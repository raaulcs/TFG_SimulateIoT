
echo -------------------------------------------------------------------------------------------------------------------------------------------------------------
echo ------------------------------------------------------- DOCKERIZANDO COMPONENTES ----------------------------------------------------------------------------
echo -------------------------------------------------------------------------------------------------------------------------------------------------------------


echo *Dockerizando todos los componentes generados  ----------------
cd "$parent_path"/gencode/ActA0
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/ActB1
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/SensA0
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/SensB1
echo pepita123* | sudo mvn clean package docker:build &
wait
cd "$parent_path"/gencode/fogA0
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/fogB1
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/Fiware/MiddlewareNodeComponent/MNCfogB
echo pepita123* | sudo docker build -t localhost:5000/mncfogb . &
wait
cd "$parent_path"/gencode/Fiware/OrionTopicManager/OTMfogB
echo pepita123* | sudo docker build -t localhost:5000/otmfogb . &
cd "$parent_path"/gencode/apis/apifogA0
echo pepita123* | sudo docker build -t localhost:5000/apifoga0 . &
cd "$parent_path"/gencode/apis/apifogB1
echo pepita123* | sudo docker build -t localhost:5000/apifogb1 . &

wait

echo -------------------------------------------------------------------------------------------------------------------------------------------------------------
echo ------------------------------------------------------- COMPONENTES DOCKERIZADOS ----------------------------------------------------------------------------
echo -------------------------------------------------------------------------------------------------------------------------------------------------------------
	
