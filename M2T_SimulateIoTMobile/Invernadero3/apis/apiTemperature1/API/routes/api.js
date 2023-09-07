const express = require('express');
const router = express.Router();

const Temperature = require('../models/Temperature');


router.get('/Temperature', function(req, res){
  Temperature.find({}).then(function(Temperature){
	res.send(Temperature);
  });
});

router.get('/Temperature/:id', function(req, res){
  Temperature.find({_id:req.params.id}).then(function(Temperature){
	res.send(Temperature);
  });
});

router.post('/Temperature', function(req, res){
  Temperature.create(req.body).then(function(Temperature){
	res.send(Temperature);
  });
});

router.put('/Temperature/:id', function(req, res){
  Temperature.findByIdAndUpdate({_id:req.params.id}, req.body).then(function(Temperature){
	res.send(Temperature);
  });
});

router.delete('/Temperature/:id', function(req, res){
  Temperature.findByIdAndRemove({_id:req.params.id}).then(function(Temperature){
	res.send(Temperature);
  });
});
 
module.exports = router;
