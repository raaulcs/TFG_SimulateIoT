var mqtt = require('mqtt')
var client  = mqtt.connect('tcp://mosquitto-humidity0:1883')

client.on('connect', function () {
  console.log('Connected to Mosquitto!')
})

client.subscribe("Humidity",{qos:1});
console.log('Suscribed to topic Humidity!')

			
client.on('message',function(topic, message, packet){
	if(topic === 'Humidity'){
		console.log("Message received: " + message + " --- Publishing to Orion.");
		client.publish('/1234/Topic_Humidity/attrs', message);
	}
	
});
			

