
#!/bin/bash

docker-machine scp "$parent_path"/gencode/daemon.json fogA0:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT fogA0:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/fogA0.sh fogA0:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/fogA0/docker-compose.yml fogA0:~/tutorials.IoT-over-MQTT
docker-machine ssh fogA0 ""$1";sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1111:1883 --constraint node.hostname==fogA0 --name enablingnetworkfogfoga0 eclipse-mosquitto;exit"
docker-machine ssh fogA0 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo ./services start;sleep 10s;bash ~/fogA0.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetworkfogfoga0;exit"

