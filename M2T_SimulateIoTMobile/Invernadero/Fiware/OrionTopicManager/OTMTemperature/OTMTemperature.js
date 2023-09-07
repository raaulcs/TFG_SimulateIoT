var mqtt = require('mqtt')
var client  = mqtt.connect('tcp://mosquitto-temperature1:1883')

client.on('connect', function () {
  console.log('Connected to Mosquitto!')
})

client.subscribe("Temperature",{qos:1});
console.log('Suscribed to topic Temperature!')

			
client.on('message',function(topic, message, packet){
	if(topic === 'Temperature'){
		console.log("Message received: " + message + " --- Publishing to Orion.");
		client.publish('/1234/Topic_Temperature/attrs', message);
	}
	
});
			

