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
     "device_id":   "sensTemperature_1",
     "entity_name": "urn:ngsi-ld:sensTemperature:1",
     "entity_type": "Temperature",
     "protocol":    "JSON",
     "transport":   "MQTT",
     "timezone":    "Europe/Berlin",
     "attributes": [
       { "object_id": "v", "name": "value", "type": "Integer" }
     ],
     "static_attributes": [
       { "name":"name", "type": "String", "value": "sensTemperature"}
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
     "device_id":   "actTemperature_1",
     "entity_name": "urn:ngsi-ld:actTemperature:1",
     "entity_type": "Actuator",
     "protocol":    "JSON",
     "transport":   "MQTT",
     "timezone":    "Europe/Berlin",
     "static_attributes": [
       { "name":"name", "type": "String", "value": "actTemperature"}
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
     "device_id":   "Topic_Temperature",
     "entity_name": "urn:ngsi-ld:Topic_Temperature:0",
     "entity_type": "Topic",
     "protocol":    "JSON",
     "transport":   "MQTT",
     "timezone":    "Europe/Berlin",
     "attributes": [
       { "object_id": "v", "name": "value", "type": "Integer" }
     ],
     "static_attributes": [
       { "name":"name", "type": "String", "value": "Topic_Temperature"}
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
    "entities": [{"idPattern": "urn:ngsi-ld:Topic_Temperature:0"}],
    "condition": {
      "attrs": [ "value" ]
    }
  },
  "notification": {
    "http": {
      "url": "http://perseo-fe-temperature1:9090/notices"
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
  "name": "rule1_temperature",
  "text":"select *,\"rule1_temperature\" as ruleName from pattern [every select value from EsperClient.EventTemperatureLow where value < 16 and id=\"urn:ngsi-ld:Topic_Temperature:0\")]",
  "action": {
        "type": "post",
        "template": "{\"value\":${value}}",
        "parameters": {
            "url": "http://mnctemperature1:5150/Temperature_1",
            "headers": {
                        "Content-type": "application/json"
            }
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
  "name": "rule2_temperature",
  "text":"select *,\"rule2_temperature\" as ruleName from pattern [every select value from EsperClient.EventTemperatureHigh where value > 25 and id=\"urn:ngsi-ld:Topic_Temperature:0\")]",
  "action": {
        "type": "post",
        "template": "{\"value\":${value}}",
        "parameters": {
            "url": "http://mnctemperature1:5150/Temperature_2",
            "headers": {
                        "Content-type": "application/json"
            }
        }
    }
}'

