#!/bin/bash
echo pepita123* | sudo -S docker push localhost:5000/foga0 &
echo pepita123* | sudo -S docker push localhost:5000/fogb0 &
echo pepita123* | sudo -S docker push localhost:5000/acta0 &
echo pepita123* | sudo -S docker push localhost:5000/actb0 &
echo pepita123* | sudo -S docker push localhost:5000/sensa0 &
echo pepita123* | sudo -S docker push localhost:5000/sensb0 &
