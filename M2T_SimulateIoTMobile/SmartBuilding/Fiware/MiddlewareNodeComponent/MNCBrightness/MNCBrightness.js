var express = require('express');
var app = express();
var router = express.Router();
var mqtt = require('mqtt')

var clientBrightness1  = mqtt.connect('tcp://mosquitto-brightness1:1883')
clientBrightness1.on('connect', function () {
  console.log('Connected to Mosquitto of Swarm Brightness1 : tcp://mosquitto-brightness1:1883')
})


router.post('/Brightness_1', function(req, res) {
 console.log('Handling post request Brightness_1');
 clientBrightness1.publish('Brightness', 'RuleBrightness: The brightness is lower than 60%, lights on!');
 return res.json({
    success: true
});
});


//module.exports = router;

app.use("/",router);

app.listen(5150);
