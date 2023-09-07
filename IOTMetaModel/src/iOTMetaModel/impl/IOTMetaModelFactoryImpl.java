/**
 */
package iOTMetaModel.impl;

import iOTMetaModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IOTMetaModelFactoryImpl extends EFactoryImpl implements IOTMetaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IOTMetaModelFactory init() {
		try {
			IOTMetaModelFactory theIOTMetaModelFactory = (IOTMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(IOTMetaModelPackage.eNS_URI);
			if (theIOTMetaModelFactory != null) {
				return theIOTMetaModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IOTMetaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOTMetaModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IOTMetaModelPackage.ENVIRONMENT: return createEnvironment();
			case IOTMetaModelPackage.SENSOR: return createSensor();
			case IOTMetaModelPackage.ACTUATOR: return createActuator();
			case IOTMetaModelPackage.FOG_NODE: return createFogNode();
			case IOTMetaModelPackage.CLOUD_NODE: return createCloudNode();
			case IOTMetaModelPackage.ADDITIONAL_CONFIGURATION: return createAdditionalConfiguration();
			case IOTMetaModelPackage.COORDINATES: return createCoordinates();
			case IOTMetaModelPackage.DATA: return createData();
			case IOTMetaModelPackage.TOPIC: return createTopic();
			case IOTMetaModelPackage.SP: return createSP();
			case IOTMetaModelPackage.CEP: return createCEP();
			case IOTMetaModelPackage.NO_SQL: return createNoSQL();
			case IOTMetaModelPackage.RULE: return createRule();
			case IOTMetaModelPackage.EMAIL_NOTIFICATION: return createEmailNotification();
			case IOTMetaModelPackage.TOPIC_NOTIFICATION: return createTopicNotification();
			case IOTMetaModelPackage.REDIRECTION_CONFIGURATION: return createRedirectionConfiguration();
			case IOTMetaModelPackage.GENERATION_RANGE: return createGenerationRange();
			case IOTMetaModelPackage.ALEATORY: return createAleatory();
			case IOTMetaModelPackage.CS_VLOAD: return createCSVload();
			case IOTMetaModelPackage.ARDUINO: return createArduino();
			case IOTMetaModelPackage.RASPBERRY: return createRaspberry();
			case IOTMetaModelPackage.USER_DEVICE: return createUserDevice();
			case IOTMetaModelPackage.ARDUINO_CONFIGURATION: return createArduinoConfiguration();
			case IOTMetaModelPackage.INPUT: return createInput();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IOTMetaModelPackage.SIZE:
				return createSizeFromString(eDataType, initialValue);
			case IOTMetaModelPackage.BROKER_TYPE:
				return createBrokerTypeFromString(eDataType, initialValue);
			case IOTMetaModelPackage.CLOUD_TYPE:
				return createCloudTypeFromString(eDataType, initialValue);
			case IOTMetaModelPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			case IOTMetaModelPackage.DATA_BASE_PROVIDER:
				return createDataBaseProviderFromString(eDataType, initialValue);
			case IOTMetaModelPackage.PROCESS_ENGINE_PROVIDER:
				return createProcessEngineProviderFromString(eDataType, initialValue);
			case IOTMetaModelPackage.ARDUINO_MODEL:
				return createArduinoModelFromString(eDataType, initialValue);
			case IOTMetaModelPackage.ARDUINO_DEVICE_TYPE:
				return createArduinoDeviceTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IOTMetaModelPackage.SIZE:
				return convertSizeToString(eDataType, instanceValue);
			case IOTMetaModelPackage.BROKER_TYPE:
				return convertBrokerTypeToString(eDataType, instanceValue);
			case IOTMetaModelPackage.CLOUD_TYPE:
				return convertCloudTypeToString(eDataType, instanceValue);
			case IOTMetaModelPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			case IOTMetaModelPackage.DATA_BASE_PROVIDER:
				return convertDataBaseProviderToString(eDataType, instanceValue);
			case IOTMetaModelPackage.PROCESS_ENGINE_PROVIDER:
				return convertProcessEngineProviderToString(eDataType, instanceValue);
			case IOTMetaModelPackage.ARDUINO_MODEL:
				return convertArduinoModelToString(eDataType, instanceValue);
			case IOTMetaModelPackage.ARDUINO_DEVICE_TYPE:
				return convertArduinoDeviceTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FogNode createFogNode() {
		FogNodeImpl fogNode = new FogNodeImpl();
		return fogNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudNode createCloudNode() {
		CloudNodeImpl cloudNode = new CloudNodeImpl();
		return cloudNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalConfiguration createAdditionalConfiguration() {
		AdditionalConfigurationImpl additionalConfiguration = new AdditionalConfigurationImpl();
		return additionalConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coordinates createCoordinates() {
		CoordinatesImpl coordinates = new CoordinatesImpl();
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Topic createTopic() {
		TopicImpl topic = new TopicImpl();
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SP createSP() {
		SPImpl sp = new SPImpl();
		return sp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CEP createCEP() {
		CEPImpl cep = new CEPImpl();
		return cep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoSQL createNoSQL() {
		NoSQLImpl noSQL = new NoSQLImpl();
		return noSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmailNotification createEmailNotification() {
		EmailNotificationImpl emailNotification = new EmailNotificationImpl();
		return emailNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopicNotification createTopicNotification() {
		TopicNotificationImpl topicNotification = new TopicNotificationImpl();
		return topicNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RedirectionConfiguration createRedirectionConfiguration() {
		RedirectionConfigurationImpl redirectionConfiguration = new RedirectionConfigurationImpl();
		return redirectionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenerationRange createGenerationRange() {
		GenerationRangeImpl generationRange = new GenerationRangeImpl();
		return generationRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aleatory createAleatory() {
		AleatoryImpl aleatory = new AleatoryImpl();
		return aleatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSVload createCSVload() {
		CSVloadImpl csVload = new CSVloadImpl();
		return csVload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Arduino createArduino() {
		ArduinoImpl arduino = new ArduinoImpl();
		return arduino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Raspberry createRaspberry() {
		RaspberryImpl raspberry = new RaspberryImpl();
		return raspberry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserDevice createUserDevice() {
		UserDeviceImpl userDevice = new UserDeviceImpl();
		return userDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArduinoConfiguration createArduinoConfiguration() {
		ArduinoConfigurationImpl arduinoConfiguration = new ArduinoConfigurationImpl();
		return arduinoConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size createSizeFromString(EDataType eDataType, String initialValue) {
		Size result = Size.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerType createBrokerTypeFromString(EDataType eDataType, String initialValue) {
		BrokerType result = BrokerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBrokerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudType createCloudTypeFromString(EDataType eDataType, String initialValue) {
		CloudType result = CloudType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCloudTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBaseProvider createDataBaseProviderFromString(EDataType eDataType, String initialValue) {
		DataBaseProvider result = DataBaseProvider.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataBaseProviderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessEngineProvider createProcessEngineProviderFromString(EDataType eDataType, String initialValue) {
		ProcessEngineProvider result = ProcessEngineProvider.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessEngineProviderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoModel createArduinoModelFromString(EDataType eDataType, String initialValue) {
		ArduinoModel result = ArduinoModel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArduinoModelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoDeviceType createArduinoDeviceTypeFromString(EDataType eDataType, String initialValue) {
		ArduinoDeviceType result = ArduinoDeviceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArduinoDeviceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IOTMetaModelPackage getIOTMetaModelPackage() {
		return (IOTMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IOTMetaModelPackage getPackage() {
		return IOTMetaModelPackage.eINSTANCE;
	}

} //IOTMetaModelFactoryImpl
