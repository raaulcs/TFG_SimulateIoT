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
docker-machine create --driver virtualbox fogB0
echo "
   _   _   _   _   _     _   _   _   _   _   _  
  / \ / \ / \ / \ / \   / \ / \ / \ / \ / \ / \ 
 ( S | w | a | r | m ) ( c | r | e | a | d | o )
  \_/ \_/ \_/ \_/ \_/   \_/ \_/ \_/ \_/ \_/ \_/  
"

java -jar MTCLauncher.jar book2publication2html.properties
echo fogA0 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
docker-machine ip fogA0 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
echo fogB0 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
docker-machine ip fogB0 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones

cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/temperature.csv.csv /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/SensA0/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/fogA0/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/SensA0/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/ActA0/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/fogB0/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/SensB0/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/ActB0/src/main/resources
 
echo *Dockerizando todos los componentes generados  ----------------
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/ActA0
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/ActB0
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/SensA0
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/SensB0
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/fogA0
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/fogB0
sudo mvn clean package docker:build
echo *Componentes Dockerizados! ---------------

echo *Subiendo imagenes a DockerHub ----------------
echo pepita123* | docker login --username joseinformatica96 --password-stdin
echo pepita123* | sudo -S docker push localhost:5000/foga0
echo pepita123* | sudo -S docker push localhost:5000/fogb0
echo pepita123* | sudo -S docker push localhost:5000/acta0
echo pepita123* | sudo -S docker push localhost:5000/actb0
echo pepita123* | sudo -S docker push localhost:5000/sensa0
echo pepita123* | sudo -S docker push localhost:5000/sensb0
echo *Subida de imagenes finalizada! ----------------
echo *Bajando imagenes ----------------
docker-machine ssh fogA0 "$TOKEN;docker pull eclipse-mosquitto;echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/foga0;docker pull 158.49.189.138:5000/acta0;docker pull 158.49.189.138:5000/sensa0;exit"
docker-machine ssh fogB0 "$TOKEN;docker pull eclipse-mosquitto;echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/fogb0;docker pull 158.49.189.138:5000/actb0;docker pull 158.49.189.138:5000/sensb0;exit"
echo *Imagenes bajadas!----------------

echo *Deplegando entorno IoT!----------------
	docker-machine ssh Environment "docker service create --constraint node.hostname==fogA0 --replicas 1 -p 1883:1883 --name MosquittofogA0 eclipse-mosquitto;docker service create --constraint node.hostname==fogB0 --replicas 1 -p 1884:1883 --name MosquittofogB0 eclipse-mosquitto;docker service create --replicas 1 --constraint node.hostname==fogA0 --name fogA0 localhost:5000/foga0;docker service create --replicas 1 --constraint node.hostname==fogB0 --name fogB0 localhost:5000/fogb0;	docker service create --replicas 1 --name acta0 localhost:5000/acta0;docker service create --replicas 1 --name actb0 localhost:5000/actb0;docker service create --replicas 1 --name sensa0 localhost:5000/sensa0;docker service create --replicas 1 --name sensb0 localhost:5000/sensb0;exit"
echo *Entorno IoT desplegado!----------------
