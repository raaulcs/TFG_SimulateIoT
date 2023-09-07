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
echo y | docker-machine rm Presence0 Brightness1 Water2 Gas3 Environment

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

docker-machine create --driver virtualbox --virtualbox-memory "2000" Presence0
docker-machine scp "$parent_path"/gencode/daemon.json Presence0:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT Presence0:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/Presence0.sh Presence0:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/Presence0/docker-compose.yml Presence0:~/tutorials.IoT-over-MQTT
docker-machine ssh Presence0 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1111:1883 --constraint node.hostname==Presence0 --name enablingnetwork eclipse-mosquitto;exit"
docker-machine ssh Presence0 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo bash services start;sleep 10s;bash ~/Presence0.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetwork;exit"
docker-machine create --driver virtualbox --virtualbox-memory "2000" Brightness1
docker-machine scp "$parent_path"/gencode/daemon.json Brightness1:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT Brightness1:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/Brightness1.sh Brightness1:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/Brightness1/docker-compose.yml Brightness1:~/tutorials.IoT-over-MQTT
docker-machine ssh Brightness1 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1111:1883 --constraint node.hostname==Brightness1 --name enablingnetwork eclipse-mosquitto;exit"
docker-machine ssh Brightness1 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo bash services start;sleep 10s;bash ~/Brightness1.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetwork;exit"
docker-machine create --driver virtualbox --virtualbox-memory "2000" Water2
docker-machine scp "$parent_path"/gencode/daemon.json Water2:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT Water2:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/Water2.sh Water2:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/Water2/docker-compose.yml Water2:~/tutorials.IoT-over-MQTT
docker-machine ssh Water2 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1111:1883 --constraint node.hostname==Water2 --name enablingnetwork eclipse-mosquitto;exit"
docker-machine ssh Water2 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo bash services start;sleep 10s;bash ~/Water2.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetwork;exit"
docker-machine create --driver virtualbox --virtualbox-memory "2000" Gas3
docker-machine scp "$parent_path"/gencode/daemon.json Gas3:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT Gas3:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/Gas3.sh Gas3:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/Gas3/docker-compose.yml Gas3:~/tutorials.IoT-over-MQTT
docker-machine ssh Gas3 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1111:1883 --constraint node.hostname==Gas3 --name enablingnetwork eclipse-mosquitto;exit"
docker-machine ssh Gas3 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo bash services start;sleep 10s;bash ~/Gas3.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetwork;exit"
echo "
   _   _   _   _   _     _   _   _   _   _   _  
  / \ / \ / \ / \ / \   / \ / \ / \ / \ / \ / \ 
 ( S | w | a | r | m ) ( c | r | e | a | d | o )
  \_/ \_/ \_/ \_/ \_/   \_/ \_/ \_/ \_/ \_/ \_/  
"


echo *Dockerizando todos los componentes generados  ----------------
cd "$parent_path"/gencode/actPresence0
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/actBrightness1
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/actWater2
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/actGas3
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensPresence0
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensBrightness1
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensWater2
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensGas3
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/Presence0
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/Brightness1
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/Water2
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/Gas3
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/Fiware/MiddlewareNodeComponent/MNCPresence
echo "$pass" | sudo docker build -t localhost:5000/mncpresence .

cd "$parent_path"/gencode/Fiware/OrionTopicManager/OTMPresence
echo "$pass" | sudo docker build -t localhost:5000/otmpresence .
cd "$parent_path"/gencode/Fiware/MiddlewareNodeComponent/MNCBrightness
echo "$pass" | sudo docker build -t localhost:5000/mncbrightness .

cd "$parent_path"/gencode/Fiware/OrionTopicManager/OTMBrightness
echo "$pass" | sudo docker build -t localhost:5000/otmbrightness .
cd "$parent_path"/gencode/Fiware/MiddlewareNodeComponent/MNCWater
echo "$pass" | sudo docker build -t localhost:5000/mncwater .

cd "$parent_path"/gencode/Fiware/OrionTopicManager/OTMWater
echo "$pass" | sudo docker build -t localhost:5000/otmwater .
cd "$parent_path"/gencode/Fiware/MiddlewareNodeComponent/MNCGas
echo "$pass" | sudo docker build -t localhost:5000/mncgas .

cd "$parent_path"/gencode/Fiware/OrionTopicManager/OTMGas
echo "$pass" | sudo docker build -t localhost:5000/otmgas .
cd "$parent_path"/gencode/dashboard/dashboard2
mvn clean install
cd ..
echo "$pass" | sudo docker build . -t localhost:5000/dashboard
 
echo *Componentes Dockerizados! ---------------

echo *Subiendo imagenes a DockerHub ----------------
echo "$pass" |sudo docker login --username joseinformatica96 --password-stdin
echo "$pass" | sudo -S docker push localhost:5000/presence0
echo "$pass" | sudo -S docker push localhost:5000/brightness1
echo "$pass" | sudo -S docker push localhost:5000/water2
echo "$pass" | sudo -S docker push localhost:5000/gas3
echo "$pass" | sudo -S docker push localhost:5000/mncpresence

echo "$pass" | sudo -S docker push localhost:5000/otmpresence
echo "$pass" | sudo -S docker push localhost:5000/mncbrightness

echo "$pass" | sudo -S docker push localhost:5000/otmbrightness
echo "$pass" | sudo -S docker push localhost:5000/mncwater

echo "$pass" | sudo -S docker push localhost:5000/otmwater
echo "$pass" | sudo -S docker push localhost:5000/mncgas

echo "$pass" | sudo -S docker push localhost:5000/otmgas
echo "$pass" | sudo -S docker push localhost:5000/actpresence0
echo "$pass" | sudo -S docker push localhost:5000/actbrightness1
echo "$pass" | sudo -S docker push localhost:5000/actwater2
echo "$pass" | sudo -S docker push localhost:5000/actgas3
echo "$pass" | sudo -S docker push localhost:5000/senspresence0
echo "$pass" | sudo -S docker push localhost:5000/sensbrightness1
echo "$pass" | sudo -S docker push localhost:5000/senswater2
echo "$pass" | sudo -S docker push localhost:5000/sensgas3
echo "$pass" | sudo -S docker push localhost:5000/dashboard
echo *Subida de imagenes finalizada! ----------------
echo *Bajando imagenes ----------------
docker-machine ssh Presence0 "echo "$pass" | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/presence0;docker pull 158.49.189.138:5000/mncpresence;docker pull 158.49.189.138:5000/otmpresence;docker pull 158.49.189.138:5000/actpresence0;docker pull 158.49.189.138:5000/senspresence0;exit"
docker-machine ssh Brightness1 "echo "$pass" | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/brightness1;docker pull 158.49.189.138:5000/mncbrightness;docker pull 158.49.189.138:5000/otmbrightness;docker pull 158.49.189.138:5000/actbrightness1;docker pull 158.49.189.138:5000/sensbrightness1;exit"
docker-machine ssh Water2 "echo "$pass" | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/water2;docker pull 158.49.189.138:5000/mncwater;docker pull 158.49.189.138:5000/otmwater;docker pull 158.49.189.138:5000/actwater2;docker pull 158.49.189.138:5000/senswater2;exit"
docker-machine ssh Gas3 "echo "$pass" | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/gas3;docker pull 158.49.189.138:5000/mncgas;docker pull 158.49.189.138:5000/otmgas;docker pull 158.49.189.138:5000/actgas3;docker pull 158.49.189.138:5000/sensgas3;exit"

echo *Imagenes bajadas!----------------

echo *Deplegando entorno IoT!----------------
	docker-machine ssh Environment "docker service create --network my-network --replicas 1 --constraint node.hostname==Presence0 --name Presence0 "$ip"/presence0;docker service create --network my-network --hostname mncpresence0 --replicas 1 --constraint node.hostname==Presence0 --name mncpresence0 "$ip"/mncpresence;docker service create --network my-network --hostname otmpresence0 --replicas 1 --constraint node.hostname==Presence0 --name otmpresence0 "$ip"/otmpresence;docker service create --network my-network --replicas 1 --constraint node.hostname==Presence0 --name actpresence0 "$ip"/actpresence0;docker service create --network my-network --replicas 1 --constraint node.hostname==Presence0 --name senspresence0 "$ip"/senspresence0;docker service create --network my-network --replicas 1 --constraint node.hostname==Brightness1 --name Brightness1 "$ip"/brightness1;docker service create --network my-network --hostname mncbrightness1 --replicas 1 --constraint node.hostname==Brightness1 --name mncbrightness1 "$ip"/mncbrightness;docker service create --network my-network --hostname otmbrightness1 --replicas 1 --constraint node.hostname==Brightness1 --name otmbrightness1 "$ip"/otmbrightness;docker service create --network my-network --replicas 2 --constraint node.hostname==Brightness1 --name actbrightness1 "$ip"/actbrightness1;docker service create --network my-network --replicas 1 --constraint node.hostname==Brightness1 --name sensbrightness1 "$ip"/sensbrightness1;docker service create --network my-network --replicas 1 --constraint node.hostname==Water2 --name Water2 "$ip"/water2;docker service create --network my-network --hostname mncwater2 --replicas 1 --constraint node.hostname==Water2 --name mncwater2 "$ip"/mncwater;docker service create --network my-network --hostname otmwater2 --replicas 1 --constraint node.hostname==Water2 --name otmwater2 "$ip"/otmwater;docker service create --network my-network --replicas 1 --constraint node.hostname==Water2 --name actwater2 "$ip"/actwater2;docker service create --network my-network --replicas 1 --constraint node.hostname==Water2 --name senswater2 "$ip"/senswater2;docker service create --network my-network --replicas 1 --constraint node.hostname==Gas3 --name Gas3 "$ip"/gas3;docker service create --network my-network --hostname mncgas3 --replicas 1 --constraint node.hostname==Gas3 --name mncgas3 "$ip"/mncgas;docker service create --network my-network --hostname otmgas3 --replicas 1 --constraint node.hostname==Gas3 --name otmgas3 "$ip"/otmgas;docker service create --network my-network --replicas 1 --constraint node.hostname==Gas3 --name actgas3 "$ip"/actgas3;docker service create --network my-network --replicas 1 --constraint node.hostname==Gas3 --name sensgas3 "$ip"/sensgas3;echo "$pass" | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/dashboard;docker service create --constraint node.hostname==Environment -p 8081:8080 --replicas 1 --name Dashboard "$ip"/dashboard;exit"
echo *Entorno IoT desplegado!----------------
