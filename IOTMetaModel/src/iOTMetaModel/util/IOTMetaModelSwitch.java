/**
 */
package iOTMetaModel.util;

import iOTMetaModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see iOTMetaModel.IOTMetaModelPackage
 * @generated
 */
public class IOTMetaModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IOTMetaModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOTMetaModelSwitch() {
		if (modelPackage == null) {
			modelPackage = IOTMetaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IOTMetaModelPackage.ENVIRONMENT: {
				Environment environment = (Environment)theEObject;
				T result = caseEnvironment(environment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.EDGE_NODE: {
				EdgeNode edgeNode = (EdgeNode)theEObject;
				T result = caseEdgeNode(edgeNode);
				if (result == null) result = caseNode(edgeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.PROCESS_NODE: {
				ProcessNode processNode = (ProcessNode)theEObject;
				T result = caseProcessNode(processNode);
				if (result == null) result = caseNode(processNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseEdgeNode(sensor);
				if (result == null) result = caseNode(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.ACTUATOR: {
				Actuator actuator = (Actuator)theEObject;
				T result = caseActuator(actuator);
				if (result == null) result = caseEdgeNode(actuator);
				if (result == null) result = caseNode(actuator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.FOG_NODE: {
				FogNode fogNode = (FogNode)theEObject;
				T result = caseFogNode(fogNode);
				if (result == null) result = caseProcessNode(fogNode);
				if (result == null) result = caseNode(fogNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.CLOUD_NODE: {
				CloudNode cloudNode = (CloudNode)theEObject;
				T result = caseCloudNode(cloudNode);
				if (result == null) result = caseProcessNode(cloudNode);
				if (result == null) result = caseNode(cloudNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.ADDITIONAL_CONFIGURATION: {
				AdditionalConfiguration additionalConfiguration = (AdditionalConfiguration)theEObject;
				T result = caseAdditionalConfiguration(additionalConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.COORDINATES: {
				Coordinates coordinates = (Coordinates)theEObject;
				T result = caseCoordinates(coordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.TOPIC: {
				Topic topic = (Topic)theEObject;
				T result = caseTopic(topic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.DATA_BASE: {
				DataBase dataBase = (DataBase)theEObject;
				T result = caseDataBase(dataBase);
				if (result == null) result = caseComponent(dataBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.PROCESS_ENGINE: {
				ProcessEngine processEngine = (ProcessEngine)theEObject;
				T result = caseProcessEngine(processEngine);
				if (result == null) result = caseComponent(processEngine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.SP: {
				SP sp = (SP)theEObject;
				T result = caseSP(sp);
				if (result == null) result = caseProcessEngine(sp);
				if (result == null) result = caseComponent(sp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.CEP: {
				CEP cep = (CEP)theEObject;
				T result = caseCEP(cep);
				if (result == null) result = caseProcessEngine(cep);
				if (result == null) result = caseComponent(cep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.NO_SQL: {
				NoSQL noSQL = (NoSQL)theEObject;
				T result = caseNoSQL(noSQL);
				if (result == null) result = caseDataBase(noSQL);
				if (result == null) result = caseComponent(noSQL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.NOTIFICATION: {
				Notification notification = (Notification)theEObject;
				T result = caseNotification(notification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.EMAIL_NOTIFICATION: {
				EmailNotification emailNotification = (EmailNotification)theEObject;
				T result = caseEmailNotification(emailNotification);
				if (result == null) result = caseNotification(emailNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.TOPIC_NOTIFICATION: {
				TopicNotification topicNotification = (TopicNotification)theEObject;
				T result = caseTopicNotification(topicNotification);
				if (result == null) result = caseNotification(topicNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.REDIRECTION_CONFIGURATION: {
				RedirectionConfiguration redirectionConfiguration = (RedirectionConfiguration)theEObject;
				T result = caseRedirectionConfiguration(redirectionConfiguration);
				if (result == null) result = caseAdditionalConfiguration(redirectionConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.DATA_SOURCE: {
				DataSource dataSource = (DataSource)theEObject;
				T result = caseDataSource(dataSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.LOAD_FROM_FILE: {
				LoadFromFile loadFromFile = (LoadFromFile)theEObject;
				T result = caseLoadFromFile(loadFromFile);
				if (result == null) result = caseDataSource(loadFromFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.DATA_GENERATION: {
				DataGeneration dataGeneration = (DataGeneration)theEObject;
				T result = caseDataGeneration(dataGeneration);
				if (result == null) result = caseDataSource(dataGeneration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.GENERATION_RANGE: {
				GenerationRange generationRange = (GenerationRange)theEObject;
				T result = caseGenerationRange(generationRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.ALEATORY: {
				Aleatory aleatory = (Aleatory)theEObject;
				T result = caseAleatory(aleatory);
				if (result == null) result = caseDataGeneration(aleatory);
				if (result == null) result = caseDataSource(aleatory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.CS_VLOAD: {
				CSVload csVload = (CSVload)theEObject;
				T result = caseCSVload(csVload);
				if (result == null) result = caseLoadFromFile(csVload);
				if (result == null) result = caseDataSource(csVload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.HIL_NODE: {
				HIL_Node hiL_Node = (HIL_Node)theEObject;
				T result = caseHIL_Node(hiL_Node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.ARDUINO: {
				Arduino arduino = (Arduino)theEObject;
				T result = caseArduino(arduino);
				if (result == null) result = caseHIL_Node(arduino);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.RASPBERRY: {
				Raspberry raspberry = (Raspberry)theEObject;
				T result = caseRaspberry(raspberry);
				if (result == null) result = caseHIL_Node(raspberry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.USER_DEVICE: {
				UserDevice userDevice = (UserDevice)theEObject;
				T result = caseUserDevice(userDevice);
				if (result == null) result = caseHIL_Node(userDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.ARDUINO_CONFIGURATION: {
				ArduinoConfiguration arduinoConfiguration = (ArduinoConfiguration)theEObject;
				T result = caseArduinoConfiguration(arduinoConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IOTMetaModelPackage.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironment(Environment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeNode(EdgeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessNode(ProcessNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fog Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fog Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFogNode(FogNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudNode(CloudNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalConfiguration(AdditionalConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinates(Coordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopic(Topic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBase(DataBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Engine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Engine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessEngine(ProcessEngine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSP(SP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CEP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CEP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCEP(CEP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No SQL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No SQL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoSQL(NoSQL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotification(Notification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmailNotification(EmailNotification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topic Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopicNotification(TopicNotification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redirection Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redirection Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedirectionConfiguration(RedirectionConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load From File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load From File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadFromFile(LoadFromFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Generation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Generation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataGeneration(DataGeneration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generation Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generation Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerationRange(GenerationRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aleatory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aleatory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAleatory(Aleatory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CS Vload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CS Vload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSVload(CSVload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HIL Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HIL Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHIL_Node(HIL_Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduino(Arduino object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raspberry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raspberry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaspberry(Raspberry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDevice(UserDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduinoConfiguration(ArduinoConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IOTMetaModelSwitch
