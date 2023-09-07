
  var cy = cytoscape({

  container: document.getElementById('cy'), // container to render in


  
  elements: {
      nodes: [
			{ data: { id: 'Fog_0_1', label:'fogA' }, classes: 'fog' },
			{ data: { id: 'Topics_0', label:'Topics', parent: 'Fog_0_1' }, classes: 'Topics'},
			{ data: { id: 'Rule_Topics_0', label:'Rule_Topics', parent: 'Fog_0_1' }, classes: 'Rule_Topics' },
			{ data: { id: 'A1', parent: 'Topics_0' }, position: { x: 300, y: 0 }, classes: 'Topic' },
			{ data: { id: 'A1', parent: 'Rule_Topics_0' }, position: { x: 300, y: 500 }, classes: 'Topic' },
			{ data: { id: '0', label: 'SensA\nIP'}, position: { x: 300, y: -350 }, classes: 'device' },						
			{ data: { id: 'A2', parent: 'Topics_0' }, position: { x: 600, y: 0 }, classes: 'Topic' },
			{ data: { id: 'A2', parent: 'Rule_Topics_0' }, position: { x: 600, y: 450 }, classes: 'Topic' },
			{ data: { id: '0', label: 'SensA\nIP'}, position: { x: 300, y: -350 }, classes: 'device' },						
			{ data: { id: 'X', parent: 'Topics_0' }, position: { x: 900, y: 0 }, classes: 'Topic' },
			{ data: { id: 'X', parent: 'Rule_Topics_0' }, position: { x: 900, y: 500 }, classes: 'Topic' },
			{ data: { id: '0', label: 'SensA\nIP'}, position: { x: 300, y: -350 }, classes: 'device' },						
			{ data: { id: 'Fog_0_2', label:'fogB' }, classes: 'fog' },
			{ data: { id: 'Topics_0', label:'Topics', parent: 'Fog_0_2' }, classes: 'Topics'},
			{ data: { id: 'Rule_Topics_0', label:'Rule_Topics', parent: 'Fog_0_2' }, classes: 'Rule_Topics' },
			{ data: { id: 'B', parent: 'Topics_0' }, position: { x: 2300, y: 0 }, classes: 'Topic' },
			{ data: { id: 'B', parent: 'Rule_Topics_0' }, position: { x: 2300, y: 500 }, classes: 'Topic' },
			{ data: { id: '0', label: 'SensB\nIP'}, position: { x: 2300, y: -350 }, classes: 'device' },									
      ],
 
	  edges: [
	        { data: { id: 'pub_A1_0', weight: 3, source: '0', target: 'A1' }, classes: 'Publish' },
	        { data: { id: 'pub_A2_0', weight: 3, source: '0', target: 'A2' }, classes: 'Publish' },
	        { data: { id: 'pub_B_0', weight: 3, source: '0', target: 'B' }, classes: 'Publish' },
	        { data: { id: 'sub_A1_0', weight: 3, source: 'A1', target: 'actuator_0' }, classes: 'Suscribed' },
	        { data: { id: 'sub_A2_0', weight: 3, source: 'A2', target: 'actuator_0' }, classes: 'Suscribed' },
	        { data: { id: 'sub_B_0', weight: 3, source: 'B', target: 'actuator_0' }, classes: 'Suscribed' },
      ]
  },

  style: [ // the stylesheet for the graph
    {
      selector: 'node',
      style: {
        'content': 'data(id)',
	    'label': 'data(label)',
	    'text-wrap': 'wrap',
        'text-valign': 'top',
        'color': 'black',
	    'font-size': 30,
        'width': 80,
        'height': 80
      }
    },
	{
      selector: '.WSO2',
      style: {
		'text-valign': 'top',
        'background-fit': 'contain',
		'background-image': 'http://c1.staticflickr.com/7899/46817715724_11a6fe823e_b.jpg',
		'shape': 'data(type)',
		'width': 250,
        'height': 100,
        'label': 'data(label)'
      }
    },
	{
      selector: '.Esper',
      style: {
		'text-valign': 'top',
        'background-fit': 'contain',
		'background-image': 'http://c1.staticflickr.com/7891/47488599302_eae0d7b88c_b.jpg',
		'shape': 'data(type)',
		'width': 250,
        'height': 100,
        'label': 'data(label)'
      }
    },
	{
      selector: '.Mongo',
      style: {
		'text-valign': 'top',
        'background-fit': 'contain',
		'background-image': 'http://c1.staticflickr.com/7801/46625933555_fb333b3b6b_b.jpg',
		'shape': 'data(type)',
		'width': 250,
        'height': 100,
        'label': 'data(label)'
      }
    },
	{
      selector: '.Mosquitto',
      style: {
		'text-valign': 'top',
        'background-fit': 'contain',
		'background-image': 'http://c1.staticflickr.com/7902/47488581822_9285984e31_b.jpg',
		'shape': 'data(type)',
        'label': 'data(label)',
		'width': 250,
        'height': 100
      }
    },
	{
      selector: '.fog',
      style: {
        'background-color': '#1B4F72',
		'text-outline-color': '#1B4F72',
        'label': 'data(label)'
      }
    },
    {
      selector: '.device',
      style: {
		'text-valign': 'top',
        'background-fit': 'cover',
		'background-image': 'https://c1.staticflickr.com/5/4892/45644138234_6725870549_b.jpg',
        'label': 'data(label)'
      }
    },
    {
      selector: '.actuator',
      style: {
        'background-color': '#943126',
		'text-outline-color': '#943126',
        'label': 'data(label)'
      }
    },
    {
      selector: '.Topic',
      style: {
        'background-color': '#b9770e',
		'text-outline-color': '#b9770e',
        'label': 'data(id)'
      }
    },
    {
      selector: '.RuleTopic',
      style: {
        'background-color': '#186a3b',
		'text-outline-color': '#186a3b',
        'label': 'data(label)'
      }
    },
    {
      selector: '$node > node',
      css: {
        'padding-top': '10px',
        'padding-left': '10px',
        'padding-bottom': '10px',
        'padding-right': '10px',
        'text-valign': 'top',
        'text-halign': 'center',
        'background-color': '#a9cce3',
		'text-outline-color': '#a9cce3'
      }
    },
    {
      selector: '.Topics',
      style: {
        'background-color': '#2980b9',
		'text-outline-color': '#2980b9',
        'label': 'data(id)'
      }
    },
    {
      selector: '.Rule_Topics',
      style: {
        'background-color': '#9b59b6',
		'text-outline-color': '#9b59b6',
        'label': 'data(id)'
      }
    },
    {
      selector: 'edge',
      style: {
        'curve-style': 'bezier',
        'target-arrow-shape': 'triangle', 
        'width': 4,
        'line-color': '#ddd',
        'target-arrow-color': '#ddd'
      }
    },
    {
      selector: '.Suscribed',
      style: {
        'curve-style': 'bezier',
        'target-arrow-shape': 'triangle',
        'width': 4,
        'line-color': '#f1948a',
        'target-arrow-color': '#f1948a'
      }
    },
    {
      selector: '.Publish',
      style: {
        'curve-style': 'bezier',
        'target-arrow-shape': 'triangle',
        'width': 4,
        'line-color': '#f7dc6f',
        'target-arrow-color': '#f7dc6f'
      }
    }
  ],

  layout: {
    name: 'preset',
    padding: 5
  }

});

