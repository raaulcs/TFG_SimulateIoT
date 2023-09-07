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
	    				<li><input type="checkbox" name="list" id="TopicsA0"><label for="TopicsA0"><a href="TopicLecture?top=A">TopicA</a></label>
	    					<ul class="interior">
	    						<li><input type="checkbox" name="list" id="RulesA0"><label for="RulesA0"><a href="#r">Rules</a></label>
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
	    						<li><a href="TopicLecture?top=A">TopicA</a></li>
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
	    						<li><a href="TopicLecture?top=A">TopicA</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
		</li>
		<li><input type="checkbox" name="list" id="FogList1"/><label for="FogList1">FogfogB1</label>
			<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogTopics1"><label for="FogTopics1">Topics</label>
	    			<ul class="interior">
	    				<li><input type="checkbox" name="list" id="TopicsTopicB1"><label for="TopicsTopicB1"><a href="TopicLecture?top=TopicB">TopicTopicB</a></label>
	    					<ul class="interior">
	    						<li><input type="checkbox" name="list" id="RulesTopicB1"><label for="RulesTopicB1"><a href="#r">Rules</a></label>
	    							<ul class="interior">
	    								<li><p>select value from EsperClient.EventTopicBFogB where value < 90</p></li>
	    							</ul>
	    						</li>
	    					</ul>
	    				</li>
	    				<li><input type="checkbox" name="list" id="TopicsTopicC1"><label for="TopicsTopicC1"><a href="TopicLecture?top=TopicC">TopicTopicC</a></label>
	    					<ul class="interior">
	    						<li><input type="checkbox" name="list" id="RulesTopicC1"><label for="RulesTopicC1"><a href="#r">Rules</a></label>
	    							<ul class="interior">
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
	    				<li><input type="checkbox" name="list" id="Sensor1"><label for="Sensor1">SensorSensB1</label>
	    					<ul class="interior">
	    						<li><a href="TopicLecture?top=TopicB">TopicTopicB</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
	    	<ul class="interior">
	    		<li><input type="checkbox" name="list" id="FogActuators1"><label for="FogActuators1">Actuators</label>
	    			<ul class="interior">
						<li><input type="checkbox" name="list" id="Actuator1"><label for="Actuator1">ActuatorActB1</label>
	    					<ul class="interior">
	    						<li><a href="TopicLecture?top=TopicC">TopicTopicC</a></li>
	    					</ul>
	    				</li>
	    			</ul>
	    		</li>
	    	</ul>
		</li>
	</ul>
</body>
</html>
