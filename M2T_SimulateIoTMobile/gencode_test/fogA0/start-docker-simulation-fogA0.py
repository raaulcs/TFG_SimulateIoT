print ('----------------------------------------------------------------------------------------------------\n')
import os, subprocess, getpass, sys, importlib.util, platform

print('Checking if all necessary libraries are installed:\n')
subprocess.check_call([sys.executable, "-m", "pip", "install", "scp", "paramiko", "cryptography"])
PATH = os.path.dirname(os.path.abspath(__file__))
paramiko_found = importlib.util.find_spec('paramiko') is not None
scp_found = importlib.util.find_spec('scp') is not None
cryptography_found = importlib.util.find_spec('cryptography') is not None

if paramiko_found and scp_found and cryptography_found:
	import paramiko, scp
	from cryptography.fernet import Fernet
	
	def execute(cmd):
		popen = subprocess.Popen(cmd, shell=True, stdout=subprocess.PIPE, universal_newlines=True)
		for stdout_line in iter(popen.stdout.readline, ""):
			yield stdout_line 
		popen.stdout.close()
		return_code = popen.wait()
		if return_code:
			raise subprocess.CalledProcessError(return_code, cmd)
	
	print ('\n----------------------------------------------------------------------------------------------------\n')
	print ("Starting Docker container ('start-docker-simulation-fogA0.py')")
	print ('\n----------------------------------------------------------------------------------------------------\n')
	if platform.system() == 'Linux':
		if os.path.exists(PATH+'/credentials-fogA0.txt') and os.path.exists(PATH+'/key-fogA0.key'):
			print ("Obtaining the required IP address for 'fogA':")
			print ('Raspberry Pi: 158.49.245.143\n')
			with open(PATH+'/key-fogA0.key', 'rb') as file:
				key = file.read()
			with open(PATH+'/credentials-fogA0.txt', 'rb') as encrypted_file:
				encrypted_credentials = encrypted_file.read()
			decrypted_credentials = fernet = Fernet(key).decrypt(encrypted_credentials)
			print("Does your 'fogA' device have a password? (yes/no): "+decrypted_credentials.decode().split('\n')[0])
			print("Enter the username of device 'fogA': "+decrypted_credentials.decode().split('\n')[1])
			username = decrypted_credentials.decode().split('\n')[1]
			if decrypted_credentials.decode().split('\n')[0] == 'yes':
				print("Enter the password of device 'fogA': ")
				password = decrypted_credentials.decode().split('\n')[2]
			print ('\n----------------------------------------------------------------------------------------------------\n')
			print("Running the docker-composer file ('fogA'):\n")
			if decrypted_credentials.decode().split('\n')[0] == 'yes':
				ssh = paramiko.SSHClient()
				ssh.load_system_host_keys()
				ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
				ssh.connect(hostname='158.49.245.143', username=username, password=password, port='22', look_for_keys=False)
				stdin, stdout, stderr = ssh.exec_command("docker compose -f '/home/pi/docker-run.yaml' up --remove-orphans --force-recreate", get_pty=True)
				for line in iter(stdout.readline, ""):
					print(line, end="")
				stdin.close()
				ssh.close()
			else:
				for path in execute("ssh "+username+"@158.49.245.143 'docker compose -f /home/pi/docker-run.yaml up --remove-orphans --force-recreate'"):
					print(path, end="")
				#ssh = subprocess.Popen(f'ssh '+username+'@158.49.245.143 "docker compose -f /home/pi/docker-run.yaml up --remove-orphans --force-recreate"', shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
				#ssh.wait()
				#print(ine.decode())
				#for line in ssh.communicate():
					#print(line.decode())
			print ('\n----------------------------------------------------------------------------------------------------\n')
			print("End of Docker runs ('start-docker-simulation-fogA0.py')")
		else:
			print("You must load the raspberry configuration ('load-swarm-worker-fogA0.py') first")
	else:
		print('Error responde: This script should only be run if your operating system is UNIX/Linux')
else:
	print("The required libraries are not installed. Please, rerun the script again ('start-docker-simulation-fogA0.py')")
print ('\n----------------------------------------------------------------------------------------------------\n')
getpass.getpass("Press 'Enter' to continue... ")
print ('\n----------------------------------------------------------------------------------------------------')
