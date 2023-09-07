
#!/bin/bash

docker-machine scp "$parent_path"/gencode/daemon.json Brightness1:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT Brightness1:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/Brightness1.sh Brightness1:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/Brightness1/docker-compose.yml Brightness1:~/tutorials.IoT-over-MQTT
docker-machine ssh Brightness1 ""$1";sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1112:1883 --constraint node.hostname==Brightness1 --name enablingnetworkfogbrightness1 eclipse-mosquitto;exit"
docker-machine ssh Brightness1 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo ./services start;sleep 10s;bash ~/Brightness1.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetworkfogbrightness1;exit"

