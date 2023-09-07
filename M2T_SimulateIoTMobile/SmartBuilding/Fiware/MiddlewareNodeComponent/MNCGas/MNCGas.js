var express = require('express');
var app = express();
var router = express.Router();
var mqtt = require('mqtt')

var clientGas3  = mqtt.connect('tcp://mosquitto-gas3:1883')
clientGas3.on('connect', function () {
  console.log('Connected to Mosquitto of Swarm Gas3 : tcp://mosquitto-gas3:1883')
})


router.post('/Gas_3', function(req, res) {
 console.log('Handling post request Gas_3');
 clientGas3.publish('Gas', 'RuleGas: The gas level is decreasing, might be a leak!');
 return res.json({
    success: true
});
});


//module.exports = router;

app.use("/",router);

app.listen(5150);
