print ('----------------------------------------------------------------------------------------------------\n')
import os, socket, subprocess, getpass, sys, platform, shutil, importlib.util

print('Checking if all necessary libraries are installed:\n')
subprocess.check_call([sys.executable, "-m", "pip", "install", "scp", "paramiko", "cryptography"])
PATH = os.path.dirname(os.path.abspath(__file__))
paramiko_found = importlib.util.find_spec('paramiko') is not None
scp_found = importlib.util.find_spec('scp') is not None
cryptography_found = importlib.util.find_spec('cryptography') is not None

if paramiko_found and scp_found and cryptography_found:
	import paramiko, scp
	from cryptography.fernet import Fernet
	if os.path.exists(PATH+'/DeployV2/Swarm/join-manager-cmd.txt'):
		os.remove(PATH+'/DeployV2/Swarm/join-manager-cmd.txt')
	
	s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
	s.connect(("8.8.8.8", 80))
	ip=s.getsockname()[0]
	s.close()
	
	def replace_line(file_name, line_num, text):
	    lines = open(file_name, 'r').readlines()
	    lines[line_num] = text
	    out = open(file_name, 'w')
	    out.writelines(lines)
	    out.close()
	with open(PATH+'/DeployV2/docker-compose.yaml', 'r') as file:
	    lines = [line.rstrip() for line in file]
	shutil.copy2(PATH+'/DeployV2/docker-compose.yaml', PATH+'/DeployV2/docker-run.yaml')
	count = 0
	usr = input("\nEnter the Docker Hub username (e.g. 'admin'): ")
	psw = getpass.getpass("Enter the Docker Hub password (e.g. '12345'): ")
	print()
	os.system('docker login --username '+usr+' --password '+psw)
	with open(PATH+'/DeployV2/Swarm/credentials-docker.txt', 'w') as file:
		file.write(usr+'\n'+psw)
	key = Fernet.generate_key()
	with open(PATH+'/DeployV2/Swarm/key-docker.key', 'wb') as file:
		file.write(key)
	with open(PATH+'/DeployV2/Swarm/credentials-docker.txt', 'rb') as file:
		decrypted_credentials = file.read()
	encrypted_credentials = Fernet(key).encrypt(decrypted_credentials)
	with open(PATH+'/DeployV2/Swarm/credentials-docker.txt', 'wb') as encrypted_file:
		encrypted_file.write(encrypted_credentials)
	print('\n----------------------------------------------------------------------------------------------------\n')
	print('Select where you want to save the multi-arc image:\n')
	print('  - 0) Local registry')
	print('  - 1) Docker Hub repository')
	print()
	inp_build = 'error'
	while inp_build != '0' and inp_build != '1':
		inp_build = input("Enter the number of the selected option (0-1): ")
	for line in lines:
		if (line.find('localhost:5000/') != -1):
			if inp_build == '0':
				replace_line(PATH+'/DeployV2/docker-run.yaml', count, line[0:line.find('localhost:5000/')]+ip+':5000/hil:'+line[line.find('localhost')+15:999]+'\n')
			else:
				replace_line(PATH+'/DeployV2/docker-run.yaml', count, line[0:line.find('localhost:5000/')]+usr+'/hil:'+line[line.find('localhost')+15:999]+'\n')
		count += 1
	
	print ('\n----------------------------------------------------------------------------------------------------\n')
	print ("Starting to build a Docker Swarm deployment ('load-config-all-raspberry.py')")
	print ('\n----------------------------------------------------------------------------------------------------\n')
	if platform.system() == 'Linux':
		print ('Obtaining the required IP address for UNIX/Linux OS:')
		print ('Current computer: '+ip)
		print ('\nForcing the current machine to leave the Swarm that it is connected to:')
		os.system('docker swarm leave --force')
		print('\nCreating a cluster in swarm mode and generating the command for workers to join it:')
		with open(PATH+'/DeployV2/Swarm/daemon.json', 'w') as file:
			file.write('{\n\t"builder": { "gc": { "defaultKeepStorage": "20GB", "enabled": true } },\n\t"experimental": true,\n\t"features": { "buildkit": true },\n\t"insecure-registries": ["'+ip+':5000"]\n}')
		ADD_WORKER_CMD = subprocess.getoutput('docker swarm init --advertise-addr '+ip+' --listen-addr 0.0.0.0:2377')
		if len(ADD_WORKER_CMD.split('\n')) >= 5:
			print(ADD_WORKER_CMD.split('\n')[4][4:999])
			ADD_WORKER_CMD = ADD_WORKER_CMD.split('\n')[4][4:999]
			with open(PATH+'/DeployV2/Swarm/join-manager-cmd.txt', 'w') as file:
				file.write(ADD_WORKER_CMD)
			print ('\n----------------------------------------------------------------------------------------------------\n')
			print ("Obtaining the required IP address for 'fogA':")
			print ('Raspberry Pi: 158.49.245.143\n')
			inp = 'error'
			while inp != 'yes' and inp != 'no':
			    inp = input("Does your 'fogA' device have a password? (yes/no): ").lower()
			username = input("Enter the username of device 'fogA': ")
			if inp == 'yes':
				password = getpass.getpass("Enter the password of device 'fogA': ")
			with open(PATH+'/fogA0/credentials-fogA0.txt', 'w') as file:
				if inp == 'yes':
					file.write(inp+'\n'+username+'\n'+password)
				else:
					file.write(inp+'\n'+username)
			key = Fernet.generate_key()
			with open(PATH+'/fogA0/key-fogA0.key', 'wb') as file:
				file.write(key)
			with open(PATH+'/fogA0/credentials-fogA0.txt', 'rb') as file:
				decrypted_credentials = file.read()
			encrypted_credentials = Fernet(key).encrypt(decrypted_credentials)
			with open(PATH+'/fogA0/credentials-fogA0.txt', 'wb') as encrypted_file:
				encrypted_file.write(encrypted_credentials)
			print ('\n----------------------------------------------------------------------------------------------------\n')
			print("Joining a cluster in swarm mode as a worker ('fogA'):")
			if inp == 'yes':
				ssh = paramiko.SSHClient()
				ssh.load_system_host_keys()
				ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
				ssh.connect(hostname='158.49.245.143', username=username, password=password, port='22', look_for_keys=False)
				scp = scp.SCPClient(ssh.get_transport())
				scp.put(PATH+'/DeployV2/Swarm/daemon.json', '/home/pi')
				scp.put(PATH+'/DeployV2/docker-run.yaml', '/home/pi')
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
				scp = subprocess.Popen(f"scp '"+PATH+"/DeployV2/Swarm/daemon.json' "+username+"@158.49.245.143:/home/pi", shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
				scp.wait()
				scp = subprocess.Popen(f"scp '"+PATH+"/DeployV2/docker-run.yaml' "+username+"@158.49.245.143:/home/pi", shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
				scp.wait()
				ssh = subprocess.Popen(f'ssh '+username+'@158.49.245.143 "sudo apt-get install ufw; sudo ufw allow 2377/tcp; sudo ufw allow 7946/tcp; sudo ufw allow 7946/udp; sudo ufw allow 4789/udp; sudo ufw enable; sudo ufw disable; sudo /sbin/iptables --flush"', shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
				ssh.wait()
				ssh = subprocess.Popen(f'ssh '+username+'@158.49.245.143 "sudo mv /home/pi/daemon.json /etc/docker; sudo systemctl daemon-reload; sudo systemctl restart docker; docker swarm leave --force; '+ADD_WORKER_CMD+'"', shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
				ssh.wait()
				for line in ssh.communicate():
					if line.decode():
						if line[-1:].decode() == '\n':
							print(line[0:len(line)-1].decode()) #print(line.decode().replace('\n', ''))
						else:
							print(line.decode())
			print ('\n----------------------------------------------------------------------------------------------------\n')
			print ("Obtaining the required IP address for 'fogB':")
			print ('Raspberry Pi: 1.1.1.1\n')
			inp = 'error'
			while inp != 'yes' and inp != 'no':
			    inp = input("Does your 'fogB' device have a password? (yes/no): ").lower()
			username = input("Enter the username of device 'fogB': ")
			if inp == 'yes':
				password = getpass.getpass("Enter the password of device 'fogB': ")
			with open(PATH+'/fogB0/credentials-fogB0.txt', 'w') as file:
				if inp == 'yes':
					file.write(inp+'\n'+username+'\n'+password)
				else:
					file.write(inp+'\n'+username)
			key = Fernet.generate_key()
			with open(PATH+'/fogB0/key-fogB0.key', 'wb') as file:
				file.write(key)
			with open(PATH+'/fogB0/credentials-fogB0.txt', 'rb') as file:
				decrypted_credentials = file.read()
			encrypted_credentials = Fernet(key).encrypt(decrypted_credentials)
			with open(PATH+'/fogB0/credentials-fogB0.txt', 'wb') as encrypted_file:
				encrypted_file.write(encrypted_credentials)
			print ('\n----------------------------------------------------------------------------------------------------\n')
			print("Joining a cluster in swarm mode as a worker ('fogB'):")
			if inp == 'yes':
				ssh = paramiko.SSHClient()
				ssh.load_system_host_keys()
				ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
				ssh.connect(hostname='1.1.1.1', username=username, password=password, port='22', look_for_keys=False)
				scp = scp.SCPClient(ssh.get_transport())
				scp.put(PATH+'/DeployV2/Swarm/daemon.json', '/home/pi')
				scp.put(PATH+'/DeployV2/docker-run.yaml', '/home/pi')
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
				scp = subprocess.Popen(f"scp '"+PATH+"/DeployV2/Swarm/daemon.json' "+username+"@1.1.1.1:/home/pi", shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
				scp.wait()
				scp = subprocess.Popen(f"scp '"+PATH+"/DeployV2/docker-run.yaml' "+username+"@1.1.1.1:/home/pi", shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
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
			print('Error responde: the cluster in swarm mode has not been created correctly')
	else:
		print('Error responde: This script should only be run if your operating system is UNIX/Linux')
	print ('\n----------------------------------------------------------------------------------------------------\n')
	print ("End of Docker Swarm deployment ('load-config-all-raspberry.py')")
else:
	print ("\nThe required libraries are not installed. Please, rerun the script again ('load-config-all-raspberry.py')")
print ('\n----------------------------------------------------------------------------------------------------\n')
getpass.getpass("Press 'Enter' to continue... ")
print ('\n----------------------------------------------------------------------------------------------------')
