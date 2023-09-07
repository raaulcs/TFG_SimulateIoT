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
docker-machine ssh Environment "docker service create --name=viz --publish=8080:8080/tcp --constraint=node.role==manager --mount=type=bind,src=/var/run/docker.sock,dst=/var/run/docker.sock dockersamples/visualizer;exit" >> "$parent_path"/gencode/token

i=0
while IFS= read -r line; do
  ((i++))
  if [[ "$i" == '5' ]]; then
    echo $line
    TOKEN=$line
  fi
done < "$parent_path"/gencode/token

docker-machine create --driver virtualbox Humidity0
docker-machine scp "$parent_path"/gencode/daemon.json Humidity0:~
docker-machine ssh Humidity0 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine create --driver virtualbox Temperature1
docker-machine scp "$parent_path"/gencode/daemon.json Temperature1:~
docker-machine ssh Temperature1 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine create --driver virtualbox WaterLevel2
docker-machine scp "$parent_path"/gencode/daemon.json WaterLevel2:~
docker-machine ssh WaterLevel2 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"


echo "
   _   _   _   _   _     _   _   _   _   _   _  
  / \ / \ / \ / \ / \   / \ / \ / \ / \ / \ / \ 
 ( S | w | a | r | m ) ( c | r | e | a | d | o )
  \_/ \_/ \_/ \_/ \_/   \_/ \_/ \_/ \_/ \_/ \_/  
"

echo Humidity0 >> "$parent_path"/gencode/tabladirecciones
docker-machine ip Humidity0 >> "$parent_path"/gencode/tabladirecciones
echo Temperature1 >> "$parent_path"/gencode/tabladirecciones
docker-machine ip Temperature1 >> "$parent_path"/gencode/tabladirecciones
echo WaterLevel2 >> "$parent_path"/gencode/tabladirecciones
docker-machine ip WaterLevel2 >> "$parent_path"/gencode/tabladirecciones


cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/Humidity0/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/Temperature1/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/WaterLevel2/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/MobileNodes/sensHumidity0/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/sensHumidity0/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/MobileNodes/sensTemperature1/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/sensTemperature1/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/MobileNodes/sensWaterLevel2/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/sensWaterLevel2/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/actHumidity0/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/actTemperature1/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/actWaterLevel2/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/EsperComponentHumidity0/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/EsperComponentTemperature1/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/EsperComponentWaterLevel2/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TSS/Humidity
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TSS/Temperature
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TSS/WaterLevel
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TDS/Humidity
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TDS/Temperature
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TDS/WaterLevel


echo *Dockerizando todos los componentes generados  ----------------
cd "$parent_path"/gencode/actHumidity0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/actTemperature1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/actWaterLevel2
sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensHumidity0
cd "$parent_path"/gencode/MobilityArchitecture/MobileNodes/sensHumidity0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensTemperature1
cd "$parent_path"/gencode/MobilityArchitecture/MobileNodes/sensTemperature1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensWaterLevel2
cd "$parent_path"/gencode/MobilityArchitecture/MobileNodes/sensWaterLevel2
sudo mvn clean package docker:build
cd "$parent_path"/gencode/Humidity0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/Temperature1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/WaterLevel2
sudo mvn clean package docker:build
cd "$parent_path"/gencode/EsperComponentHumidity0
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd "$parent_path"/gencode/EsperComponentTemperature1
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd "$parent_path"/gencode/EsperComponentWaterLevel2
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd "$parent_path"/gencode/apis/apiTemperature1
sudo docker build -t localhost:5000/apitemperature1 .
cd "$parent_path"/gencode/dashboard/dashboard2
mvn clean install
cd ..
sudo docker build . -t localhost:5000/dashboard
cd "$parent_path"/gencode/MobilityArchitecture/TSS/Humidity
sudo docker build . -t localhost:5000/tss-humidity
cd "$parent_path"/gencode/MobilityArchitecture/TSS/Temperature
sudo docker build . -t localhost:5000/tss-temperature
cd "$parent_path"/gencode/MobilityArchitecture/TSS/WaterLevel
sudo docker build . -t localhost:5000/tss-waterlevel
cd "$parent_path"/gencode/MobilityArchitecture/TDS/Humidity
sudo docker build . -t localhost:5000/tds-humidity
cd "$parent_path"/gencode/MobilityArchitecture/TDS/Temperature
sudo docker build . -t localhost:5000/tds-temperature
cd "$parent_path"/gencode/MobilityArchitecture/TDS/WaterLevel
sudo docker build . -t localhost:5000/tds-waterlevel


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
echo pepita123* | sudo -S docker push localhost:5000/dashboard
echo pepita123* | sudo -S docker push localhost:5000/mosquitto-simulateiot
echo pepita123* | sudo -S docker push localhost:5000/tss-humidity
echo pepita123* | sudo -S docker push localhost:5000/tss-temperature
echo pepita123* | sudo -S docker push localhost:5000/tss-waterlevel
echo pepita123* | sudo -S docker push localhost:5000/tds-humidity
echo pepita123* | sudo -S docker push localhost:5000/tds-temperature
echo pepita123* | sudo -S docker push localhost:5000/tds-waterlevel

echo *Subida de imagenes finalizada! ----------------
echo *Bajando imagenes ----------------
docker-machine ssh Humidity0 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull "$ip"/mosquitto-simulateiot;docker pull "$ip"/humidity0;docker pull "$ip"/espercomponenthumidity0;docker pull "$ip"/acthumidity0;docker pull "$ip"/senshumidity0;docker pull "$ip"/tds-humidity;docker pull "$ip"/tss-humidity;exit"
docker-machine ssh Temperature1 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull "$ip"/mosquitto-simulateiot;docker pull mongo;docker pull "$ip"/apitemperature1;docker pull "$ip"/temperature1;docker pull "$ip"/espercomponenttemperature1;docker pull "$ip"/acttemperature1;docker pull "$ip"/senstemperature1;docker pull "$ip"/tds-temperature;docker pull "$ip"/tss-temperature;exit"
docker-machine ssh WaterLevel2 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull "$ip"/mosquitto-simulateiot;docker pull "$ip"/waterlevel2;docker pull "$ip"/espercomponentwaterlevel2;docker pull "$ip"/actwaterlevel2;docker pull "$ip"/senswaterlevel2;docker pull "$ip"/tds-waterlevel;docker pull "$ip"/tss-waterlevel;exit"

echo *Imagenes bajadas!----------------

echo *Deplegando entorno IoT!----------------
	docker-machine ssh Environment "docker service create --constraint node.hostname==Humidity0 --replicas 1 -p 1883:1883 --name MosquittoHumidity0 "$ip"/mosquitto-simulateiot;docker service create --constraint node.hostname==Temperature1 -p 27018:27017 --replicas 1 --name MongoTemperature1 mongo;docker service create --replicas 1 -p 4001:4000 --constraint node.hostname==Temperature1 --name apiTemperature1 "$ip"/apitemperature1;docker service create --constraint node.hostname==Temperature1 --replicas 1 -p 1884:1883 --name MosquittoTemperature1 "$ip"/mosquitto-simulateiot;docker service create --constraint node.hostname==WaterLevel2 --replicas 1 -p 1885:1883 --name MosquittoWaterLevel2 "$ip"/mosquitto-simulateiot;docker service create --replicas 1 --constraint node.hostname==Humidity0 --name Humidity0 "$ip"/humidity0;docker service create --replicas 1 --constraint node.hostname==Humidity0 --name EsperComponentHumidity0 "$ip"/espercomponenthumidity0;docker service create --replicas 1 --constraint node.hostname==Humidity0 --name acthumidity0 "$ip"/acthumidity0;docker service create --replicas 1 --constraint node.hostname==Humidity0 --name senshumidity0 "$ip"/senshumidity0;docker service create --replicas 1 --constraint node.hostname==Temperature1 --name Temperature1 "$ip"/temperature1;docker service create --replicas 1 --constraint node.hostname==Temperature1 --name EsperComponentTemperature1 "$ip"/espercomponenttemperature1;docker service create --replicas 1 --constraint node.hostname==Temperature1 --name acttemperature1 "$ip"/acttemperature1;docker service create --replicas 1 --constraint node.hostname==Temperature1 --name senstemperature1 "$ip"/senstemperature1;docker service create --replicas 1 --constraint node.hostname==WaterLevel2 --name WaterLevel2 "$ip"/waterlevel2;docker service create --replicas 1 --constraint node.hostname==WaterLevel2 --name EsperComponentWaterLevel2 "$ip"/espercomponentwaterlevel2;docker service create --replicas 1 --constraint node.hostname==WaterLevel2 --name actwaterlevel2 "$ip"/actwaterlevel2;docker service create --replicas 1 --constraint node.hostname==WaterLevel2 --name senswaterlevel2 "$ip"/senswaterlevel2;echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull "$ip"/dashboard;docker service create --constraint node.hostname==Environment -p 8081:8080 --replicas 1 --name Dashboard "$ip"/dashboard; docker service create --replicas 1 --constraint node.hostname==Humidity0 --name tds-humidity "$ip"/tds-humidity;docker service create --replicas 1 --constraint node.hostname==Humidity0 --name tss-humidity "$ip"/tss-humidity;docker service create --replicas 1 --constraint node.hostname==Temperature1 --name tds-temperature "$ip"/tds-temperature;docker service create --replicas 1 --constraint node.hostname==Temperature1 --name tss-temperature "$ip"/tss-temperature;docker service create --replicas 1 --constraint node.hostname==WaterLevel2 --name tds-waterlevel "$ip"/tds-waterlevel;docker service create --replicas 1 --constraint node.hostname==WaterLevel2 --name tss-waterlevel "$ip"/tss-waterlevel;exit"
echo *Entorno IoT desplegado!----------------
