#!/bin/sh

echo *Generando los proyectos Maven necesarios para el motor generador de codigo ----------------
echo Generando actuators...
mvn archetype:generate -DgroupId=actuator -DartifactId=actHumidity0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=actuator -DartifactId=actTemperature1 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=actuator -DartifactId=actWaterLevel2 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
echo Actuadores generados!
echo Generando devices...
mvn archetype:generate -DgroupId=Gestores -DartifactId=sensHumidity0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=Gestores -DartifactId=sensTemperature1 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=Gestores -DartifactId=sensWaterLevel2 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
echo Devices generados!
echo Generando nodos Fog...
mvn archetype:generate -DgroupId=Fog -DartifactId=Humidity0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=Fog -DartifactId=Temperature1 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=Fog -DartifactId=WaterLevel2 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
echo Nodos Fog generados!
echo Generando componentes Esper...
mvn archetype:generate -DgroupId=EsperClient -DartifactId=EsperComponentHumidity0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=EsperClient -DartifactId=EsperComponentTemperature1 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=EsperClient -DartifactId=EsperComponentWaterLevel2 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
echo componentes Esper generados!
echo *Fin de la generacion de proyectos Maven! ----------------
