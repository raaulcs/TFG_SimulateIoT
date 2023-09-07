var mqtt = require('mqtt')
var client  = mqtt.connect('tcp://mosquitto-waterlevel2:1883')

client.on('connect', function () {
  console.log('Connected to Mosquitto!')
})

client.subscribe("WaterLevel",{qos:1});
console.log('Suscribed to topic WaterLevel!')

			
client.on('message',function(topic, message, packet){
	if(topic === 'WaterLevel'){
		console.log("Message received: " + message + " --- Publishing to Orion.");
		client.publish('/1234/Topic_WaterLevel/attrs', message);
	}
	
});
			

