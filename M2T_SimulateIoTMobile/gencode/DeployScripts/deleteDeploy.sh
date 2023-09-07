rm "$parent_path"/gencode/tabladirecciones
docker-machine rm fogA0
docker-machine rm fogB1
docker-machine ssh Environment "docker node rm fogA0;docker node rm fogB1;docker service rm $(docker service ls -q);docker service create --name=viz --publish=8080:8080/tcp --constraint=node.role==manager --mount=type=bind,src=/var/run/docker.sock,dst=/var/run/docker.sock dockersamples/visualizer;exit"
