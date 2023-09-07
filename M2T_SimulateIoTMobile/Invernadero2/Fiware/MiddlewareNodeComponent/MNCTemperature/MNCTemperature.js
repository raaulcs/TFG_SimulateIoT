var express = require('express');
var app = express();
var router = express.Router();
var mqtt = require('mqtt')

var clientTemperature1  = mqtt.connect('tcp://mosquitto-temperature1:1883')
clientTemperature1.on('connect', function () {
  console.log('Connected to Mosquitto of Swarm Temperature1 : tcp://mosquitto-temperature1:1883')
})


router.post('/Temperature_1', function(req, res) {
 console.log('Handling post request Temperature_1');
 clientTemperature1.publish('Temperature', 'RuleTemperature: Temperature is below 16 degrees.');
 return res.json({
    success: true
});
});
router.post('/Temperature_2', function(req, res) {
 console.log('Handling post request Temperature_2');
 clientTemperature1.publish('Temperature', 'RuleTemperature: Temperature has surpassed 25 degrees.');
 return res.json({
    success: true
});
});


//module.exports = router;

app.use("/",router);

app.listen(5150);
