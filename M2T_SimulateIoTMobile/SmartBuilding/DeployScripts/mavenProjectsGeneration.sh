#!/bin/sh

echo *Generando los proyectos Maven necesarios para el motor generador de codigo ----------------
echo Generando actuators...
mvn archetype:generate -DgroupId=actuator -DartifactId=actPresence0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=actuator -DartifactId=actBrightness1 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=actuator -DartifactId=actWater2 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=actuator -DartifactId=actGas3 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
echo Actuadores generados!
echo Generando devices...
mvn archetype:generate -DgroupId=Gestores -DartifactId=sensPresence0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=Gestores -DartifactId=sensBrightness1 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=Gestores -DartifactId=sensWater2 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=Gestores -DartifactId=sensGas3 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
echo Devices generados!
echo Generando nodos Fog...
mvn archetype:generate -DgroupId=Fog -DartifactId=Presence0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=Fog -DartifactId=Brightness1 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=Fog -DartifactId=Water2 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=Fog -DartifactId=Gas3 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
echo Nodos Fog generados!
echo Generando componentes Esper...
mvn archetype:generate -DgroupId=EsperClient -DartifactId=EsperComponentPresence0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=EsperClient -DartifactId=EsperComponentBrightness1 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=EsperClient -DartifactId=EsperComponentWater2 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=EsperClient -DartifactId=EsperComponentGas3 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
echo componentes Esper generados!
echo *Fin de la generacion de proyectos Maven! ----------------
