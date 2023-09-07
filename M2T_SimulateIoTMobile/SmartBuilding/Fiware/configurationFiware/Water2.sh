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
     "device_id":   "sensWater_2",
     "entity_name": "urn:ngsi-ld:sensWater:2",
     "entity_type": "Water",
     "protocol":    "JSON",
     "transport":   "MQTT",
     "timezone":    "Europe/Berlin",
     "attributes": [
       { "object_id": "v", "name": "value", "type": "Integer" }
     ],
     "static_attributes": [
       { "name":"name", "type": "String", "value": "sensWater"}
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
     "device_id":   "actWater_2",
     "entity_name": "urn:ngsi-ld:actWater:2",
     "entity_type": "Actuator",
     "protocol":    "JSON",
     "transport":   "MQTT",
     "timezone":    "Europe/Berlin",
     "static_attributes": [
       { "name":"name", "type": "String", "value": "actWater"}
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
     "device_id":   "Topic_Water",
     "entity_name": "urn:ngsi-ld:Topic_Water:0",
     "entity_type": "Topic",
     "protocol":    "JSON",
     "transport":   "MQTT",
     "timezone":    "Europe/Berlin",
     "attributes": [
       { "object_id": "v", "name": "value", "type": "Integer" }
     ],
     "static_attributes": [
       { "name":"name", "type": "String", "value": "Topic_Water"}
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
    "entities": [{"idPattern": "urn:ngsi-ld:Topic_Water:0"}],
    "condition": {
      "attrs": [ "value" ]
    }
  },
  "notification": {
    "http": {
      "url": "http://perseo-fe-water2:9090/notices"
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
  "name": "rule2_water",
  "text":"select *,\"rule2_water\" as ruleName from pattern [every select value from EsperClient.EventWater where value < 30.5 and id=\"urn:ngsi-ld:Topic_Water:0\")]",
  "action": {
        "type": "post",
        "template": "{\"value\":${value}}",
        "parameters": {
            "url": "http://mncwater2:5150/Water_2",
            "headers": {
                        "Content-type": "application/json"
            }
        }
    }
}'

