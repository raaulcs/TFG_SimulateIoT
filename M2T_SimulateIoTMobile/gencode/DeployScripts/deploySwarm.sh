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
docker-machine ssh Environment "docker service create --name=viz --publish=8080:8080/tcp --constraint=node.role==manager --mount=type=bind,src=/var/run/docker.sock,dst=/var/run/docker.sock dockersamples/visualizer;exit" >> "$parent_path"/gencode/token

i=0
while IFS= read -r line; do
  ((i++))
  if [[ "$i" == '5' ]]; then
    echo $line
    TOKEN=$line
  fi
done < "$parent_path"/gencode/token

docker-machine create --driver virtualbox fogA0
docker-machine scp "$parent_path"/gencode/daemon.json fogA0:~
docker-machine ssh fogA0 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine create --driver virtualbox fogB1
docker-machine scp "$parent_path"/gencode/daemon.json fogB1:~
docker-machine ssh fogB1 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"


echo "
   _   _   _   _   _     _   _   _   _   _   _  
  / \ / \ / \ / \ / \   / \ / \ / \ / \ / \ / \ 
 ( S | w | a | r | m ) ( c | r | e | a | d | o )
  \_/ \_/ \_/ \_/ \_/   \_/ \_/ \_/ \_/ \_/ \_/  
"

echo fogA0 >> "$parent_path"/gencode/tabladirecciones
docker-machine ip fogA0 >> "$parent_path"/gencode/tabladirecciones
echo fogB1 >> "$parent_path"/gencode/tabladirecciones
docker-machine ip fogB1 >> "$parent_path"/gencode/tabladirecciones


cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/fogA0/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/MobileNodes/SensA0/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/SensA0/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/ActA0/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/fogB1/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/MobileNodes/SensB1/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/SensB1/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/ActB1/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/EsperComponentfogB1/src/main/resources
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TSS/fogA
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TSS/fogB
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TDS/fogA
cp "$parent_path"/gencode/tabladirecciones "$parent_path"/gencode/MobilityArchitecture/TDS/fogB


echo *Dockerizando todos los componentes generados  ----------------
cd "$parent_path"/gencode/ActA0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/ActB1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/SensA0
cd "$parent_path"/gencode/MobilityArchitecture/MobileNodes/SensA0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/SensB1
cd "$parent_path"/gencode/MobilityArchitecture/MobileNodes/SensB1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/fogA0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/fogB1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/EsperComponentfogB1
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd "$parent_path"/gencode/apis/apifogA0
sudo docker build -t localhost:5000/apifoga0 .
cd "$parent_path"/gencode/apis/apifogB1
sudo docker build -t localhost:5000/apifogb1 .
cd "$parent_path"/gencode/dashboard/dashboard2
mvn clean install
cd ..
sudo docker build . -t localhost:5000/dashboard
cd "$parent_path"/gencode/MobilityArchitecture/TSS/fogA
sudo docker build . -t localhost:5000/tss-foga
cd "$parent_path"/gencode/MobilityArchitecture/TSS/fogB
sudo docker build . -t localhost:5000/tss-fogb
cd "$parent_path"/gencode/MobilityArchitecture/TDS/fogA
sudo docker build . -t localhost:5000/tds-foga
cd "$parent_path"/gencode/MobilityArchitecture/TDS/fogB
sudo docker build . -t localhost:5000/tds-fogb


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
echo pepita123* | sudo -S docker push localhost:5000/dashboard
echo pepita123* | sudo -S docker push localhost:5000/mosquitto-simulateiot
echo pepita123* | sudo -S docker push localhost:5000/tss-foga
echo pepita123* | sudo -S docker push localhost:5000/tss-fogb
echo pepita123* | sudo -S docker push localhost:5000/tds-foga
echo pepita123* | sudo -S docker push localhost:5000/tds-fogb

echo *Subida de imagenes finalizada! ----------------
echo *Bajando imagenes ----------------
docker-machine ssh fogA0 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull "$ip"/mosquitto-simulateiot;docker pull mongo;docker pull "$ip"/apifoga0;docker pull "$ip"/foga0;docker pull "$ip"/acta0;docker pull "$ip"/sensa0;docker pull "$ip"/tds-foga;docker pull "$ip"/tss-foga;exit"
docker-machine ssh fogB1 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull "$ip"/mosquitto-simulateiot;docker pull mongo;docker pull "$ip"/apifogb1;docker pull "$ip"/fogb1;docker pull "$ip"/espercomponentfogb1;docker pull "$ip"/actb1;docker pull "$ip"/sensb1;docker pull "$ip"/tds-fogb;docker pull "$ip"/tss-fogb;exit"

echo *Imagenes bajadas!----------------

echo *Deplegando entorno IoT!----------------
	docker-machine ssh Environment "docker service create --constraint node.hostname==fogA0 -p 27017:27017 --replicas 1 --name MongofogA0 mongo;docker service create --replicas 1 -p 4000:4000 --constraint node.hostname==fogA0 --name apifogA0 "$ip"/apifoga0;docker service create --constraint node.hostname==fogA0 --replicas 1 -p 1883:1883 --name MosquittofogA0 "$ip"/mosquitto-simulateiot;docker service create --constraint node.hostname==fogB1 -p 27018:27017 --replicas 1 --name MongofogB1 mongo;docker service create --replicas 1 -p 4001:4000 --constraint node.hostname==fogB1 --name apifogB1 "$ip"/apifogb1;docker service create --constraint node.hostname==fogB1 --replicas 1 -p 1884:1883 --name MosquittofogB1 "$ip"/mosquitto-simulateiot;docker service create --replicas 1 --constraint node.hostname==fogA0 --name fogA0 "$ip"/foga0;docker service create --replicas 1 --constraint node.hostname==fogA0 --name acta0 "$ip"/acta0;docker service create --replicas 1 --constraint node.hostname==fogA0 --name sensa0 "$ip"/sensa0;docker service create --replicas 1 --constraint node.hostname==fogB1 --name fogB1 "$ip"/fogb1;docker service create --replicas 1 --constraint node.hostname==fogB1 --name EsperComponentfogB1 "$ip"/espercomponentfogb1;docker service create --replicas 1 --constraint node.hostname==fogB1 --name actb1 "$ip"/actb1;docker service create --replicas 1 --constraint node.hostname==fogB1 --name sensb1 "$ip"/sensb1;echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull "$ip"/dashboard;docker service create --constraint node.hostname==Environment -p 8081:8080 --replicas 1 --name Dashboard "$ip"/dashboard; docker service create --replicas 1 --constraint node.hostname==fogA0 --name tds-foga "$ip"/tds-foga;docker service create --replicas 1 --constraint node.hostname==fogA0 --name tss-foga "$ip"/tss-foga;docker service create --replicas 1 --constraint node.hostname==fogB1 --name tds-fogb "$ip"/tds-fogb;docker service create --replicas 1 --constraint node.hostname==fogB1 --name tss-fogb "$ip"/tss-fogb;exit"
echo *Entorno IoT desplegado!----------------
