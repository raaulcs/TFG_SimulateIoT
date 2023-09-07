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
				print("Building the image for node 'Humidity' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/Humidity0/target/docker/Dockerfile') and os.path.exists(PATH+'/Humidity0/target/docker/Humidity0-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/Humidity0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:humidity0 . --push')
					else:
						os.system('cd "'+PATH+'/Humidity0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:humidity0 . --push')
				else:
					print("Component 'Humidity' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'Temperature' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/Temperature1/target/docker/Dockerfile') and os.path.exists(PATH+'/Temperature1/target/docker/Temperature1-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/Temperature1/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:temperature1 . --push')
					else:
						os.system('cd "'+PATH+'/Temperature1/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:temperature1 . --push')
				else:
					print("Component 'Temperature' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'WaterLevel' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/WaterLevel2/target/docker/Dockerfile') and os.path.exists(PATH+'/WaterLevel2/target/docker/WaterLevel2-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/WaterLevel2/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:waterlevel2 . --push')
					else:
						os.system('cd "'+PATH+'/WaterLevel2/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:waterlevel2 . --push')
				else:
					print("Component 'WaterLevel' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'sensHumidity' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/sensHumidity0/target/docker/Dockerfile') and os.path.exists(PATH+'/sensHumidity0/target/docker/sensHumidity0-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/sensHumidity0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:sensor-senshumidity0 . --push')
					else:
						os.system('cd "'+PATH+'/sensHumidity0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:sensor-senshumidity0 . --push')
				else:
					print("Component 'sensHumidity' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'sensTemperature' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/sensTemperature1/target/docker/Dockerfile') and os.path.exists(PATH+'/sensTemperature1/target/docker/sensTemperature1-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/sensTemperature1/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:sensor-senstemperature1 . --push')
					else:
						os.system('cd "'+PATH+'/sensTemperature1/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:sensor-senstemperature1 . --push')
				else:
					print("Component 'sensTemperature' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'sensWaterLevel' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/sensWaterLevel2/target/docker/Dockerfile') and os.path.exists(PATH+'/sensWaterLevel2/target/docker/sensWaterLevel2-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/sensWaterLevel2/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:sensor-senswaterlevel2 . --push')
					else:
						os.system('cd "'+PATH+'/sensWaterLevel2/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:sensor-senswaterlevel2 . --push')
				else:
					print("Component 'sensWaterLevel' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'actHumidity' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/actHumidity0/target/docker/Dockerfile') and os.path.exists(PATH+'/actHumidity0/target/docker/actHumidity0-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/actHumidity0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:actuator-acthumidity0 . --push')
					else:
						os.system('cd "'+PATH+'/actHumidity0/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:actuator-acthumidity0 . --push')
				else:
					print("Component 'actHumidity' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'actTemperature' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/actTemperature1/target/docker/Dockerfile') and os.path.exists(PATH+'/actTemperature1/target/docker/actTemperature1-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/actTemperature1/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:actuator-acttemperature1 . --push')
					else:
						os.system('cd "'+PATH+'/actTemperature1/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:actuator-acttemperature1 . --push')
				else:
					print("Component 'actTemperature' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
				print('\n----------------------------------------------------------------------------------------------------\n')
				print("Building the image for node 'actWaterLevel' (linux/ard64, linux/arm64):\n")
				if os.path.exists(PATH+'/actWaterLevel2/target/docker/Dockerfile') and os.path.exists(PATH+'/actWaterLevel2/target/docker/actWaterLevel2-1.0-SNAPSHOT-thorntail.jar'):
					if local_registry == True:
						os.system('cd "'+PATH+'/actWaterLevel2/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+ip+':5000/hil:actuator-actwaterlevel2 . --push')
					else:
						os.system('cd "'+PATH+'/actWaterLevel2/target/docker"; docker buildx build --builder=builder --platform linux/amd64,linux/arm64 -t '+usr+'/hil:actuator-actwaterlevel2 . --push')
				else:
					print("Component 'actWaterLevel' has not been dockerised properly. Run 'compile-dockerize-registry-components.py' script")
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
