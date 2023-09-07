/**
 */
package iOTMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HIL Data configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.HIL_Data_configuration#getMeasurementUnit <em>Measurement Unit</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getHIL_Data_configuration()
 * @model annotation="gmf.node label='id' figure='svg' color='226,150,152' svg.uri='platform:/plugin/IOTMetaModel/imagenes/arduino.svg' tool.small.bundle='IOTMetaModel' tool.small.path='imagenes/arduino.png' tool.large.bundle='IOTMetaModel' tool.large.path='imagenes/arduino.png' label.icon='false' label.placement='external'"
 * @generated
 */
public interface HIL_Data_configuration extends DataSource {
	/**
	 * Returns the value of the '<em><b>Measurement Unit</b></em>' attribute.
	 * The default value is <code>"Celsius"</code>.
	 * The literals are from the enumeration {@link iOTMetaModel.MeasurementUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Unit</em>' attribute.
	 * @see iOTMetaModel.MeasurementUnit
	 * @see #setMeasurementUnit(MeasurementUnit)
	 * @see iOTMetaModel.IOTMetaModelPackage#getHIL_Data_configuration_MeasurementUnit()
	 * @model default="Celsius"
	 * @generated
	 */
	MeasurementUnit getMeasurementUnit();

	/**
	 * Sets the value of the '{@link iOTMetaModel.HIL_Data_configuration#getMeasurementUnit <em>Measurement Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Unit</em>' attribute.
	 * @see iOTMetaModel.MeasurementUnit
	 * @see #getMeasurementUnit()
	 * @generated
	 */
	void setMeasurementUnit(MeasurementUnit value);

} // HIL_Data_configuration
