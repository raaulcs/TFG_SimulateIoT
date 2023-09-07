#!/bin/bash


curl -iX POST \
  'http://localhost:4041/iot/services' \
  -H 'Content-Type: application/json' \
  -H 'fiware-service: openiot' \
  -H 'fiware-servicepath: /' \
  -d '{
 "services": [
   {
     "apikey":      "",
     "cbroker":     "http://orion:8082",
     "entity_type": "Devices",
     "resource":    ""
   }
 ]
}'

curl -iX POST \
  'http://localhost:4041/iot/devices' \
  -H 'Content-Type: application/json' \
  -H 'fiware-service: openiot' \
  -H 'fiware-servicepath: /' \
  -d '{
 "devices": [
   {
     "device_id":   "sensHumidity_0",
     "entity_name": "urn:ngsi-ld:sensHumidity:0",
     "entity_type": "Humidity",
     "protocol":    "JSON",
     "transport":   "MQTT",
     "timezone":    "Europe/Berlin",
     "attributes": [
       { "object_id": "v", "name": "value", "type": "Integer" }
     ],
     "static_attributes": [
       { "name":"name", "type": "String", "value": "sensHumidity"}
     ]
   }
 ]
}'

    

curl -iX POST \
  'http://localhost:4041/iot/devices' \
  -H 'Content-Type: application/json' \
  -H 'fiware-service: openiot' \
  -H 'fiware-servicepath: /' \
  -d '{
 "devices": [
   {
     "device_id":   "actHumidity_0",
     "entity_name": "urn:ngsi-ld:actHumidity:0",
     "entity_type": "Actuator",
     "protocol":    "JSON",
     "transport":   "MQTT",
     "timezone":    "Europe/Berlin",
     "static_attributes": [
       { "name":"name", "type": "String", "value": "actHumidity"}
     ]
   }
 ]
}'

curl -iX POST \
  'http://localhost:4041/iot/devices' \
  -H 'Content-Type: application/json' \
  -H 'fiware-service: openiot' \
  -H 'fiware-servicepath: /' \
  -d '{
 "devices": [
   {
     "device_id":   "Topic_Humidity",
     "entity_name": "urn:ngsi-ld:Topic_Humidity:0",
     "entity_type": "Topic",
     "protocol":    "JSON",
     "transport":   "MQTT",
     "timezone":    "Europe/Berlin",
     "attributes": [
       { "object_id": "v", "name": "value", "type": "Integer" }
     ],
     "static_attributes": [
       { "name":"name", "type": "String", "value": "Topic_Humidity"}
     ]
   }
 ]
}'

////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////
--------------------------------------------------------
curl -iX POST \
  --url 'http://localhost:8082/v2/subscriptions' \
  --header 'content-type: application/json' \
  -H 'fiware-service: openiot' \
  --data '{
  "description": "Suscription description",
  "subject": {
    "entities": [{"idPattern": "urn:ngsi-ld:Topic_Humidity:0"}],
    "condition": {
      "attrs": [ "value" ]
    }
  },
  "notification": {
    "http": {
      "url": "http://perseo-fe-humidity0:9090/notices"
    }
  }
}'

------------
curl -iX POST \
  'http://localhost:9090/rules' \
  -H 'fiware-service: openiot' \
  -H 'fiware-servicepath: /' \
  -H 'Content-Type: application/json' \
  -d '{
  "name": "rule0_humidity",
  "text":"select *,\"rule0_humidity\" as ruleName from pattern [every select value from EsperClient.EventHumidity where value < 50 and id=\"urn:ngsi-ld:Topic_Humidity:0\")]",
  "action": {
        "type": "post",
        "template": "{\"value\":${value}}",
        "parameters": {
            "url": "http://mnchumidity0:5150/Humidity_0",
            "headers": {
                        "Content-type": "application/json"
            }
        }
    }
}'

