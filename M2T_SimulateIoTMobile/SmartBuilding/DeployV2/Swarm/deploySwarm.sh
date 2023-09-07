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
parent_path=$( cd "$(dirname "${BASH_SOURCE[0]}")" ; pwd -P )

#Private IP of the machine where the registry is deployed (if registry is in local machine)
ip=$(ifconfig wlo1| grep 'inet ' | grep -oE "\b([0-9]{1,3}\.){3}[0-9]{1,3}\b" | head -1):5000

#To accept pull dockers from registry woithout ssl certs
echo "{ \"insecure-registries\":[\"$ip\"] }" > "$parent_path"/daemon.json

echo y | docker-machine rm Presence0 Brightness1 Water2 Gas3 Environment

docker-machine create --driver virtualbox Environment

IPENV=$(docker-machine ip Environment)
TOKEN=$(docker-machine ssh Environment "docker swarm init --advertise-addr "$IPENV";exit" | sed -n 5p)
#Uncomment for viz, a graphic visualiser of the orchestration
#docker-machine ssh Environment "docker service create --name=viz --publish=8080:8080/tcp --constraint=node.role==manager --mount=type=bind,src=/var/run/docker.sock,dst=/var/run/docker.sock dockersamples/visualizer;exit"

docker-machine create --driver virtualbox Presence0
docker-machine scp "$parent_path"/daemon.json Presence0:~
docker-machine ssh Presence0 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine create --driver virtualbox Brightness1
docker-machine scp "$parent_path"/daemon.json Brightness1:~
docker-machine ssh Brightness1 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine create --driver virtualbox Water2
docker-machine scp "$parent_path"/daemon.json Water2:~
docker-machine ssh Water2 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"
docker-machine create --driver virtualbox Gas3
docker-machine scp "$parent_path"/daemon.json Gas3:~
docker-machine ssh Gas3 "$TOKEN;sudo cp ~/daemon.json /etc/docker;sudo /etc/init.d/docker restart;exit"


echo "
   _   _   _   _   _     _   _   _   _   _   _  
  / \ / \ / \ / \ / \   / \ / \ / \ / \ / \ / \ 
 ( S | w | a | r | m ) ( c | r | e | a | d | o )
  \_/ \_/ \_/ \_/ \_/   \_/ \_/ \_/ \_/ \_/ \_/  
"

#rm "$parent_path"/daemon.json

