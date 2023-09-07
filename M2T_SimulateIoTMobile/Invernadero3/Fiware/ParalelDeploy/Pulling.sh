#!/bin/bash
docker-machine ssh Humidity0 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/mnchumidity;docker pull 158.49.189.138:5000/otmhumidity;docker pull 158.49.189.138:5000/acthumidity0;docker pull 158.49.189.138:5000/senshumidity0;exit"
docker-machine ssh Temperature1 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/mnctemperature;docker pull 158.49.189.138:5000/otmtemperature;docker pull 158.49.189.138:5000/acttemperature1;docker pull 158.49.189.138:5000/senstemperature1;exit"
docker-machine ssh WaterLevel2 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/mncwaterlevel;docker pull 158.49.189.138:5000/otmwaterlevel;docker pull 158.49.189.138:5000/actwaterlevel2;docker pull 158.49.189.138:5000/senswaterlevel2;exit"

