/**
 */
package iOTMetaModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iOTMetaModel.IOTMetaModelPackage
 * @generated
 */
public interface IOTMetaModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IOTMetaModelFactory eINSTANCE = iOTMetaModel.impl.IOTMetaModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment</em>'.
	 * @generated
	 */
	Environment createEnvironment();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actuator</em>'.
	 * @generated
	 */
	Actuator createActuator();

	/**
	 * Returns a new object of class '<em>Fog Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fog Node</em>'.
	 * @generated
	 */
	FogNode createFogNode();

	/**
	 * Returns a new object of class '<em>Cloud Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Node</em>'.
	 * @generated
	 */
	CloudNode createCloudNode();

	/**
	 * Returns a new object of class '<em>Additional Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Configuration</em>'.
	 * @generated
	 */
	AdditionalConfiguration createAdditionalConfiguration();

	/**
	 * Returns a new object of class '<em>Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinates</em>'.
	 * @generated
	 */
	Coordinates createCoordinates();

	/**
	 * Returns a new object of class '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data</em>'.
	 * @generated
	 */
	Data createData();

	/**
	 * Returns a new object of class '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic</em>'.
	 * @generated
	 */
	Topic createTopic();

	/**
	 * Returns a new object of class '<em>SP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SP</em>'.
	 * @generated
	 */
	SP createSP();

	/**
	 * Returns a new object of class '<em>CEP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CEP</em>'.
	 * @generated
	 */
	CEP createCEP();

	/**
	 * Returns a new object of class '<em>No SQL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No SQL</em>'.
	 * @generated
	 */
	NoSQL createNoSQL();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Email Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Email Notification</em>'.
	 * @generated
	 */
	EmailNotification createEmailNotification();

	/**
	 * Returns a new object of class '<em>Topic Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic Notification</em>'.
	 * @generated
	 */
	TopicNotification createTopicNotification();

	/**
	 * Returns a new object of class '<em>Redirection Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redirection Configuration</em>'.
	 * @generated
	 */
	RedirectionConfiguration createRedirectionConfiguration();

	/**
	 * Returns a new object of class '<em>Generation Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generation Range</em>'.
	 * @generated
	 */
	GenerationRange createGenerationRange();

	/**
	 * Returns a new object of class '<em>Aleatory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aleatory</em>'.
	 * @generated
	 */
	Aleatory createAleatory();

	/**
	 * Returns a new object of class '<em>CS Vload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CS Vload</em>'.
	 * @generated
	 */
	CSVload createCSVload();

	/**
	 * Returns a new object of class '<em>Arduino</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino</em>'.
	 * @generated
	 */
	Arduino createArduino();

	/**
	 * Returns a new object of class '<em>Raspberry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raspberry</em>'.
	 * @generated
	 */
	Raspberry createRaspberry();

	/**
	 * Returns a new object of class '<em>User Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Device</em>'.
	 * @generated
	 */
	UserDevice createUserDevice();

	/**
	 * Returns a new object of class '<em>Arduino Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Configuration</em>'.
	 * @generated
	 */
	ArduinoConfiguration createArduinoConfiguration();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	Input createInput();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IOTMetaModelPackage getIOTMetaModelPackage();

} //IOTMetaModelFactory
