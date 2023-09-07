print ('----------------------------------------------------------------------------------------------------\n')
import os, socket, subprocess, platform, getpass, shutil, sys, importlib.util

print('Checking if all necessary libraries are installed:\n')
subprocess.check_call([sys.executable, "-m", "pip", "install", "scp", "paramiko", "cryptography"])
PATH = os.path.dirname(os.path.abspath(__file__))
cryptography_found = importlib.util.find_spec('cryptography') is not None

if cryptography_found:
	from cryptography.fernet import Fernet

	print ('\n----------------------------------------------------------------------------------------------------\n')
	print ("Starting to build a Docker Swarm deployment ('load-swarm-manager-linux.py')\n")
	print ('----------------------------------------------------------------------------------------------------\n')
	print ('Obtaining the required IP address for UNIX/Linux OS:')
	s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
	s.connect(("8.8.8.8", 80))
	ip=s.getsockname()[0]
	s.close()
	print ('Current computer: '+ip)
	def replace_line(file_name, line_num, text):
	    lines = open(file_name, 'r').readlines()
	    lines[line_num] = text
	    out = open(file_name, 'w')
	    out.writelines(lines)
	    out.close()
	print ('\nForcing the current machine to leave the Swarm that it is connected to:')
	os.system('docker swarm leave --force')
	print ('\n----------------------------------------------------------------------------------------------------\n')
	with open(PATH+'/daemon.json', 'w') as file:
		file.write('{\n\t"builder": { "gc": { "defaultKeepStorage": "20GB", "enabled": true } },\n\t"experimental": true,\n\t"features": { "buildkit": true },\n\t"insecure-registries": ["'+ip+':5000"]\n}')
	with open(os.path.dirname(PATH)+'/docker-compose.yaml', 'r') as file:
	    lines = [line.rstrip() for line in file]
	shutil.copy2(os.path.dirname(PATH)+'/docker-compose.yaml', os.path.dirname(PATH)+'/docker-run.yaml')
	count = 0
	usr = input("Enter the Docker Hub username (e.g. 'admin'): ")  
	psw = getpass.getpass("Enter the Docker Hub password (e.g. '12345'): ")
	print()
	os.system('docker login --username '+usr+' --password '+psw)
	with open(PATH+'/credentials-docker.txt', 'w') as file:
		file.write(usr+'\n'+psw)
	key = Fernet.generate_key()
	with open(PATH+'/key-docker.key', 'wb') as file:
		file.write(key)
	with open(PATH+'/credentials-docker.txt', 'rb') as file:
		decrypted_credentials = file.read()
	encrypted_credentials = Fernet(key).encrypt(decrypted_credentials)
	with open(PATH+'/credentials-docker.txt', 'wb') as encrypted_file:
		encrypted_file.write(encrypted_credentials)
	print('\n----------------------------------------------------------------------------------------------------\n')
	print('Select where you want to save the multi-arc image:\n')
	print('  - 0) Local registry')
	print('  - 1) Docker Hub repository')
	print()
	inp_build = 'error'
	while inp_build != '0' and inp_build != '1':
		inp_build = input("Enter the number of the selected option (0-1): ")
	print ('\n----------------------------------------------------------------------------------------------------\n')
	for line in lines:
		if (line.find('localhost:5000/') != -1):
			if inp_build == '0':
				replace_line(os.path.dirname(PATH)+'/docker-run.yaml', count, line[0:line.find('localhost:5000/')]+ip+':5000/hil:'+line[line.find('localhost')+15:999]+'\n')
			else:
				replace_line(os.path.dirname(PATH)+'/docker-run.yaml', count, line[0:line.find('localhost:5000/')]+usr+'/hil:'+line[line.find('localhost')+15:999]+'\n')
		count += 1
	if platform.system() == 'Linux':
		print('Creating a cluster in swarm mode and generating the command for workers to join it:')
		ADD_WORKER_CMD = subprocess.getoutput('docker swarm init --advertise-addr '+ip+' --listen-addr 0.0.0.0:2377')
		if len(ADD_WORKER_CMD.split('\n')) >= 5:
			print(ADD_WORKER_CMD.split('\n')[4][4:999])
			ADD_WORKER_CMD = ADD_WORKER_CMD.split('\n')[4][4:999]
			with open(PATH+'/join-manager-cmd.txt', 'w') as file:
				file.write(ADD_WORKER_CMD)
		else:
			print('Error responde: the cluster in swarm mode has not been created correctly\n')
	else:
		print('Error responde: This script should only be run if your operating system is UNIX/Linux')
	print('\n----------------------------------------------------------------------------------------------------\n')
	print("End of Docker Swarm deployment ('load-swarm-manager-linux.py')")
else:
	print("\nThe required libraries are not installed. Please, rerun the script again ('load-swarm-manager-linux.py')")
print ('\n----------------------------------------------------------------------------------------------------\n')
getpass.getpass("Press 'Enter' to continue... ")
print ('\n----------------------------------------------------------------------------------------------------')
