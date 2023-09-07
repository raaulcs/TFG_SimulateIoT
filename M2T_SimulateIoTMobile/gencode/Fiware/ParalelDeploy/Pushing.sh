#!/bin/bash
echo pepita123* | sudo -S docker push localhost:5000/foga0 &
echo pepita123* | sudo -S docker push localhost:5000/fogb1 &
echo pepita123* | sudo -S docker push localhost:5000/mncfogb &

echo pepita123* | sudo -S docker push localhost:5000/otmfogb &
echo pepita123* | sudo -S docker push localhost:5000/acta0 &
echo pepita123* | sudo -S docker push localhost:5000/actb1 &
echo pepita123* | sudo -S docker push localhost:5000/sensa0 &
echo pepita123* | sudo -S docker push localhost:5000/sensb1 &
