import threading

import mqttclient
import time
import TokenManagement as tmn
import datetime

def readIP(nodeName):
    lines = []
    with open('/TSS/tabladirecciones') as f:
        lines = f.readlines()

    count = 0
    for line in lines:
        if line.lower().rstrip("\n") == nodeName.lower():
            ip = lines[count + 1].rstrip("\n")
            port = count/2
        count += 1

    return ip, int(port)

def TMN():
    tokenList = ['135315987', '1354315456657', '425654765', '426547899', '45687965734', '4564356456776', '4354354678890']
    tokenMN = tmn.TokenManagement(tokenList)

    ######################################################### Mosquitto start and configuration
    suscribeTopics = ["TMN"]
    mqttc = mqttclient.MyMQTTClass("TMN")
    mqttc.setTokenManagerNode(tokenMN)

    tokenManagementThread = threading.Thread(target=tokenMN.tokenLifeManagement)
    tokenManagementThread.start()

    print("Triying connection with Broker Mosquitto at: ")
    connected = False
    while connected != True:
        try:
            ip, port = readIP('temperature1')
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
    x = threading.Thread(target=TMN)
    x.start()


main()
