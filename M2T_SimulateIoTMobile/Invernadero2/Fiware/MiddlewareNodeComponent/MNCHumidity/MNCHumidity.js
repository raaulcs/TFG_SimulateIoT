var express = require('express');
var app = express();
var router = express.Router();
var mqtt = require('mqtt')

var clientHumidity0  = mqtt.connect('tcp://mosquitto-humidity0:1883')
clientHumidity0.on('connect', function () {
  console.log('Connected to Mosquitto of Swarm Humidity0 : tcp://mosquitto-humidity0:1883')
})


router.post('/Humidity_0', function(req, res) {
 console.log('Handling post request Humidity_0');
 clientHumidity0.publish('Humidity', 'RuleHumidity: Humidity is decreasing, it is below 50%.');
 return res.json({
    success: true
});
});


//module.exports = router;

app.use("/",router);

app.listen(5150);
