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

parent_path=$( cd "$(dirname "${BASH_SOURCE[0]}")" ; cd .. ; cd .. ; pwd -P )
ip=158.49.189.138:5000
pass=pepita123*

rm "$parent_path"/gencode/token
rm "$parent_path"/gencode/tabladirecciones
rm "$parent_path"/gencode/ipenvironment
echo y | docker-machine rm Humidity0 Temperature1 WaterLevel2 Environment

docker-machine create --driver virtualbox Environment

docker-machine ls >> "$parent_path"/gencode/ipenvironment
IPENV=$(grep -oE "\b([0-9]{1,3}\.){3}[0-9]{1,3}\b" "$parent_path"/gencode/ipenvironment)
docker-machine ssh Environment "docker swarm init --advertise-addr "$IPENV";exit" >> "$parent_path"/gencode/token
docker-machine ssh Environment "docker network create --driver overlay --attachable my-network;docker service create --name=viz --publish=8080:8080/tcp --constraint=node.role==manager --mount=type=bind,src=/var/run/docker.sock,dst=/var/run/docker.sock dockersamples/visualizer;exit"

i=0
while IFS= read -r line; do
  ((i++))
  if [[ "$i" == '5' ]]; then
    echo $line
    TOKEN=$line
  fi
done < "$parent_path"/gencode/token

docker-machine create --driver virtualbox --virtualbox-memory "2000" Humidity0
docker-machine scp "$parent_path"/gencode/daemon.json Humidity0:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT Humidity0:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/Humidity0.sh Humidity0:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/Humidity0/docker-compose.yml Humidity0:~/tutorials.IoT-over-MQTT
docker-machine ssh Humidity0 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1111:1883 --constraint node.hostname==Humidity0 --name enablingnetwork eclipse-mosquitto;exit"
docker-machine ssh Humidity0 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo bash services start;sleep 10s;bash ~/Humidity0.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetwork;exit"
docker-machine create --driver virtualbox --virtualbox-memory "2000" Temperature1
docker-machine scp "$parent_path"/gencode/daemon.json Temperature1:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT Temperature1:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/Temperature1.sh Temperature1:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/Temperature1/docker-compose.yml Temperature1:~/tutorials.IoT-over-MQTT
docker-machine ssh Temperature1 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1111:1883 --constraint node.hostname==Temperature1 --name enablingnetwork eclipse-mosquitto;exit"
docker-machine ssh Temperature1 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo bash services start;sleep 10s;bash ~/Temperature1.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetwork;exit"
docker-machine create --driver virtualbox --virtualbox-memory "2000" WaterLevel2
docker-machine scp "$parent_path"/gencode/daemon.json WaterLevel2:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT WaterLevel2:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/WaterLevel2.sh WaterLevel2:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/WaterLevel2/docker-compose.yml WaterLevel2:~/tutorials.IoT-over-MQTT
docker-machine ssh WaterLevel2 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1111:1883 --constraint node.hostname==WaterLevel2 --name enablingnetwork eclipse-mosquitto;exit"
docker-machine ssh WaterLevel2 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo bash services start;sleep 10s;bash ~/WaterLevel2.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetwork;exit"
echo "
   _   _   _   _   _     _   _   _   _   _   _  
  / \ / \ / \ / \ / \   / \ / \ / \ / \ / \ / \ 
 ( S | w | a | r | m ) ( c | r | e | a | d | o )
  \_/ \_/ \_/ \_/ \_/   \_/ \_/ \_/ \_/ \_/ \_/  
"


echo *Dockerizando todos los componentes generados  ----------------
cd "$parent_path"/gencode/actHumidity0
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/actTemperature1
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/actWaterLevel2
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensHumidity0
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensTemperature1
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensWaterLevel2
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/Humidity0
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/Temperature1
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/WaterLevel2
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/Fiware/MiddlewareNodeComponent/MNCHumidity
echo "$pass" | sudo docker build -t localhost:5000/mnchumidity .

cd "$parent_path"/gencode/Fiware/OrionTopicManager/OTMHumidity
echo "$pass" | sudo docker build -t localhost:5000/otmhumidity .
cd "$parent_path"/gencode/Fiware/MiddlewareNodeComponent/MNCTemperature
echo "$pass" | sudo docker build -t localhost:5000/mnctemperature .

cd "$parent_path"/gencode/Fiware/OrionTopicManager/OTMTemperature
echo "$pass" | sudo docker build -t localhost:5000/otmtemperature .
cd "$parent_path"/gencode/Fiware/MiddlewareNodeComponent/MNCWaterLevel
echo "$pass" | sudo docker build -t localhost:5000/mncwaterlevel .

cd "$parent_path"/gencode/Fiware/OrionTopicManager/OTMWaterLevel
echo "$pass" | sudo docker build -t localhost:5000/otmwaterlevel .
cd "$parent_path"/gencode/apis/apiTemperature1
echo "$pass" | sudo docker build -t localhost:5000/apitemperature1 .
cd "$parent_path"/gencode/dashboard/dashboard2
mvn clean install
cd ..
echo "$pass" | sudo docker build . -t localhost:5000/dashboard
 
echo *Componentes Dockerizados! ---------------

echo *Subiendo imagenes a DockerHub ----------------
echo "$pass" |sudo docker login --username joseinformatica96 --password-stdin
echo "$pass" | sudo -S docker push localhost:5000/humidity0
echo "$pass" | sudo -S docker push localhost:5000/temperature1
echo "$pass" | sudo -S docker push localhost:5000/apitemperature1
echo "$pass" | sudo -S docker push localhost:5000/waterlevel2
echo "$pass" | sudo -S docker push localhost:5000/mnchumidity

echo "$pass" | sudo -S docker push localhost:5000/otmhumidity
echo "$pass" | sudo -S docker push localhost:5000/mnctemperature

echo "$pass" | sudo -S docker push localhost:5000/otmtemperature
echo "$pass" | sudo -S docker push localhost:5000/mncwaterlevel

echo "$pass" | sudo -S docker push localhost:5000/otmwaterlevel
echo "$pass" | sudo -S docker push localhost:5000/acthumidity0
echo "$pass" | sudo -S docker push localhost:5000/acttemperature1
echo "$pass" | sudo -S docker push localhost:5000/actwaterlevel2
echo "$pass" | sudo -S docker push localhost:5000/senshumidity0
echo "$pass" | sudo -S docker push localhost:5000/senstemperature1
echo "$pass" | sudo -S docker push localhost:5000/senswaterlevel2
echo "$pass" | sudo -S docker push localhost:5000/dashboard
echo *Subida de imagenes finalizada! ----------------
echo *Bajando imagenes ----------------
docker-machine ssh Humidity0 "echo "$pass" | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/humidity0;docker pull 158.49.189.138:5000/mnchumidity;docker pull 158.49.189.138:5000/otmhumidity;docker pull 158.49.189.138:5000/acthumidity0;docker pull 158.49.189.138:5000/senshumidity0;exit"
docker-machine ssh Temperature1 "echo "$pass" | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/apitemperature1;docker pull 158.49.189.138:5000/temperature1;docker pull 158.49.189.138:5000/mnctemperature;docker pull 158.49.189.138:5000/otmtemperature;docker pull 158.49.189.138:5000/acttemperature1;docker pull 158.49.189.138:5000/senstemperature1;exit"
docker-machine ssh WaterLevel2 "echo "$pass" | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/waterlevel2;docker pull 158.49.189.138:5000/mncwaterlevel;docker pull 158.49.189.138:5000/otmwaterlevel;docker pull 158.49.189.138:5000/actwaterlevel2;docker pull 158.49.189.138:5000/senswaterlevel2;exit"

echo *Imagenes bajadas!----------------

echo *Deplegando entorno IoT!----------------
	docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 4001:4000 --constraint node.hostname==Temperature1 --name apiTemperature1 "$ip"/apitemperature1;docker service create --network my-network --replicas 1 --constraint node.hostname==Humidity0 --name Humidity0 "$ip"/humidity0;docker service create --network my-network --hostname mnchumidity0 --replicas 1 --constraint node.hostname==Humidity0 --name mnchumidity0 "$ip"/mnchumidity;docker service create --network my-network --hostname otmhumidity0 --replicas 1 --constraint node.hostname==Humidity0 --name otmhumidity0 "$ip"/otmhumidity;docker service create --network my-network --replicas 1 --constraint node.hostname==Humidity0 --name acthumidity0 "$ip"/acthumidity0;docker service create --network my-network --replicas 1 --constraint node.hostname==Humidity0 --name senshumidity0 "$ip"/senshumidity0;docker service create --network my-network --replicas 1 --constraint node.hostname==Temperature1 --name Temperature1 "$ip"/temperature1;docker service create --network my-network --hostname mnctemperature1 --replicas 1 --constraint node.hostname==Temperature1 --name mnctemperature1 "$ip"/mnctemperature;docker service create --network my-network --hostname otmtemperature1 --replicas 1 --constraint node.hostname==Temperature1 --name otmtemperature1 "$ip"/otmtemperature;docker service create --network my-network --replicas 1 --constraint node.hostname==Temperature1 --name acttemperature1 "$ip"/acttemperature1;docker service create --network my-network --replicas 1 --constraint node.hostname==Temperature1 --name senstemperature1 "$ip"/senstemperature1;docker service create --network my-network --replicas 1 --constraint node.hostname==WaterLevel2 --name WaterLevel2 "$ip"/waterlevel2;docker service create --network my-network --hostname mncwaterlevel2 --replicas 1 --constraint node.hostname==WaterLevel2 --name mncwaterlevel2 "$ip"/mncwaterlevel;docker service create --network my-network --hostname otmwaterlevel2 --replicas 1 --constraint node.hostname==WaterLevel2 --name otmwaterlevel2 "$ip"/otmwaterlevel;docker service create --network my-network --replicas 1 --constraint node.hostname==WaterLevel2 --name actwaterlevel2 "$ip"/actwaterlevel2;docker service create --network my-network --replicas 1 --constraint node.hostname==WaterLevel2 --name senswaterlevel2 "$ip"/senswaterlevel2;echo "$pass" | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/dashboard;docker service create --constraint node.hostname==Environment -p 8081:8080 --replicas 1 --name Dashboard "$ip"/dashboard;exit"
echo *Entorno IoT desplegado!----------------
