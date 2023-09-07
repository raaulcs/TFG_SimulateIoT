from pymongo import MongoClient
import datetime

class mongoclient():
    #Create the mongoDB client and inserts the topics wich can be discover by nodes
    def __init__(self, ipMongo, topicscoll):
        self.client = MongoClient(ipMongo, 27017)
        self.db = self.client.tdn
        self.collection = self.db.topics
        self.topicscoll = topicscoll
        result = self.collection.insert_many(topicscoll)
        result.inserted_ids

    def getTopics(self):
        cursor = self.collection.find({})
        result='['
        for document in cursor:
            del document['date']
            result = result+str(document)+','
        result = result[:len(result)-1]+']'
        return result
