#!/bin/sh

echo Eliminando archivos no necesarios antes de dockerizar...
rm "$parent_path"/gencode/ActA0/src/main/java/actuator/App.java
rm "$parent_path"/gencode/ActB0/src/main/java/actuator/App.java
rm "$parent_path"/gencode/SensA0/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/SensB0/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/fogA0/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/fogB0/src/main/java/Gestores/App.java
echo Archivos innecesarios eliminados!
echo *Dockerizando todos los componentes generados  ----------------
cd "$parent_path"/gencode/ActA0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/ActB0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/SensA0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/SensB0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/fogA0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/fogB0
sudo mvn clean package docker:build
echo *Componentes Dockerizados! ----------------
