const express = require('express');
const router = express.Router();

const A = require('../models/A');


router.get('/A', function(req, res){
  A.find({}).then(function(A){
	res.send(A);
  });
});

router.get('/A/:id', function(req, res){
  A.find({_id:req.params.id}).then(function(A){
	res.send(A);
  });
});

router.post('/A', function(req, res){
  A.create(req.body).then(function(A){
	res.send(A);
  });
});

router.put('/A/:id', function(req, res){
  A.findByIdAndUpdate({_id:req.params.id}, req.body).then(function(A){
	res.send(A);
  });
});

router.delete('/A/:id', function(req, res){
  A.findByIdAndRemove({_id:req.params.id}).then(function(A){
	res.send(A);
  });
});
 
module.exports = router;
