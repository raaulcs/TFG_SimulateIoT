/**
 */
package iOTMetaModel.impl;

import iOTMetaModel.Actuator;
import iOTMetaModel.AdditionalConfiguration;
import iOTMetaModel.Aleatory;
import iOTMetaModel.Arduino;
import iOTMetaModel.ArduinoConfiguration;
import iOTMetaModel.ArduinoDeviceType;
import iOTMetaModel.ArduinoModel;
import iOTMetaModel.BrokerType;
import iOTMetaModel.CSVload;
import iOTMetaModel.CloudNode;
import iOTMetaModel.CloudType;
import iOTMetaModel.Component;
import iOTMetaModel.Coordinates;
import iOTMetaModel.Data;
import iOTMetaModel.DataBase;
import iOTMetaModel.DataBaseProvider;
import iOTMetaModel.DataGeneration;
import iOTMetaModel.DataSource;
import iOTMetaModel.DataType;
import iOTMetaModel.EdgeNode;
import iOTMetaModel.EmailNotification;
import iOTMetaModel.Environment;
import iOTMetaModel.FogNode;
import iOTMetaModel.GenerationRange;
import iOTMetaModel.HIL_Data_configuration;
import iOTMetaModel.HIL_Node;
import iOTMetaModel.IOTMetaModelFactory;
import iOTMetaModel.IOTMetaModelPackage;
import iOTMetaModel.Input;
import iOTMetaModel.LoadFromFile;
import iOTMetaModel.MeasurementUnit;
import iOTMetaModel.NoSQL;
import iOTMetaModel.Node;
import iOTMetaModel.Notification;
import iOTMetaModel.ProcessEngine;
import iOTMetaModel.ProcessEngineProvider;
import iOTMetaModel.ProcessNode;
import iOTMetaModel.Raspberry;
import iOTMetaModel.Raspberry;
import iOTMetaModel.RedirectionConfiguration;
import iOTMetaModel.Rule;
import iOTMetaModel.Sensor;
import iOTMetaModel.Size;
import iOTMetaModel.Topic;
import iOTMetaModel.TopicNotification;
import iOTMetaModel.UserDevice;
import iOTMetaModel.Input;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IOTMetaModelPackageImpl extends EPackageImpl implements IOTMetaModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noSQLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redirectionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadFromFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataGenerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generationRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aleatoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csVloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hiL_NodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raspberryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum brokerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cloudTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataBaseProviderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processEngineProviderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arduinoModelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arduinoDeviceTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see iOTMetaModel.IOTMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IOTMetaModelPackageImpl() {
		super(eNS_URI, IOTMetaModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link IOTMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IOTMetaModelPackage init() {
		if (isInited) return (IOTMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(IOTMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIOTMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IOTMetaModelPackageImpl theIOTMetaModelPackage = registeredIOTMetaModelPackage instanceof IOTMetaModelPackageImpl ? (IOTMetaModelPackageImpl)registeredIOTMetaModelPackage : new IOTMetaModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theIOTMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theIOTMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIOTMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IOTMetaModelPackage.eNS_URI, theIOTMetaModelPackage);
		return theIOTMetaModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironment_Name() {
		return (EAttribute)environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironment_SimulationSpeed() {
		return (EAttribute)environmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironment_NumberOfMessages() {
		return (EAttribute)environmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvironment_Node() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvironment_Data() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Id() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Coordinates() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Suscribe_on_topic() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Publish_on_topic() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Hil_node_configuration() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdgeNode() {
		return edgeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdgeNode_Quantity() {
		return (EAttribute)edgeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdgeNode_Additionalconfiguration() {
		return (EReference)edgeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdgeNode_Data() {
		return (EReference)edgeNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessNode() {
		return processNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessNode_Size() {
		return (EAttribute)processNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessNode_RedirectionTime() {
		return (EAttribute)processNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessNode_BrokerType() {
		return (EAttribute)processNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessNode_Edge_node() {
		return (EReference)processNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessNode_Redirect() {
		return (EReference)processNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessNode_Create_topic() {
		return (EReference)processNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessNode_Component() {
		return (EReference)processNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSensor_Generation_speed() {
		return (EAttribute)sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFogNode() {
		return fogNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCloudNode() {
		return cloudNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCloudNode_CloudType() {
		return (EAttribute)cloudNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdditionalConfiguration() {
		return additionalConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdditionalConfiguration_Id() {
		return (EAttribute)additionalConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoordinates() {
		return coordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinates_Name() {
		return (EAttribute)coordinatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinates_Latitude() {
		return (EAttribute)coordinatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinates_Longitude() {
		return (EAttribute)coordinatesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getData_Name() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getData_Id() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getData_DataType() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_Datasource() {
		return (EReference)dataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTopic() {
		return topicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTopic_Name() {
		return (EAttribute)topicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTopic_Data() {
		return (EReference)topicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Id() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataBase() {
		return dataBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataBase_DataBaseProvider() {
		return (EAttribute)dataBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessEngine() {
		return processEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessEngine_ProcessEngineProvider() {
		return (EAttribute)processEngineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessEngine_Rule() {
		return (EReference)processEngineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSP() {
		return spEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCEP() {
		return cepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNoSQL() {
		return noSQLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_Apply_to() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Id() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_EventType() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRule_Rule() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_Generates_notification() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotification() {
		return notificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotification_Name() {
		return (EAttribute)notificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotification_Message() {
		return (EAttribute)notificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotification_Route() {
		return (EAttribute)notificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmailNotification() {
		return emailNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailNotification_DestinyNotification() {
		return (EAttribute)emailNotificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailNotification_Username() {
		return (EAttribute)emailNotificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailNotification_SMTPserver() {
		return (EAttribute)emailNotificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmailNotification_Password() {
		return (EAttribute)emailNotificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTopicNotification() {
		return topicNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTopicNotification_Publish_on_topic() {
		return (EReference)topicNotificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRedirectionConfiguration() {
		return redirectionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRedirectionConfiguration_Name() {
		return (EAttribute)redirectionConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRedirectionConfiguration_Route_processnode() {
		return (EReference)redirectionConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRedirectionConfiguration_Topic() {
		return (EReference)redirectionConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataSource() {
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataSource_Id() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoadFromFile() {
		return loadFromFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoadFromFile_FileName() {
		return (EAttribute)loadFromFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataGeneration() {
		return dataGenerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataGeneration_GenerationName() {
		return (EAttribute)dataGenerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataGeneration_GenerationRange() {
		return (EReference)dataGenerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenerationRange() {
		return generationRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerationRange_Id() {
		return (EAttribute)generationRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerationRange_Lower() {
		return (EAttribute)generationRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGenerationRange_Upper() {
		return (EAttribute)generationRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAleatory() {
		return aleatoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCSVload() {
		return csVloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHIL_Node() {
		return hiL_NodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHIL_Node_IP() {
		return (EAttribute)hiL_NodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArduino() {
		return arduinoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArduino_ArduinoModel() {
		return (EAttribute)arduinoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArduino_Arduinoconfiguration() {
		return (EReference)arduinoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRaspberry() {
		return raspberryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserDevice() {
		return userDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArduinoConfiguration() {
		return arduinoConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArduinoConfiguration_DeviceType() {
		return (EAttribute)arduinoConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArduinoConfiguration_Output() {
		return (EAttribute)arduinoConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArduinoConfiguration_Input() {
		return (EReference)arduinoConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Input() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSize() {
		return sizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBrokerType() {
		return brokerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCloudType() {
		return cloudTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataBaseProvider() {
		return dataBaseProviderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcessEngineProvider() {
		return processEngineProviderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getArduinoModel() {
		return arduinoModelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getArduinoDeviceType() {
		return arduinoDeviceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IOTMetaModelFactory getIOTMetaModelFactory() {
		return (IOTMetaModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		environmentEClass = createEClass(ENVIRONMENT);
		createEAttribute(environmentEClass, ENVIRONMENT__NAME);
		createEAttribute(environmentEClass, ENVIRONMENT__SIMULATION_SPEED);
		createEAttribute(environmentEClass, ENVIRONMENT__NUMBER_OF_MESSAGES);
		createEReference(environmentEClass, ENVIRONMENT__NODE);
		createEReference(environmentEClass, ENVIRONMENT__DATA);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEAttribute(nodeEClass, NODE__ID);
		createEReference(nodeEClass, NODE__COORDINATES);
		createEReference(nodeEClass, NODE__SUSCRIBE_ON_TOPIC);
		createEReference(nodeEClass, NODE__PUBLISH_ON_TOPIC);
		createEReference(nodeEClass, NODE__HIL_NODE_CONFIGURATION);

		edgeNodeEClass = createEClass(EDGE_NODE);
		createEAttribute(edgeNodeEClass, EDGE_NODE__QUANTITY);
		createEReference(edgeNodeEClass, EDGE_NODE__ADDITIONALCONFIGURATION);
		createEReference(edgeNodeEClass, EDGE_NODE__DATA);

		processNodeEClass = createEClass(PROCESS_NODE);
		createEReference(processNodeEClass, PROCESS_NODE__EDGE_NODE);
		createEReference(processNodeEClass, PROCESS_NODE__REDIRECT);
		createEAttribute(processNodeEClass, PROCESS_NODE__REDIRECTION_TIME);
		createEReference(processNodeEClass, PROCESS_NODE__CREATE_TOPIC);
		createEAttribute(processNodeEClass, PROCESS_NODE__SIZE);
		createEReference(processNodeEClass, PROCESS_NODE__COMPONENT);
		createEAttribute(processNodeEClass, PROCESS_NODE__BROKER_TYPE);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__GENERATION_SPEED);

		actuatorEClass = createEClass(ACTUATOR);

		fogNodeEClass = createEClass(FOG_NODE);

		cloudNodeEClass = createEClass(CLOUD_NODE);
		createEAttribute(cloudNodeEClass, CLOUD_NODE__CLOUD_TYPE);

		additionalConfigurationEClass = createEClass(ADDITIONAL_CONFIGURATION);
		createEAttribute(additionalConfigurationEClass, ADDITIONAL_CONFIGURATION__ID);

		coordinatesEClass = createEClass(COORDINATES);
		createEAttribute(coordinatesEClass, COORDINATES__NAME);
		createEAttribute(coordinatesEClass, COORDINATES__LATITUDE);
		createEAttribute(coordinatesEClass, COORDINATES__LONGITUDE);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__NAME);
		createEAttribute(dataEClass, DATA__ID);
		createEAttribute(dataEClass, DATA__DATA_TYPE);
		createEReference(dataEClass, DATA__DATASOURCE);

		topicEClass = createEClass(TOPIC);
		createEAttribute(topicEClass, TOPIC__NAME);
		createEReference(topicEClass, TOPIC__DATA);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEAttribute(componentEClass, COMPONENT__ID);

		dataBaseEClass = createEClass(DATA_BASE);
		createEAttribute(dataBaseEClass, DATA_BASE__DATA_BASE_PROVIDER);

		processEngineEClass = createEClass(PROCESS_ENGINE);
		createEAttribute(processEngineEClass, PROCESS_ENGINE__PROCESS_ENGINE_PROVIDER);
		createEReference(processEngineEClass, PROCESS_ENGINE__RULE);

		spEClass = createEClass(SP);

		cepEClass = createEClass(CEP);

		noSQLEClass = createEClass(NO_SQL);

		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__APPLY_TO);
		createEAttribute(ruleEClass, RULE__ID);
		createEAttribute(ruleEClass, RULE__EVENT_TYPE);
		createEAttribute(ruleEClass, RULE__RULE);
		createEReference(ruleEClass, RULE__GENERATES_NOTIFICATION);

		notificationEClass = createEClass(NOTIFICATION);
		createEAttribute(notificationEClass, NOTIFICATION__NAME);
		createEAttribute(notificationEClass, NOTIFICATION__MESSAGE);
		createEAttribute(notificationEClass, NOTIFICATION__ROUTE);

		emailNotificationEClass = createEClass(EMAIL_NOTIFICATION);
		createEAttribute(emailNotificationEClass, EMAIL_NOTIFICATION__DESTINY_NOTIFICATION);
		createEAttribute(emailNotificationEClass, EMAIL_NOTIFICATION__USERNAME);
		createEAttribute(emailNotificationEClass, EMAIL_NOTIFICATION__SMT_PSERVER);
		createEAttribute(emailNotificationEClass, EMAIL_NOTIFICATION__PASSWORD);

		topicNotificationEClass = createEClass(TOPIC_NOTIFICATION);
		createEReference(topicNotificationEClass, TOPIC_NOTIFICATION__PUBLISH_ON_TOPIC);

		redirectionConfigurationEClass = createEClass(REDIRECTION_CONFIGURATION);
		createEAttribute(redirectionConfigurationEClass, REDIRECTION_CONFIGURATION__NAME);
		createEReference(redirectionConfigurationEClass, REDIRECTION_CONFIGURATION__ROUTE_PROCESSNODE);
		createEReference(redirectionConfigurationEClass, REDIRECTION_CONFIGURATION__TOPIC);

		dataSourceEClass = createEClass(DATA_SOURCE);
		createEAttribute(dataSourceEClass, DATA_SOURCE__ID);

		loadFromFileEClass = createEClass(LOAD_FROM_FILE);
		createEAttribute(loadFromFileEClass, LOAD_FROM_FILE__FILE_NAME);

		dataGenerationEClass = createEClass(DATA_GENERATION);
		createEAttribute(dataGenerationEClass, DATA_GENERATION__GENERATION_NAME);
		createEReference(dataGenerationEClass, DATA_GENERATION__GENERATION_RANGE);

		generationRangeEClass = createEClass(GENERATION_RANGE);
		createEAttribute(generationRangeEClass, GENERATION_RANGE__ID);
		createEAttribute(generationRangeEClass, GENERATION_RANGE__LOWER);
		createEAttribute(generationRangeEClass, GENERATION_RANGE__UPPER);

		aleatoryEClass = createEClass(ALEATORY);

		csVloadEClass = createEClass(CS_VLOAD);

		hiL_NodeEClass = createEClass(HIL_NODE);
		createEAttribute(hiL_NodeEClass, HIL_NODE__IP);

		arduinoEClass = createEClass(ARDUINO);
		createEAttribute(arduinoEClass, ARDUINO__ARDUINO_MODEL);
		createEReference(arduinoEClass, ARDUINO__ARDUINOCONFIGURATION);

		raspberryEClass = createEClass(RASPBERRY);

		userDeviceEClass = createEClass(USER_DEVICE);

		arduinoConfigurationEClass = createEClass(ARDUINO_CONFIGURATION);
		createEAttribute(arduinoConfigurationEClass, ARDUINO_CONFIGURATION__DEVICE_TYPE);
		createEAttribute(arduinoConfigurationEClass, ARDUINO_CONFIGURATION__OUTPUT);
		createEReference(arduinoConfigurationEClass, ARDUINO_CONFIGURATION__INPUT);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__INPUT);

		// Create enums
		sizeEEnum = createEEnum(SIZE);
		brokerTypeEEnum = createEEnum(BROKER_TYPE);
		cloudTypeEEnum = createEEnum(CLOUD_TYPE);
		dataTypeEEnum = createEEnum(DATA_TYPE);
		dataBaseProviderEEnum = createEEnum(DATA_BASE_PROVIDER);
		processEngineProviderEEnum = createEEnum(PROCESS_ENGINE_PROVIDER);
		arduinoModelEEnum = createEEnum(ARDUINO_MODEL);
		arduinoDeviceTypeEEnum = createEEnum(ARDUINO_DEVICE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		edgeNodeEClass.getESuperTypes().add(this.getNode());
		processNodeEClass.getESuperTypes().add(this.getNode());
		sensorEClass.getESuperTypes().add(this.getEdgeNode());
		actuatorEClass.getESuperTypes().add(this.getEdgeNode());
		fogNodeEClass.getESuperTypes().add(this.getProcessNode());
		cloudNodeEClass.getESuperTypes().add(this.getProcessNode());
		dataBaseEClass.getESuperTypes().add(this.getComponent());
		processEngineEClass.getESuperTypes().add(this.getComponent());
		spEClass.getESuperTypes().add(this.getProcessEngine());
		cepEClass.getESuperTypes().add(this.getProcessEngine());
		noSQLEClass.getESuperTypes().add(this.getDataBase());
		emailNotificationEClass.getESuperTypes().add(this.getNotification());
		topicNotificationEClass.getESuperTypes().add(this.getNotification());
		redirectionConfigurationEClass.getESuperTypes().add(this.getAdditionalConfiguration());
		loadFromFileEClass.getESuperTypes().add(this.getDataSource());
		dataGenerationEClass.getESuperTypes().add(this.getDataSource());
		aleatoryEClass.getESuperTypes().add(this.getDataGeneration());
		csVloadEClass.getESuperTypes().add(this.getLoadFromFile());
		arduinoEClass.getESuperTypes().add(this.getHIL_Node());
		raspberryEClass.getESuperTypes().add(this.getHIL_Node());
		userDeviceEClass.getESuperTypes().add(this.getHIL_Node());

		// Initialize classes and features; add operations and parameters
		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_SimulationSpeed(), ecorePackage.getEFloatObject(), "simulationSpeed", "1.0", 0, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_NumberOfMessages(), ecorePackage.getEIntegerObject(), "numberOfMessages", "100", 0, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironment_Node(), this.getNode(), null, "node", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironment_Data(), this.getData(), null, "data", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Id(), ecorePackage.getEIntegerObject(), "id", "0", 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Coordinates(), this.getCoordinates(), null, "coordinates", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Suscribe_on_topic(), this.getTopic(), null, "suscribe_on_topic", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Publish_on_topic(), this.getTopic(), null, "publish_on_topic", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Hil_node_configuration(), this.getHIL_Node(), null, "hil_node_configuration", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeNodeEClass, EdgeNode.class, "EdgeNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdgeNode_Quantity(), ecorePackage.getEIntegerObject(), "quantity", "1", 0, 1, EdgeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeNode_Additionalconfiguration(), this.getAdditionalConfiguration(), null, "additionalconfiguration", null, 0, 1, EdgeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeNode_Data(), this.getData(), null, "data", null, 0, 1, EdgeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processNodeEClass, ProcessNode.class, "ProcessNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessNode_Edge_node(), this.getEdgeNode(), null, "edge_node", null, 0, -1, ProcessNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessNode_Redirect(), this.getProcessNode(), null, "redirect", null, 0, -1, ProcessNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessNode_RedirectionTime(), ecorePackage.getEIntegerObject(), "redirectionTime", "0", 0, 1, ProcessNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessNode_Create_topic(), this.getTopic(), null, "create_topic", null, 0, -1, ProcessNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessNode_Size(), this.getSize(), "size", "XS", 0, 1, ProcessNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessNode_Component(), this.getComponent(), null, "component", null, 0, -1, ProcessNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessNode_BrokerType(), this.getBrokerType(), "BrokerType", "Mosquitto", 0, 1, ProcessNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Generation_speed(), ecorePackage.getEFloatObject(), "generation_speed", "1.0", 0, 1, Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fogNodeEClass, FogNode.class, "FogNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cloudNodeEClass, CloudNode.class, "CloudNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudNode_CloudType(), this.getCloudType(), "CloudType", "AWS", 0, 1, CloudNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionalConfigurationEClass, AdditionalConfiguration.class, "AdditionalConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdditionalConfiguration_Id(), ecorePackage.getEIntegerObject(), "id", "0", 0, 1, AdditionalConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinatesEClass, Coordinates.class, "Coordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoordinates_Name(), ecorePackage.getEString(), "name", null, 0, 1, Coordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinates_Latitude(), ecorePackage.getEIntegerObject(), "latitude", null, 0, 1, Coordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinates_Longitude(), ecorePackage.getEIntegerObject(), "longitude", null, 0, 1, Coordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Name(), ecorePackage.getEString(), "name", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Id(), ecorePackage.getEIntegerObject(), "id", "0", 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_DataType(), this.getDataType(), "DataType", "INTEGER", 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Datasource(), this.getDataSource(), null, "datasource", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topicEClass, Topic.class, "Topic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopic_Name(), ecorePackage.getEString(), "name", null, 0, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopic_Data(), this.getData(), null, "data", null, 0, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Id(), ecorePackage.getEIntegerObject(), "id", "0", 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataBaseEClass, DataBase.class, "DataBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataBase_DataBaseProvider(), this.getDataBaseProvider(), "DataBaseProvider", "MongoDB", 0, 1, DataBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEngineEClass, ProcessEngine.class, "ProcessEngine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessEngine_ProcessEngineProvider(), this.getProcessEngineProvider(), "ProcessEngineProvider", "EsperTech", 0, 1, ProcessEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessEngine_Rule(), this.getRule(), null, "rule", null, 0, -1, ProcessEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spEClass, iOTMetaModel.SP.class, "SP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cepEClass, iOTMetaModel.CEP.class, "CEP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noSQLEClass, NoSQL.class, "NoSQL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_Apply_to(), this.getTopic(), null, "apply_to", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Id(), ecorePackage.getEIntegerObject(), "id", "0", 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_EventType(), ecorePackage.getEString(), "eventType", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Rule(), ecorePackage.getEString(), "rule", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Generates_notification(), this.getNotification(), null, "generates_notification", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationEClass, Notification.class, "Notification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotification_Name(), ecorePackage.getEString(), "name", null, 0, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotification_Message(), ecorePackage.getEString(), "message", null, 0, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotification_Route(), ecorePackage.getEString(), "route", null, 0, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emailNotificationEClass, EmailNotification.class, "EmailNotification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmailNotification_DestinyNotification(), ecorePackage.getEString(), "destinyNotification", null, 0, 1, EmailNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmailNotification_Username(), ecorePackage.getEString(), "username", null, 0, 1, EmailNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmailNotification_SMTPserver(), ecorePackage.getEString(), "SMTPserver", null, 0, 1, EmailNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmailNotification_Password(), ecorePackage.getEString(), "password", null, 0, 1, EmailNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topicNotificationEClass, TopicNotification.class, "TopicNotification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopicNotification_Publish_on_topic(), this.getTopic(), null, "publish_on_topic", null, 0, -1, TopicNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(redirectionConfigurationEClass, RedirectionConfiguration.class, "RedirectionConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRedirectionConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, RedirectionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRedirectionConfiguration_Route_processnode(), this.getProcessNode(), null, "route_processnode", null, 1, -1, RedirectionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRedirectionConfiguration_Topic(), this.getTopic(), null, "topic", null, 1, 1, RedirectionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSource_Id(), ecorePackage.getEIntegerObject(), "id", "0", 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadFromFileEClass, LoadFromFile.class, "LoadFromFile", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadFromFile_FileName(), ecorePackage.getEString(), "FileName", null, 0, 1, LoadFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataGenerationEClass, DataGeneration.class, "DataGeneration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataGeneration_GenerationName(), ecorePackage.getEString(), "GenerationName", null, 0, 1, DataGeneration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataGeneration_GenerationRange(), this.getGenerationRange(), null, "generationRange", null, 0, 1, DataGeneration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generationRangeEClass, GenerationRange.class, "GenerationRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenerationRange_Id(), ecorePackage.getEIntegerObject(), "id", "0", 0, 1, GenerationRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationRange_Lower(), ecorePackage.getEIntegerObject(), "Lower", null, 0, 1, GenerationRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationRange_Upper(), ecorePackage.getEIntegerObject(), "Upper", null, 0, 1, GenerationRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aleatoryEClass, Aleatory.class, "Aleatory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(csVloadEClass, CSVload.class, "CSVload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hiL_NodeEClass, HIL_Node.class, "HIL_Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHIL_Node_IP(), ecorePackage.getEString(), "IP", null, 0, 1, HIL_Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduinoEClass, Arduino.class, "Arduino", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArduino_ArduinoModel(), this.getArduinoModel(), "arduinoModel", "Yun", 0, 1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduino_Arduinoconfiguration(), this.getArduinoConfiguration(), null, "arduinoconfiguration", null, 1, -1, Arduino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(raspberryEClass, Raspberry.class, "Raspberry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userDeviceEClass, UserDevice.class, "UserDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arduinoConfigurationEClass, ArduinoConfiguration.class, "ArduinoConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArduinoConfiguration_DeviceType(), this.getArduinoDeviceType(), "deviceType", "Thermistor", 0, 1, ArduinoConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoConfiguration_Output(), ecorePackage.getEIntegerObject(), "output", null, 0, 1, ArduinoConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArduinoConfiguration_Input(), this.getInput(), null, "input", null, 0, -1, ArduinoConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_Input(), ecorePackage.getEIntegerObject(), "input", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sizeEEnum, Size.class, "Size");
		addEEnumLiteral(sizeEEnum, Size.XS);
		addEEnumLiteral(sizeEEnum, Size.S);
		addEEnumLiteral(sizeEEnum, Size.M);
		addEEnumLiteral(sizeEEnum, Size.L);
		addEEnumLiteral(sizeEEnum, Size.XL);
		addEEnumLiteral(sizeEEnum, Size.XXL);

		initEEnum(brokerTypeEEnum, BrokerType.class, "BrokerType");
		addEEnumLiteral(brokerTypeEEnum, BrokerType.MOSQUITTO);

		initEEnum(cloudTypeEEnum, CloudType.class, "CloudType");
		addEEnumLiteral(cloudTypeEEnum, CloudType.AWS);
		addEEnumLiteral(cloudTypeEEnum, CloudType.AZURE);
		addEEnumLiteral(cloudTypeEEnum, CloudType.HEROKU);
		addEEnumLiteral(cloudTypeEEnum, CloudType.OPEN_SHIFT);
		addEEnumLiteral(cloudTypeEEnum, CloudType.UNDEFINED);

		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.INTEGER);
		addEEnumLiteral(dataTypeEEnum, DataType.STRING);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOLEAN);
		addEEnumLiteral(dataTypeEEnum, DataType.FLOAT);

		initEEnum(dataBaseProviderEEnum, DataBaseProvider.class, "DataBaseProvider");
		addEEnumLiteral(dataBaseProviderEEnum, DataBaseProvider.MONGO_DB);

		initEEnum(processEngineProviderEEnum, ProcessEngineProvider.class, "ProcessEngineProvider");
		addEEnumLiteral(processEngineProviderEEnum, ProcessEngineProvider.ESPER_TECH);
		addEEnumLiteral(processEngineProviderEEnum, ProcessEngineProvider.WSO2);

		initEEnum(arduinoModelEEnum, ArduinoModel.class, "ArduinoModel");
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.ADAFRUIT_CIRCUIT_PLAYGROUND);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.BT);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.DUEMILANOVE_OR_DIECIMILA);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.ESPLORA);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.ETHERNET);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.FIO);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.GEMMA);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.INDUSTRIAL101);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.LEONARDO);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.LEONARDO_ETH);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.MEGA_ADK);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.MEGA_OR_MEGA2560);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.MICRO);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.MINI);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.NG_OR_OLDER);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.NANO);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.PRO_OR_PRO_MINI);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.ROBOT_CONTROL);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.ROBOT_MOTOR);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.UNO);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.UNO_MINI);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.UNO_WI_FI);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.YUN);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.YUN_MINI);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.LILY_PAD_ARDUINO);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.LILY_PAD_ARDUINO_USB);
		addEEnumLiteral(arduinoModelEEnum, ArduinoModel.LININO_ONE);

		initEEnum(arduinoDeviceTypeEEnum, ArduinoDeviceType.class, "ArduinoDeviceType");
		addEEnumLiteral(arduinoDeviceTypeEEnum, ArduinoDeviceType.THERMISTOR);
		addEEnumLiteral(arduinoDeviceTypeEEnum, ArduinoDeviceType.ROTATORY_POTENTIOMETER);
		addEEnumLiteral(arduinoDeviceTypeEEnum, ArduinoDeviceType.TILT_SENSOR);
		addEEnumLiteral(arduinoDeviceTypeEEnum, ArduinoDeviceType.PHOTORESISTOR);
		addEEnumLiteral(arduinoDeviceTypeEEnum, ArduinoDeviceType.ACCELEROMETER);
		addEEnumLiteral(arduinoDeviceTypeEEnum, ArduinoDeviceType.PUSHBUTTON_MODULE);
		addEEnumLiteral(arduinoDeviceTypeEEnum, ArduinoDeviceType.LINEAR_POTENTIOMETER);
		addEEnumLiteral(arduinoDeviceTypeEEnum, ArduinoDeviceType.TOUCH_SENSOR);
		addEEnumLiteral(arduinoDeviceTypeEEnum, ArduinoDeviceType.JOYSTICK_MODULE);
		addEEnumLiteral(arduinoDeviceTypeEEnum, ArduinoDeviceType.GYROSCOPE);
		addEEnumLiteral(arduinoDeviceTypeEEnum, ArduinoDeviceType.HALL_SENSOR);
		addEEnumLiteral(arduinoDeviceTypeEEnum, ArduinoDeviceType.LED);
		addEEnumLiteral(arduinoDeviceTypeEEnum, ArduinoDeviceType.HIGH_POWER_LED);
		addEEnumLiteral(arduinoDeviceTypeEEnum, ArduinoDeviceType.MOSFET);
		addEEnumLiteral(arduinoDeviceTypeEEnum, ArduinoDeviceType.RELAY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
		// gmf.compartment
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (environmentEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (nodeEClass,
		   source,
		   new String[] {
			   "label", "name"
		   });
		addAnnotation
		  (sensorEClass,
		   source,
		   new String[] {
			   "color", "226,150,152",
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/device.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/device.png",
			   "label.placement", "internal",
			   "label.icon", "true"
		   });
		addAnnotation
		  (actuatorEClass,
		   source,
		   new String[] {
			   "color", "226,150,152",
			   "tool.small.bundle", "IOTMetaModel",
			   "label.placement", "internal",
			   "tool.small.path", "imagenes/Actuator.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/Actuator.png",
			   "label.icon", "true"
		   });
		addAnnotation
		  (fogNodeEClass,
		   source,
		   new String[] {
			   "tool.small.bundle", "IOTMetaModel",
			   "color", "203,225,249",
			   "tool.small.path", "imagenes/fog.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/fog.png",
			   "label.placement", "internal"
		   });
		addAnnotation
		  (cloudNodeEClass,
		   source,
		   new String[] {
			   "tool.small.bundle", "IOTMetaModel",
			   "color", "191,248,203",
			   "tool.small.path", "imagenes/cloud.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/cloud.png",
			   "label.placement", "internal"
		   });
		addAnnotation
		  (additionalConfigurationEClass,
		   source,
		   new String[] {
			   "label", "id",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/IOTMetaModel/imagenes/machineLearning.svg",
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/machine_learning.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/machine_learning.png",
			   "label.placement", "external",
			   "label.icon", "false"
		   });
		addAnnotation
		  (coordinatesEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/xy.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/xy.png",
			   "label.icon", "true",
			   "label.placement", "external"
		   });
		addAnnotation
		  (dataEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "color", "226,150,152",
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/data.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/data.png",
			   "label.placement", "internal",
			   "label.icon", "true"
		   });
		addAnnotation
		  (topicEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/IOTMetaModel/imagenes/topic.svg",
			   "label.placement", "external",
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/topic.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/topic.png",
			   "label.icon", "false"
		   });
		addAnnotation
		  (componentEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "true",
			   "label.placement", "internal"
		   });
		addAnnotation
		  (spEClass,
		   source,
		   new String[] {
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/wso2.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/wso2.png",
			   "label.placement", "internal"
		   });
		addAnnotation
		  (cepEClass,
		   source,
		   new String[] {
			   "tool.small.bundle", "IOTMetaModel",
			   "color", "191,248,203",
			   "tool.small.path", "imagenes/esper.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/esper.png",
			   "label.placement", "internal"
		   });
		addAnnotation
		  (noSQLEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/IOTMetaModel/imagenes/mongo.svg",
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/mongo.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/mongo.png",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (ruleEClass,
		   source,
		   new String[] {
			   "label", "eventType",
			   "color", "191,248,203",
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/rule.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/rule.png",
			   "label.placement", "internal",
			   "label.icon", "true"
		   });
		addAnnotation
		  (notificationEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "color", "191,248,203",
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/notification.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/notification.png",
			   "label.placement", "external",
			   "label.icon", "false"
		   });
		addAnnotation
		  (emailNotificationEClass,
		   source,
		   new String[] {
			   "tool.small.bundle", "IOTMetaModel",
			   "color", "191,248,203",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/IOTMetaModel/imagenes/gmail.svg",
			   "tool.small.path", "imagenes/gmail.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/gmail.png",
			   "label.placement", "external"
		   });
		addAnnotation
		  (topicNotificationEClass,
		   source,
		   new String[] {
			   "figure", "svg",
			   "color", "191,248,203",
			   "svg.uri", "platform:/plugin/IOTMetaModel/imagenes/notification.svg"
		   });
		addAnnotation
		  (redirectionConfigurationEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/IOTMetaModel/imagenes/redirect.svg",
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/redirect.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/redirect.png",
			   "label.placement", "external",
			   "label.icon", "false"
		   });
		addAnnotation
		  (dataSourceEClass,
		   source,
		   new String[] {
			   "label.placement", "internal",
			   "label.icon", "true"
		   });
		addAnnotation
		  (loadFromFileEClass,
		   source,
		   new String[] {
			   "label", "FileName"
		   });
		addAnnotation
		  (dataGenerationEClass,
		   source,
		   new String[] {
			   "label", "GenerationName",
			   "label.icon", "true",
			   "label.placement", "internal"
		   });
		addAnnotation
		  (generationRangeEClass,
		   source,
		   new String[] {
			   "label", "id",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/IOTMetaModel/imagenes/range.svg",
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/range.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/range.png",
			   "label.placement", "external",
			   "label.icon", "false"
		   });
		addAnnotation
		  (aleatoryEClass,
		   source,
		   new String[] {
			   "color", "226,150,152",
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/random.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/random.png"
		   });
		addAnnotation
		  (csVloadEClass,
		   source,
		   new String[] {
			   "figure", "svg",
			   "color", "226,150,152",
			   "svg.uri", "platform:/plugin/IOTMetaModel/imagenes/csv.svg",
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/csv.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/csv.png",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (arduinoEClass,
		   source,
		   new String[] {
			   "label", "IP",
			   "figure", "svg",
			   "color", "226,150,152",
			   "svg.uri", "platform:/plugin/IOTMetaModel/imagenes/arduino.svg",
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/arduino.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/arduino.png",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (raspberryEClass,
		   source,
		   new String[] {
			   "label", "IP",
			   "figure", "svg",
			   "color", "226,150,152",
			   "svg.uri", "platform:/plugin/IOTMetaModel/imagenes/raspberry.svg",
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/raspberry.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/raspberry.png",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (userDeviceEClass,
		   source,
		   new String[] {
			   "label", "IP",
			   "figure", "svg",
			   "color", "226,150,152",
			   "svg.uri", "platform:/plugin/IOTMetaModel/imagenes/userDevice.svg",
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/userDevice.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/userDevice.png",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (arduinoConfigurationEClass,
		   source,
		   new String[] {
			   "label", "deviceType",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/IOTMetaModel/imagenes/arduino.svg",
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/arduino.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/arduino.png",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (inputEClass,
		   source,
		   new String[] {
			   "label", "input",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/IOTMetaModel/imagenes/telegram.svg",
			   "tool.small.bundle", "IOTMetaModel",
			   "tool.small.path", "imagenes/telegram.png",
			   "tool.large.bundle", "IOTMetaModel",
			   "tool.large.path", "imagenes/telegram.png",
			   "label.placement", "external",
			   "label.icon", "false"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (getNode_Suscribe_on_topic(),
		   source,
		   new String[] {
			   "source.decoration", "arrow",
			   "target.decoration", "none",
			   "style", "dash",
			   "color", "255,93,0",
			   "width", "3"
		   });
		addAnnotation
		  (getNode_Publish_on_topic(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash",
			   "color", "255,93,0",
			   "width", "3"
		   });
		addAnnotation
		  (getEdgeNode_Data(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash",
			   "color", "51,51,204",
			   "width", "3"
		   });
		addAnnotation
		  (getProcessNode_Edge_node(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash",
			   "color", "0,102,0",
			   "width", "3"
		   });
		addAnnotation
		  (getProcessNode_Redirect(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "color", "255,0,236",
			   "width", "3"
		   });
		addAnnotation
		  (getRule_Apply_to(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash",
			   "color", "46,204,113",
			   "width", "3"
		   });
		addAnnotation
		  (getTopicNotification_Publish_on_topic(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash",
			   "color", "255,93,0",
			   "width", "3"
		   });
		addAnnotation
		  (getRedirectionConfiguration_Topic(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash",
			   "color", "255,93,0",
			   "width", "3"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getNode_Hil_node_configuration(),
		   source,
		   new String[] {
			   "collapsible", "false"
		   });
		addAnnotation
		  (getEdgeNode_Additionalconfiguration(),
		   source,
		   new String[] {
			   "collapsible", "false"
		   });
		addAnnotation
		  (getProcessNode_Create_topic(),
		   source,
		   new String[] {
			   "collapsible", "false"
		   });
		addAnnotation
		  (getProcessNode_Component(),
		   source,
		   new String[] {
			   "collapsible", "false"
		   });
		addAnnotation
		  (getData_Datasource(),
		   source,
		   new String[] {
			   "collapsible", "false"
		   });
		addAnnotation
		  (getProcessEngine_Rule(),
		   source,
		   new String[] {
			   "collapsible", "false"
		   });
		addAnnotation
		  (getRule_Generates_notification(),
		   source,
		   new String[] {
			   "collapsible", "false"
		   });
		addAnnotation
		  (getArduino_Arduinoconfiguration(),
		   source,
		   new String[] {
			   "collapsible", "false"
		   });
	}

} //IOTMetaModelPackageImpl
