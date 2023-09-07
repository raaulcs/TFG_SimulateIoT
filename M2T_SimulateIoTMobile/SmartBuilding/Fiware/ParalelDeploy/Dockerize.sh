
echo -------------------------------------------------------------------------------------------------------------------------------------------------------------
echo ------------------------------------------------------- DOCKERIZANDO COMPONENTES ----------------------------------------------------------------------------
echo -------------------------------------------------------------------------------------------------------------------------------------------------------------


echo *Dockerizando todos los componentes generados  ----------------
cd "$parent_path"/gencode/actPresence0
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/actBrightness1
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/actWater2
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/actGas3
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/sensPresence0
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/sensBrightness1
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/sensWater2
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/sensGas3
echo pepita123* | sudo mvn clean package docker:build &
wait
cd "$parent_path"/gencode/Presence0
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/Brightness1
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/Water2
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/Gas3
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/Fiware/MiddlewareNodeComponent/MNCPresence
echo pepita123* | sudo docker build -t localhost:5000/mncpresence . &
wait
cd "$parent_path"/gencode/Fiware/OrionTopicManager/OTMPresence
echo pepita123* | sudo docker build -t localhost:5000/otmpresence . &
cd "$parent_path"/gencode/Fiware/MiddlewareNodeComponent/MNCBrightness
echo pepita123* | sudo docker build -t localhost:5000/mncbrightness . &
wait
cd "$parent_path"/gencode/Fiware/OrionTopicManager/OTMBrightness
echo pepita123* | sudo docker build -t localhost:5000/otmbrightness . &
cd "$parent_path"/gencode/Fiware/MiddlewareNodeComponent/MNCWater
echo pepita123* | sudo docker build -t localhost:5000/mncwater . &
wait
cd "$parent_path"/gencode/Fiware/OrionTopicManager/OTMWater
echo pepita123* | sudo docker build -t localhost:5000/otmwater . &
cd "$parent_path"/gencode/Fiware/MiddlewareNodeComponent/MNCGas
echo pepita123* | sudo docker build -t localhost:5000/mncgas . &
wait
cd "$parent_path"/gencode/Fiware/OrionTopicManager/OTMGas
echo pepita123* | sudo docker build -t localhost:5000/otmgas . &
cd "$parent_path"/gencode/apis/apiPresence0
echo pepita123* | sudo docker build -t localhost:5000/apipresence0 . &
cd "$parent_path"/gencode/apis/apiBrightness1
echo pepita123* | sudo docker build -t localhost:5000/apibrightness1 . &
cd "$parent_path"/gencode/apis/apiWater2
echo pepita123* | sudo docker build -t localhost:5000/apiwater2 . &
cd "$parent_path"/gencode/apis/apiGas3
echo pepita123* | sudo docker build -t localhost:5000/apigas3 . &

wait

echo -------------------------------------------------------------------------------------------------------------------------------------------------------------
echo ------------------------------------------------------- COMPONENTES DOCKERIZADOS ----------------------------------------------------------------------------
echo -------------------------------------------------------------------------------------------------------------------------------------------------------------
	
