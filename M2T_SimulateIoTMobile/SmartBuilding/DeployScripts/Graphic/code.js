
  var cy = cytoscape({

  container: document.getElementById('cy'), // container to render in


  
  elements: {
      nodes: [
			{ data: { id: 'Fog_0_1', label:'Presence' }, classes: 'fog' },
			{ data: { id: 'Topics_0', label:'Topics', parent: 'Fog_0_1' }, classes: 'Topics'},
			{ data: { id: 'Rule_Topics_0', label:'Rule_Topics', parent: 'Fog_0_1' }, classes: 'Rule_Topics' },
			{ data: { id: 'Presence', parent: 'Topics_0' }, position: { x: 300, y: 0 }, classes: 'Topic' },
			{ data: { id: 'Presence', parent: 'Rule_Topics_0' }, position: { x: 300, y: 500 }, classes: 'Topic' },
			{ data: { id: '0', label: 'sensPresence\nIP'}, position: { x: 300, y: -350 }, classes: 'device' },						
			{ data: { id: 'analyzerOf_Presence', label:'Esper_CEP', type: 'rectangle', parent: 'Fog_0_1' }, position: { x: 300, y: 175 }, classes: 'Esper' },					
			{ data: { id: 'Mosquitto_0', label:'Mosquitto', type: 'rectangle', parent: 'Fog_0_1' }, position: { x: 300, y: 175 }, classes: 'Mosquitto' },	
			{ data: { id: '0_Rule_0_1', label: 'Rule_0\nselect value from EsperClient.EventPresence where value = 1', parent: 'Presence'}, position: { x: 300, y: 500 }, classes: 'RuleTopic' },
			{ data: { id: 'actuator_0', label: 'actPresence\nIP' }, position: { x: 300, y: 800 }, classes: 'actuator' },
			{ data: { id: 'Fog_1_2', label:'Brightness' }, classes: 'fog' },
			{ data: { id: 'Topics_1', label:'Topics', parent: 'Fog_1_2' }, classes: 'Topics'},
			{ data: { id: 'Rule_Topics_1', label:'Rule_Topics', parent: 'Fog_1_2' }, classes: 'Rule_Topics' },
			{ data: { id: 'Brightness', parent: 'Topics_1' }, position: { x: 2300, y: 0 }, classes: 'Topic' },
			{ data: { id: 'Brightness', parent: 'Rule_Topics_1' }, position: { x: 2300, y: 500 }, classes: 'Topic' },
			{ data: { id: '1', label: 'sensBrightness\nIP'}, position: { x: 2300, y: -350 }, classes: 'device' },									
			{ data: { id: 'analyzerOf_Brightness', label:'Esper_CEP', type: 'rectangle', parent: 'Fog_1_2' }, position: { x: 2300, y: 175 }, classes: 'Esper' },					
			{ data: { id: 'Mosquitto_1', label:'Mosquitto', type: 'rectangle', parent: 'Fog_1_2' }, position: { x: 2300, y: 175 }, classes: 'Mosquitto' },	
			{ data: { id: '1_Rule_1_1', label: 'Rule_1\nselect value from EsperClient.EventBrightness where value < 60', parent: 'Brightness'}, position: { x: 2300, y: 500 }, classes: 'RuleTopic' },
			{ data: { id: 'actuator_1', label: 'actBrightness\nIP' }, position: { x: 2300, y: 800 }, classes: 'actuator' },
			{ data: { id: 'Fog_2_3', label:'Water' }, classes: 'fog' },
			{ data: { id: 'Topics_2', label:'Topics', parent: 'Fog_2_3' }, classes: 'Topics'},
			{ data: { id: 'Rule_Topics_2', label:'Rule_Topics', parent: 'Fog_2_3' }, classes: 'Rule_Topics' },
			{ data: { id: 'Water', parent: 'Topics_2' }, position: { x: 4300, y: 0 }, classes: 'Topic' },
			{ data: { id: 'Water', parent: 'Rule_Topics_2' }, position: { x: 4300, y: 500 }, classes: 'Topic' },
			{ data: { id: '2', label: 'sensWater\nIP'}, position: { x: 4300, y: -350 }, classes: 'device' },						
			{ data: { id: 'analyzerOf_Water', label:'Esper_CEP', type: 'rectangle', parent: 'Fog_2_3' }, position: { x: 4300, y: 175 }, classes: 'Esper' },					
			{ data: { id: 'Mosquitto_2', label:'Mosquitto', type: 'rectangle', parent: 'Fog_2_3' }, position: { x: 4300, y: 175 }, classes: 'Mosquitto' },	
			{ data: { id: '2_Rule_2_1', label: 'Rule_2\nselect value from EsperClient.EventWater where value < 30.5', parent: 'Water'}, position: { x: 4300, y: 500 }, classes: 'RuleTopic' },
			{ data: { id: 'actuator_2', label: 'actWater\nIP' }, position: { x: 4300, y: 800 }, classes: 'actuator' },
			{ data: { id: 'Fog_3_4', label:'Gas' }, classes: 'fog' },
			{ data: { id: 'Topics_3', label:'Topics', parent: 'Fog_3_4' }, classes: 'Topics'},
			{ data: { id: 'Rule_Topics_3', label:'Rule_Topics', parent: 'Fog_3_4' }, classes: 'Rule_Topics' },
			{ data: { id: 'Gas', parent: 'Topics_3' }, position: { x: 300, y: 1000 }, classes: 'Topic' },
			{ data: { id: 'Gas', parent: 'Rule_Topics_3' }, position: { x: 300, y: 1500 }, classes: 'Topic' },
			{ data: { id: '3', label: 'sensGas\nIP'}, position: { x: 300, y: 650 }, classes: 'device' },						
			{ data: { id: 'analyzerOf_Gas', label:'Esper_CEP', type: 'rectangle', parent: 'Fog_3_4' }, position: { x: 300, y: 1175 }, classes: 'Esper' },					
			{ data: { id: 'Mosquitto_3', label:'Mosquitto', type: 'rectangle', parent: 'Fog_3_4' }, position: { x: 300, y: 1175 }, classes: 'Mosquitto' },	
			{ data: { id: '3_Rule_3_1', label: 'Rule_3\nselect value from EsperClient.EventGas where value < 35.6', parent: 'Gas'}, position: { x: 300, y: 1500 }, classes: 'RuleTopic' },
			{ data: { id: 'actuator_3', label: 'actGas\nIP' }, position: { x: 300, y: 1800 }, classes: 'actuator' },
      ],
 
	  edges: [
	        { data: { id: 'pub_Presence_0', weight: 3, source: '0', target: 'Presence' }, classes: 'Publish' },
	        { data: { id: 'pub_Brightness_1', weight: 3, source: '1', target: 'Brightness' }, classes: 'Publish' },
	        { data: { id: 'pub_Water_2', weight: 3, source: '2', target: 'Water' }, classes: 'Publish' },
	        { data: { id: 'pub_Gas_3', weight: 3, source: '3', target: 'Gas' }, classes: 'Publish' },
	        { data: { id: 'sub_Presence_0', weight: 3, source: 'Presence', target: 'actuator_0' }, classes: 'Suscribed' },
	        { data: { id: 'sub_Brightness_1', weight: 3, source: 'Brightness', target: 'actuator_1' }, classes: 'Suscribed' },
	        { data: { id: 'sub_Water_2', weight: 3, source: 'Water', target: 'actuator_2' }, classes: 'Suscribed' },
	        { data: { id: 'sub_Gas_3', weight: 3, source: 'Gas', target: 'actuator_3' }, classes: 'Suscribed' },
	        { data: { id: 'line_0', weight: 3, source: 'Topics_0', target: 'analyzerOf_Presence' }},
			{ data: { id: 'linee_0', weight: 3, source: 'analyzerOf_Presence', target: 'Rule_Topics_0' }},			
	        { data: { id: 'line_1', weight: 3, source: 'Topics_1', target: 'analyzerOf_Brightness' }},
			{ data: { id: 'linee_1', weight: 3, source: 'analyzerOf_Brightness', target: 'Rule_Topics_1' }},			
	        { data: { id: 'line_2', weight: 3, source: 'Topics_2', target: 'analyzerOf_Water' }},
			{ data: { id: 'linee_2', weight: 3, source: 'analyzerOf_Water', target: 'Rule_Topics_2' }},			
	        { data: { id: 'line_3', weight: 3, source: 'Topics_3', target: 'analyzerOf_Gas' }},
			{ data: { id: 'linee_3', weight: 3, source: 'analyzerOf_Gas', target: 'Rule_Topics_3' }},			
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

