print ('----------------------------------------------------------------------------------------------------\n')
import os, getpass, platform, socket, subprocess, sys, shutil, importlib.util

print('Checking if all necessary libraries are installed:\n')
subprocess.check_call([sys.executable, "-m", "pip", "install", "cryptography"])
cryptography_found = importlib.util.find_spec('cryptography') is not None
PATH = os.path.dirname(os.path.abspath(__file__))

s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
s.connect(("8.8.8.8", 80))
ip = s.getsockname()[0]
s.close()

if cryptography_found:
	from cryptography.fernet import Fernet

	print('\n----------------------------------------------------------------------------------------------------\n')
	print("Starting to run the SimulateIot-HiL environment ('start-docker-simulation.py')\n")
	print('----------------------------------------------------------------------------------------------------\n')
	if platform.system() == 'Linux':
		print('Select which option you would like to run:\n')
		print('  - 0) Build a multi-arch image and start the docker containers')
		print('  - 1) Start the docker containers')
		print('  - 2) Build a multi-arch image')
		print()
		inp = 'error'
		while inp != '0' and inp != '1' and inp != '2':
			inp = input("Enter the number of the selected option (0-2): ")
		print ('\n----------------------------------------------------------------------------------------------------')
		if inp == '0' or inp == '2':
			print("\nStarting to build a multi-arch image with Docker BuildKit\n")
			print('----------------------------------------------------------------------------------------------------\n')
			print("Updating 'daemon.json' configuration:")
			if os.path.exists(PATH+'/DeployV2/Swarm/daemon.json'):
				shutil.copy2(PATH+'/DeployV2/Swarm/daemon.json', PATH+'/DeployV2/Swarm/daemon2.json')
				os.system('sudo mv '+PATH+'/DeployV2/Swarm/daemon.json /etc/docker; sudo systemctl daemon-reload; sudo systemctl restart docker')
				os.rename(PATH+'/DeployV2/Swarm/daemon2.json', PATH+'/DeployV2/Swarm/daemon.json')
				print("The new configuration has been applied and Docker has been restarted\n")
			else:
				print("\nThe new configuration has not been applied. File 'daemon.json' has not been found")
			if os.path.exists(PATH+'/DeployV2/Swarm/credentials-docker.txt') and os.path.exists(PATH+'/DeployV2/Swarm/key-docker.key'):
				with open(PATH+'/DeployV2/Swarm/key-docker.key', 'rb') as file:
					key = file.read()
				with open(PATH+'/DeployV2/Swarm/credentials-docker.txt', 'rb') as encrypted_file:
					encrypted_credentials = encrypted_file.read()
				decrypted_credentials = fernet = Fernet(key).decrypt(encrypted_credentials)
				print("Enter the Docker Hub username (e.g. 'admin'): "+decrypted_credentials.decode().split('\n')[0])
				usr = decrypted_credentials.decode().split('\n')[0]
				print("Enter the Docker Hub password (e.g. '12345'): \n")
				psw = decrypted_credentials.decode().split('\n')[1]
				os.system('docker login --username '+usr+' --password '+psw)
				print('\n----------------------------------------------------------------------------------------------------\n')
				os.system('docker buildx create --name builder --driver=docker-container --driver-opt image=moby/buildkit:master --platform linux/amd64,linux/arm64 --bootstrap --use')
				print()
				os.system('docker buildx ls')
				with open(PATH+'/DeployV2/docker-run.yaml', 'r') as file:
					lines = [line.rstrip() for line in file]
				local_registry = False
				for line in lines:
					if (line.find(ip+':5000/') != -1):
						local_registry = True
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'fogA' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/fogA0/target/docker/Dockerfile') and os.path.exists(PATH+'/fogA0/target/docker/fogA0-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/fogA0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:foga0 . --push')
					else:
						os.system('cd "'+PATH+'/fogA0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:foga0 . --push')
				else:
					print("Component 'fogA' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'SensA' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/SensA0/target/docker/Dockerfile') and os.path.exists(PATH+'/SensA0/target/docker/SensA0-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/SensA0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:sensor-sensa0 . --push')
					else:
						os.system('cd "'+PATH+'/SensA0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:sensor-sensa0 . --push')
				else:
					print("Component 'SensA' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'ActA' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/ActA0/target/docker/Dockerfile') and os.path.exists(PATH+'/ActA0/target/docker/ActA0-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/ActA0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:actuator-acta0 . --push')
					else:
						os.system('cd "'+PATH+'/ActA0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:actuator-acta0 . --push')
				else:
					print("Component 'ActA' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'fogB' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/fogB0/target/docker/Dockerfile') and os.path.exists(PATH+'/fogB0/target/docker/fogB0-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/fogB0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:fogb0 . --push')
					else:
						os.system('cd "'+PATH+'/fogB0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:fogb0 . --push')
				else:
					print("Component 'fogB' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'SensB' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/SensB0/target/docker/Dockerfile') and os.path.exists(PATH+'/SensB0/target/docker/SensB0-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/SensB0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:sensor-sensb0 . --push')
					else:
						os.system('cd "'+PATH+'/SensB0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:sensor-sensb0 . --push')
				else:
					print("Component 'SensB' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'ActB' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/ActB0/target/docker/Dockerfile') and os.path.exists(PATH+'/ActB0/target/docker/ActB0-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/ActB0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:actuator-actb0 . --push')
					else:
						os.system('cd "'+PATH+'/ActB0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:actuator-actb0 . --push')
				else:
					print("Component 'ActB' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
			else:
				print("You must load the raspberry configuration ('load-swarm-manager-linux.py') first")
		if inp == '0':
			print('\n----------------------------------------------------------------------------------------------------')
		if inp == '0' or inp == '1':
			#print ("\nUpdating Ubuntu Uncomplicated Firewall configuration:\n")
			#os.system('sudo ufw allow 2377/tcp; sudo ufw allow 7946/tcp; sudo ufw allow 7946/udp; sudo ufw allow 4789/udp')
			#print()
			#os.system('sudo ufw enable; sudo ufw disable')
			print("\nStarting the Docker containers in the current UNIX/Linux system...")
			subprocess.call("gnome-terminal -- python3 "+PATH+"/DeployV2/start-docker-simulation-linux.py", shell=True)
			print("Starting the Docker containers in Raspberry Pi devices...")
			subprocess.call("gnome-terminal -- python3 "+PATH+"/fogA0/start-docker-simulation-fogA0.py", shell=True)
			subprocess.call("gnome-terminal -- python3 "+PATH+"/fogB0/start-docker-simulation-fogB0.py", shell=True)
	else:
		print('Error responde: This script should only be run if your operating system is UNIX/Linux')
else:
	print ("\nThe required libraries are not installed. Please, rerun the script again ('start-docker-simulation.py')")
print ('\n----------------------------------------------------------------------------------------------------\n')
print ("End of the SimulateIot-HiL environment run ('start-docker-simulation.py')")
print ('\n----------------------------------------------------------------------------------------------------\n')
getpass.getpass("Press 'Enter' to continue... ")
print ('\n----------------------------------------------------------------------------------------------------')
