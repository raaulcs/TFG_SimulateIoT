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
		<li><input type="checkbox" name="list" id="FogList0"/><label for="FogList0">FogfogA0</label>
			<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogTopics0"><label for="FogTopics0">Topics</label>
	    			<ul class="interior">
	    				<li><input type="checkbox" name="list" id="TopicsA10"><label for="TopicsA10"><a href="#r">TopicA1</a></label>
	    					<ul class="interior">
	    						<li><input type="checkbox" name="list" id="RulesA10"><label for="RulesA10"><a href="#r">Rules</a></label>
	    							<ul class="interior">
	    							</ul>
	    						</li>
	    					</ul>
	    				</li>
	    				<li><input type="checkbox" name="list" id="TopicsA20"><label for="TopicsA20"><a href="#r">TopicA2</a></label>
	    					<ul class="interior">
	    						<li><input type="checkbox" name="list" id="RulesA20"><label for="RulesA20"><a href="#r">Rules</a></label>
	    							<ul class="interior">
	    							</ul>
	    						</li>
	    					</ul>
	    				</li>
	    				<li><input type="checkbox" name="list" id="TopicsX0"><label for="TopicsX0"><a href="#r">TopicX</a></label>
	    					<ul class="interior">
	    						<li><input type="checkbox" name="list" id="RulesX0"><label for="RulesX0"><a href="#r">Rules</a></label>
	    							<ul class="interior">
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
	    				<li><input type="checkbox" name="list" id="Sensor0"><label for="Sensor0">SensorSensA0</label>
	    					<ul class="interior">
	    						<li><a href="#r">TopicA1</a></li>
	    						<li><a href="#r">TopicA2</a></li>
	    						<li><a href="#r">TopicB</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
	    	<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogActuators0"><label for="FogActuators0">Actuators</label>
	    			<ul class="interior">
						<li><input type="checkbox" name="list" id="Actuator0"><label for="Actuator0">ActuatorActA0</label>
	    					<ul class="interior">
	    						<li><a href="#r">TopicA1</a></li>
	    						<li><a href="#r">TopicA2</a></li>
	    						<li><a href="#r">TopicB</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
		</li>
		<li><input type="checkbox" name="list" id="FogList0"/><label for="FogList0">FogfogB0</label>
			<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogTopics0"><label for="FogTopics0">Topics</label>
	    			<ul class="interior">
	    				<li><input type="checkbox" name="list" id="TopicsB0"><label for="TopicsB0"><a href="#r">TopicB</a></label>
	    					<ul class="interior">
	    						<li><input type="checkbox" name="list" id="RulesB0"><label for="RulesB0"><a href="#r">Rules</a></label>
	    							<ul class="interior">
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
	    				<li><input type="checkbox" name="list" id="Sensor0"><label for="Sensor0">SensorSensB0</label>
	    					<ul class="interior">
	    						<li><a href="#r">TopicB</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
	    	<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogActuators0"><label for="FogActuators0">Actuators</label>
	    			<ul class="interior">
						<li><input type="checkbox" name="list" id="Actuator0"><label for="Actuator0">ActuatorActB0</label>
	    					<ul class="interior">
	    						<li><a href="#r">TopicB</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
		</li>
	</ul>
</body>
</html>
