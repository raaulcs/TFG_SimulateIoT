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
     "device_id":   "SensB_1",
     "entity_name": "urn:ngsi-ld:SensB:1",
     "entity_type": "TopicB",
     "protocol":    "JSON",
     "transport":   "MQTT",
     "timezone":    "Europe/Berlin",
     "attributes": [
       { "object_id": "v", "name": "value", "type": "Integer" }
     ],
     "static_attributes": [
       { "name":"name", "type": "String", "value": "SensB"}
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
     "device_id":   "ActB_1",
     "entity_name": "urn:ngsi-ld:ActB:1",
     "entity_type": "Actuator",
     "protocol":    "JSON",
     "transport":   "MQTT",
     "timezone":    "Europe/Berlin",
     "static_attributes": [
       { "name":"name", "type": "String", "value": "ActB"}
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
     "device_id":   "Topic_TopicB",
     "entity_name": "urn:ngsi-ld:Topic_TopicB:0",
     "entity_type": "Topic",
     "protocol":    "JSON",
     "transport":   "MQTT",
     "timezone":    "Europe/Berlin",
     "attributes": [
       { "object_id": "v", "name": "value", "type": "Integer" }
     ],
     "static_attributes": [
       { "name":"name", "type": "String", "value": "Topic_TopicB"}
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
    "entities": [{"idPattern": "urn:ngsi-ld:Topic_TopicB:0"}],
    "condition": {
      "attrs": [ "value" ]
    }
  },
  "notification": {
    "http": {
      "url": "http://perseo-fe-fogb1:9090/notices"
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
  "name": "rule0_topicb",
  "text":"select *,\"rule0_topicb\" as ruleName from pattern [every select value from EsperClient.EventTopicBFogB where value < 90 and id=\"urn:ngsi-ld:Topic_TopicB:0\")]",
  "action": {
        "type": "post",
        "template": "{\"value\":${value}}",
        "parameters": {
            "url": "http://mncfogb1:5150/TopicC_0",
            "headers": {
                        "Content-type": "application/json"
            }
        }
    }
}'

