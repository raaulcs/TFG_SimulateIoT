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
     "device_id":   "sensWaterLevel_2",
     "entity_name": "urn:ngsi-ld:sensWaterLevel:2",
     "entity_type": "WaterLevel",
     "protocol":    "JSON",
     "transport":   "MQTT",
     "timezone":    "Europe/Berlin",
     "attributes": [
       { "object_id": "v", "name": "value", "type": "Integer" }
     ],
     "static_attributes": [
       { "name":"name", "type": "String", "value": "sensWaterLevel"}
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
     "device_id":   "actWaterLevel_2",
     "entity_name": "urn:ngsi-ld:actWaterLevel:2",
     "entity_type": "Actuator",
     "protocol":    "JSON",
     "transport":   "MQTT",
     "timezone":    "Europe/Berlin",
     "static_attributes": [
       { "name":"name", "type": "String", "value": "actWaterLevel"}
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
     "device_id":   "Topic_WaterLevel",
     "entity_name": "urn:ngsi-ld:Topic_WaterLevel:0",
     "entity_type": "Topic",
     "protocol":    "JSON",
     "transport":   "MQTT",
     "timezone":    "Europe/Berlin",
     "attributes": [
       { "object_id": "v", "name": "value", "type": "Integer" }
     ],
     "static_attributes": [
       { "name":"name", "type": "String", "value": "Topic_WaterLevel"}
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
    "entities": [{"idPattern": "urn:ngsi-ld:Topic_WaterLevel:0"}],
    "condition": {
      "attrs": [ "value" ]
    }
  },
  "notification": {
    "http": {
      "url": "http://perseo-fe-waterlevel2:9090/notices"
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
  "name": "rule3_waterlevel",
  "text":"select *,\"rule3_waterlevel\" as ruleName from pattern [every select value from EsperClient.EventWaterLevel where value < 15 and id=\"urn:ngsi-ld:Topic_WaterLevel:0\")]",
  "action": {
        "type": "post",
        "template": "{\"value\":${value}}",
        "parameters": {
            "url": "http://mncwaterlevel2:5150/Humidity_3",
            "headers": {
                        "Content-type": "application/json"
            }
        }
    }
}'

