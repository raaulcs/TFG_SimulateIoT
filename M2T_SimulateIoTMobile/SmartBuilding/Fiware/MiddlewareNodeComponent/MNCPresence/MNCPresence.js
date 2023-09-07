var express = require('express');
var app = express();
var router = express.Router();
var mqtt = require('mqtt')

var clientPresence0  = mqtt.connect('tcp://mosquitto-presence0:1883')
clientPresence0.on('connect', function () {
  console.log('Connected to Mosquitto of Swarm Presence0 : tcp://mosquitto-presence0:1883')
})


router.post('/Presence_0', function(req, res) {
 console.log('Handling post request Presence_0');
 clientPresence0.publish('Presence', 'RulePresence: Presence detected!');
 return res.json({
    success: true
});
});


//module.exports = router;

app.use("/",router);

app.listen(5150);
