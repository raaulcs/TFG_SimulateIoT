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
				print("Building the image for node 'Presence' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/Presence0/target/docker/Dockerfile') and os.path.exists(PATH+'/Presence0/target/docker/Presence0-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/Presence0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:presence0 . --push')
					else:
						os.system('cd "'+PATH+'/Presence0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:presence0 . --push')
				else:
					print("Component 'Presence' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'Brightness' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/Brightness1/target/docker/Dockerfile') and os.path.exists(PATH+'/Brightness1/target/docker/Brightness1-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/Brightness1/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:brightness1 . --push')
					else:
						os.system('cd "'+PATH+'/Brightness1/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:brightness1 . --push')
				else:
					print("Component 'Brightness' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'Water' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/Water2/target/docker/Dockerfile') and os.path.exists(PATH+'/Water2/target/docker/Water2-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/Water2/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:water2 . --push')
					else:
						os.system('cd "'+PATH+'/Water2/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:water2 . --push')
				else:
					print("Component 'Water' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'Gas' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/Gas3/target/docker/Dockerfile') and os.path.exists(PATH+'/Gas3/target/docker/Gas3-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/Gas3/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:gas3 . --push')
					else:
						os.system('cd "'+PATH+'/Gas3/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:gas3 . --push')
				else:
					print("Component 'Gas' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'sensPresence' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/sensPresence0/target/docker/Dockerfile') and os.path.exists(PATH+'/sensPresence0/target/docker/sensPresence0-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/sensPresence0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:sensor-senspresence0 . --push')
					else:
						os.system('cd "'+PATH+'/sensPresence0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:sensor-senspresence0 . --push')
				else:
					print("Component 'sensPresence' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'sensBrightness' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/sensBrightness1/target/docker/Dockerfile') and os.path.exists(PATH+'/sensBrightness1/target/docker/sensBrightness1-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/sensBrightness1/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:sensor-sensbrightness1 . --push')
					else:
						os.system('cd "'+PATH+'/sensBrightness1/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:sensor-sensbrightness1 . --push')
				else:
					print("Component 'sensBrightness' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'sensWater' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/sensWater2/target/docker/Dockerfile') and os.path.exists(PATH+'/sensWater2/target/docker/sensWater2-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/sensWater2/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:sensor-senswater2 . --push')
					else:
						os.system('cd "'+PATH+'/sensWater2/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:sensor-senswater2 . --push')
				else:
					print("Component 'sensWater' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'sensGas' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/sensGas3/target/docker/Dockerfile') and os.path.exists(PATH+'/sensGas3/target/docker/sensGas3-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/sensGas3/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:sensor-sensgas3 . --push')
					else:
						os.system('cd "'+PATH+'/sensGas3/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:sensor-sensgas3 . --push')
				else:
					print("Component 'sensGas' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'actPresence' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/actPresence0/target/docker/Dockerfile') and os.path.exists(PATH+'/actPresence0/target/docker/actPresence0-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/actPresence0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:actuator-actpresence0 . --push')
					else:
						os.system('cd "'+PATH+'/actPresence0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:actuator-actpresence0 . --push')
				else:
					print("Component 'actPresence' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'actBrightness' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/actBrightness1/target/docker/Dockerfile') and os.path.exists(PATH+'/actBrightness1/target/docker/actBrightness1-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/actBrightness1/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:actuator-actbrightness1 . --push')
					else:
						os.system('cd "'+PATH+'/actBrightness1/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:actuator-actbrightness1 . --push')
				else:
					print("Component 'actBrightness' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'actWater' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/actWater2/target/docker/Dockerfile') and os.path.exists(PATH+'/actWater2/target/docker/actWater2-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/actWater2/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:actuator-actwater2 . --push')
					else:
						os.system('cd "'+PATH+'/actWater2/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:actuator-actwater2 . --push')
				else:
					print("Component 'actWater' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'actGas' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/actGas3/target/docker/Dockerfile') and os.path.exists(PATH+'/actGas3/target/docker/actGas3-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/actGas3/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:actuator-actgas3 . --push')
					else:
						os.system('cd "'+PATH+'/actGas3/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:actuator-actgas3 . --push')
				else:
					print("Component 'actGas' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
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
	else:
		print('Error responde: This script should only be run if your operating system is UNIX/Linux')
else:
	print ("\nThe required libraries are not installed. Please, rerun the script again ('start-docker-simulation.py')")
print ('\n----------------------------------------------------------------------------------------------------\n')
print ("End of the SimulateIot-HiL environment run ('start-docker-simulation.py')")
print ('\n----------------------------------------------------------------------------------------------------\n')
getpass.getpass("Press 'Enter' to continue... ")
print ('\n----------------------------------------------------------------------------------------------------')
