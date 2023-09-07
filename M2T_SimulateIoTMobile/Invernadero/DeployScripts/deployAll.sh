#!/bin/bash

echo "
   _   _   _   _   _   _   _   _   _     _   _   _   _   _   _   _   _   _   _  
  / \ / \ / \ / \ / \ / \ / \ / \ / \   / \ / \ / \ / \ / \ / \ / \ / \ / \ / \ 
 ( I | n | i | c | i | a | n | d | o ) ( d | e | s | p | l | i | e | g | u | e )
  \_/ \_/ \_/ \_/ \_/ \_/ \_/ \_/ \_/   \_/ \_/ \_/ \_/ \_/ \_/ \_/ \_/ \_/ \_/ 
"
echo "
   _   _   _   _   _   _   _     _   _   _   _   _  
  / \ / \ / \ / \ / \ / \ / \   / \ / \ / \ / \ / \ 
 ( C | r | e | a | n | d | o ) ( S | w | a | r | m )
  \_/ \_/ \_/ \_/ \_/ \_/ \_/   \_/ \_/ \_/ \_/ \_/  
"

docker-machine create --driver virtualbox Environment
docker-machine ssh Environment "docker swarm init --advertise-addr 192.168.99.100;exit" >> "$parent_path"/gencode/token

i=0
while IFS= read -r line; do
  ((i++))
  if [[ "$i" == '5' ]]; then
    echo $line
    TOKEN=$line
  fi
done < "$parent_path"/gencode/token

docker-machine create --driver virtualbox Humidity0
docker-machine create --driver virtualbox Temperature1
docker-machine create --driver virtualbox WaterLevel2
echo "
   _   _   _   _   _     _   _   _   _   _   _  
  / \ / \ / \ / \ / \   / \ / \ / \ / \ / \ / \ 
 ( S | w | a | r | m ) ( c | r | e | a | d | o )
  \_/ \_/ \_/ \_/ \_/   \_/ \_/ \_/ \_/ \_/ \_/  
"

java -jar MTCLauncher.jar book2publication2html.properties
echo Humidity0 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
docker-machine ip Humidity0 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
echo Temperature1 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
docker-machine ip Temperature1 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
echo WaterLevel2 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
docker-machine ip WaterLevel2 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones

cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/Humidity0/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/Temperature1/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/WaterLevel2/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/sensHumidity0/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/sensTemperature1/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/sensWaterLevel2/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/actHumidity0/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/actTemperature1/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/actWaterLevel2/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/EsperComponentHumidity0/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/EsperComponentTemperature1/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/EsperComponentWaterLevel2/src/main/resources
 
echo *Dockerizando todos los componentes generados  ----------------
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/actHumidity0
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/actTemperature1
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/actWaterLevel2
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/sensHumidity0
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/sensTemperature1
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/sensWaterLevel2
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/Humidity0
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/Temperature1
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/WaterLevel2
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/EsperComponentHumidity0
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/EsperComponentTemperature1
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/EsperComponentWaterLevel2
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/apis/apiTemperature1
sudo docker build -t localhost:5000/apitemperature1 .
echo *Componentes Dockerizados! ---------------

echo *Subiendo imagenes a DockerHub ----------------
echo pepita123* | docker login --username joseinformatica96 --password-stdin
echo pepita123* | sudo -S docker push localhost:5000/humidity0
echo pepita123* | sudo -S docker push localhost:5000/temperature1
echo pepita123* | sudo -S docker push localhost:5000/apitemperature1
echo pepita123* | sudo -S docker push localhost:5000/waterlevel2
echo pepita123* | sudo -S docker push localhost:5000/espercomponenthumidity0
echo pepita123* | sudo -S docker push localhost:5000/espercomponenttemperature1
echo pepita123* | sudo -S docker push localhost:5000/espercomponentwaterlevel2
echo pepita123* | sudo -S docker push localhost:5000/acthumidity0
echo pepita123* | sudo -S docker push localhost:5000/acttemperature1
echo pepita123* | sudo -S docker push localhost:5000/actwaterlevel2
echo pepita123* | sudo -S docker push localhost:5000/senshumidity0
echo pepita123* | sudo -S docker push localhost:5000/senstemperature1
echo pepita123* | sudo -S docker push localhost:5000/senswaterlevel2
echo *Subida de imagenes finalizada! ----------------
echo *Bajando imagenes ----------------
docker-machine ssh Humidity0 "$TOKEN;docker pull eclipse-mosquitto;echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/humidity0;docker pull 158.49.189.138:5000/espercomponenthumidity0;docker pull 158.49.189.138:5000/acthumidity0;docker pull 158.49.189.138:5000/senshumidity0;exit"
docker-machine ssh Temperature1 "$TOKEN;docker pull eclipse-mosquitto;echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull mongo;docker pull 158.49.189.138:5000/apitemperature1;docker pull 158.49.189.138:5000/temperature1;docker pull 158.49.189.138:5000/espercomponenttemperature1;docker pull 158.49.189.138:5000/acttemperature1;docker pull 158.49.189.138:5000/senstemperature1;exit"
docker-machine ssh WaterLevel2 "$TOKEN;docker pull eclipse-mosquitto;echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/waterlevel2;docker pull 158.49.189.138:5000/espercomponentwaterlevel2;docker pull 158.49.189.138:5000/actwaterlevel2;docker pull 158.49.189.138:5000/senswaterlevel2;exit"
echo *Imagenes bajadas!----------------

echo *Deplegando entorno IoT!----------------
	docker-machine ssh Environment "docker service create --constraint node.hostname==Humidity0 --replicas 1 -p 1883:1883 --name MosquittoHumidity0 eclipse-mosquitto;docker service create --constraint node.hostname==Temperature1 -p 27018:27017 --replicas 1 --name MongoTemperature1 mongo;docker service create --replicas 1 -p 4001:4000 --constraint node.hostname==Temperature1 --name apiTemperature1 localhost:5000/apitemperature1;docker service create --constraint node.hostname==Temperature1 --replicas 1 -p 1884:1883 --name MosquittoTemperature1 eclipse-mosquitto;docker service create --constraint node.hostname==WaterLevel2 --replicas 1 -p 1885:1883 --name MosquittoWaterLevel2 eclipse-mosquitto;docker service create --replicas 1 --constraint node.hostname==Humidity0 --name Humidity0 localhost:5000/humidity0;docker service create --replicas 1 --constraint node.hostname==Humidity0 --name EsperComponentHumidity0 localhost:5000/espercomponenthumidity0;docker service create --replicas 1 --constraint node.hostname==Temperature1 --name Temperature1 localhost:5000/temperature1;docker service create --replicas 1 --constraint node.hostname==Temperature1 --name EsperComponentTemperature1 localhost:5000/espercomponenttemperature1;docker service create --replicas 1 --constraint node.hostname==WaterLevel2 --name WaterLevel2 localhost:5000/waterlevel2;docker service create --replicas 1 --constraint node.hostname==WaterLevel2 --name EsperComponentWaterLevel2 localhost:5000/espercomponentwaterlevel2;	docker service create --replicas 1 --name acthumidity0 localhost:5000/acthumidity0;docker service create --replicas 1 --name acttemperature1 localhost:5000/acttemperature1;docker service create --replicas 1 --name actwaterlevel2 localhost:5000/actwaterlevel2;docker service create --replicas 1 --name senshumidity0 localhost:5000/senshumidity0;docker service create --replicas 1 --name senstemperature1 localhost:5000/senstemperature1;docker service create --replicas 1 --name senswaterlevel2 localhost:5000/senswaterlevel2;exit"
echo *Entorno IoT desplegado!----------------
