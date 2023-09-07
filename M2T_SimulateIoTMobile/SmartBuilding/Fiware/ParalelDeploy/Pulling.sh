#!/bin/bash
docker-machine ssh Presence0 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/mncpresence;docker pull 158.49.189.138:5000/otmpresence;docker pull 158.49.189.138:5000/actpresence0;docker pull 158.49.189.138:5000/senspresence0;exit"
docker-machine ssh Brightness1 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/mncbrightness;docker pull 158.49.189.138:5000/otmbrightness;docker pull 158.49.189.138:5000/actbrightness1;docker pull 158.49.189.138:5000/sensbrightness1;exit"
docker-machine ssh Water2 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/mncwater;docker pull 158.49.189.138:5000/otmwater;docker pull 158.49.189.138:5000/actwater2;docker pull 158.49.189.138:5000/senswater2;exit"
docker-machine ssh Gas3 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/mncgas;docker pull 158.49.189.138:5000/otmgas;docker pull 158.49.189.138:5000/actgas3;docker pull 158.49.189.138:5000/sensgas3;exit"

