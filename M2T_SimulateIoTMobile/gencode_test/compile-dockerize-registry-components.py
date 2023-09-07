import os, shutil, socket, getpass, subprocess

PATH = os.path.dirname(os.path.abspath(__file__))
s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
s.connect(("8.8.8.8", 80))
ip = s.getsockname()[0]
s.close()

def replace_line(file_name, line_num, text):
    lines = open(file_name, 'r').readlines()
    lines[line_num] = text
    out = open(file_name, 'w')
    out.writelines(lines)
    out.close()

def execute(cmd):
	popen = subprocess.Popen(cmd, shell=True, stdout=subprocess.PIPE, universal_newlines=True)
	for stdout_line in iter(popen.stdout.readline, ""):
		yield stdout_line 
	popen.stdout.close()
	return_code = popen.wait()
	if return_code:
		raise subprocess.CalledProcessError(return_code, cmd)

print ('----------------------------------------------------------------------------------------------------\n')
print ("Starting to dockerize registry components ('compile-dockerize-registry-components.py')\n")
print ('----------------------------------------------------------------------------------------------------\n')
if os.path.exists(PATH+'/temperature.csv'):
	shutil.copy2(PATH+'/temperature.csv', PATH+'/SensA0/src/main/resources')
	#print ('----------------------------------------------------------------------------------------------------\n')
#elif os.path.exists(PATH+'/gencode/temperature.csv'):
	#shutil.copy2(PATH+'/gencode/temperature.csv' +PATH+'/gencode/MobilityArchitecture/MobileNodes/SensA0/src/main/resources')
	#print ('----------------------------------------------------------------------------------------------------\n')
print('Dockerizing generated sensor components:\n')
with open(PATH+'/SensA0/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/SensA0/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/SensA0 clean package docker:build &"):
	print(path, end="")
#for path in execute(["mvn -f "+PATH+"/MobilityArchitecture/MobileNodes/SensA0 clean package docker:build &"]):
	#print(path, end="")
print()
with open(PATH+'/SensB0/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/SensB0/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/SensB0 clean package docker:build &"):
	print(path, end="")
#for path in execute(["mvn -f "+PATH+"/MobilityArchitecture/MobileNodes/SensB0 clean package docker:build &"]):
	#print(path, end="")
print()
print ('----------------------------------------------------------------------------------------------------\n')
print('Dockerizing generated actuator components:\n')
with open(PATH+'/ActA0/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/ActA0/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/ActA0 clean package docker:build &"):
	print(path, end="")
print()
with open(PATH+'/ActB0/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/ActB0/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/ActB0 clean package docker:build &"):
	print(path, end="")
print()
print ('----------------------------------------------------------------------------------------------------\n')
print('Dockerizing generated fog and cloud components:\n')
with open(PATH+'/fogA0/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/fogA0/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/fogA0 clean package docker:build &"):
	print(path, end="")
print()
with open(PATH+'/fogB0/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/fogB0/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/fogB0 clean package docker:build &"):
	print(path, end="")
print()
print ('----------------------------------------------------------------------------------------------------\n')
print('Dockerizing generated database and process engine components:\n')
print ('----------------------------------------------------------------------------------------------------\n')
#for path in execute("mvn -f "+PATH+"/dashboard/dashboard2 clean install"):
#	print(path, end="")
#for path in execute("docker build "+PATH+"/dashboard -t "+ip+":5000/dashboard  &"):
	#print(path, end="")
print ('\n----------------------------------------------------------------------------------------------------\n')
for path in execute("docker build "+PATH+"/MobilityArchitecture/TSS/fogA -t "+ip+":5000/tss-foga"):
	print(path, end="")
print()
for path in execute("docker build "+PATH+"/MobilityArchitecture/TSS/fogB -t "+ip+":5000/tss-fogb"):
	print(path, end="")
print()
for path in execute("docker build "+PATH+"/MobilityArchitecture/TDS/fogA -t "+ip+":5000/tds-foga"):
	print(path, end="")
print()
for path in execute("docker build "+PATH+"/MobilityArchitecture/TDS/fogB -t "+ip+":5000/tds-fogb"):
	print(path, end="")
print()
print ('----------------------------------------------------------------------------------------------------\n')
print('Uploading dockers to registry:\n')
for path in execute("docker push "+ip+":5000/foga0 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/fogb0 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/actuator-acta0 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/actuator-actb0 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/sensor-sensa0 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/sensor-sensb0 &"):
	print(path, end="")
print()
#for path in execute("docker push "+ip+":5000/dashboard &"):
	#print(path, end="")
for path in execute("docker push "+ip+":5000/tss-foga &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/tss-fogb &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/tds-foga &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/tds-fogb &"):
	print(path, end="")
print()
print ('----------------------------------------------------------------------------------------------------\n')
print ("End of registry components dockerisation ('compile-dockerize-registry-components.py')")
print ('\n----------------------------------------------------------------------------------------------------\n')
getpass.getpass("Press 'Enter' to continue... ")
print ('\n----------------------------------------------------------------------------------------------------')
