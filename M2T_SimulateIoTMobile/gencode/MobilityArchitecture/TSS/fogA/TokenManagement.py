import time


class TokenManagement:

    def __init__(self, tokenList):
        self.tokenList = tokenList
        self.currentToken = tokenList[1]
        self.previousToken = tokenList[0]

    def checkToken (self, token):
        if token == self.currentToken:
            response = 'OK'
        elif token != self.currentToken:
            if token == self.previousToken:
                response = self.currentToken
            else:
                response = 'disconnect'
                print(token, '---', self.previousToken, '---', self.currentToken)
        return response

    def prepareResponseMQTT(self, message):
        mqttresponse = "{ 'token' : '" + message + "'}"
        return mqttresponse


    def tokenLifeManagement(self):
        i=1
        while i < len(self.tokenList):
            self.currentToken = self.tokenList[i]
            self.previousToken = self.tokenList[i-1]
            i=i+1
            time.sleep(200000000)
