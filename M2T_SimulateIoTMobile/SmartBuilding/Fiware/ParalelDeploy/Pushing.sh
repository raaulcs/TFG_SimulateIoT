#!/bin/bash
echo pepita123* | sudo -S docker push localhost:5000/presence0 &
echo pepita123* | sudo -S docker push localhost:5000/brightness1 &
echo pepita123* | sudo -S docker push localhost:5000/water2 &
echo pepita123* | sudo -S docker push localhost:5000/gas3 &
echo pepita123* | sudo -S docker push localhost:5000/mncpresence &

echo pepita123* | sudo -S docker push localhost:5000/otmpresence &
echo pepita123* | sudo -S docker push localhost:5000/mncbrightness &

echo pepita123* | sudo -S docker push localhost:5000/otmbrightness &
echo pepita123* | sudo -S docker push localhost:5000/mncwater &

echo pepita123* | sudo -S docker push localhost:5000/otmwater &
echo pepita123* | sudo -S docker push localhost:5000/mncgas &

echo pepita123* | sudo -S docker push localhost:5000/otmgas &
echo pepita123* | sudo -S docker push localhost:5000/actpresence0 &
echo pepita123* | sudo -S docker push localhost:5000/actbrightness1 &
echo pepita123* | sudo -S docker push localhost:5000/actwater2 &
echo pepita123* | sudo -S docker push localhost:5000/actgas3 &
echo pepita123* | sudo -S docker push localhost:5000/senspresence0 &
echo pepita123* | sudo -S docker push localhost:5000/sensbrightness1 &
echo pepita123* | sudo -S docker push localhost:5000/senswater2 &
echo pepita123* | sudo -S docker push localhost:5000/sensgas3 &
