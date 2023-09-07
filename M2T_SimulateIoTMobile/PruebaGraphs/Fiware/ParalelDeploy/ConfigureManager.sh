#!/bin/bash

docker-machine ssh Environment "docker swarm init --advertise-addr 192.168.99.100;exit" >> "$parent_path"/gencode/token
docker-machine ssh Environment "docker network create --driver overlay --attachable my-network;docker service create --name=viz --publish=8080:8080/tcp --constraint=node.role==manager --mount=type=bind,src=/var/run/docker.sock,dst=/var/run/docker.sock dockersamples/visualizer &;exit"

i=0
while IFS= read -r line; do
  ((i++))
  if [[ "$i" == '5' ]]; then
    echo $line
    TOKEN=$line
  fi
done < "$parent_path"/gencode/token
