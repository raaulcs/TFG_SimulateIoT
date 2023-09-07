var express = require('express');
var app = express();
var router = express.Router();
var mqtt = require('mqtt')

var clientfogB1  = mqtt.connect('tcp://mosquitto-fogb1:1883')
clientfogB1.on('connect', function () {
  console.log('Connected to Mosquitto of Swarm fogB1 : tcp://mosquitto-fogb1:1883')
})


router.post('/TopicC_0', function(req, res) {
 console.log('Handling post request TopicC_0');
 clientfogB1.publish('TopicC', 'RuleTopicBFogB: rule meet');
 return res.json({
    success: true
});
});


//module.exports = router;

app.use("/",router);

app.listen(5150);
