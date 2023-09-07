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
		<li><input type="checkbox" name="list" id="FogList0"/><label for="FogList0">FogPresence0</label>
			<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogTopics0"><label for="FogTopics0">Topics</label>
	    			<ul class="interior">
	    				<li><input type="checkbox" name="list" id="TopicsPresence0"><label for="TopicsPresence0"><a href="#r">TopicPresence</a></label>
	    					<ul class="interior">
	    						<li><input type="checkbox" name="list" id="RulesPresence0"><label for="RulesPresence0"><a href="#r">Rules</a></label>
	    							<ul class="interior">
	    								<li><p>select value from EsperClient.EventPresence where value = 1</p></li>
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
	    				<li><input type="checkbox" name="list" id="Sensor0"><label for="Sensor0">SensorsensPresence0</label>
	    					<ul class="interior">
	    						<li><a href="#r">TopicPresence</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
	    	<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogActuators0"><label for="FogActuators0">Actuators</label>
	    			<ul class="interior">
						<li><input type="checkbox" name="list" id="Actuator0"><label for="Actuator0">ActuatoractPresence0</label>
	    					<ul class="interior">
	    						<li><a href="#r">TopicPresence</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
		</li>
		<li><input type="checkbox" name="list" id="FogList1"/><label for="FogList1">FogBrightness1</label>
			<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogTopics1"><label for="FogTopics1">Topics</label>
	    			<ul class="interior">
	    				<li><input type="checkbox" name="list" id="TopicsBrightness1"><label for="TopicsBrightness1"><a href="#r">TopicBrightness</a></label>
	    					<ul class="interior">
	    						<li><input type="checkbox" name="list" id="RulesBrightness1"><label for="RulesBrightness1"><a href="#r">Rules</a></label>
	    							<ul class="interior">
	    								<li><p>select value from EsperClient.EventBrightness where value < 60</p></li>
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
	    				<li><input type="checkbox" name="list" id="Sensor1"><label for="Sensor1">SensorsensBrightness1</label>
	    					<ul class="interior">
	    						<li><a href="#r">TopicBrightness</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
	    	<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogActuators1"><label for="FogActuators1">Actuators</label>
	    			<ul class="interior">
						<li><input type="checkbox" name="list" id="Actuator1"><label for="Actuator1">ActuatoractBrightness1</label>
	    					<ul class="interior">
	    						<li><a href="#r">TopicBrightness</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
		</li>
		<li><input type="checkbox" name="list" id="FogList2"/><label for="FogList2">FogWater2</label>
			<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogTopics2"><label for="FogTopics2">Topics</label>
	    			<ul class="interior">
	    				<li><input type="checkbox" name="list" id="TopicsWater2"><label for="TopicsWater2"><a href="#r">TopicWater</a></label>
	    					<ul class="interior">
	    						<li><input type="checkbox" name="list" id="RulesWater2"><label for="RulesWater2"><a href="#r">Rules</a></label>
	    							<ul class="interior">
	    								<li><p>select value from EsperClient.EventWater where value < 30.5</p></li>
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
	    				<li><input type="checkbox" name="list" id="Sensor2"><label for="Sensor2">SensorsensWater2</label>
	    					<ul class="interior">
	    						<li><a href="#r">TopicWater</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
	    	<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogActuators2"><label for="FogActuators2">Actuators</label>
	    			<ul class="interior">
						<li><input type="checkbox" name="list" id="Actuator2"><label for="Actuator2">ActuatoractWater2</label>
	    					<ul class="interior">
	    						<li><a href="#r">TopicWater</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
		</li>
		<li><input type="checkbox" name="list" id="FogList3"/><label for="FogList3">FogGas3</label>
			<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogTopics3"><label for="FogTopics3">Topics</label>
	    			<ul class="interior">
	    				<li><input type="checkbox" name="list" id="TopicsGas3"><label for="TopicsGas3"><a href="#r">TopicGas</a></label>
	    					<ul class="interior">
	    						<li><input type="checkbox" name="list" id="RulesGas3"><label for="RulesGas3"><a href="#r">Rules</a></label>
	    							<ul class="interior">
	    								<li><p>select value from EsperClient.EventGas where value < 35.6</p></li>
	    							</ul>
	    						</li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>



	    	<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogSensors3"><label for="FogSensors3">Sensors</label>
	    			<ul class="interior">
	    				<li><input type="checkbox" name="list" id="Sensor3"><label for="Sensor3">SensorsensGas3</label>
	    					<ul class="interior">
	    						<li><a href="#r">TopicGas</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
	    	<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogActuators3"><label for="FogActuators3">Actuators</label>
	    			<ul class="interior">
						<li><input type="checkbox" name="list" id="Actuator3"><label for="Actuator3">ActuatoractGas3</label>
	    					<ul class="interior">
	    						<li><a href="#r">TopicGas</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
		</li>
	</ul>
</body>
</html>
