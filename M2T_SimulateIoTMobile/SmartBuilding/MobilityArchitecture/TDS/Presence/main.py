import threading

import mqttclient
import time
import mongoclient
import datetime

def readIP(nodeName):
    lines = []
    with open('/TDS/tabladirecciones') as f:
        lines = f.readlines()

    count = 0
    for line in lines:
        if line.lower().rstrip("\n") == nodeName.lower():
            ip = lines[count + 1].rstrip("\n")
            port = count/2
        count += 1

    return ip, int(port)

def TDN():
    ######################################################### Create the mongoDB client and inserts the topics wich can be discover by nodes
    ipMongo, port = readIP('presence0')

    topicscoll = [{"name": "Presence", "sipnosis": "Future, work", "tags": ["Future", "Work"],"date": datetime.datetime.utcnow()}
]                  

    clientmongo = mongoclient.mongoclient(ipMongo + ':' + str(27017+port), topicscoll)
    #########################################################

    ######################################################### Mosquitto start and configuration
    suscribeTopics = ["TDN"]

    mqttc = mqttclient.MyMQTTClass("TDS")
    mqttc.setMongoClient(clientmongo)

    print("Triying connection with Broker Mosquitto at: ")
    connected = False
    while connected != True:
        try:
            ip, port = readIP('presence0')
            mqttc.connect(ip, 1883+port, 60)
            #mqttc.connect("localhost", 1883, 60)
            print("Connection with Broker Mosquitto stablished!")
            connected = True
        except:  # al menos una
            print("No available Mosquitto, triying new connection in 10 seconds...")
            time.sleep(10)

    print("Subscribing to topics: {}".format(suscribeTopics))
    for x in suscribeTopics:
        mqttc.subscribe(x, 0)
        print("Subscribed to topic: {}".format(x))
    print("Suscribed to Topics!")
    #########################################################

    rc = mqttc.run()

def main():
    x = threading.Thread(target=TDN)
    x.start()

    # p.start()

main()
