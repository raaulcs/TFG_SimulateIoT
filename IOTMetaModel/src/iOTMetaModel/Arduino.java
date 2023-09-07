/**
 */
package iOTMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.Arduino#getArduinoModel <em>Arduino Model</em>}</li>
 *   <li>{@link iOTMetaModel.Arduino#getArduinoconfiguration <em>Arduinoconfiguration</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getArduino()
 * @model annotation="gmf.node label='IP' figure='svg' color='226,150,152' svg.uri='platform:/plugin/IOTMetaModel/imagenes/arduino.svg' tool.small.bundle='IOTMetaModel' tool.small.path='imagenes/arduino.png' tool.large.bundle='IOTMetaModel' tool.large.path='imagenes/arduino.png' label.icon='false' label.placement='external'"
 * @generated
 */
public interface Arduino extends HIL_Node {
	/**
	 * Returns the value of the '<em><b>Arduino Model</b></em>' attribute.
	 * The default value is <code>"Yun"</code>.
	 * The literals are from the enumeration {@link iOTMetaModel.ArduinoModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Model</em>' attribute.
	 * @see iOTMetaModel.ArduinoModel
	 * @see #setArduinoModel(ArduinoModel)
	 * @see iOTMetaModel.IOTMetaModelPackage#getArduino_ArduinoModel()
	 * @model default="Yun"
	 * @generated
	 */
	ArduinoModel getArduinoModel();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Arduino#getArduinoModel <em>Arduino Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arduino Model</em>' attribute.
	 * @see iOTMetaModel.ArduinoModel
	 * @see #getArduinoModel()
	 * @generated
	 */
	void setArduinoModel(ArduinoModel value);

	/**
	 * Returns the value of the '<em><b>Arduinoconfiguration</b></em>' containment reference list.
	 * The list contents are of type {@link iOTMetaModel.ArduinoConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduinoconfiguration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduinoconfiguration</em>' containment reference list.
	 * @see iOTMetaModel.IOTMetaModelPackage#getArduino_Arduinoconfiguration()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment collapsible='false'"
	 * @generated
	 */
	EList<ArduinoConfiguration> getArduinoconfiguration();

} // Arduino
