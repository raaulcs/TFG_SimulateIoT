#!/bin/bash
echo pepita123* | sudo -S docker push localhost:5000/humidity0 &
echo pepita123* | sudo -S docker push localhost:5000/temperature1 &
echo pepita123* | sudo -S docker push localhost:5000/waterlevel2 &
echo pepita123* | sudo -S docker push localhost:5000/mnchumidity &

echo pepita123* | sudo -S docker push localhost:5000/otmhumidity &
echo pepita123* | sudo -S docker push localhost:5000/mnctemperature &

echo pepita123* | sudo -S docker push localhost:5000/otmtemperature &
echo pepita123* | sudo -S docker push localhost:5000/mncwaterlevel &

echo pepita123* | sudo -S docker push localhost:5000/otmwaterlevel &
echo pepita123* | sudo -S docker push localhost:5000/acthumidity0 &
echo pepita123* | sudo -S docker push localhost:5000/acttemperature1 &
echo pepita123* | sudo -S docker push localhost:5000/actwaterlevel2 &
echo pepita123* | sudo -S docker push localhost:5000/senshumidity0 &
echo pepita123* | sudo -S docker push localhost:5000/senstemperature1 &
echo pepita123* | sudo -S docker push localhost:5000/senswaterlevel2 &
