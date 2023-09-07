rm "$parent_path"/gencode/tabladirecciones
docker-machine rm Humidity0
docker-machine rm Temperature1
docker-machine rm WaterLevel2
docker-machine ssh Environment "docker node rm Humidity0;docker node rm Temperature1;docker node rm WaterLevel2;docker service rm $(docker service ls -q);docker service create --name=viz --publish=8080:8080/tcp --constraint=node.role==manager --mount=type=bind,src=/var/run/docker.sock,dst=/var/run/docker.sock dockersamples/visualizer;exit"
