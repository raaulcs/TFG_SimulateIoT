var express = require('express');
var app = express();
var router = express.Router();
var mqtt = require('mqtt')

var clientWater2  = mqtt.connect('tcp://mosquitto-water2:1883')
clientWater2.on('connect', function () {
  console.log('Connected to Mosquitto of Swarm Water2 : tcp://mosquitto-water2:1883')
})


router.post('/Water_2', function(req, res) {
 console.log('Handling post request Water_2');
 clientWater2.publish('Water', 'RuleWater: The water level is decreasing, might be a leak!');
 return res.json({
    success: true
});
});


//module.exports = router;

app.use("/",router);

app.listen(5150);
