var mqtt = require('mqtt')
var client  = mqtt.connect('tcp://mosquitto-brightness1:1883')

client.on('connect', function () {
  console.log('Connected to Mosquitto!')
})

client.subscribe("Brightness",{qos:1});
console.log('Suscribed to topic Brightness!')

			
client.on('message',function(topic, message, packet){
	if(topic === 'Brightness'){
		console.log("Message received: " + message + " --- Publishing to Orion.");
		client.publish('/1234/Topic_Brightness/attrs', message);
	}
	
});
			

