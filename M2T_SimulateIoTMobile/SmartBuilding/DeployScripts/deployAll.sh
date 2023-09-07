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

docker-machine create --driver virtualbox Presence0
docker-machine create --driver virtualbox Brightness1
docker-machine create --driver virtualbox Water2
docker-machine create --driver virtualbox Gas3
echo "
   _   _   _   _   _     _   _   _   _   _   _  
  / \ / \ / \ / \ / \   / \ / \ / \ / \ / \ / \ 
 ( S | w | a | r | m ) ( c | r | e | a | d | o )
  \_/ \_/ \_/ \_/ \_/   \_/ \_/ \_/ \_/ \_/ \_/  
"

java -jar MTCLauncher.jar book2publication2html.properties
echo Presence0 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
docker-machine ip Presence0 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
echo Brightness1 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
docker-machine ip Brightness1 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
echo Water2 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
docker-machine ip Water2 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
echo Gas3 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones
docker-machine ip Gas3 >> /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones

cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/Presence0/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/Brightness1/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/Water2/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/Gas3/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/sensPresence0/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/sensBrightness1/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/sensWater2/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/sensGas3/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/actPresence0/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/actBrightness1/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/actWater2/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/actGas3/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/EsperComponentPresence0/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/EsperComponentBrightness1/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/EsperComponentWater2/src/main/resources
cp /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/tabladirecciones /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/EsperComponentGas3/src/main/resources
 
echo *Dockerizando todos los componentes generados  ----------------
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/actPresence0
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/actBrightness1
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/actWater2
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/actGas3
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/sensPresence0
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/sensBrightness1
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/sensWater2
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/sensGas3
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/Presence0
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/Brightness1
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/Water2
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/Gas3
sudo mvn clean package docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/EsperComponentPresence0
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/EsperComponentBrightness1
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/EsperComponentWater2
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd /home/jose/Escritorio/LauncherACCeleo/AccLauncher/gen/genFiles/EsperComponentGas3
sudo mvn clean compile assembly:single
sudo mvn docker:build
echo *Componentes Dockerizados! ---------------

echo *Subiendo imagenes a DockerHub ----------------
echo pepita123* | docker login --username joseinformatica96 --password-stdin
echo pepita123* | sudo -S docker push localhost:5000/presence0
echo pepita123* | sudo -S docker push localhost:5000/brightness1
echo pepita123* | sudo -S docker push localhost:5000/water2
echo pepita123* | sudo -S docker push localhost:5000/gas3
echo pepita123* | sudo -S docker push localhost:5000/espercomponentpresence0
echo pepita123* | sudo -S docker push localhost:5000/espercomponentbrightness1
echo pepita123* | sudo -S docker push localhost:5000/espercomponentwater2
echo pepita123* | sudo -S docker push localhost:5000/espercomponentgas3
echo pepita123* | sudo -S docker push localhost:5000/actpresence0
echo pepita123* | sudo -S docker push localhost:5000/actbrightness1
echo pepita123* | sudo -S docker push localhost:5000/actwater2
echo pepita123* | sudo -S docker push localhost:5000/actgas3
echo pepita123* | sudo -S docker push localhost:5000/senspresence0
echo pepita123* | sudo -S docker push localhost:5000/sensbrightness1
echo pepita123* | sudo -S docker push localhost:5000/senswater2
echo pepita123* | sudo -S docker push localhost:5000/sensgas3
echo *Subida de imagenes finalizada! ----------------
echo *Bajando imagenes ----------------
docker-machine ssh Presence0 "$TOKEN;docker pull eclipse-mosquitto;echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/presence0;docker pull 158.49.189.138:5000/espercomponentpresence0;docker pull 158.49.189.138:5000/actpresence0;docker pull 158.49.189.138:5000/senspresence0;exit"
docker-machine ssh Brightness1 "$TOKEN;docker pull eclipse-mosquitto;echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/brightness1;docker pull 158.49.189.138:5000/espercomponentbrightness1;docker pull 158.49.189.138:5000/actbrightness1;docker pull 158.49.189.138:5000/sensbrightness1;exit"
docker-machine ssh Water2 "$TOKEN;docker pull eclipse-mosquitto;echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/water2;docker pull 158.49.189.138:5000/espercomponentwater2;docker pull 158.49.189.138:5000/actwater2;docker pull 158.49.189.138:5000/senswater2;exit"
docker-machine ssh Gas3 "$TOKEN;docker pull eclipse-mosquitto;echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/gas3;docker pull 158.49.189.138:5000/espercomponentgas3;docker pull 158.49.189.138:5000/actgas3;docker pull 158.49.189.138:5000/sensgas3;exit"
echo *Imagenes bajadas!----------------

echo *Deplegando entorno IoT!----------------
	docker-machine ssh Environment "docker service create --constraint node.hostname==Presence0 --replicas 1 -p 1883:1883 --name MosquittoPresence0 eclipse-mosquitto;docker service create --constraint node.hostname==Brightness1 --replicas 1 -p 1884:1883 --name MosquittoBrightness1 eclipse-mosquitto;docker service create --constraint node.hostname==Water2 --replicas 1 -p 1885:1883 --name MosquittoWater2 eclipse-mosquitto;docker service create --constraint node.hostname==Gas3 --replicas 1 -p 1886:1883 --name MosquittoGas3 eclipse-mosquitto;docker service create --replicas 1 --constraint node.hostname==Presence0 --name Presence0 localhost:5000/presence0;docker service create --replicas 1 --constraint node.hostname==Presence0 --name EsperComponentPresence0 localhost:5000/espercomponentpresence0;docker service create --replicas 1 --constraint node.hostname==Brightness1 --name Brightness1 localhost:5000/brightness1;docker service create --replicas 1 --constraint node.hostname==Brightness1 --name EsperComponentBrightness1 localhost:5000/espercomponentbrightness1;docker service create --replicas 1 --constraint node.hostname==Water2 --name Water2 localhost:5000/water2;docker service create --replicas 1 --constraint node.hostname==Water2 --name EsperComponentWater2 localhost:5000/espercomponentwater2;docker service create --replicas 1 --constraint node.hostname==Gas3 --name Gas3 localhost:5000/gas3;docker service create --replicas 1 --constraint node.hostname==Gas3 --name EsperComponentGas3 localhost:5000/espercomponentgas3;	docker service create --replicas 1 --name actpresence0 localhost:5000/actpresence0;docker service create --replicas 2 --name actbrightness1 localhost:5000/actbrightness1;docker service create --replicas 1 --name actwater2 localhost:5000/actwater2;docker service create --replicas 1 --name actgas3 localhost:5000/actgas3;docker service create --replicas 1 --name senspresence0 localhost:5000/senspresence0;docker service create --replicas 1 --name sensbrightness1 localhost:5000/sensbrightness1;docker service create --replicas 1 --name senswater2 localhost:5000/senswater2;docker service create --replicas 1 --name sensgas3 localhost:5000/sensgas3;exit"
echo *Entorno IoT desplegado!----------------
