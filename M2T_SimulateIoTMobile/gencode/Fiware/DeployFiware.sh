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
echo y | docker-machine rm fogA0 fogB1 Environment

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

docker-machine create --driver virtualbox --virtualbox-memory "2000" fogA0
docker-machine scp "$parent_path"/gencode/daemon.json fogA0:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT fogA0:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/fogA0.sh fogA0:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/fogA0/docker-compose.yml fogA0:~/tutorials.IoT-over-MQTT
docker-machine ssh fogA0 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1111:1883 --constraint node.hostname==fogA0 --name enablingnetwork eclipse-mosquitto;exit"
docker-machine ssh fogA0 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo bash services start;sleep 10s;bash ~/fogA0.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetwork;exit"
docker-machine create --driver virtualbox --virtualbox-memory "2000" fogB1
docker-machine scp "$parent_path"/gencode/daemon.json fogB1:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT fogB1:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/fogB1.sh fogB1:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/fogB1/docker-compose.yml fogB1:~/tutorials.IoT-over-MQTT
docker-machine ssh fogB1 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1111:1883 --constraint node.hostname==fogB1 --name enablingnetwork eclipse-mosquitto;exit"
docker-machine ssh fogB1 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo bash services start;sleep 10s;bash ~/fogB1.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetwork;exit"
echo "
   _   _   _   _   _     _   _   _   _   _   _  
  / \ / \ / \ / \ / \   / \ / \ / \ / \ / \ / \ 
 ( S | w | a | r | m ) ( c | r | e | a | d | o )
  \_/ \_/ \_/ \_/ \_/   \_/ \_/ \_/ \_/ \_/ \_/  
"


echo *Dockerizando todos los componentes generados  ----------------
cd "$parent_path"/gencode/ActA0
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/ActB1
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/SensA0
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/SensB1
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/fogA0
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/fogB1
echo "$pass" | sudo mvn clean package docker:build
cd "$parent_path"/gencode/Fiware/MiddlewareNodeComponent/MNCfogB
echo "$pass" | sudo docker build -t localhost:5000/mncfogb .

cd "$parent_path"/gencode/Fiware/OrionTopicManager/OTMfogB
echo "$pass" | sudo docker build -t localhost:5000/otmfogb .
cd "$parent_path"/gencode/apis/apifogA0
echo "$pass" | sudo docker build -t localhost:5000/apifoga0 .
cd "$parent_path"/gencode/apis/apifogB1
echo "$pass" | sudo docker build -t localhost:5000/apifogb1 .
cd "$parent_path"/gencode/dashboard/dashboard2
mvn clean install
cd ..
echo "$pass" | sudo docker build . -t localhost:5000/dashboard
 
echo *Componentes Dockerizados! ---------------

echo *Subiendo imagenes a DockerHub ----------------
echo "$pass" |sudo docker login --username joseinformatica96 --password-stdin
echo "$pass" | sudo -S docker push localhost:5000/foga0
echo "$pass" | sudo -S docker push localhost:5000/apifoga0
echo "$pass" | sudo -S docker push localhost:5000/fogb1
echo "$pass" | sudo -S docker push localhost:5000/apifogb1
echo "$pass" | sudo -S docker push localhost:5000/mncfogb

echo "$pass" | sudo -S docker push localhost:5000/otmfogb
echo "$pass" | sudo -S docker push localhost:5000/acta0
echo "$pass" | sudo -S docker push localhost:5000/actb1
echo "$pass" | sudo -S docker push localhost:5000/sensa0
echo "$pass" | sudo -S docker push localhost:5000/sensb1
echo "$pass" | sudo -S docker push localhost:5000/dashboard
echo *Subida de imagenes finalizada! ----------------
echo *Bajando imagenes ----------------
docker-machine ssh fogA0 "echo "$pass" | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/apifoga0;docker pull 158.49.189.138:5000/foga0;docker pull 158.49.189.138:5000/acta0;docker pull 158.49.189.138:5000/sensa0;exit"
docker-machine ssh fogB1 "echo "$pass" | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/apifogb1;docker pull 158.49.189.138:5000/fogb1;docker pull 158.49.189.138:5000/mncfogb;docker pull 158.49.189.138:5000/otmfogb;docker pull 158.49.189.138:5000/actb1;docker pull 158.49.189.138:5000/sensb1;exit"

echo *Imagenes bajadas!----------------

echo *Deplegando entorno IoT!----------------
	docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 4000:4000 --constraint node.hostname==fogA0 --name apifogA0 "$ip"/apifoga0;docker service create --network my-network --replicas 1 -p 4001:4000 --constraint node.hostname==fogB1 --name apifogB1 "$ip"/apifogb1;docker service create --network my-network --replicas 1 --constraint node.hostname==fogA0 --name fogA0 "$ip"/foga0;docker service create --network my-network --replicas 1 --constraint node.hostname==fogA0 --name acta0 "$ip"/acta0;docker service create --network my-network --replicas 1 --constraint node.hostname==fogA0 --name sensa0 "$ip"/sensa0;docker service create --network my-network --replicas 1 --constraint node.hostname==fogB1 --name fogB1 "$ip"/fogb1;docker service create --network my-network --hostname mncfogb1 --replicas 1 --constraint node.hostname==fogB1 --name mncfogb1 "$ip"/mncfogb;docker service create --network my-network --hostname otmfogb1 --replicas 1 --constraint node.hostname==fogB1 --name otmfogb1 "$ip"/otmfogb;docker service create --network my-network --replicas 1 --constraint node.hostname==fogB1 --name actb1 "$ip"/actb1;docker service create --network my-network --replicas 1 --constraint node.hostname==fogB1 --name sensb1 "$ip"/sensb1;echo "$pass" | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/dashboard;docker service create --constraint node.hostname==Environment -p 8081:8080 --replicas 1 --name Dashboard "$ip"/dashboard;exit"
echo *Entorno IoT desplegado!----------------
