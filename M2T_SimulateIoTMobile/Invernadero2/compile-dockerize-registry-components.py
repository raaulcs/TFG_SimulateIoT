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
with open(PATH+'/sensHumidity0/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/sensHumidity0/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/sensHumidity0 clean package docker:build &"):
	print(path, end="")
#for path in execute(["mvn -f "+PATH+"/MobilityArchitecture/MobileNodes/sensHumidity0 clean package docker:build &"]):
	#print(path, end="")
print()
with open(PATH+'/sensTemperature1/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/sensTemperature1/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/sensTemperature1 clean package docker:build &"):
	print(path, end="")
#for path in execute(["mvn -f "+PATH+"/MobilityArchitecture/MobileNodes/sensTemperature1 clean package docker:build &"]):
	#print(path, end="")
print()
with open(PATH+'/sensWaterLevel2/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/sensWaterLevel2/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/sensWaterLevel2 clean package docker:build &"):
	print(path, end="")
#for path in execute(["mvn -f "+PATH+"/MobilityArchitecture/MobileNodes/sensWaterLevel2 clean package docker:build &"]):
	#print(path, end="")
print()
print ('----------------------------------------------------------------------------------------------------\n')
print('Dockerizing generated actuator components:\n')
with open(PATH+'/actHumidity0/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/actHumidity0/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/actHumidity0 clean package docker:build &"):
	print(path, end="")
print()
with open(PATH+'/actTemperature1/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/actTemperature1/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/actTemperature1 clean package docker:build &"):
	print(path, end="")
print()
with open(PATH+'/actWaterLevel2/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/actWaterLevel2/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/actWaterLevel2 clean package docker:build &"):
	print(path, end="")
print()
print ('----------------------------------------------------------------------------------------------------\n')
print('Dockerizing generated fog and cloud components:\n')
with open(PATH+'/Humidity0/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/Humidity0/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/Humidity0 clean package docker:build &"):
	print(path, end="")
print()
with open(PATH+'/Temperature1/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/Temperature1/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/Temperature1 clean package docker:build &"):
	print(path, end="")
print()
with open(PATH+'/WaterLevel2/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/WaterLevel2/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/WaterLevel2 clean package docker:build &"):
	print(path, end="")
print()
print ('----------------------------------------------------------------------------------------------------\n')
print('Dockerizing generated database and process engine components:\n')
with open(PATH+'/EsperComponentHumidity0/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/EsperComponentHumidity0/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/EsperComponentHumidity0 clean compile assembly:single"):
	print(path, end="")
for path in execute("mvn -f "+PATH+"/EsperComponentHumidity0 docker:build &"):
	print(path, end="")
print()
with open(PATH+'/EsperComponentTemperature1/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/EsperComponentTemperature1/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/EsperComponentTemperature1 clean compile assembly:single"):
	print(path, end="")
for path in execute("mvn -f "+PATH+"/EsperComponentTemperature1 docker:build &"):
	print(path, end="")
print()
with open(PATH+'/EsperComponentWaterLevel2/pom.xml', 'r') as file:
    lines = [line.rstrip() for line in file]
count = 0    
for line in lines:
	if (line.find('<imageName>') != -1):
		replace_line(PATH+'/EsperComponentWaterLevel2/pom.xml', count, line[0:line.find('<imageName>')+len('<imageName>')]+ip+line[line.find(':5000'):999]+'\n')
	count += 1
for path in execute("mvn -f "+PATH+"/EsperComponentWaterLevel2 clean compile assembly:single"):
	print(path, end="")
for path in execute("mvn -f "+PATH+"/EsperComponentWaterLevel2 docker:build &"):
	print(path, end="")
print()
print ('----------------------------------------------------------------------------------------------------\n')
#for path in execute("docker build "+PATH+"/apis/apiTemperature1 -t "+ip+":5000/api-temperature1 . &"):
#	print(path, end="")
#print()
#for path in execute("mvn -f "+PATH+"/dashboard/dashboard2 clean install"):
#	print(path, end="")
#for path in execute("docker build "+PATH+"/dashboard -t "+ip+":5000/dashboard  &"):
	#print(path, end="")
print ('\n----------------------------------------------------------------------------------------------------\n')
for path in execute("docker build "+PATH+"/MobilityArchitecture/TSS/Humidity -t "+ip+":5000/tss-humidity"):
	print(path, end="")
print()
for path in execute("docker build "+PATH+"/MobilityArchitecture/TSS/Temperature -t "+ip+":5000/tss-temperature"):
	print(path, end="")
print()
for path in execute("docker build "+PATH+"/MobilityArchitecture/TSS/WaterLevel -t "+ip+":5000/tss-waterlevel"):
	print(path, end="")
print()
for path in execute("docker build "+PATH+"/MobilityArchitecture/TDS/Humidity -t "+ip+":5000/tds-humidity"):
	print(path, end="")
print()
for path in execute("docker build "+PATH+"/MobilityArchitecture/TDS/Temperature -t "+ip+":5000/tds-temperature"):
	print(path, end="")
print()
for path in execute("docker build "+PATH+"/MobilityArchitecture/TDS/WaterLevel -t "+ip+":5000/tds-waterlevel"):
	print(path, end="")
print()
print ('----------------------------------------------------------------------------------------------------\n')
print('Uploading dockers to registry:\n')
for path in execute("docker push "+ip+":5000/humidity0 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/temperature1 &"):
	print(path, end="")
print()
#for path in execute("docker push "+ip+":5000/api-temperature1 &"):
#	print(path, end="")
#print()
for path in execute("docker push "+ip+":5000/waterlevel2 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/esper-humidity0 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/esper-temperature1 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/esper-waterlevel2 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/actuator-acthumidity0 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/actuator-acttemperature1 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/actuator-actwaterlevel2 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/sensor-senshumidity0 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/sensor-senstemperature1 &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/sensor-senswaterlevel2 &"):
	print(path, end="")
print()
#for path in execute("docker push "+ip+":5000/dashboard &"):
	#print(path, end="")
for path in execute("docker push "+ip+":5000/tss-humidity &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/tss-temperature &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/tss-waterlevel &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/tds-humidity &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/tds-temperature &"):
	print(path, end="")
print()
for path in execute("docker push "+ip+":5000/tds-waterlevel &"):
	print(path, end="")
print()
print ('----------------------------------------------------------------------------------------------------\n')
print ("End of registry components dockerisation ('compile-dockerize-registry-components.py')")
print ('\n----------------------------------------------------------------------------------------------------\n')
getpass.getpass("Press 'Enter' to continue... ")
print ('\n----------------------------------------------------------------------------------------------------')
