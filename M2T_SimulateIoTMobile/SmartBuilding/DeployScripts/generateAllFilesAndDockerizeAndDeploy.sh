#!/bin/sh

echo Eliminando archivos no necesarios antes de dockerizar...
rm "$parent_path"/gencode/actPresence0/src/main/java/actuator/App.java
rm "$parent_path"/gencode/actBrightness1/src/main/java/actuator/App.java
rm "$parent_path"/gencode/actWater2/src/main/java/actuator/App.java
rm "$parent_path"/gencode/actGas3/src/main/java/actuator/App.java
rm "$parent_path"/gencode/sensPresence0/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/sensBrightness1/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/sensWater2/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/sensGas3/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/Presence0/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/Brightness1/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/Water2/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/Gas3/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/EsperComponentPresence0/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/EsperComponentBrightness1/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/EsperComponentWater2/src/main/java/Gestores/App.java
rm "$parent_path"/gencode/EsperComponentGas3/src/main/java/Gestores/App.java
echo Archivos innecesarios eliminados!
echo *Dockerizando todos los componentes generados  ----------------
cd "$parent_path"/gencode/actPresence0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/actBrightness1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/actWater2
sudo mvn clean package docker:build
cd "$parent_path"/gencode/actGas3
sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensPresence0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensBrightness1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensWater2
sudo mvn clean package docker:build
cd "$parent_path"/gencode/sensGas3
sudo mvn clean package docker:build
cd "$parent_path"/gencode/Presence0
sudo mvn clean package docker:build
cd "$parent_path"/gencode/Brightness1
sudo mvn clean package docker:build
cd "$parent_path"/gencode/Water2
sudo mvn clean package docker:build
cd "$parent_path"/gencode/Gas3
sudo mvn clean package docker:build
cd "$parent_path"/gencode/EsperComponentPresence0
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd "$parent_path"/gencode/EsperComponentBrightness1
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd "$parent_path"/gencode/EsperComponentWater2
sudo mvn clean compile assembly:single
sudo mvn docker:build
cd "$parent_path"/gencode/EsperComponentGas3
sudo mvn clean compile assembly:single
sudo mvn docker:build
echo *Componentes Dockerizados! ----------------
