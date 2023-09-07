var mqtt = require('mqtt')
var client  = mqtt.connect('tcp://mosquitto-presence0:1883')

client.on('connect', function () {
  console.log('Connected to Mosquitto!')
})

client.subscribe("Presence",{qos:1});
console.log('Suscribed to topic Presence!')

			
client.on('message',function(topic, message, packet){
	if(topic === 'Presence'){
		console.log("Message received: " + message + " --- Publishing to Orion.");
		client.publish('/1234/Topic_Presence/attrs', message);
	}
	
});
			

