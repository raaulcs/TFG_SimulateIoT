/**
 */
package iOTMetaModel.util;

import iOTMetaModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iOTMetaModel.IOTMetaModelPackage
 * @generated
 */
public class IOTMetaModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IOTMetaModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOTMetaModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IOTMetaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IOTMetaModelSwitch<Adapter> modelSwitch =
		new IOTMetaModelSwitch<Adapter>() {
			@Override
			public Adapter caseEnvironment(Environment object) {
				return createEnvironmentAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseEdgeNode(EdgeNode object) {
				return createEdgeNodeAdapter();
			}
			@Override
			public Adapter caseProcessNode(ProcessNode object) {
				return createProcessNodeAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseActuator(Actuator object) {
				return createActuatorAdapter();
			}
			@Override
			public Adapter caseFogNode(FogNode object) {
				return createFogNodeAdapter();
			}
			@Override
			public Adapter caseCloudNode(CloudNode object) {
				return createCloudNodeAdapter();
			}
			@Override
			public Adapter caseAdditionalConfiguration(AdditionalConfiguration object) {
				return createAdditionalConfigurationAdapter();
			}
			@Override
			public Adapter caseCoordinates(Coordinates object) {
				return createCoordinatesAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseTopic(Topic object) {
				return createTopicAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseDataBase(DataBase object) {
				return createDataBaseAdapter();
			}
			@Override
			public Adapter caseProcessEngine(ProcessEngine object) {
				return createProcessEngineAdapter();
			}
			@Override
			public Adapter caseSP(SP object) {
				return createSPAdapter();
			}
			@Override
			public Adapter caseCEP(CEP object) {
				return createCEPAdapter();
			}
			@Override
			public Adapter caseNoSQL(NoSQL object) {
				return createNoSQLAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseNotification(Notification object) {
				return createNotificationAdapter();
			}
			@Override
			public Adapter caseEmailNotification(EmailNotification object) {
				return createEmailNotificationAdapter();
			}
			@Override
			public Adapter caseTopicNotification(TopicNotification object) {
				return createTopicNotificationAdapter();
			}
			@Override
			public Adapter caseRedirectionConfiguration(RedirectionConfiguration object) {
				return createRedirectionConfigurationAdapter();
			}
			@Override
			public Adapter caseDataSource(DataSource object) {
				return createDataSourceAdapter();
			}
			@Override
			public Adapter caseLoadFromFile(LoadFromFile object) {
				return createLoadFromFileAdapter();
			}
			@Override
			public Adapter caseDataGeneration(DataGeneration object) {
				return createDataGenerationAdapter();
			}
			@Override
			public Adapter caseGenerationRange(GenerationRange object) {
				return createGenerationRangeAdapter();
			}
			@Override
			public Adapter caseAleatory(Aleatory object) {
				return createAleatoryAdapter();
			}
			@Override
			public Adapter caseCSVload(CSVload object) {
				return createCSVloadAdapter();
			}
			@Override
			public Adapter caseHIL_Node(HIL_Node object) {
				return createHIL_NodeAdapter();
			}
			@Override
			public Adapter caseArduino(Arduino object) {
				return createArduinoAdapter();
			}
			@Override
			public Adapter caseRaspberry(Raspberry object) {
				return createRaspberryAdapter();
			}
			@Override
			public Adapter caseUserDevice(UserDevice object) {
				return createUserDeviceAdapter();
			}
			@Override
			public Adapter caseArduinoConfiguration(ArduinoConfiguration object) {
				return createArduinoConfigurationAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.Environment
	 * @generated
	 */
	public Adapter createEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.EdgeNode <em>Edge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.EdgeNode
	 * @generated
	 */
	public Adapter createEdgeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.ProcessNode <em>Process Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.ProcessNode
	 * @generated
	 */
	public Adapter createProcessNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.Actuator
	 * @generated
	 */
	public Adapter createActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.FogNode <em>Fog Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.FogNode
	 * @generated
	 */
	public Adapter createFogNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.CloudNode <em>Cloud Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.CloudNode
	 * @generated
	 */
	public Adapter createCloudNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.AdditionalConfiguration <em>Additional Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.AdditionalConfiguration
	 * @generated
	 */
	public Adapter createAdditionalConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.Coordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.Coordinates
	 * @generated
	 */
	public Adapter createCoordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.Topic
	 * @generated
	 */
	public Adapter createTopicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.DataBase
	 * @generated
	 */
	public Adapter createDataBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.ProcessEngine <em>Process Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.ProcessEngine
	 * @generated
	 */
	public Adapter createProcessEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.SP <em>SP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.SP
	 * @generated
	 */
	public Adapter createSPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.CEP <em>CEP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.CEP
	 * @generated
	 */
	public Adapter createCEPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.NoSQL <em>No SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.NoSQL
	 * @generated
	 */
	public Adapter createNoSQLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.Notification
	 * @generated
	 */
	public Adapter createNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.EmailNotification <em>Email Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.EmailNotification
	 * @generated
	 */
	public Adapter createEmailNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.TopicNotification <em>Topic Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.TopicNotification
	 * @generated
	 */
	public Adapter createTopicNotificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.RedirectionConfiguration <em>Redirection Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.RedirectionConfiguration
	 * @generated
	 */
	public Adapter createRedirectionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.LoadFromFile <em>Load From File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.LoadFromFile
	 * @generated
	 */
	public Adapter createLoadFromFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.DataGeneration <em>Data Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.DataGeneration
	 * @generated
	 */
	public Adapter createDataGenerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.GenerationRange <em>Generation Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.GenerationRange
	 * @generated
	 */
	public Adapter createGenerationRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.Aleatory <em>Aleatory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.Aleatory
	 * @generated
	 */
	public Adapter createAleatoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.CSVload <em>CS Vload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.CSVload
	 * @generated
	 */
	public Adapter createCSVloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.HIL_Node <em>HIL Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.HIL_Node
	 * @generated
	 */
	public Adapter createHIL_NodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.Arduino <em>Arduino</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.Arduino
	 * @generated
	 */
	public Adapter createArduinoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.Raspberry <em>Raspberry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.Raspberry
	 * @generated
	 */
	public Adapter createRaspberryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.UserDevice <em>User Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.UserDevice
	 * @generated
	 */
	public Adapter createUserDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.ArduinoConfiguration <em>Arduino Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.ArduinoConfiguration
	 * @generated
	 */
	public Adapter createArduinoConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iOTMetaModel.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iOTMetaModel.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IOTMetaModelAdapterFactory
