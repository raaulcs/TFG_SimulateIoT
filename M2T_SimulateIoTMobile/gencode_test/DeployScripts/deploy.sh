#!/bin/sh

echo *Iniciando el Despliegue ----------------
gnome-terminal --tab -e "bash -c 'printf \"\033]0;FOGfogA0\007\";echo pepita123* | sudo -S docker run foga0'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;FOGfogB0\007\";echo pepita123* | sudo -S docker run fogb0'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ACTUATORActA0\007\";echo pepita123* | sudo -S docker run acta0'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;ACTUATORActB0\007\";echo pepita123* | sudo -S docker run actb0'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;DEVICESensA0\007\";echo pepita123* | sudo -S docker run sensa0'"
gnome-terminal --tab -e "bash -c 'printf \"\033]0;DEVICESensB0\007\";echo pepita123* | sudo -S docker run sensb0'"
echo *Finalizando el Despliegue ----------------
