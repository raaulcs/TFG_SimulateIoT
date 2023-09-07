
#!/bin/bash

docker-machine scp "$parent_path"/gencode/daemon.json Gas3:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT Gas3:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/Gas3.sh Gas3:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/Gas3/docker-compose.yml Gas3:~/tutorials.IoT-over-MQTT
docker-machine ssh Gas3 ""$1";sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1114:1883 --constraint node.hostname==Gas3 --name enablingnetworkfoggas3 eclipse-mosquitto;exit"
docker-machine ssh Gas3 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo ./services start;sleep 10s;bash ~/Gas3.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetworkfoggas3;exit"

