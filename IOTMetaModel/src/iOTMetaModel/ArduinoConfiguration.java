/**
 */
package iOTMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.ArduinoConfiguration#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link iOTMetaModel.ArduinoConfiguration#getOutput <em>Output</em>}</li>
 *   <li>{@link iOTMetaModel.ArduinoConfiguration#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getArduinoConfiguration()
 * @model annotation="gmf.node label='deviceType' figure='svg' svg.uri='platform:/plugin/IOTMetaModel/imagenes/arduino.svg' tool.small.bundle='IOTMetaModel' tool.small.path='imagenes/arduino.png' tool.large.bundle='IOTMetaModel' tool.large.path='imagenes/arduino.png' label.icon='false' label.placement='external'"
 * @generated
 */
public interface ArduinoConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Type</b></em>' attribute.
	 * The default value is <code>"Thermistor"</code>.
	 * The literals are from the enumeration {@link iOTMetaModel.ArduinoDeviceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Type</em>' attribute.
	 * @see iOTMetaModel.ArduinoDeviceType
	 * @see #setDeviceType(ArduinoDeviceType)
	 * @see iOTMetaModel.IOTMetaModelPackage#getArduinoConfiguration_DeviceType()
	 * @model default="Thermistor"
	 * @generated
	 */
	ArduinoDeviceType getDeviceType();

	/**
	 * Sets the value of the '{@link iOTMetaModel.ArduinoConfiguration#getDeviceType <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Type</em>' attribute.
	 * @see iOTMetaModel.ArduinoDeviceType
	 * @see #getDeviceType()
	 * @generated
	 */
	void setDeviceType(ArduinoDeviceType value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(Integer)
	 * @see iOTMetaModel.IOTMetaModelPackage#getArduinoConfiguration_Output()
	 * @model
	 * @generated
	 */
	Integer getOutput();

	/**
	 * Sets the value of the '{@link iOTMetaModel.ArduinoConfiguration#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Integer value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link iOTMetaModel.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see iOTMetaModel.IOTMetaModelPackage#getArduinoConfiguration_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInput();

} // ArduinoConfiguration
