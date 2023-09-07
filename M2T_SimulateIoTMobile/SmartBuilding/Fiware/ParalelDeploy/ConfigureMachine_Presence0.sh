
#!/bin/bash

docker-machine scp "$parent_path"/gencode/daemon.json Presence0:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT Presence0:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/Presence0.sh Presence0:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/Presence0/docker-compose.yml Presence0:~/tutorials.IoT-over-MQTT
docker-machine ssh Presence0 ""$1";sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1111:1883 --constraint node.hostname==Presence0 --name enablingnetworkfogpresence0 eclipse-mosquitto;exit"
docker-machine ssh Presence0 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo ./services start;sleep 10s;bash ~/Presence0.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetworkfogpresence0;exit"

