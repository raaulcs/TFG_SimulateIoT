// --------------------------------------------------------------------------------------------------------------------------------

#include <TinkerKit.h>
#include <PubSubClient.h>
#include <YunClient.h>

// --------------------------------------------------------------------------------------------------------------------------------

#define MQTT_HOST_fogA0 "158.49.245.143"
#define MQTT_HOST_fogB0 "1.1.1.1"

#define TOPIC_A1 "A1"
#define TOPIC_A2 "A2"
#define TOPIC_B "B"

#define SERIAL 9600
#define PORT_fogA0 "Mosquitto_PORT"
#define PORT_fogB0 "Mosquitto_PORT"

// --------------------------------------------------------------------------------------------------------------------------------

void callback(char* topic, byte* payload, unsigned int length) {
  // Handle message arrived
}

// --------------------------------------------------------------------------------------------------------------------------------

YunClient yun;
PubSubClient mqtt_fogA0(MQTT_HOST_fogA0, PORT_fogA0, callback, yun);
PubSubClient mqtt_fogB0(MQTT_HOST_fogB0, PORT_fogB0, callback, yun);

boolean connected = false;	 // Toggle connected variable to check if MQTT is running
TKThermistor therm(I1);      // Creating the object 'therm' (TKThermistor class). Hooked up on I1
String var;					 // Auxiliary string variable

// --------------------------------------------------------------------------------------------------------------------------------

void connectMQTT(){
  while(!connected){
	if (mqtt_fogA0.connect("sensor0_fogA0") and mqtt_fogB0.connect("sensor0_fogB0")) {
      connected = true;
    }
    else {
      // Wait 5000 milliseconds before trying to connect again
	  delay(5000);    
    }
  }
}

void setup() {
  Serial.begin(SERIAL); // Initialize serial communications at 9600 bps
  Bridge.begin();
  connectMQTT();
}

// --------------------------------------------------------------------------------------------------------------------------------

void loop() {
  if (!mqtt_fogA0.connected() or !mqtt_fogB0.connected()) {
    connected = false;
    connectMQTT();
  }
  else {
    // Read the sensor value:
    var = therm.readCelsius();
	var = "{ \"value\" : \"" + var + "\" }";

	// Publish the sensor value:
	mqtt_fogA0.publish(TOPIC_A1,(char*) var.c_str());
	mqtt_fogA0.publish(TOPIC_A2,(char*) var.c_str());
	mqtt_fogB0.publish(TOPIC_B,(char*) var.c_str());

    // Wait 5000 milliseconds before the next loop
    delay(5000);
  } 

  mqtt_fogA0.loop();
  mqtt_fogB0.loop();
}

// --------------------------------------------------------------------------------------------------------------------------------
