var mqtt = require('mqtt')
var client  = mqtt.connect('tcp://mosquitto-gas3:1883')

client.on('connect', function () {
  console.log('Connected to Mosquitto!')
})

client.subscribe("Gas",{qos:1});
console.log('Suscribed to topic Gas!')

			
client.on('message',function(topic, message, packet){
	if(topic === 'Gas'){
		console.log("Message received: " + message + " --- Publishing to Orion.");
		client.publish('/1234/Topic_Gas/attrs', message);
	}
	
});
			

