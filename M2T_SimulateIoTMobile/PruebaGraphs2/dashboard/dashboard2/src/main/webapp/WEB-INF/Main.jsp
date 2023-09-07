<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link type="text/css" href="css/Main.css" rel="stylesheet">
</head>
<body>
	<ul id="menu">
		<li><input type="checkbox" name="list" id="FogList0"/><label for="FogList0">FogHumidity0</label>
			<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogTopics0"><label for="FogTopics0">Topics</label>
	    			<ul class="interior">
	    				<li><input type="checkbox" name="list" id="TopicsHumidity0"><label for="TopicsHumidity0"><a href="#r">TopicHumidity</a></label>
	    					<ul class="interior">
	    						<li><input type="checkbox" name="list" id="RulesHumidity0"><label for="RulesHumidity0"><a href="#r">Rules</a></label>
	    							<ul class="interior">
	    								<li><p>select value from EsperClient.EventHumidity where value < 50</p></li>
	    							</ul>
	    						</li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>



	    	<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogSensors0"><label for="FogSensors0">Sensors</label>
	    			<ul class="interior">
	    				<li><input type="checkbox" name="list" id="Sensor0"><label for="Sensor0">SensorsensHumidity0</label>
	    					<ul class="interior">
	    						<li><a href="#r">TopicHumidity</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
	    	<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogActuators0"><label for="FogActuators0">Actuators</label>
	    			<ul class="interior">
						<li><input type="checkbox" name="list" id="Actuator0"><label for="Actuator0">ActuatoractHumidity0</label>
	    					<ul class="interior">
	    						<li><a href="#r">TopicHumidity</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
		</li>
		<li><input type="checkbox" name="list" id="FogList1"/><label for="FogList1">FogTemperature1</label>
			<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogTopics1"><label for="FogTopics1">Topics</label>
	    			<ul class="interior">
	    				<li><input type="checkbox" name="list" id="TopicsTemperature1"><label for="TopicsTemperature1"><a href="TopicLecture?top=Temperature">TopicTemperature</a></label>
	    					<ul class="interior">
	    						<li><input type="checkbox" name="list" id="RulesTemperature1"><label for="RulesTemperature1"><a href="#r">Rules</a></label>
	    							<ul class="interior">
	    								<li><p>select value from EsperClient.EventTemperatureLow where value < 16</p></li>
	    								<li><p>select value from EsperClient.EventTemperatureHigh where value > 25</p></li>
	    							</ul>
	    						</li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>



	    	<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogSensors1"><label for="FogSensors1">Sensors</label>
	    			<ul class="interior">
	    				<li><input type="checkbox" name="list" id="Sensor1"><label for="Sensor1">SensorsensTemperature1</label>
	    					<ul class="interior">
	    						<li><a href="TopicLecture?top=Temperature">TopicTemperature</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
	    	<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogActuators1"><label for="FogActuators1">Actuators</label>
	    			<ul class="interior">
						<li><input type="checkbox" name="list" id="Actuator1"><label for="Actuator1">ActuatoractTemperature1</label>
	    					<ul class="interior">
	    						<li><a href="TopicLecture?top=Temperature">TopicTemperature</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
		</li>
		<li><input type="checkbox" name="list" id="FogList2"/><label for="FogList2">FogWaterLevel2</label>
			<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogTopics2"><label for="FogTopics2">Topics</label>
	    			<ul class="interior">
	    				<li><input type="checkbox" name="list" id="TopicsWaterLevel2"><label for="TopicsWaterLevel2"><a href="#r">TopicWaterLevel</a></label>
	    					<ul class="interior">
	    						<li><input type="checkbox" name="list" id="RulesWaterLevel2"><label for="RulesWaterLevel2"><a href="#r">Rules</a></label>
	    							<ul class="interior">
	    								<li><p>select value from EsperClient.EventWaterLevel where value < 15</p></li>
	    							</ul>
	    						</li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>



	    	<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogSensors2"><label for="FogSensors2">Sensors</label>
	    			<ul class="interior">
	    				<li><input type="checkbox" name="list" id="Sensor2"><label for="Sensor2">SensorsensWaterLevel2</label>
	    					<ul class="interior">
	    						<li><a href="#r">TopicWaterLevel</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
	    	<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogActuators2"><label for="FogActuators2">Actuators</label>
	    			<ul class="interior">
						<li><input type="checkbox" name="list" id="Actuator2"><label for="Actuator2">ActuatoractWaterLevel2</label>
	    					<ul class="interior">
	    						<li><a href="#r">TopicWaterLevel</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
		</li>
	</ul>
</body>
</html>
