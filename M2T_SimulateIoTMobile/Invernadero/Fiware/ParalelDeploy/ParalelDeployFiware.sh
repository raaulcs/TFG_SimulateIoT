#!/bin/bash

rm "$parent_path"/gencode/token &
echo y | docker-machine rm Humidity0 Temperature1 WaterLevel2 Environment 

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

bash "$parent_path"/gencode/Fiware/ParalelDeploy/ConfigureMachine_Humidity0.sh "$TOKEN" &
bash "$parent_path"/gencode/Fiware/ParalelDeploy/ConfigureMachine_Temperature1.sh "$TOKEN" &
bash "$parent_path"/gencode/Fiware/ParalelDeploy/ConfigureMachine_WaterLevel2.sh "$TOKEN" &

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

