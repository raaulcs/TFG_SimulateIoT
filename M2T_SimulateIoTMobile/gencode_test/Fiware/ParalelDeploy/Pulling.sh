#!/bin/bash
docker-machine ssh fogA0 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/acta0;docker pull 158.49.189.138:5000/sensa0;exit"
docker-machine ssh fogB0 "echo pepita123* | docker login --username joseinformatica96 --password-stdin;docker pull 158.49.189.138:5000/actb0;docker pull 158.49.189.138:5000/sensb0;exit"

