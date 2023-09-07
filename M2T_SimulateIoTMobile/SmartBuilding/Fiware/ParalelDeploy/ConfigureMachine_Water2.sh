
#!/bin/bash

docker-machine scp "$parent_path"/gencode/daemon.json Water2:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT Water2:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/Water2.sh Water2:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/Water2/docker-compose.yml Water2:~/tutorials.IoT-over-MQTT
docker-machine ssh Water2 ""$1";sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1113:1883 --constraint node.hostname==Water2 --name enablingnetworkfogwater2 eclipse-mosquitto;exit"
docker-machine ssh Water2 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo ./services start;sleep 10s;bash ~/Water2.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetworkfogwater2;exit"

