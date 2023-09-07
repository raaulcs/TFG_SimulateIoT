
#!/bin/bash

docker-machine scp "$parent_path"/gencode/daemon.json fogB1:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT fogB1:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/fogB1.sh fogB1:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/fogB1/docker-compose.yml fogB1:~/tutorials.IoT-over-MQTT
docker-machine ssh fogB1 ""$1";sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1112:1883 --constraint node.hostname==fogB1 --name enablingnetworkfogfogb1 eclipse-mosquitto;exit"
docker-machine ssh fogB1 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo ./services start;sleep 10s;bash ~/fogB1.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetworkfogfogb1;exit"

