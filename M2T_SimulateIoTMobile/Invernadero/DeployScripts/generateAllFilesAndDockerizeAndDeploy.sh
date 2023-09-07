#!/bin/sh

echo Eliminando archivos no necesarios antes de dockerizar...
rm "$parent_path"/gencode/actHumidity0/src/main/java/actuator/App.java
rm "$parent_path"/gencode/actTemperature1/src/main/java/actuator/App.java
rm "$parent_path"/gencode/actWaterLevel2/src/main/java/actuator/App.java
rm "$parent_path"/gencode/sensHumidity0/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/sensTemperature1/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/sensWaterLevel2/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/Humidity0/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/Temperature1/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/WaterLevel2/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/EsperComponentHumidity0/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/EsperComponentTemperature1/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/EsperComponentWaterLevel2/src/main/java/Gestores/App.java
echo Archivos innecesarios eliminados!
echo *Dockerizando todos los componentes generados  ----------------
cd "$parent_path"/gencode/actHumidity0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/actTemperature1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/actWaterLevel2
sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensHumidity0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensTemperature1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensWaterLevel2
sudo mvn clean package docker:build
cd "$parent_path"/gencode/Humidity0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/Temperature1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/WaterLevel2
sudo mvn clean package docker:build
cd "$parent_path"/gencode/EsperComponentHumidity0
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd "$parent_path"/gencode/EsperComponentTemperature1
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd "$parent_path"/gencode/EsperComponentWaterLevel2
sudo mvn clean compile assembly:single
sudo mvn docker:build
echo *Componentes Dockerizados! ----------------
