var mqtt = require('mqtt')
var client  = mqtt.connect('tcp://mosquitto-fogb1:1883')

client.on('connect', function () {
  console.log('Connected to Mosquitto!')
})

client.subscribe("TopicB",{qos:1});
console.log('Suscribed to topic TopicB!')

			
client.on('message',function(topic, message, packet){
	if(topic === 'TopicB'){
		console.log("Message received: " + message + " --- Publishing to Orion.");
		client.publish('/1234/Topic_TopicB/attrs', message);
	}
	
});
			

