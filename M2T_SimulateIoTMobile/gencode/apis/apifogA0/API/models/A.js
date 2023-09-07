
const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const ASchema = new Schema({
	id: {
		type:String,
		required: [false, 'id field is required']	
	},
	value: {
 		type:String,
		required: [false, 'data field is required']
    },
	topic: {
 		type:String,
		required: [false, 'data field is required']
    },
	route: {
 		type:String,
		required: [false, 'data field is required']
    },
	timeStamp: {
 		type:String,
		required: [false, 'data field is required']
    }

});

const Element = mongoose.model('A', ASchema, 'A');

module.exports = Element;

