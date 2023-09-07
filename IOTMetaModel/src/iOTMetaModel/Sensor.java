/**
 */
package iOTMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.Sensor#getGeneration_speed <em>Generation speed</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getSensor()
 * @model annotation="gmf.node color='226,150,152' tool.small.bundle='IOTMetaModel' tool.small.path='imagenes/device.png' tool.large.bundle='IOTMetaModel' tool.large.path='imagenes/device.png' label.placement='internal' label.icon='true'"
 * @generated
 */
public interface Sensor extends EdgeNode {
	/**
	 * Returns the value of the '<em><b>Generation speed</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation speed</em>' attribute.
	 * @see #setGeneration_speed(Float)
	 * @see iOTMetaModel.IOTMetaModelPackage#getSensor_Generation_speed()
	 * @model default="1.0"
	 * @generated
	 */
	Float getGeneration_speed();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Sensor#getGeneration_speed <em>Generation speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation speed</em>' attribute.
	 * @see #getGeneration_speed()
	 * @generated
	 */
	void setGeneration_speed(Float value);

} // Sensor
