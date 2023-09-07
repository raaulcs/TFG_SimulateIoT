#!/bin/sh

echo Eliminando archivos no necesarios antes de dockerizar...
rm "$parent_path"/gencode/ActA0/src/main/java/actuator/App.java
rm "$parent_path"/gencode/ActB1/src/main/java/actuator/App.java
rm "$parent_path"/gencode/SensA0/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/SensB1/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/fogA0/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/fogB1/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/EsperComponentfogB1/src/main/java/Gestores/App.java
echo Archivos innecesarios eliminados!
echo *Dockerizando todos los componentes generados  ----------------
cd "$parent_path"/gencode/ActA0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/ActB1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/SensA0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/SensB1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/fogA0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/fogB1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/EsperComponentfogB1
sudo mvn clean compile assembly:single
sudo mvn docker:build
echo *Componentes Dockerizados! ----------------
