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
     "device_id":   "SensA_0",
     "entity_name": "urn:ngsi-ld:SensA:0",
     "entity_type": "A1A2B",
     "protocol":    "JSON",
     "transport":   "MQTT",
     "timezone":    "Europe/Berlin",
     "attributes": [
       { "object_id": "v", "name": "value", "type": "Integer" }
     ],
     "static_attributes": [
       { "name":"name", "type": "String", "value": "SensA"}
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
     "device_id":   "ActA_0",
     "entity_name": "urn:ngsi-ld:ActA:0",
     "entity_type": "Actuator",
     "protocol":    "JSON",
     "transport":   "MQTT",
     "timezone":    "Europe/Berlin",
     "static_attributes": [
       { "name":"name", "type": "String", "value": "ActA"}
     ]
   }
 ]
}'


////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////


