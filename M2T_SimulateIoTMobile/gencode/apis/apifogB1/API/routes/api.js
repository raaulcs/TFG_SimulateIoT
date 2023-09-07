const express = require('express');
const router = express.Router();

const TopicB = require('../models/TopicB');


router.get('/TopicB', function(req, res){
  TopicB.find({}).then(function(TopicB){
	res.send(TopicB);
  });
});

router.get('/TopicB/:id', function(req, res){
  TopicB.find({_id:req.params.id}).then(function(TopicB){
	res.send(TopicB);
  });
});

router.post('/TopicB', function(req, res){
  TopicB.create(req.body).then(function(TopicB){
	res.send(TopicB);
  });
});

router.put('/TopicB/:id', function(req, res){
  TopicB.findByIdAndUpdate({_id:req.params.id}, req.body).then(function(TopicB){
	res.send(TopicB);
  });
});

router.delete('/TopicB/:id', function(req, res){
  TopicB.findByIdAndRemove({_id:req.params.id}).then(function(TopicB){
	res.send(TopicB);
  });
});
 

const TopicC = require('../models/TopicC');


router.get('/TopicC', function(req, res){
  TopicC.find({}).then(function(TopicC){
	res.send(TopicC);
  });
});

router.get('/TopicC/:id', function(req, res){
  TopicC.find({_id:req.params.id}).then(function(TopicC){
	res.send(TopicC);
  });
});

router.post('/TopicC', function(req, res){
  TopicC.create(req.body).then(function(TopicC){
	res.send(TopicC);
  });
});

router.put('/TopicC/:id', function(req, res){
  TopicC.findByIdAndUpdate({_id:req.params.id}, req.body).then(function(TopicC){
	res.send(TopicC);
  });
});

router.delete('/TopicC/:id', function(req, res){
  TopicC.findByIdAndRemove({_id:req.params.id}).then(function(TopicC){
	res.send(TopicC);
  });
});
 
module.exports = router;
