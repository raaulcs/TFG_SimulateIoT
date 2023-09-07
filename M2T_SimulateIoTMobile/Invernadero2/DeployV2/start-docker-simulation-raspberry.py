import os, getpass, subprocess, platform

PATH = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
if platform.system() == 'Linux':
else:
	print('Error responde: This script should only be run if your operating system is UNIX/Linux')
