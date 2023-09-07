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
docker-machine ssh Environment "docker service create --name=viz --publish=8080:8080/tcp --constraint=node.role==manager --mount=type=bind,src=/var/run/docker.sock,dst=/var/run/docker.sock dockersamples/visualizer;exit" >> "$parent_path"/gencode/token

i=0
while IFS= read -r line; do
  ((i++))
  if [[ "$i" == '5' ]]; then
    echo $line
    TOKEN=$line
  fi
done < "$parent_path"/gencode/token

docker-machine create --driver virtualbox Presence0
docker-machine scp "$parent_path"/gencode/daemon.json Presence0:~
docker-machine ssh Presence0 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine create --driver virtualbox Brightness1
docker-machine scp "$parent_path"/gencode/daemon.json Brightness1:~
docker-machine ssh Brightness1 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine create --driver virtualbox Water2
docker-machine scp "$parent_path"/gencode/daemon.json Water2:~
docker-machine ssh Water2 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine create --driver virtualbox Gas3
docker-machine scp "$parent_path"/gencode/daemon.json Gas3:~
docker-machine ssh Gas3 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"


echo "
   _   _   _   _   _     _   _   _   _   _   _  
  / \ / \ / \ / \ / \   / \ / \ / \ / \ / \ / \ 
 ( S | w | a | r | m ) ( c | r | e | a | d | o )
  \_/ \_/ \_/ \_/ \_/   \_/ \_/ \_/ \_/ \_/ \_/  
"

echo Presence0 >> "$parent_path"/gencode/tabladirecciones
docker-machine ip Presence0 >> "$parent_path"/gencode/tabladirecciones
echo Brightness1 >> "$parent_path"/gencode/tabladirecciones
docker-machine ip Brightness1 >> "$parent_path"/gencode/tabladirecciones
echo Water2 >> "$parent_path"/gencode/tabladirecciones
docker-machine ip Water2 >> "$parent_path"/gencode/tabladirecciones
echo Gas3 >> "$parent_path"/gencode/tabladirecciones
docker-machine ip Gas3 >> "$parent_path"/gencode/tabladirecciones


cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/Presence0/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/Brightness1/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/Water2/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/Gas3/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/MobileNodes/sensPresence0/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/sensPresence0/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/MobileNodes/sensBrightness1/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/sensBrightness1/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/MobileNodes/sensWater2/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/sensWater2/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/MobileNodes/sensGas3/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/sensGas3/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/actPresence0/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/actBrightness1/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/actWater2/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/actGas3/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/EsperComponentPresence0/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/EsperComponentBrightness1/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/EsperComponentWater2/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/EsperComponentGas3/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TSS/Presence
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TSS/Brightness
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TSS/Water
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TSS/Gas
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TDS/Presence
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TDS/Brightness
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TDS/Water
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TDS/Gas


echo *Dockerizando todos los componentes generados  ----------------
cd "$parent_path"/gencode/actPresence0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/actBrightness1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/actWater2
sudo mvn clean package docker:build
cd "$parent_path"/gencode/actGas3
sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensPresence0
cd "$parent_path"/gencode/MobilityArchitecture/MobileNodes/sensPresence0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensBrightness1
cd "$parent_path"/gencode/MobilityArchitecture/MobileNodes/sensBrightness1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensWater2
cd "$parent_path"/gencode/MobilityArchitecture/MobileNodes/sensWater2
sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensGas3
cd "$parent_path"/gencode/MobilityArchitecture/MobileNodes/sensGas3
sudo mvn clean package docker:build
cd "$parent_path"/gencode/Presence0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/Brightness1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/Water2
sudo mvn clean package docker:build
cd "$parent_path"/gencode/Gas3
sudo mvn clean package docker:build
cd "$parent_path"/gencode/EsperComponentPresence0
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd "$parent_path"/gencode/EsperComponentBrightness1
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd "$parent_path"/gencode/EsperComponentWater2
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd "$parent_path"/gencode/EsperComponentGas3
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd "$parent_path"/gencode/dashboard/dashboard2
mvn clean install
cd ..
sudo docker build . -t localhost:5000/dashboard
cd "$parent_path"/gencode/MobilityArchitecture/TSS/Presence
sudo docker build . -t localhost:5000/tss-presence
cd "$parent_path"/gencode/MobilityArchitecture/TSS/Brightness
sudo docker build . -t localhost:5000/tss-brightness
cd "$parent_path"/gencode/MobilityArchitecture/TSS/Water
sudo docker build . -t localhost:5000/tss-water
cd "$parent_path"/gencode/MobilityArchitecture/TSS/Gas
sudo docker build . -t localhost:5000/tss-gas
cd "$parent_path"/gencode/MobilityArchitecture/TDS/Presence
sudo docker build . -t localhost:5000/tds-presence
cd "$parent_path"/gencode/MobilityArchitecture/TDS/Brightness
sudo docker build . -t localhost:5000/tds-brightness
cd "$parent_path"/gencode/MobilityArchitecture/TDS/Water
sudo docker build . -t localhost:5000/tds-water
cd "$parent_path"/gencode/MobilityArchitecture/TDS/Gas
sudo docker build . -t localhost:5000/tds-gas


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
echo pepita123* | sudo -S docker push localhost:5000/dashboard
echo pepita123* | sudo -S docker push localhost:5000/mosquitto-simulateiot
echo pepita123* | sudo -S docker push localhost:5000/tss-presence
echo pepita123* | sudo -S docker push localhost:5000/tss-brightness
echo pepita123* | sudo -S docker push localhost:5000/tss-water
echo pepita123* | sudo -S docker push localhost:5000/tss-gas
echo pepita123* | sudo -S docker push localhost:5000/tds-presence
echo pepita123* | sudo -S docker push localhost:5000/tds-brightness
echo pepita123* | sudo -S docker push localhost:5000/tds-water
echo pepita123* | sudo -S docker push localhost:5000/tds-gas

echo *Subida de imagenes finalizada! ----------------
echo *Bajando imagenes ----------------
docker-machine ssh Presence0 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull "$ip"/mosquitto-simulateiot;docker pull "$ip"/presence0;docker pull "$ip"/espercomponentpresence0;docker pull "$ip"/actpresence0;docker pull "$ip"/senspresence0;docker pull "$ip"/tds-presence;docker pull "$ip"/tss-presence;exit"
docker-machine ssh Brightness1 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull "$ip"/mosquitto-simulateiot;docker pull "$ip"/brightness1;docker pull "$ip"/espercomponentbrightness1;docker pull "$ip"/actbrightness1;docker pull "$ip"/sensbrightness1;docker pull "$ip"/tds-brightness;docker pull "$ip"/tss-brightness;exit"
docker-machine ssh Water2 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull "$ip"/mosquitto-simulateiot;docker pull "$ip"/water2;docker pull "$ip"/espercomponentwater2;docker pull "$ip"/actwater2;docker pull "$ip"/senswater2;docker pull "$ip"/tds-water;docker pull "$ip"/tss-water;exit"
docker-machine ssh Gas3 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull "$ip"/mosquitto-simulateiot;docker pull "$ip"/gas3;docker pull "$ip"/espercomponentgas3;docker pull "$ip"/actgas3;docker pull "$ip"/sensgas3;docker pull "$ip"/tds-gas;docker pull "$ip"/tss-gas;exit"

echo *Imagenes bajadas!----------------

echo *Deplegando entorno IoT!----------------
	docker-machine ssh Environment "docker service create --constraint node.hostname==Presence0 --replicas 1 -p 1883:1883 --name MosquittoPresence0 "$ip"/mosquitto-simulateiot;docker service create --constraint node.hostname==Brightness1 --replicas 1 -p 1884:1883 --name MosquittoBrightness1 "$ip"/mosquitto-simulateiot;docker service create --constraint node.hostname==Water2 --replicas 1 -p 1885:1883 --name MosquittoWater2 "$ip"/mosquitto-simulateiot;docker service create --constraint node.hostname==Gas3 --replicas 1 -p 1886:1883 --name MosquittoGas3 "$ip"/mosquitto-simulateiot;docker service create --replicas 1 --constraint node.hostname==Presence0 --name Presence0 "$ip"/presence0;docker service create --replicas 1 --constraint node.hostname==Presence0 --name EsperComponentPresence0 "$ip"/espercomponentpresence0;docker service create --replicas 1 --constraint node.hostname==Presence0 --name actpresence0 "$ip"/actpresence0;docker service create --replicas 1 --constraint node.hostname==Presence0 --name senspresence0 "$ip"/senspresence0;docker service create --replicas 1 --constraint node.hostname==Brightness1 --name Brightness1 "$ip"/brightness1;docker service create --replicas 1 --constraint node.hostname==Brightness1 --name EsperComponentBrightness1 "$ip"/espercomponentbrightness1;docker service create --replicas 2 --constraint node.hostname==Brightness1 --name actbrightness1 "$ip"/actbrightness1;docker service create --replicas 1 --constraint node.hostname==Brightness1 --name sensbrightness1 "$ip"/sensbrightness1;docker service create --replicas 1 --constraint node.hostname==Water2 --name Water2 "$ip"/water2;docker service create --replicas 1 --constraint node.hostname==Water2 --name EsperComponentWater2 "$ip"/espercomponentwater2;docker service create --replicas 1 --constraint node.hostname==Water2 --name actwater2 "$ip"/actwater2;docker service create --replicas 1 --constraint node.hostname==Water2 --name senswater2 "$ip"/senswater2;docker service create --replicas 1 --constraint node.hostname==Gas3 --name Gas3 "$ip"/gas3;docker service create --replicas 1 --constraint node.hostname==Gas3 --name EsperComponentGas3 "$ip"/espercomponentgas3;docker service create --replicas 1 --constraint node.hostname==Gas3 --name actgas3 "$ip"/actgas3;docker service create --replicas 1 --constraint node.hostname==Gas3 --name sensgas3 "$ip"/sensgas3;echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull "$ip"/dashboard;docker service create --constraint node.hostname==Environment -p 8081:8080 --replicas 1 --name Dashboard "$ip"/dashboard; docker service create --replicas 1 --constraint node.hostname==Presence0 --name tds-presence "$ip"/tds-presence;docker service create --replicas 1 --constraint node.hostname==Presence0 --name tss-presence "$ip"/tss-presence;docker service create --replicas 1 --constraint node.hostname==Brightness1 --name tds-brightness "$ip"/tds-brightness;docker service create --replicas 1 --constraint node.hostname==Brightness1 --name tss-brightness "$ip"/tss-brightness;docker service create --replicas 1 --constraint node.hostname==Water2 --name tds-water "$ip"/tds-water;docker service create --replicas 1 --constraint node.hostname==Water2 --name tss-water "$ip"/tss-water;docker service create --replicas 1 --constraint node.hostname==Gas3 --name tds-gas "$ip"/tds-gas;docker service create --replicas 1 --constraint node.hostname==Gas3 --name tss-gas "$ip"/tss-gas;exit"
echo *Entorno IoT desplegado!----------------
