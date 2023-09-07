
echo -------------------------------------------------------------------------------------------------------------------------------------------------------------
echo ------------------------------------------------------- DOCKERIZANDO COMPONENTES ----------------------------------------------------------------------------
echo -------------------------------------------------------------------------------------------------------------------------------------------------------------

echo pepita123* | cp "$parent_path"/gencode/temperature.csv.csv "$parent_path"/gencode/SensA0/src/main/resources &

echo *Dockerizando todos los componentes generados  ----------------
cd "$parent_path"/gencode/ActA0
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/ActB0
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/SensA0
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/SensB0
echo pepita123* | sudo mvn clean package docker:build &
wait
cd "$parent_path"/gencode/fogA0
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/fogB0
echo pepita123* | sudo mvn clean package docker:build &
cd "$parent_path"/gencode/apis/apifogA0
echo pepita123* | sudo docker build -t localhost:5000/apifoga0 . &
cd "$parent_path"/gencode/apis/apifogB0
echo pepita123* | sudo docker build -t localhost:5000/apifogb0 . &

wait

echo -------------------------------------------------------------------------------------------------------------------------------------------------------------
echo ------------------------------------------------------- COMPONENTES DOCKERIZADOS ----------------------------------------------------------------------------
echo -------------------------------------------------------------------------------------------------------------------------------------------------------------
	
