import os, getpass

PATH = os.path.dirname(os.path.abspath(__file__))

print ('----------------------------------------------------------------------------------------------------\n')
print ("Starting Docker container ('start-docker-simulation-linux.py')\n")
print ('----------------------------------------------------------------------------------------------------\n')
if os.path.exists(PATH+'/docker-run.yaml'):
	os.system("docker compose -f "+PATH+"/docker-run.yaml up --remove-orphans --force-recreate")
else:
	print("You must run the fog nodes script ('load-swarm-manager-linux.py') first")
print ('\n----------------------------------------------------------------------------------------------------\n')
print ("End of Docker run ('start-docker-simulation-linux.py')")
print ('\n----------------------------------------------------------------------------------------------------\n')
getpass.getpass("Press 'Enter' to continue... ")
print ('\n----------------------------------------------------------------------------------------------------')
