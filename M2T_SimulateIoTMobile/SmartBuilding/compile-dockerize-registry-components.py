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
print('Dockerizing generated sensor components:\n')
with open(PATH+'/sensPresence0/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/sensPresence0/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/sensPresence0 clean package docker:build &"):
	print(path, end="")
#for path in execute(["mvn -f "+PATH+"/MobilityArchitecture/MobileNodes/sensPresence0 clean package docker:build &"]):
	#print(path, end="")
print()
with open(PATH+'/sensBrightness1/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/sensBrightness1/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/sensBrightness1 clean package docker:build &"):
	print(path, end="")
#for path in execute(["mvn -f "+PATH+"/MobilityArchitecture/MobileNodes/sensBrightness1 clean package docker:build &"]):
	#print(path, end="")
print()
with open(PATH+'/sensWater2/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/sensWater2/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/sensWater2 clean package docker:build &"):
	print(path, end="")
#for path in execute(["mvn -f "+PATH+"/MobilityArchitecture/MobileNodes/sensWater2 clean package docker:build &"]):
	#print(path, end="")
print()
with open(PATH+'/sensGas3/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/sensGas3/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/sensGas3 clean package docker:build &"):
	print(path, end="")
#for path in execute(["mvn -f "+PATH+"/MobilityArchitecture/MobileNodes/sensGas3 clean package docker:build &"]):
	#print(path, end="")
print()
print ('----------------------------------------------------------------------------------------------------\n')
print('Dockerizing generated actuator components:\n')
with open(PATH+'/actPresence0/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/actPresence0/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/actPresence0 clean package docker:build &"):
	print(path, end="")
print()
with open(PATH+'/actBrightness1/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/actBrightness1/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/actBrightness1 clean package docker:build &"):
	print(path, end="")
print()
with open(PATH+'/actWater2/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/actWater2/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/actWater2 clean package docker:build &"):
	print(path, end="")
print()
with open(PATH+'/actGas3/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/actGas3/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/actGas3 clean package docker:build &"):
	print(path, end="")
print()
print ('----------------------------------------------------------------------------------------------------\n')
print('Dockerizing generated fog and cloud components:\n')
with open(PATH+'/Presence0/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/Presence0/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/Presence0 clean package docker:build &"):
	print(path, end="")
print()
with open(PATH+'/Brightness1/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/Brightness1/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/Brightness1 clean package docker:build &"):
	print(path, end="")
print()
with open(PATH+'/Water2/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/Water2/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/Water2 clean package docker:build &"):
	print(path, end="")
print()
with open(PATH+'/Gas3/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/Gas3/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/Gas3 clean package docker:build &"):
	print(path, end="")
print()
print ('----------------------------------------------------------------------------------------------------\n')
print('Dockerizing generated database and process engine components:\n')
with open(PATH+'/EsperComponentPresence0/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/EsperComponentPresence0/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/EsperComponentPresence0 clean compile assembly:single"):
	print(path, end="")
for path in execute("mvn -f "+PATH+"/EsperComponentPresence0 docker:build &"):
	print(path, end="")
print()
with open(PATH+'/EsperComponentBrightness1/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/EsperComponentBrightness1/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/EsperComponentBrightness1 clean compile assembly:single"):
	print(path, end="")
for path in execute("mvn -f "+PATH+"/EsperComponentBrightness1 docker:build &"):
	print(path, end="")
print()
with open(PATH+'/EsperComponentWater2/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/EsperComponentWater2/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/EsperComponentWater2 clean compile assembly:single"):
	print(path, end="")
for path in execute("mvn -f "+PATH+"/EsperComponentWater2 docker:build &"):
	print(path, end="")
print()
with open(PATH+'/EsperComponentGas3/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/EsperComponentGas3/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/EsperComponentGas3 clean compile assembly:single"):
	print(path, end="")
for path in execute("mvn -f "+PATH+"/EsperComponentGas3 docker:build &"):
	print(path, end="")
print()
print ('----------------------------------------------------------------------------------------------------\n')
#for path in execute("mvn -f "+PATH+"/dashboard/dashboard2 clean install"):
#	print(path, end="")
#for path in execute("docker build "+PATH+"/dashboard -t "+ip+":5000/dashboard  &"):
	#print(path, end="")
print ('\n----------------------------------------------------------------------------------------------------\n')
for path in execute("docker build "+PATH+"/MobilityArchitecture/TSS/Presence -t "+ip+":5000/tss-presence"):
	print(path, end="")
print()
for path in execute("docker build "+PATH+"/MobilityArchitecture/TSS/Brightness -t "+ip+":5000/tss-brightness"):
	print(path, end="")
print()
for path in execute("docker build "+PATH+"/MobilityArchitecture/TSS/Water -t "+ip+":5000/tss-water"):
	print(path, end="")
print()
for path in execute("docker build "+PATH+"/MobilityArchitecture/TSS/Gas -t "+ip+":5000/tss-gas"):
	print(path, end="")
print()
for path in execute("docker build "+PATH+"/MobilityArchitecture/TDS/Presence -t "+ip+":5000/tds-presence"):
	print(path, end="")
print()
for path in execute("docker build "+PATH+"/MobilityArchitecture/TDS/Brightness -t "+ip+":5000/tds-brightness"):
	print(path, end="")
print()
for path in execute("docker build "+PATH+"/MobilityArchitecture/TDS/Water -t "+ip+":5000/tds-water"):
	print(path, end="")
print()
for path in execute("docker build "+PATH+"/MobilityArchitecture/TDS/Gas -t "+ip+":5000/tds-gas"):
	print(path, end="")
print()
print ('----------------------------------------------------------------------------------------------------\n')
print('Uploading dockers to registry:\n')
for path in execute("docker push "+ip+":5000/presence0 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/brightness1 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/water2 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/gas3 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/esper-presence0 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/esper-brightness1 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/esper-water2 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/esper-gas3 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/actuator-actpresence0 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/actuator-actbrightness1 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/actuator-actwater2 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/actuator-actgas3 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/sensor-senspresence0 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/sensor-sensbrightness1 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/sensor-senswater2 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/sensor-sensgas3 &"):
	print(path, end="")
print()
#for path in execute("docker push "+ip+":5000/dashboard &"):
	#print(path, end="")
for path in execute("docker push "+ip+":5000/tss-presence &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/tss-brightness &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/tss-water &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/tss-gas &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/tds-presence &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/tds-brightness &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/tds-water &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/tds-gas &"):
	print(path, end="")
print()
print ('----------------------------------------------------------------------------------------------------\n')
print ("End of registry components dockerisation ('compile-dockerize-registry-components.py')")
print ('\n----------------------------------------------------------------------------------------------------\n')
getpass.getpass("Press 'Enter' to continue... ")
print ('\n----------------------------------------------------------------------------------------------------')
