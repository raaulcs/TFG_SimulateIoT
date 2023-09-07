
#!/bin/bash

docker-machine scp "$parent_path"/gencode/daemon.json Humidity0:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT Humidity0:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/Humidity0.sh Humidity0:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/Humidity0/docker-compose.yml Humidity0:~/tutorials.IoT-over-MQTT
docker-machine ssh Humidity0 ""$1";sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1111:1883 --constraint node.hostname==Humidity0 --name enablingnetworkfoghumidity0 eclipse-mosquitto;exit"
docker-machine ssh Humidity0 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo ./services start;sleep 10s;bash ~/Humidity0.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetworkfoghumidity0;exit"

