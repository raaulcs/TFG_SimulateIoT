#!/bin/bash
docker-machine ssh fogA0 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/acta0;docker pull 158.49.189.138:5000/sensa0;exit"
docker-machine ssh fogB1 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/mncfogb;docker pull 158.49.189.138:5000/otmfogb;docker pull 158.49.189.138:5000/actb1;docker pull 158.49.189.138:5000/sensb1;exit"

