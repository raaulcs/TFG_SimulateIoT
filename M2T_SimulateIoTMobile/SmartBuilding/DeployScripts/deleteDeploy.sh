rm "$parent_path"/gencode/tabladirecciones
docker-machine rm Presence0
docker-machine rm Brightness1
docker-machine rm Water2
docker-machine rm Gas3
docker-machine ssh Environment "docker node rm Presence0;docker node rm Brightness1;docker node rm Water2;docker node rm Gas3;docker service rm $(docker service ls -q);docker service create --name=viz --publish=8080:8080/tcp --constraint=node.role==manager --mount=type=bind,src=/var/run/docker.sock,dst=/var/run/docker.sock dockersamples/visualizer;exit"
