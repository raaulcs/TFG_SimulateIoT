var express = require('express');
var app = express();
var router = express.Router();
var mqtt = require('mqtt')

var clientWaterLevel2  = mqtt.connect('tcp://mosquitto-waterlevel2:1883')
clientWaterLevel2.on('connect', function () {
  console.log('Connected to Mosquitto of Swarm WaterLevel2 : tcp://mosquitto-waterlevel2:1883')
})


router.post('/Humidity_3', function(req, res) {
 console.log('Handling post request Humidity_3');
 clientWaterLevel2.publish('Humidity', 'RuleWaterLevel: The water level in the tank is below 10 liters.');
 return res.json({
    success: true
});
});


//module.exports = router;

app.use("/",router);

app.listen(5150);
