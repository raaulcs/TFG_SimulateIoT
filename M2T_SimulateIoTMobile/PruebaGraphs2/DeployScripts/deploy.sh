#!/bin/sh

echo *Iniciando el Despliegue ----------------
gnome-terminal --tab -e "bash -c 'printf \"\033]0;FOGHumidity0\007\";echo pepita123* | sudo -S docker run humidity0'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;FOGTemperature1\007\";echo pepita123* | sudo -S docker run temperature1'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;FOGWaterLevel2\007\";echo pepita123* | sudo -S docker run waterlevel2'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ESPERHumidity0\007\";echo pepita123* | sudo -S docker run EsperComponenthumidity0'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ESPERTemperature1\007\";echo pepita123* | sudo -S docker run EsperComponenttemperature1'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ESPERWaterLevel2\007\";echo pepita123* | sudo -S docker run EsperComponentwaterlevel2'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ACTUATORactHumidity0\007\";echo pepita123* | sudo -S docker run acthumidity0'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ACTUATORactTemperature1\007\";echo pepita123* | sudo -S docker run acttemperature1'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ACTUATORactWaterLevel2\007\";echo pepita123* | sudo -S docker run actwaterlevel2'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;DEVICEsensHumidity0\007\";echo pepita123* | sudo -S docker run senshumidity0'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;DEVICEsensTemperature1\007\";echo pepita123* | sudo -S docker run senstemperature1'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;DEVICEsensWaterLevel2\007\";echo pepita123* | sudo -S docker run senswaterlevel2'"
echo *Finalizando el Despliegue ----------------
