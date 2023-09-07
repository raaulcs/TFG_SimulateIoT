from builtins import print
import paho.mqtt.client as mqtt
import json


class MyMQTTClass(mqtt.Client):

    def setTokenManagerNode(self, _tmn):
        self.tmn = _tmn

    def on_connect(self, mqttc, obj, flags, rc):
        print("rc: " + str(rc))

    def on_message(self, mqttc, obj, msg):
        jsonmsg = json.loads(msg.payload.decode("utf-8"))
        print("---------------- DATA RECEPTION, Executing Token Management Response ----------------")
        print("Received Token request from topic {}".format(jsonmsg["sensorname"]))
        publishOn = jsonmsg["sensorname"] + 'TMN'
        deviceToken = jsonmsg["token"]
        response = self.tmn.checkToken(deviceToken)
        mqttresponse = self.tmn.prepareResponseMQTT(response)
        self.publish(publishOn, mqttresponse)
        # response = requests.post(self.url, data=msg.payload)
        # print(response.text)
        # for top in self.publishTopics:
        # self.publish(top, response.text)

    def on_publish(self, mqttc, obj, mid):
        print("mid: " + str(mid))

    def on_subscribe(self, mqttc, obj, mid, granted_qos):
        print("Subscribed: " + str(mid) + " " + str(granted_qos))

    def on_log(self, mqttc, obj, level, string):
        print(string)

    def run(self):
        rc = 0
        while rc == 0:
            rc = self.loop()
        return rc


# If you want to use a specific client id, use
# mqttc = MyMQTTClass("client-id")
# but note that the client id must be unique on the broker. Leaving the client
# id parameter empty will generate a random id for you.

mqttc = MyMQTTClass("TMN")
rc = mqttc.run()

# print("rc: "+str(rc))
