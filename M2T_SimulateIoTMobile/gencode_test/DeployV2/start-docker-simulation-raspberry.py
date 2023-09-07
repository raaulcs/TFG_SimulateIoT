import os, getpass, subprocess, platform

PATH = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
if platform.system() == 'Linux':
	subprocess.call("gnome-terminal -- python3 "+PATH+"/fogA0/start-docker-simulation-fogA0.py", shell=True)
	subprocess.call("gnome-terminal -- python3 "+PATH+"/fogB0/start-docker-simulation-fogB0.py", shell=True)
else:
	print('Error responde: This script should only be run if your operating system is UNIX/Linux')
