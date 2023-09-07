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

docker-machine create --driver virtualbox fogA0
docker-machine create --driver virtualbox fogB1
echo "
   _   _   _   _   _     _   _   _   _   _   _  
  / \ / \ / \ / \ / \   / \ / \ / \ / \ / \ / \ 
 ( S | w | a | r | m ) ( c | r | e | a | d | o )
  \_/ \_/ \_/ \_/ \_/   \_/ \_/ \_/ \_/ \_/ \_/  
"

java -jar MTCLauncher.jar book2publication2html.properties
echo fogA0 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
docker-machine ip fogA0 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
echo fogB1 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
docker-machine ip fogB1 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones

cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/fogA0/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/SensA0/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/ActA0/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/fogB1/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/SensB1/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/ActB1/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/EsperComponentfogB1/src/main/resources
 
echo *Dockerizando todos los componentes generados  ----------------
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/ActA0
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/ActB1
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/SensA0
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/SensB1
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/fogA0
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/fogB1
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/EsperComponentfogB1
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/apis/apifogA0
sudo docker build -t localhost:5000/apifoga0 .
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/apis/apifogB1
sudo docker build -t localhost:5000/apifogb1 .
echo *Componentes Dockerizados! ---------------

echo *Subiendo imagenes a DockerHub ----------------
echo pepita123* | docker login --username joseinformatica96 --password-stdin
echo pepita123* | sudo -S docker push localhost:5000/foga0
echo pepita123* | sudo -S docker push localhost:5000/apifoga0
echo pepita123* | sudo -S docker push localhost:5000/fogb1
echo pepita123* | sudo -S docker push localhost:5000/apifogb1
echo pepita123* | sudo -S docker push localhost:5000/espercomponentfogb1
echo pepita123* | sudo -S docker push localhost:5000/acta0
echo pepita123* | sudo -S docker push localhost:5000/actb1
echo pepita123* | sudo -S docker push localhost:5000/sensa0
echo pepita123* | sudo -S docker push localhost:5000/sensb1
echo *Subida de imagenes finalizada! ----------------
echo *Bajando imagenes ----------------
docker-machine ssh fogA0 "$TOKEN;docker pull eclipse-mosquitto;echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull mongo;docker pull 158.49.189.138:5000/apifoga0;docker pull 158.49.189.138:5000/foga0;docker pull 158.49.189.138:5000/acta0;docker pull 158.49.189.138:5000/sensa0;exit"
docker-machine ssh fogB1 "$TOKEN;docker pull eclipse-mosquitto;echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull mongo;docker pull 158.49.189.138:5000/apifogb1;docker pull 158.49.189.138:5000/fogb1;docker pull 158.49.189.138:5000/espercomponentfogb1;docker pull 158.49.189.138:5000/actb1;docker pull 158.49.189.138:5000/sensb1;exit"
echo *Imagenes bajadas!----------------

echo *Deplegando entorno IoT!----------------
	docker-machine ssh Environment "docker service create --constraint node.hostname==fogA0 -p 27017:27017 --replicas 1 --name MongofogA0 mongo;docker service create --replicas 1 -p 4000:4000 --constraint node.hostname==fogA0 --name apifogA0 localhost:5000/apifoga0;docker service create --constraint node.hostname==fogA0 --replicas 1 -p 1883:1883 --name MosquittofogA0 eclipse-mosquitto;docker service create --constraint node.hostname==fogB1 -p 27018:27017 --replicas 1 --name MongofogB1 mongo;docker service create --replicas 1 -p 4001:4000 --constraint node.hostname==fogB1 --name apifogB1 localhost:5000/apifogb1;docker service create --constraint node.hostname==fogB1 --replicas 1 -p 1884:1883 --name MosquittofogB1 eclipse-mosquitto;docker service create --replicas 1 --constraint node.hostname==fogA0 --name fogA0 localhost:5000/foga0;docker service create --replicas 1 --constraint node.hostname==fogB1 --name fogB1 localhost:5000/fogb1;docker service create --replicas 1 --constraint node.hostname==fogB1 --name EsperComponentfogB1 localhost:5000/espercomponentfogb1;	docker service create --replicas 1 --name acta0 localhost:5000/acta0;docker service create --replicas 1 --name actb1 localhost:5000/actb1;docker service create --replicas 1 --name sensa0 localhost:5000/sensa0;docker service create --replicas 1 --name sensb1 localhost:5000/sensb1;exit"
echo *Entorno IoT desplegado!----------------
