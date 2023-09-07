/**
 */
package iOTMetaModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iOTMetaModel.IOTMetaModelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface IOTMetaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iOTMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/iOTMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iOTMetaModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IOTMetaModelPackage eINSTANCE = iOTMetaModel.impl.IOTMetaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.EnvironmentImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Simulation Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__SIMULATION_SPEED = 1;

	/**
	 * The feature id for the '<em><b>Number Of Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NUMBER_OF_MESSAGES = 2;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NODE = 3;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__DATA = 4;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.NodeImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = 1;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COORDINATES = 2;

	/**
	 * The feature id for the '<em><b>Suscribe on topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SUSCRIBE_ON_TOPIC = 3;

	/**
	 * The feature id for the '<em><b>Publish on topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PUBLISH_ON_TOPIC = 4;

	/**
	 * The feature id for the '<em><b>Hil node configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HIL_NODE_CONFIGURATION = 5;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.EdgeNodeImpl <em>Edge Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.EdgeNodeImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getEdgeNode()
	 * @generated
	 */
	int EDGE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__COORDINATES = NODE__COORDINATES;

	/**
	 * The feature id for the '<em><b>Suscribe on topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__SUSCRIBE_ON_TOPIC = NODE__SUSCRIBE_ON_TOPIC;

	/**
	 * The feature id for the '<em><b>Publish on topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__PUBLISH_ON_TOPIC = NODE__PUBLISH_ON_TOPIC;

	/**
	 * The feature id for the '<em><b>Hil node configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__HIL_NODE_CONFIGURATION = NODE__HIL_NODE_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__QUANTITY = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additionalconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__ADDITIONALCONFIGURATION = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__DATA = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Edge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.ProcessNodeImpl <em>Process Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.ProcessNodeImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getProcessNode()
	 * @generated
	 */
	int PROCESS_NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NODE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NODE__COORDINATES = NODE__COORDINATES;

	/**
	 * The feature id for the '<em><b>Suscribe on topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NODE__SUSCRIBE_ON_TOPIC = NODE__SUSCRIBE_ON_TOPIC;

	/**
	 * The feature id for the '<em><b>Publish on topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NODE__PUBLISH_ON_TOPIC = NODE__PUBLISH_ON_TOPIC;

	/**
	 * The feature id for the '<em><b>Hil node configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NODE__HIL_NODE_CONFIGURATION = NODE__HIL_NODE_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Edge node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NODE__EDGE_NODE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Redirect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NODE__REDIRECT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Redirection Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NODE__REDIRECTION_TIME = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Create topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NODE__CREATE_TOPIC = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NODE__SIZE = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NODE__COMPONENT = NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Broker Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NODE__BROKER_TYPE = NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Process Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.SensorImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = EDGE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ID = EDGE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__COORDINATES = EDGE_NODE__COORDINATES;

	/**
	 * The feature id for the '<em><b>Suscribe on topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SUSCRIBE_ON_TOPIC = EDGE_NODE__SUSCRIBE_ON_TOPIC;

	/**
	 * The feature id for the '<em><b>Publish on topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PUBLISH_ON_TOPIC = EDGE_NODE__PUBLISH_ON_TOPIC;

	/**
	 * The feature id for the '<em><b>Hil node configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__HIL_NODE_CONFIGURATION = EDGE_NODE__HIL_NODE_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__QUANTITY = EDGE_NODE__QUANTITY;

	/**
	 * The feature id for the '<em><b>Additionalconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__ADDITIONALCONFIGURATION = EDGE_NODE__ADDITIONALCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DATA = EDGE_NODE__DATA;

	/**
	 * The feature id for the '<em><b>Generation speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__GENERATION_SPEED = EDGE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = EDGE_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.ActuatorImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = EDGE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ID = EDGE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__COORDINATES = EDGE_NODE__COORDINATES;

	/**
	 * The feature id for the '<em><b>Suscribe on topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__SUSCRIBE_ON_TOPIC = EDGE_NODE__SUSCRIBE_ON_TOPIC;

	/**
	 * The feature id for the '<em><b>Publish on topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PUBLISH_ON_TOPIC = EDGE_NODE__PUBLISH_ON_TOPIC;

	/**
	 * The feature id for the '<em><b>Hil node configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__HIL_NODE_CONFIGURATION = EDGE_NODE__HIL_NODE_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__QUANTITY = EDGE_NODE__QUANTITY;

	/**
	 * The feature id for the '<em><b>Additionalconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__ADDITIONALCONFIGURATION = EDGE_NODE__ADDITIONALCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__DATA = EDGE_NODE__DATA;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = EDGE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.FogNodeImpl <em>Fog Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.FogNodeImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getFogNode()
	 * @generated
	 */
	int FOG_NODE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__NAME = PROCESS_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__ID = PROCESS_NODE__ID;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__COORDINATES = PROCESS_NODE__COORDINATES;

	/**
	 * The feature id for the '<em><b>Suscribe on topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__SUSCRIBE_ON_TOPIC = PROCESS_NODE__SUSCRIBE_ON_TOPIC;

	/**
	 * The feature id for the '<em><b>Publish on topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__PUBLISH_ON_TOPIC = PROCESS_NODE__PUBLISH_ON_TOPIC;

	/**
	 * The feature id for the '<em><b>Hil node configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__HIL_NODE_CONFIGURATION = PROCESS_NODE__HIL_NODE_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Edge node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__EDGE_NODE = PROCESS_NODE__EDGE_NODE;

	/**
	 * The feature id for the '<em><b>Redirect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__REDIRECT = PROCESS_NODE__REDIRECT;

	/**
	 * The feature id for the '<em><b>Redirection Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__REDIRECTION_TIME = PROCESS_NODE__REDIRECTION_TIME;

	/**
	 * The feature id for the '<em><b>Create topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__CREATE_TOPIC = PROCESS_NODE__CREATE_TOPIC;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__SIZE = PROCESS_NODE__SIZE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__COMPONENT = PROCESS_NODE__COMPONENT;

	/**
	 * The feature id for the '<em><b>Broker Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE__BROKER_TYPE = PROCESS_NODE__BROKER_TYPE;

	/**
	 * The number of structural features of the '<em>Fog Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_NODE_FEATURE_COUNT = PROCESS_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.CloudNodeImpl <em>Cloud Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.CloudNodeImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getCloudNode()
	 * @generated
	 */
	int CLOUD_NODE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__NAME = PROCESS_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__ID = PROCESS_NODE__ID;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__COORDINATES = PROCESS_NODE__COORDINATES;

	/**
	 * The feature id for the '<em><b>Suscribe on topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__SUSCRIBE_ON_TOPIC = PROCESS_NODE__SUSCRIBE_ON_TOPIC;

	/**
	 * The feature id for the '<em><b>Publish on topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__PUBLISH_ON_TOPIC = PROCESS_NODE__PUBLISH_ON_TOPIC;

	/**
	 * The feature id for the '<em><b>Hil node configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__HIL_NODE_CONFIGURATION = PROCESS_NODE__HIL_NODE_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Edge node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__EDGE_NODE = PROCESS_NODE__EDGE_NODE;

	/**
	 * The feature id for the '<em><b>Redirect</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__REDIRECT = PROCESS_NODE__REDIRECT;

	/**
	 * The feature id for the '<em><b>Redirection Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__REDIRECTION_TIME = PROCESS_NODE__REDIRECTION_TIME;

	/**
	 * The feature id for the '<em><b>Create topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__CREATE_TOPIC = PROCESS_NODE__CREATE_TOPIC;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__SIZE = PROCESS_NODE__SIZE;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__COMPONENT = PROCESS_NODE__COMPONENT;

	/**
	 * The feature id for the '<em><b>Broker Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__BROKER_TYPE = PROCESS_NODE__BROKER_TYPE;

	/**
	 * The feature id for the '<em><b>Cloud Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__CLOUD_TYPE = PROCESS_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cloud Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE_FEATURE_COUNT = PROCESS_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.AdditionalConfigurationImpl <em>Additional Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.AdditionalConfigurationImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getAdditionalConfiguration()
	 * @generated
	 */
	int ADDITIONAL_CONFIGURATION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_CONFIGURATION__ID = 0;

	/**
	 * The number of structural features of the '<em>Additional Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.CoordinatesImpl <em>Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.CoordinatesImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getCoordinates()
	 * @generated
	 */
	int COORDINATES = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__LATITUDE = 1;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__LONGITUDE = 2;

	/**
	 * The number of structural features of the '<em>Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.DataImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getData()
	 * @generated
	 */
	int DATA = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Datasource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATASOURCE = 3;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.TopicImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__DATA = 1;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.ComponentImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.DataBaseImpl <em>Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.DataBaseImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getDataBase()
	 * @generated
	 */
	int DATA_BASE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Data Base Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__DATA_BASE_PROVIDER = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.ProcessEngineImpl <em>Process Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.ProcessEngineImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getProcessEngine()
	 * @generated
	 */
	int PROCESS_ENGINE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ENGINE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ENGINE__ID = COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Process Engine Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ENGINE__PROCESS_ENGINE_PROVIDER = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ENGINE__RULE = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ENGINE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.SPImpl <em>SP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.SPImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getSP()
	 * @generated
	 */
	int SP = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP__NAME = PROCESS_ENGINE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP__ID = PROCESS_ENGINE__ID;

	/**
	 * The feature id for the '<em><b>Process Engine Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP__PROCESS_ENGINE_PROVIDER = PROCESS_ENGINE__PROCESS_ENGINE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP__RULE = PROCESS_ENGINE__RULE;

	/**
	 * The number of structural features of the '<em>SP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SP_FEATURE_COUNT = PROCESS_ENGINE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.CEPImpl <em>CEP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.CEPImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getCEP()
	 * @generated
	 */
	int CEP = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP__NAME = PROCESS_ENGINE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP__ID = PROCESS_ENGINE__ID;

	/**
	 * The feature id for the '<em><b>Process Engine Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP__PROCESS_ENGINE_PROVIDER = PROCESS_ENGINE__PROCESS_ENGINE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP__RULE = PROCESS_ENGINE__RULE;

	/**
	 * The number of structural features of the '<em>CEP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CEP_FEATURE_COUNT = PROCESS_ENGINE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.NoSQLImpl <em>No SQL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.NoSQLImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getNoSQL()
	 * @generated
	 */
	int NO_SQL = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL__NAME = DATA_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL__ID = DATA_BASE__ID;

	/**
	 * The feature id for the '<em><b>Data Base Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL__DATA_BASE_PROVIDER = DATA_BASE__DATA_BASE_PROVIDER;

	/**
	 * The number of structural features of the '<em>No SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_FEATURE_COUNT = DATA_BASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.RuleImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 18;

	/**
	 * The feature id for the '<em><b>Apply to</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__APPLY_TO = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ID = 1;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__EVENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RULE = 3;

	/**
	 * The feature id for the '<em><b>Generates notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__GENERATES_NOTIFICATION = 4;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.NotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.NotificationImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__ROUTE = 2;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.EmailNotificationImpl <em>Email Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.EmailNotificationImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getEmailNotification()
	 * @generated
	 */
	int EMAIL_NOTIFICATION = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_NOTIFICATION__NAME = NOTIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_NOTIFICATION__MESSAGE = NOTIFICATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_NOTIFICATION__ROUTE = NOTIFICATION__ROUTE;

	/**
	 * The feature id for the '<em><b>Destiny Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_NOTIFICATION__DESTINY_NOTIFICATION = NOTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_NOTIFICATION__USERNAME = NOTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>SMT Pserver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_NOTIFICATION__SMT_PSERVER = NOTIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_NOTIFICATION__PASSWORD = NOTIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Email Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_NOTIFICATION_FEATURE_COUNT = NOTIFICATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.TopicNotificationImpl <em>Topic Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.TopicNotificationImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getTopicNotification()
	 * @generated
	 */
	int TOPIC_NOTIFICATION = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_NOTIFICATION__NAME = NOTIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_NOTIFICATION__MESSAGE = NOTIFICATION__MESSAGE;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_NOTIFICATION__ROUTE = NOTIFICATION__ROUTE;

	/**
	 * The feature id for the '<em><b>Publish on topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_NOTIFICATION__PUBLISH_ON_TOPIC = NOTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Topic Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_NOTIFICATION_FEATURE_COUNT = NOTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.RedirectionConfigurationImpl <em>Redirection Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.RedirectionConfigurationImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getRedirectionConfiguration()
	 * @generated
	 */
	int REDIRECTION_CONFIGURATION = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECTION_CONFIGURATION__ID = ADDITIONAL_CONFIGURATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECTION_CONFIGURATION__NAME = ADDITIONAL_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Route processnode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECTION_CONFIGURATION__ROUTE_PROCESSNODE = ADDITIONAL_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECTION_CONFIGURATION__TOPIC = ADDITIONAL_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Redirection Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDIRECTION_CONFIGURATION_FEATURE_COUNT = ADDITIONAL_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.DataSourceImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__ID = 0;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.LoadFromFileImpl <em>Load From File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.LoadFromFileImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getLoadFromFile()
	 * @generated
	 */
	int LOAD_FROM_FILE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_FROM_FILE__ID = DATA_SOURCE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_FROM_FILE__FILE_NAME = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Load From File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_FROM_FILE_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.DataGenerationImpl <em>Data Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.DataGenerationImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getDataGeneration()
	 * @generated
	 */
	int DATA_GENERATION = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GENERATION__ID = DATA_SOURCE__ID;

	/**
	 * The feature id for the '<em><b>Generation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GENERATION__GENERATION_NAME = DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generation Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GENERATION__GENERATION_RANGE = DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_GENERATION_FEATURE_COUNT = DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.GenerationRangeImpl <em>Generation Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.GenerationRangeImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getGenerationRange()
	 * @generated
	 */
	int GENERATION_RANGE = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_RANGE__ID = 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_RANGE__LOWER = 1;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_RANGE__UPPER = 2;

	/**
	 * The number of structural features of the '<em>Generation Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_RANGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.AleatoryImpl <em>Aleatory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.AleatoryImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getAleatory()
	 * @generated
	 */
	int ALEATORY = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALEATORY__ID = DATA_GENERATION__ID;

	/**
	 * The feature id for the '<em><b>Generation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALEATORY__GENERATION_NAME = DATA_GENERATION__GENERATION_NAME;

	/**
	 * The feature id for the '<em><b>Generation Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALEATORY__GENERATION_RANGE = DATA_GENERATION__GENERATION_RANGE;

	/**
	 * The number of structural features of the '<em>Aleatory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALEATORY_FEATURE_COUNT = DATA_GENERATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.CSVloadImpl <em>CS Vload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.CSVloadImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getCSVload()
	 * @generated
	 */
	int CS_VLOAD = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_VLOAD__ID = LOAD_FROM_FILE__ID;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_VLOAD__FILE_NAME = LOAD_FROM_FILE__FILE_NAME;

	/**
	 * The number of structural features of the '<em>CS Vload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_VLOAD_FEATURE_COUNT = LOAD_FROM_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.HIL_NodeImpl <em>HIL Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.HIL_NodeImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getHIL_Node()
	 * @generated
	 */
	int HIL_NODE = 29;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIL_NODE__IP = 0;

	/**
	 * The number of structural features of the '<em>HIL Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIL_NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.ArduinoImpl <em>Arduino</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.ArduinoImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getArduino()
	 * @generated
	 */
	int ARDUINO = 30;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__IP = HIL_NODE__IP;

	/**
	 * The feature id for the '<em><b>Arduino Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__ARDUINO_MODEL = HIL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arduinoconfiguration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO__ARDUINOCONFIGURATION = HIL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arduino</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_FEATURE_COUNT = HIL_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.RaspberryImpl <em>Raspberry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.RaspberryImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getRaspberry()
	 * @generated
	 */
	int RASPBERRY = 31;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASPBERRY__IP = HIL_NODE__IP;

	/**
	 * The number of structural features of the '<em>Raspberry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASPBERRY_FEATURE_COUNT = HIL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.UserDeviceImpl <em>User Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.UserDeviceImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getUserDevice()
	 * @generated
	 */
	int USER_DEVICE = 32;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEVICE__IP = HIL_NODE__IP;

	/**
	 * The number of structural features of the '<em>User Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DEVICE_FEATURE_COUNT = HIL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.ArduinoConfigurationImpl <em>Arduino Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.ArduinoConfigurationImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getArduinoConfiguration()
	 * @generated
	 */
	int ARDUINO_CONFIGURATION = 33;

	/**
	 * The feature id for the '<em><b>Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_CONFIGURATION__DEVICE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_CONFIGURATION__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_CONFIGURATION__INPUT = 2;

	/**
	 * The number of structural features of the '<em>Arduino Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link iOTMetaModel.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.impl.InputImpl
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 34;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INPUT = 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link iOTMetaModel.Size <em>Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.Size
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 35;

	/**
	 * The meta object id for the '{@link iOTMetaModel.BrokerType <em>Broker Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.BrokerType
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getBrokerType()
	 * @generated
	 */
	int BROKER_TYPE = 36;

	/**
	 * The meta object id for the '{@link iOTMetaModel.CloudType <em>Cloud Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.CloudType
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getCloudType()
	 * @generated
	 */
	int CLOUD_TYPE = 37;

	/**
	 * The meta object id for the '{@link iOTMetaModel.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.DataType
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 38;

	/**
	 * The meta object id for the '{@link iOTMetaModel.DataBaseProvider <em>Data Base Provider</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.DataBaseProvider
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getDataBaseProvider()
	 * @generated
	 */
	int DATA_BASE_PROVIDER = 39;

	/**
	 * The meta object id for the '{@link iOTMetaModel.ProcessEngineProvider <em>Process Engine Provider</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.ProcessEngineProvider
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getProcessEngineProvider()
	 * @generated
	 */
	int PROCESS_ENGINE_PROVIDER = 40;

	/**
	 * The meta object id for the '{@link iOTMetaModel.ArduinoModel <em>Arduino Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.ArduinoModel
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getArduinoModel()
	 * @generated
	 */
	int ARDUINO_MODEL = 41;

	/**
	 * The meta object id for the '{@link iOTMetaModel.ArduinoDeviceType <em>Arduino Device Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iOTMetaModel.ArduinoDeviceType
	 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getArduinoDeviceType()
	 * @generated
	 */
	int ARDUINO_DEVICE_TYPE = 42;


	/**
	 * Returns the meta object for class '{@link iOTMetaModel.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see iOTMetaModel.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Environment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iOTMetaModel.Environment#getName()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Name();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Environment#getSimulationSpeed <em>Simulation Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Speed</em>'.
	 * @see iOTMetaModel.Environment#getSimulationSpeed()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_SimulationSpeed();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Environment#getNumberOfMessages <em>Number Of Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Messages</em>'.
	 * @see iOTMetaModel.Environment#getNumberOfMessages()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_NumberOfMessages();

	/**
	 * Returns the meta object for the containment reference list '{@link iOTMetaModel.Environment#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see iOTMetaModel.Environment#getNode()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link iOTMetaModel.Environment#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see iOTMetaModel.Environment#getData()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_Data();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see iOTMetaModel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iOTMetaModel.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Node#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iOTMetaModel.Node#getId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Id();

	/**
	 * Returns the meta object for the containment reference '{@link iOTMetaModel.Node#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordinates</em>'.
	 * @see iOTMetaModel.Node#getCoordinates()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Coordinates();

	/**
	 * Returns the meta object for the reference list '{@link iOTMetaModel.Node#getSuscribe_on_topic <em>Suscribe on topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Suscribe on topic</em>'.
	 * @see iOTMetaModel.Node#getSuscribe_on_topic()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Suscribe_on_topic();

	/**
	 * Returns the meta object for the reference list '{@link iOTMetaModel.Node#getPublish_on_topic <em>Publish on topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Publish on topic</em>'.
	 * @see iOTMetaModel.Node#getPublish_on_topic()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Publish_on_topic();

	/**
	 * Returns the meta object for the containment reference '{@link iOTMetaModel.Node#getHil_node_configuration <em>Hil node configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hil node configuration</em>'.
	 * @see iOTMetaModel.Node#getHil_node_configuration()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Hil_node_configuration();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.EdgeNode <em>Edge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Node</em>'.
	 * @see iOTMetaModel.EdgeNode
	 * @generated
	 */
	EClass getEdgeNode();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.EdgeNode#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see iOTMetaModel.EdgeNode#getQuantity()
	 * @see #getEdgeNode()
	 * @generated
	 */
	EAttribute getEdgeNode_Quantity();

	/**
	 * Returns the meta object for the containment reference '{@link iOTMetaModel.EdgeNode#getAdditionalconfiguration <em>Additionalconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additionalconfiguration</em>'.
	 * @see iOTMetaModel.EdgeNode#getAdditionalconfiguration()
	 * @see #getEdgeNode()
	 * @generated
	 */
	EReference getEdgeNode_Additionalconfiguration();

	/**
	 * Returns the meta object for the reference '{@link iOTMetaModel.EdgeNode#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see iOTMetaModel.EdgeNode#getData()
	 * @see #getEdgeNode()
	 * @generated
	 */
	EReference getEdgeNode_Data();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.ProcessNode <em>Process Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Node</em>'.
	 * @see iOTMetaModel.ProcessNode
	 * @generated
	 */
	EClass getProcessNode();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.ProcessNode#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see iOTMetaModel.ProcessNode#getSize()
	 * @see #getProcessNode()
	 * @generated
	 */
	EAttribute getProcessNode_Size();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.ProcessNode#getRedirectionTime <em>Redirection Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redirection Time</em>'.
	 * @see iOTMetaModel.ProcessNode#getRedirectionTime()
	 * @see #getProcessNode()
	 * @generated
	 */
	EAttribute getProcessNode_RedirectionTime();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.ProcessNode#getBrokerType <em>Broker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Broker Type</em>'.
	 * @see iOTMetaModel.ProcessNode#getBrokerType()
	 * @see #getProcessNode()
	 * @generated
	 */
	EAttribute getProcessNode_BrokerType();

	/**
	 * Returns the meta object for the reference list '{@link iOTMetaModel.ProcessNode#getEdge_node <em>Edge node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Edge node</em>'.
	 * @see iOTMetaModel.ProcessNode#getEdge_node()
	 * @see #getProcessNode()
	 * @generated
	 */
	EReference getProcessNode_Edge_node();

	/**
	 * Returns the meta object for the reference list '{@link iOTMetaModel.ProcessNode#getRedirect <em>Redirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redirect</em>'.
	 * @see iOTMetaModel.ProcessNode#getRedirect()
	 * @see #getProcessNode()
	 * @generated
	 */
	EReference getProcessNode_Redirect();

	/**
	 * Returns the meta object for the containment reference list '{@link iOTMetaModel.ProcessNode#getCreate_topic <em>Create topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create topic</em>'.
	 * @see iOTMetaModel.ProcessNode#getCreate_topic()
	 * @see #getProcessNode()
	 * @generated
	 */
	EReference getProcessNode_Create_topic();

	/**
	 * Returns the meta object for the containment reference list '{@link iOTMetaModel.ProcessNode#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see iOTMetaModel.ProcessNode#getComponent()
	 * @see #getProcessNode()
	 * @generated
	 */
	EReference getProcessNode_Component();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see iOTMetaModel.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Sensor#getGeneration_speed <em>Generation speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation speed</em>'.
	 * @see iOTMetaModel.Sensor#getGeneration_speed()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Generation_speed();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see iOTMetaModel.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.FogNode <em>Fog Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fog Node</em>'.
	 * @see iOTMetaModel.FogNode
	 * @generated
	 */
	EClass getFogNode();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.CloudNode <em>Cloud Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Node</em>'.
	 * @see iOTMetaModel.CloudNode
	 * @generated
	 */
	EClass getCloudNode();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.CloudNode#getCloudType <em>Cloud Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Type</em>'.
	 * @see iOTMetaModel.CloudNode#getCloudType()
	 * @see #getCloudNode()
	 * @generated
	 */
	EAttribute getCloudNode_CloudType();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.AdditionalConfiguration <em>Additional Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Configuration</em>'.
	 * @see iOTMetaModel.AdditionalConfiguration
	 * @generated
	 */
	EClass getAdditionalConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.AdditionalConfiguration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iOTMetaModel.AdditionalConfiguration#getId()
	 * @see #getAdditionalConfiguration()
	 * @generated
	 */
	EAttribute getAdditionalConfiguration_Id();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.Coordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates</em>'.
	 * @see iOTMetaModel.Coordinates
	 * @generated
	 */
	EClass getCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Coordinates#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iOTMetaModel.Coordinates#getName()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Name();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Coordinates#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see iOTMetaModel.Coordinates#getLatitude()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Coordinates#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see iOTMetaModel.Coordinates#getLongitude()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Longitude();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see iOTMetaModel.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iOTMetaModel.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Data#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iOTMetaModel.Data#getId()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Id();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Data#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see iOTMetaModel.Data#getDataType()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_DataType();

	/**
	 * Returns the meta object for the containment reference '{@link iOTMetaModel.Data#getDatasource <em>Datasource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datasource</em>'.
	 * @see iOTMetaModel.Data#getDatasource()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Datasource();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see iOTMetaModel.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Topic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iOTMetaModel.Topic#getName()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_Name();

	/**
	 * Returns the meta object for the reference '{@link iOTMetaModel.Topic#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see iOTMetaModel.Topic#getData()
	 * @see #getTopic()
	 * @generated
	 */
	EReference getTopic_Data();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see iOTMetaModel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iOTMetaModel.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Component#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iOTMetaModel.Component#getId()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Id();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Base</em>'.
	 * @see iOTMetaModel.DataBase
	 * @generated
	 */
	EClass getDataBase();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.DataBase#getDataBaseProvider <em>Data Base Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Base Provider</em>'.
	 * @see iOTMetaModel.DataBase#getDataBaseProvider()
	 * @see #getDataBase()
	 * @generated
	 */
	EAttribute getDataBase_DataBaseProvider();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.ProcessEngine <em>Process Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Engine</em>'.
	 * @see iOTMetaModel.ProcessEngine
	 * @generated
	 */
	EClass getProcessEngine();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.ProcessEngine#getProcessEngineProvider <em>Process Engine Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Engine Provider</em>'.
	 * @see iOTMetaModel.ProcessEngine#getProcessEngineProvider()
	 * @see #getProcessEngine()
	 * @generated
	 */
	EAttribute getProcessEngine_ProcessEngineProvider();

	/**
	 * Returns the meta object for the containment reference list '{@link iOTMetaModel.ProcessEngine#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see iOTMetaModel.ProcessEngine#getRule()
	 * @see #getProcessEngine()
	 * @generated
	 */
	EReference getProcessEngine_Rule();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.SP <em>SP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SP</em>'.
	 * @see iOTMetaModel.SP
	 * @generated
	 */
	EClass getSP();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.CEP <em>CEP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CEP</em>'.
	 * @see iOTMetaModel.CEP
	 * @generated
	 */
	EClass getCEP();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.NoSQL <em>No SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No SQL</em>'.
	 * @see iOTMetaModel.NoSQL
	 * @generated
	 */
	EClass getNoSQL();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see iOTMetaModel.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the reference '{@link iOTMetaModel.Rule#getApply_to <em>Apply to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Apply to</em>'.
	 * @see iOTMetaModel.Rule#getApply_to()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Apply_to();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Rule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iOTMetaModel.Rule#getId()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Id();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Rule#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see iOTMetaModel.Rule#getEventType()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_EventType();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Rule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule</em>'.
	 * @see iOTMetaModel.Rule#getRule()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link iOTMetaModel.Rule#getGenerates_notification <em>Generates notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generates notification</em>'.
	 * @see iOTMetaModel.Rule#getGenerates_notification()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Generates_notification();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see iOTMetaModel.Notification
	 * @generated
	 */
	EClass getNotification();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Notification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iOTMetaModel.Notification#getName()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_Name();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Notification#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see iOTMetaModel.Notification#getMessage()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_Message();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Notification#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route</em>'.
	 * @see iOTMetaModel.Notification#getRoute()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_Route();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.EmailNotification <em>Email Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Notification</em>'.
	 * @see iOTMetaModel.EmailNotification
	 * @generated
	 */
	EClass getEmailNotification();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.EmailNotification#getDestinyNotification <em>Destiny Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destiny Notification</em>'.
	 * @see iOTMetaModel.EmailNotification#getDestinyNotification()
	 * @see #getEmailNotification()
	 * @generated
	 */
	EAttribute getEmailNotification_DestinyNotification();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.EmailNotification#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see iOTMetaModel.EmailNotification#getUsername()
	 * @see #getEmailNotification()
	 * @generated
	 */
	EAttribute getEmailNotification_Username();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.EmailNotification#getSMTPserver <em>SMT Pserver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SMT Pserver</em>'.
	 * @see iOTMetaModel.EmailNotification#getSMTPserver()
	 * @see #getEmailNotification()
	 * @generated
	 */
	EAttribute getEmailNotification_SMTPserver();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.EmailNotification#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see iOTMetaModel.EmailNotification#getPassword()
	 * @see #getEmailNotification()
	 * @generated
	 */
	EAttribute getEmailNotification_Password();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.TopicNotification <em>Topic Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic Notification</em>'.
	 * @see iOTMetaModel.TopicNotification
	 * @generated
	 */
	EClass getTopicNotification();

	/**
	 * Returns the meta object for the reference list '{@link iOTMetaModel.TopicNotification#getPublish_on_topic <em>Publish on topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Publish on topic</em>'.
	 * @see iOTMetaModel.TopicNotification#getPublish_on_topic()
	 * @see #getTopicNotification()
	 * @generated
	 */
	EReference getTopicNotification_Publish_on_topic();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.RedirectionConfiguration <em>Redirection Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redirection Configuration</em>'.
	 * @see iOTMetaModel.RedirectionConfiguration
	 * @generated
	 */
	EClass getRedirectionConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.RedirectionConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iOTMetaModel.RedirectionConfiguration#getName()
	 * @see #getRedirectionConfiguration()
	 * @generated
	 */
	EAttribute getRedirectionConfiguration_Name();

	/**
	 * Returns the meta object for the reference list '{@link iOTMetaModel.RedirectionConfiguration#getRoute_processnode <em>Route processnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Route processnode</em>'.
	 * @see iOTMetaModel.RedirectionConfiguration#getRoute_processnode()
	 * @see #getRedirectionConfiguration()
	 * @generated
	 */
	EReference getRedirectionConfiguration_Route_processnode();

	/**
	 * Returns the meta object for the reference '{@link iOTMetaModel.RedirectionConfiguration#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Topic</em>'.
	 * @see iOTMetaModel.RedirectionConfiguration#getTopic()
	 * @see #getRedirectionConfiguration()
	 * @generated
	 */
	EReference getRedirectionConfiguration_Topic();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see iOTMetaModel.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.DataSource#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iOTMetaModel.DataSource#getId()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Id();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.LoadFromFile <em>Load From File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load From File</em>'.
	 * @see iOTMetaModel.LoadFromFile
	 * @generated
	 */
	EClass getLoadFromFile();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.LoadFromFile#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see iOTMetaModel.LoadFromFile#getFileName()
	 * @see #getLoadFromFile()
	 * @generated
	 */
	EAttribute getLoadFromFile_FileName();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.DataGeneration <em>Data Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Generation</em>'.
	 * @see iOTMetaModel.DataGeneration
	 * @generated
	 */
	EClass getDataGeneration();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.DataGeneration#getGenerationName <em>Generation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generation Name</em>'.
	 * @see iOTMetaModel.DataGeneration#getGenerationName()
	 * @see #getDataGeneration()
	 * @generated
	 */
	EAttribute getDataGeneration_GenerationName();

	/**
	 * Returns the meta object for the containment reference '{@link iOTMetaModel.DataGeneration#getGenerationRange <em>Generation Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generation Range</em>'.
	 * @see iOTMetaModel.DataGeneration#getGenerationRange()
	 * @see #getDataGeneration()
	 * @generated
	 */
	EReference getDataGeneration_GenerationRange();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.GenerationRange <em>Generation Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation Range</em>'.
	 * @see iOTMetaModel.GenerationRange
	 * @generated
	 */
	EClass getGenerationRange();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.GenerationRange#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iOTMetaModel.GenerationRange#getId()
	 * @see #getGenerationRange()
	 * @generated
	 */
	EAttribute getGenerationRange_Id();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.GenerationRange#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see iOTMetaModel.GenerationRange#getLower()
	 * @see #getGenerationRange()
	 * @generated
	 */
	EAttribute getGenerationRange_Lower();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.GenerationRange#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see iOTMetaModel.GenerationRange#getUpper()
	 * @see #getGenerationRange()
	 * @generated
	 */
	EAttribute getGenerationRange_Upper();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.Aleatory <em>Aleatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aleatory</em>'.
	 * @see iOTMetaModel.Aleatory
	 * @generated
	 */
	EClass getAleatory();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.CSVload <em>CS Vload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CS Vload</em>'.
	 * @see iOTMetaModel.CSVload
	 * @generated
	 */
	EClass getCSVload();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.HIL_Node <em>HIL Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HIL Node</em>'.
	 * @see iOTMetaModel.HIL_Node
	 * @generated
	 */
	EClass getHIL_Node();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.HIL_Node#getIP <em>IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP</em>'.
	 * @see iOTMetaModel.HIL_Node#getIP()
	 * @see #getHIL_Node()
	 * @generated
	 */
	EAttribute getHIL_Node_IP();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.Arduino <em>Arduino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino</em>'.
	 * @see iOTMetaModel.Arduino
	 * @generated
	 */
	EClass getArduino();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Arduino#getArduinoModel <em>Arduino Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arduino Model</em>'.
	 * @see iOTMetaModel.Arduino#getArduinoModel()
	 * @see #getArduino()
	 * @generated
	 */
	EAttribute getArduino_ArduinoModel();

	/**
	 * Returns the meta object for the containment reference list '{@link iOTMetaModel.Arduino#getArduinoconfiguration <em>Arduinoconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arduinoconfiguration</em>'.
	 * @see iOTMetaModel.Arduino#getArduinoconfiguration()
	 * @see #getArduino()
	 * @generated
	 */
	EReference getArduino_Arduinoconfiguration();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.Raspberry <em>Raspberry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raspberry</em>'.
	 * @see iOTMetaModel.Raspberry
	 * @generated
	 */
	EClass getRaspberry();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.UserDevice <em>User Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Device</em>'.
	 * @see iOTMetaModel.UserDevice
	 * @generated
	 */
	EClass getUserDevice();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.ArduinoConfiguration <em>Arduino Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Configuration</em>'.
	 * @see iOTMetaModel.ArduinoConfiguration
	 * @generated
	 */
	EClass getArduinoConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.ArduinoConfiguration#getDeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Type</em>'.
	 * @see iOTMetaModel.ArduinoConfiguration#getDeviceType()
	 * @see #getArduinoConfiguration()
	 * @generated
	 */
	EAttribute getArduinoConfiguration_DeviceType();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.ArduinoConfiguration#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see iOTMetaModel.ArduinoConfiguration#getOutput()
	 * @see #getArduinoConfiguration()
	 * @generated
	 */
	EAttribute getArduinoConfiguration_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link iOTMetaModel.ArduinoConfiguration#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see iOTMetaModel.ArduinoConfiguration#getInput()
	 * @see #getArduinoConfiguration()
	 * @generated
	 */
	EReference getArduinoConfiguration_Input();

	/**
	 * Returns the meta object for class '{@link iOTMetaModel.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see iOTMetaModel.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link iOTMetaModel.Input#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see iOTMetaModel.Input#getInput()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Input();

	/**
	 * Returns the meta object for enum '{@link iOTMetaModel.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size</em>'.
	 * @see iOTMetaModel.Size
	 * @generated
	 */
	EEnum getSize();

	/**
	 * Returns the meta object for enum '{@link iOTMetaModel.BrokerType <em>Broker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Broker Type</em>'.
	 * @see iOTMetaModel.BrokerType
	 * @generated
	 */
	EEnum getBrokerType();

	/**
	 * Returns the meta object for enum '{@link iOTMetaModel.CloudType <em>Cloud Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cloud Type</em>'.
	 * @see iOTMetaModel.CloudType
	 * @generated
	 */
	EEnum getCloudType();

	/**
	 * Returns the meta object for enum '{@link iOTMetaModel.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see iOTMetaModel.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link iOTMetaModel.DataBaseProvider <em>Data Base Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Base Provider</em>'.
	 * @see iOTMetaModel.DataBaseProvider
	 * @generated
	 */
	EEnum getDataBaseProvider();

	/**
	 * Returns the meta object for enum '{@link iOTMetaModel.ProcessEngineProvider <em>Process Engine Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Engine Provider</em>'.
	 * @see iOTMetaModel.ProcessEngineProvider
	 * @generated
	 */
	EEnum getProcessEngineProvider();

	/**
	 * Returns the meta object for enum '{@link iOTMetaModel.ArduinoModel <em>Arduino Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arduino Model</em>'.
	 * @see iOTMetaModel.ArduinoModel
	 * @generated
	 */
	EEnum getArduinoModel();

	/**
	 * Returns the meta object for enum '{@link iOTMetaModel.ArduinoDeviceType <em>Arduino Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arduino Device Type</em>'.
	 * @see iOTMetaModel.ArduinoDeviceType
	 * @generated
	 */
	EEnum getArduinoDeviceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IOTMetaModelFactory getIOTMetaModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.EnvironmentImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__NAME = eINSTANCE.getEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Simulation Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__SIMULATION_SPEED = eINSTANCE.getEnvironment_SimulationSpeed();

		/**
		 * The meta object literal for the '<em><b>Number Of Messages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__NUMBER_OF_MESSAGES = eINSTANCE.getEnvironment_NumberOfMessages();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__NODE = eINSTANCE.getEnvironment_Node();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__DATA = eINSTANCE.getEnvironment_Data();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.NodeImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ID = eINSTANCE.getNode_Id();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__COORDINATES = eINSTANCE.getNode_Coordinates();

		/**
		 * The meta object literal for the '<em><b>Suscribe on topic</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SUSCRIBE_ON_TOPIC = eINSTANCE.getNode_Suscribe_on_topic();

		/**
		 * The meta object literal for the '<em><b>Publish on topic</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PUBLISH_ON_TOPIC = eINSTANCE.getNode_Publish_on_topic();

		/**
		 * The meta object literal for the '<em><b>Hil node configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__HIL_NODE_CONFIGURATION = eINSTANCE.getNode_Hil_node_configuration();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.EdgeNodeImpl <em>Edge Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.EdgeNodeImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getEdgeNode()
		 * @generated
		 */
		EClass EDGE_NODE = eINSTANCE.getEdgeNode();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_NODE__QUANTITY = eINSTANCE.getEdgeNode_Quantity();

		/**
		 * The meta object literal for the '<em><b>Additionalconfiguration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_NODE__ADDITIONALCONFIGURATION = eINSTANCE.getEdgeNode_Additionalconfiguration();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_NODE__DATA = eINSTANCE.getEdgeNode_Data();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.ProcessNodeImpl <em>Process Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.ProcessNodeImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getProcessNode()
		 * @generated
		 */
		EClass PROCESS_NODE = eINSTANCE.getProcessNode();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_NODE__SIZE = eINSTANCE.getProcessNode_Size();

		/**
		 * The meta object literal for the '<em><b>Redirection Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_NODE__REDIRECTION_TIME = eINSTANCE.getProcessNode_RedirectionTime();

		/**
		 * The meta object literal for the '<em><b>Broker Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_NODE__BROKER_TYPE = eINSTANCE.getProcessNode_BrokerType();

		/**
		 * The meta object literal for the '<em><b>Edge node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_NODE__EDGE_NODE = eINSTANCE.getProcessNode_Edge_node();

		/**
		 * The meta object literal for the '<em><b>Redirect</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_NODE__REDIRECT = eINSTANCE.getProcessNode_Redirect();

		/**
		 * The meta object literal for the '<em><b>Create topic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_NODE__CREATE_TOPIC = eINSTANCE.getProcessNode_Create_topic();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_NODE__COMPONENT = eINSTANCE.getProcessNode_Component();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.SensorImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Generation speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__GENERATION_SPEED = eINSTANCE.getSensor_Generation_speed();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.ActuatorImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.FogNodeImpl <em>Fog Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.FogNodeImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getFogNode()
		 * @generated
		 */
		EClass FOG_NODE = eINSTANCE.getFogNode();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.CloudNodeImpl <em>Cloud Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.CloudNodeImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getCloudNode()
		 * @generated
		 */
		EClass CLOUD_NODE = eINSTANCE.getCloudNode();

		/**
		 * The meta object literal for the '<em><b>Cloud Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_NODE__CLOUD_TYPE = eINSTANCE.getCloudNode_CloudType();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.AdditionalConfigurationImpl <em>Additional Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.AdditionalConfigurationImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getAdditionalConfiguration()
		 * @generated
		 */
		EClass ADDITIONAL_CONFIGURATION = eINSTANCE.getAdditionalConfiguration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_CONFIGURATION__ID = eINSTANCE.getAdditionalConfiguration_Id();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.CoordinatesImpl <em>Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.CoordinatesImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getCoordinates()
		 * @generated
		 */
		EClass COORDINATES = eINSTANCE.getCoordinates();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__NAME = eINSTANCE.getCoordinates_Name();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__LATITUDE = eINSTANCE.getCoordinates_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__LONGITUDE = eINSTANCE.getCoordinates_Longitude();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.DataImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__ID = eINSTANCE.getData_Id();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__DATA_TYPE = eINSTANCE.getData_DataType();

		/**
		 * The meta object literal for the '<em><b>Datasource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__DATASOURCE = eINSTANCE.getData_Datasource();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.TopicImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__NAME = eINSTANCE.getTopic_Name();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC__DATA = eINSTANCE.getTopic_Data();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.ComponentImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ID = eINSTANCE.getComponent_Id();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.DataBaseImpl <em>Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.DataBaseImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getDataBase()
		 * @generated
		 */
		EClass DATA_BASE = eINSTANCE.getDataBase();

		/**
		 * The meta object literal for the '<em><b>Data Base Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_BASE__DATA_BASE_PROVIDER = eINSTANCE.getDataBase_DataBaseProvider();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.ProcessEngineImpl <em>Process Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.ProcessEngineImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getProcessEngine()
		 * @generated
		 */
		EClass PROCESS_ENGINE = eINSTANCE.getProcessEngine();

		/**
		 * The meta object literal for the '<em><b>Process Engine Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_ENGINE__PROCESS_ENGINE_PROVIDER = eINSTANCE.getProcessEngine_ProcessEngineProvider();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_ENGINE__RULE = eINSTANCE.getProcessEngine_Rule();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.SPImpl <em>SP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.SPImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getSP()
		 * @generated
		 */
		EClass SP = eINSTANCE.getSP();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.CEPImpl <em>CEP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.CEPImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getCEP()
		 * @generated
		 */
		EClass CEP = eINSTANCE.getCEP();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.NoSQLImpl <em>No SQL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.NoSQLImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getNoSQL()
		 * @generated
		 */
		EClass NO_SQL = eINSTANCE.getNoSQL();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.RuleImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Apply to</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__APPLY_TO = eINSTANCE.getRule_Apply_to();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ID = eINSTANCE.getRule_Id();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__EVENT_TYPE = eINSTANCE.getRule_EventType();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__RULE = eINSTANCE.getRule_Rule();

		/**
		 * The meta object literal for the '<em><b>Generates notification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__GENERATES_NOTIFICATION = eINSTANCE.getRule_Generates_notification();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.NotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.NotificationImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getNotification()
		 * @generated
		 */
		EClass NOTIFICATION = eINSTANCE.getNotification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__NAME = eINSTANCE.getNotification_Name();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__MESSAGE = eINSTANCE.getNotification_Message();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__ROUTE = eINSTANCE.getNotification_Route();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.EmailNotificationImpl <em>Email Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.EmailNotificationImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getEmailNotification()
		 * @generated
		 */
		EClass EMAIL_NOTIFICATION = eINSTANCE.getEmailNotification();

		/**
		 * The meta object literal for the '<em><b>Destiny Notification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_NOTIFICATION__DESTINY_NOTIFICATION = eINSTANCE.getEmailNotification_DestinyNotification();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_NOTIFICATION__USERNAME = eINSTANCE.getEmailNotification_Username();

		/**
		 * The meta object literal for the '<em><b>SMT Pserver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_NOTIFICATION__SMT_PSERVER = eINSTANCE.getEmailNotification_SMTPserver();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_NOTIFICATION__PASSWORD = eINSTANCE.getEmailNotification_Password();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.TopicNotificationImpl <em>Topic Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.TopicNotificationImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getTopicNotification()
		 * @generated
		 */
		EClass TOPIC_NOTIFICATION = eINSTANCE.getTopicNotification();

		/**
		 * The meta object literal for the '<em><b>Publish on topic</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPIC_NOTIFICATION__PUBLISH_ON_TOPIC = eINSTANCE.getTopicNotification_Publish_on_topic();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.RedirectionConfigurationImpl <em>Redirection Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.RedirectionConfigurationImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getRedirectionConfiguration()
		 * @generated
		 */
		EClass REDIRECTION_CONFIGURATION = eINSTANCE.getRedirectionConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDIRECTION_CONFIGURATION__NAME = eINSTANCE.getRedirectionConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Route processnode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDIRECTION_CONFIGURATION__ROUTE_PROCESSNODE = eINSTANCE.getRedirectionConfiguration_Route_processnode();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDIRECTION_CONFIGURATION__TOPIC = eINSTANCE.getRedirectionConfiguration_Topic();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.DataSourceImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__ID = eINSTANCE.getDataSource_Id();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.LoadFromFileImpl <em>Load From File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.LoadFromFileImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getLoadFromFile()
		 * @generated
		 */
		EClass LOAD_FROM_FILE = eINSTANCE.getLoadFromFile();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_FROM_FILE__FILE_NAME = eINSTANCE.getLoadFromFile_FileName();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.DataGenerationImpl <em>Data Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.DataGenerationImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getDataGeneration()
		 * @generated
		 */
		EClass DATA_GENERATION = eINSTANCE.getDataGeneration();

		/**
		 * The meta object literal for the '<em><b>Generation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_GENERATION__GENERATION_NAME = eINSTANCE.getDataGeneration_GenerationName();

		/**
		 * The meta object literal for the '<em><b>Generation Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_GENERATION__GENERATION_RANGE = eINSTANCE.getDataGeneration_GenerationRange();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.GenerationRangeImpl <em>Generation Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.GenerationRangeImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getGenerationRange()
		 * @generated
		 */
		EClass GENERATION_RANGE = eINSTANCE.getGenerationRange();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_RANGE__ID = eINSTANCE.getGenerationRange_Id();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_RANGE__LOWER = eINSTANCE.getGenerationRange_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_RANGE__UPPER = eINSTANCE.getGenerationRange_Upper();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.AleatoryImpl <em>Aleatory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.AleatoryImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getAleatory()
		 * @generated
		 */
		EClass ALEATORY = eINSTANCE.getAleatory();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.CSVloadImpl <em>CS Vload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.CSVloadImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getCSVload()
		 * @generated
		 */
		EClass CS_VLOAD = eINSTANCE.getCSVload();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.HIL_NodeImpl <em>HIL Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.HIL_NodeImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getHIL_Node()
		 * @generated
		 */
		EClass HIL_NODE = eINSTANCE.getHIL_Node();

		/**
		 * The meta object literal for the '<em><b>IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIL_NODE__IP = eINSTANCE.getHIL_Node_IP();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.ArduinoImpl <em>Arduino</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.ArduinoImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getArduino()
		 * @generated
		 */
		EClass ARDUINO = eINSTANCE.getArduino();

		/**
		 * The meta object literal for the '<em><b>Arduino Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO__ARDUINO_MODEL = eINSTANCE.getArduino_ArduinoModel();

		/**
		 * The meta object literal for the '<em><b>Arduinoconfiguration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO__ARDUINOCONFIGURATION = eINSTANCE.getArduino_Arduinoconfiguration();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.RaspberryImpl <em>Raspberry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.RaspberryImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getRaspberry()
		 * @generated
		 */
		EClass RASPBERRY = eINSTANCE.getRaspberry();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.UserDeviceImpl <em>User Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.UserDeviceImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getUserDevice()
		 * @generated
		 */
		EClass USER_DEVICE = eINSTANCE.getUserDevice();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.ArduinoConfigurationImpl <em>Arduino Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.ArduinoConfigurationImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getArduinoConfiguration()
		 * @generated
		 */
		EClass ARDUINO_CONFIGURATION = eINSTANCE.getArduinoConfiguration();

		/**
		 * The meta object literal for the '<em><b>Device Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_CONFIGURATION__DEVICE_TYPE = eINSTANCE.getArduinoConfiguration_DeviceType();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_CONFIGURATION__OUTPUT = eINSTANCE.getArduinoConfiguration_Output();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARDUINO_CONFIGURATION__INPUT = eINSTANCE.getArduinoConfiguration_Input();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.impl.InputImpl
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__INPUT = eINSTANCE.getInput_Input();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.Size <em>Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.Size
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getSize()
		 * @generated
		 */
		EEnum SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.BrokerType <em>Broker Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.BrokerType
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getBrokerType()
		 * @generated
		 */
		EEnum BROKER_TYPE = eINSTANCE.getBrokerType();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.CloudType <em>Cloud Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.CloudType
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getCloudType()
		 * @generated
		 */
		EEnum CLOUD_TYPE = eINSTANCE.getCloudType();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.DataType
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.DataBaseProvider <em>Data Base Provider</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.DataBaseProvider
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getDataBaseProvider()
		 * @generated
		 */
		EEnum DATA_BASE_PROVIDER = eINSTANCE.getDataBaseProvider();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.ProcessEngineProvider <em>Process Engine Provider</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.ProcessEngineProvider
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getProcessEngineProvider()
		 * @generated
		 */
		EEnum PROCESS_ENGINE_PROVIDER = eINSTANCE.getProcessEngineProvider();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.ArduinoModel <em>Arduino Model</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.ArduinoModel
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getArduinoModel()
		 * @generated
		 */
		EEnum ARDUINO_MODEL = eINSTANCE.getArduinoModel();

		/**
		 * The meta object literal for the '{@link iOTMetaModel.ArduinoDeviceType <em>Arduino Device Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iOTMetaModel.ArduinoDeviceType
		 * @see iOTMetaModel.impl.IOTMetaModelPackageImpl#getArduinoDeviceType()
		 * @generated
		 */
		EEnum ARDUINO_DEVICE_TYPE = eINSTANCE.getArduinoDeviceType();

	}

} //IOTMetaModelPackage
