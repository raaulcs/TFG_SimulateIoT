#!/bin/bash

rm "$parent_path"/gencode/token &
echo y | docker-machine rm Presence0 Brightness1 Water2 Gas3 Environment 

bash "$parent_path"/gencode/Fiware/ParalelDeploy/Dockerize.sh

wait

echo -------------------------------------------------------------------------------------------------------------------------------------------------------------
echo ------------------------------------------------------- UPLOADING DOCKERS TO REGISTRY -----------------------------------------------------------------------
echo -------------------------------------------------------------------------------------------------------------------------------------------------------------

bash "$parent_path"/gencode/Fiware/ParalelDeploy/Pushing.sh

wait


bash "$parent_path"/gencode/Fiware/ParalelDeploy/CreateMachines.sh

wait

docker-machine ssh Environment "docker swarm init --advertise-addr 192.168.99.100;exit" >> "$parent_path"/gencode/token
docker-machine ssh Environment "docker network create --driver overlay --attachable my-network;docker service create --name=viz --publish=8080:8080/tcp --constraint=node.role==manager --mount=type=bind,src=/var/run/docker.sock,dst=/var/run/docker.sock dockersamples/visualizer;exit"

i=0
while IFS= read -r line; do
  ((i++))
  if [[ "$i" == '5' ]]; then
    echo $line
    TOKEN=$line
  fi
done < "$parent_path"/gencode/token

bash "$parent_path"/gencode/Fiware/ParalelDeploy/ConfigureMachine_Presence0.sh "$TOKEN" &
bash "$parent_path"/gencode/Fiware/ParalelDeploy/ConfigureMachine_Brightness1.sh "$TOKEN" &
bash "$parent_path"/gencode/Fiware/ParalelDeploy/ConfigureMachine_Water2.sh "$TOKEN" &
bash "$parent_path"/gencode/Fiware/ParalelDeploy/ConfigureMachine_Gas3.sh "$TOKEN" &

wait




echo -------------------------------------------------------------------------------------------------------------------------------------------------------------
echo ------------------------------------------------------- DOWNLOADING DOCKERS TO REGISTRY ---------------------------------------------------------------------
echo -------------------------------------------------------------------------------------------------------------------------------------------------------------

bash "$parent_path"/gencode/Fiware/ParalelDeploy/Pulling.sh

wait

echo -------------------------------------------------------------------------------------------------------------------------------------------------------------
echo ------------------------------------------------------- DEPLOYING IoT ENVIRONMENT ---------------------------------------------------------------------------
echo -------------------------------------------------------------------------------------------------------------------------------------------------------------

bash "$parent_path"/gencode/Fiware/ParalelDeploy/ServicesDeploy.sh

