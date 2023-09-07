#!/bin/sh

echo *Generando los proyectos Maven necesarios para el motor generador de codigo ----------------
echo Generando actuators...
mvn archetype:generate -DgroupId=actuator -DartifactId=ActA0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=actuator -DartifactId=ActB0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
echo Actuadores generados!
echo Generando devices...
mvn archetype:generate -DgroupId=Gestores -DartifactId=SensA0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=Gestores -DartifactId=SensB0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
echo Devices generados!
echo Generando nodos Fog...
mvn archetype:generate -DgroupId=Fog -DartifactId=fogA0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=Fog -DartifactId=fogB0 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
echo Nodos Fog generados!
echo Generando componentes Esper...
echo componentes Esper generados!
echo *Fin de la generacion de proyectos Maven! ----------------
