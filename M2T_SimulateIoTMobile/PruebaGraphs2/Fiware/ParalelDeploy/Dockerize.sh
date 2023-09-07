
echo -------------------------------------------------------------------------------------------------------------------------------------------------------------
echo ------------------------------------------------------- DOCKERIZANDO COMPONENTES ----------------------------------------------------------------------------
echo -------------------------------------------------------------------------------------------------------------------------------------------------------------


echo *Dockerizando todos los componentes generados  ----------------
cd "$parent_path"/gencode/actHumidity0
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/actTemperature1
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/actWaterLevel2
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/sensHumidity0
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/sensTemperature1
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/sensWaterLevel2
echo pepita123* | sudo mvn clean package docker:build &
wait
cd "$parent_path"/gencode/Humidity0
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/Temperature1
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/WaterLevel2
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/Fiware/MiddlewareNodeComponent/MNCHumidity
echo pepita123* | sudo docker build -t localhost:5000/mnchumidity . &
wait
cd "$parent_path"/gencode/Fiware/OrionTopicManager/OTMHumidity
echo pepita123* | sudo docker build -t localhost:5000/otmhumidity . &
cd "$parent_path"/gencode/Fiware/MiddlewareNodeComponent/MNCTemperature
echo pepita123* | sudo docker build -t localhost:5000/mnctemperature . &
wait
cd "$parent_path"/gencode/Fiware/OrionTopicManager/OTMTemperature
echo pepita123* | sudo docker build -t localhost:5000/otmtemperature . &
cd "$parent_path"/gencode/Fiware/MiddlewareNodeComponent/MNCWaterLevel
echo pepita123* | sudo docker build -t localhost:5000/mncwaterlevel . &
wait
cd "$parent_path"/gencode/Fiware/OrionTopicManager/OTMWaterLevel
echo pepita123* | sudo docker build -t localhost:5000/otmwaterlevel . &
cd "$parent_path"/gencode/apis/apiHumidity0
echo pepita123* | sudo docker build -t localhost:5000/apihumidity0 . &
cd "$parent_path"/gencode/apis/apiTemperature1
echo pepita123* | sudo docker build -t localhost:5000/apitemperature1 . &
cd "$parent_path"/gencode/apis/apiWaterLevel2
echo pepita123* | sudo docker build -t localhost:5000/apiwaterlevel2 . &

wait

echo -------------------------------------------------------------------------------------------------------------------------------------------------------------
echo ------------------------------------------------------- COMPONENTES DOCKERIZADOS ----------------------------------------------------------------------------
echo -------------------------------------------------------------------------------------------------------------------------------------------------------------
	
