#!/bin/sh

echo *Iniciando el Despliegue ----------------
gnome-terminal --tab -e "bash -c 'printf \"\033]0;FOGfogA0\007\";echo pepita123* | sudo -S docker run foga0'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;FOGfogB1\007\";echo pepita123* | sudo -S docker run fogb1'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ESPERfogB1\007\";echo pepita123* | sudo -S docker run EsperComponentfogb1'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ACTUATORActA0\007\";echo pepita123* | sudo -S docker run acta0'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ACTUATORActB1\007\";echo pepita123* | sudo -S docker run actb1'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;DEVICESensA0\007\";echo pepita123* | sudo -S docker run sensa0'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;DEVICESensB1\007\";echo pepita123* | sudo -S docker run sensb1'"
echo *Finalizando el Despliegue ----------------
