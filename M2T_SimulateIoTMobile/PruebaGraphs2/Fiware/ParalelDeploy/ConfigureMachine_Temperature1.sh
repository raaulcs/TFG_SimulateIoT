
#!/bin/bash

docker-machine scp "$parent_path"/gencode/daemon.json Temperature1:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT Temperature1:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/Temperature1.sh Temperature1:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/Temperature1/docker-compose.yml Temperature1:~/tutorials.IoT-over-MQTT
docker-machine ssh Temperature1 ""$1";sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1112:1883 --constraint node.hostname==Temperature1 --name enablingnetworkfogtemperature1 eclipse-mosquitto;exit"
docker-machine ssh Temperature1 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo ./services start;sleep 10s;bash ~/Temperature1.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetworkfogtemperature1;exit"

