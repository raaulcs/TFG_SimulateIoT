const express = require('express');
const bodyParser = require('body-parser');
const mongoose = require('mongoose');

const app = express();

mongoose.connect('mongodb://mongo-db-foga0:27017/Fog_Node_fogA_0');
mongoose.Promise = global.Promise;

app.use(bodyParser.json());

app.use('/api', require('./routes/api'));

app.listen(process.env.port || 4000, function(){
  console.log('Node server running on http://192.168.99.10x:4001');
});
