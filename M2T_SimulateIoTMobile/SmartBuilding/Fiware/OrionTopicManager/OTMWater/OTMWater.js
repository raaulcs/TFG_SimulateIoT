var mqtt = require('mqtt')
var client  = mqtt.connect('tcp://mosquitto-water2:1883')

client.on('connect', function () {
  console.log('Connected to Mosquitto!')
})

client.subscribe("Water",{qos:1});
console.log('Suscribed to topic Water!')

			
client.on('message',function(topic, message, packet){
	if(topic === 'Water'){
		console.log("Message received: " + message + " --- Publishing to Orion.");
		client.publish('/1234/Topic_Water/attrs', message);
	}
	
});
			

