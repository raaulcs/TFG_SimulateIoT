#!/bin/sh

echo *Iniciando el Despliegue ----------------
gnome-terminal --tab -e "bash -c 'printf \"\033]0;FOGPresence0\007\";echo pepita123* | sudo -S docker run presence0'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;FOGBrightness1\007\";echo pepita123* | sudo -S docker run brightness1'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;FOGWater2\007\";echo pepita123* | sudo -S docker run water2'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;FOGGas3\007\";echo pepita123* | sudo -S docker run gas3'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ESPERPresence0\007\";echo pepita123* | sudo -S docker run EsperComponentpresence0'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ESPERBrightness1\007\";echo pepita123* | sudo -S docker run EsperComponentbrightness1'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ESPERWater2\007\";echo pepita123* | sudo -S docker run EsperComponentwater2'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ESPERGas3\007\";echo pepita123* | sudo -S docker run EsperComponentgas3'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ACTUATORactPresence0\007\";echo pepita123* | sudo -S docker run actpresence0'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ACTUATORactBrightness1\007\";echo pepita123* | sudo -S docker run actbrightness1'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ACTUATORactWater2\007\";echo pepita123* | sudo -S docker run actwater2'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ACTUATORactGas3\007\";echo pepita123* | sudo -S docker run actgas3'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;DEVICEsensPresence0\007\";echo pepita123* | sudo -S docker run senspresence0'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;DEVICEsensBrightness1\007\";echo pepita123* | sudo -S docker run sensbrightness1'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;DEVICEsensWater2\007\";echo pepita123* | sudo -S docker run senswater2'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;DEVICEsensGas3\007\";echo pepita123* | sudo -S docker run sensgas3'"
echo *Finalizando el Despliegue ----------------
