print ('----------------------------------------------------------------------------------------------------\n')
import os, socket, subprocess, getpass, sys, platform, importlib.util

print('Checking if all necessary libraries are installed:\n')
subprocess.check_call([sys.executable, "-m", "pip", "install", "scp", "paramiko", "cryptography"])
PATH = os.path.dirname(os.path.abspath(__file__))
paramiko_found = importlib.util.find_spec('paramiko') is not None
scp_found = importlib.util.find_spec('scp') is not None
cryptography_found = importlib.util.find_spec('cryptography') is not None

if paramiko_found and scp_found and cryptography_found:
	import paramiko, scp
	from cryptography.fernet import Fernet
	s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
	s.connect(("8.8.8.8", 80))
	ip=s.getsockname()[0]
	s.close()
	
	print ('\n----------------------------------------------------------------------------------------------------\n')
	print ("Starting to build a Docker Swarm deployment ('load-swarm-worker-fogB0.py')")
	print ('\n----------------------------------------------------------------------------------------------------\n')
	if platform.system() == 'Linux':
		print ('Obtaining the required IP address for UNIX/Linux OS:')
		print ('Current computer: '+ip)
		print ('\n----------------------------------------------------------------------------------------------------\n')
		if os.path.exists(os.path.dirname(PATH)+'/DeployV2/Swarm/join-manager-cmd.txt'):
			inp = 'error'
			while inp != 'yes' and inp != 'no':
			    inp = input("Does your 'fogB' device have a password? (yes/no): ").lower()
			username = input("Enter the username of device 'fogB': ")
			if inp == 'yes':
				password = getpass.getpass("Enter the password of device 'fogB': ")
			with open(PATH+'/credentials-fogB0.txt', 'w') as file:
				if inp == 'yes':
					file.write(inp+'\n'+username+'\n'+password)
				else:
					file.write(inp+'\n'+username)
			key = Fernet.generate_key()
			with open(PATH+'/key-fogB0.key', 'wb') as file:
				file.write(key)
			with open(PATH+'/credentials-fogB0.txt', 'rb') as file:
				decrypted_credentials = file.read()
			encrypted_credentials = Fernet(key).encrypt(decrypted_credentials)
			with open(PATH+'/credentials-fogB0.txt', 'wb') as encrypted_file:
				encrypted_file.write(encrypted_credentials)
			print ('\n----------------------------------------------------------------------------------------------------\n')
			print("Joining a cluster in swarm mode as a worker ('fogB'):")
			with open(os.path.dirname(PATH)+'/DeployV2/Swarm/join-manager-cmd.txt', 'r') as file:
				ADD_WORKER_CMD = file.readlines()[0]
			if inp == 'yes':
				ssh = paramiko.SSHClient()
				ssh.load_system_host_keys()
				ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
				ssh.connect(hostname='1.1.1.1', username=username, password=password, port='22', look_for_keys=False)
				scp = scp.SCPClient(ssh.get_transport())
				scp.put(os.path.dirname(PATH)+'/DeployV2/Swarm/daemon.json', '/home/pi')
				scp.put(os.path.dirname(PATH)+'/DeployV2/docker-run.yaml', '/home/pi')
				stdin, stdout, stderr = ssh.exec_command("sudo apt-get install ufw; sudo ufw allow 2377/tcp; sudo ufw allow 7946/tcp; sudo ufw allow 7946/udp; sudo ufw allow 4789/udp; sudo ufw enable; sudo ufw disable; sudo /sbin/iptables --flush")
				stdin, stdout, stderr = ssh.exec_command("sudo mv /home/pi/daemon.json /etc/docker; sudo systemctl daemon-reload; sudo systemctl restart docker")
				stdin, stdout, stderr = ssh.exec_command("docker swarm leave --force")
				stdout = stdout.read().decode().split('\n')
				if len(stdout) >= 1:
					if stdout[0]:
						print(stdout[0])
					else:
						print('Error response from daemon: This node is not part of a swarm')
				else:
					print('Error responde: the node has not been able to leave the swarm cluster which it is connected to')
				stdin, stdout, stderr = ssh.exec_command(ADD_WORKER_CMD)
				stdout = stdout.read().decode().split('\n')
				if len(stdout) >= 1:
					if stdout[0]:
						print(stdout[0])
					else:
						print('Error responde: the node has not been able to join as a worker')
				else:
					print('Error responde: the node has not been able to join as a worker')
				stdin.close()
				ssh.close()
				scp.close()
			else:
				scp = subprocess.Popen(f"scp '"+os.path.dirname(PATH)+"/DeployV2/Swarm/daemon.json' "+username+"@1.1.1.1:/home/pi", shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
				scp.wait()
				scp = subprocess.Popen(f"scp '"+os.path.dirname(PATH)+"/DeployV2/docker-run.yaml' "+username+"@1.1.1.1:/home/pi", shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
				scp.wait()
				ssh = subprocess.Popen(f'ssh '+username+'@1.1.1.1 "sudo apt-get install ufw; sudo ufw allow 2377/tcp; sudo ufw allow 7946/tcp; sudo ufw allow 7946/udp; sudo ufw allow 4789/udp; sudo ufw enable; sudo ufw disable; sudo /sbin/iptables --flush"', shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
				ssh.wait()
				ssh = subprocess.Popen(f'ssh '+username+'@1.1.1.1 "sudo mv /home/pi/daemon.json /etc/docker; sudo systemctl daemon-reload; sudo systemctl restart docker; docker swarm leave --force; '+ADD_WORKER_CMD+'"', shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
				ssh.wait()
				for line in ssh.communicate():
					if line.decode():
						if line[-1:].decode() == '\n':
							print(line[0:len(line)-1].decode()) #print(line.decode().replace('\n', ''))
						else:
							print(line.decode())
		else:
			print("You must run the manager node script ('load-swarm-manager-linux.py') first")
	else:
		print('Error responde: This script should only be run if your operating system is UNIX/Linux')
	print ('\n----------------------------------------------------------------------------------------------------\n')
	print ("End of Docker Swarm deployment ('load-swarm-worker-fogB0.py')")
else:
	print ("\nThe required libraries are not installed. Please, rerun the script again ('load-swarm-worker-fogB0.py')")
print ('\n----------------------------------------------------------------------------------------------------\n')
getpass.getpass("Press 'Enter' to continue... ")
print ('\n----------------------------------------------------------------------------------------------------')
