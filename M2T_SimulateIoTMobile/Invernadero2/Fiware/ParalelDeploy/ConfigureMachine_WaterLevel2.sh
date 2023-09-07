
#!/bin/bash

docker-machine scp "$parent_path"/gencode/daemon.json WaterLevel2:~
docker-machine scp -r "$parent_path"/tutorials.IoT-over-MQTT WaterLevel2:~
docker-machine scp "$parent_path"/gencode/Fiware/configurationFiware/WaterLevel2.sh WaterLevel2:~
docker-machine scp "$parent_path"/gencode/Fiware/Compose/WaterLevel2/docker-compose.yml WaterLevel2:~/tutorials.IoT-over-MQTT
docker-machine ssh WaterLevel2 ""$1";sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine ssh Environment "docker service create --network my-network --replicas 1 -p 1113:1883 --constraint node.hostname==WaterLevel2 --name enablingnetworkfogwaterlevel2 eclipse-mosquitto;exit"
docker-machine ssh WaterLevel2 "sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose;sudo chmod +x /usr/local/bin/docker-compose;cd ~/tutorials.IoT-over-MQTT; sudo ./services start;sleep 10s;bash ~/WaterLevel2.sh;exit"
docker-machine ssh Environment "docker service rm enablingnetworkfogwaterlevel2;exit"

