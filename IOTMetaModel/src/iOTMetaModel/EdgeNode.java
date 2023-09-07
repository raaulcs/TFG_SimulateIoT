/**
 */
package iOTMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.EdgeNode#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link iOTMetaModel.EdgeNode#getAdditionalconfiguration <em>Additionalconfiguration</em>}</li>
 *   <li>{@link iOTMetaModel.EdgeNode#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getEdgeNode()
 * @model abstract="true"
 * @generated
 */
public interface EdgeNode extends Node {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(Integer)
	 * @see iOTMetaModel.IOTMetaModelPackage#getEdgeNode_Quantity()
	 * @model default="1"
	 * @generated
	 */
	Integer getQuantity();

	/**
	 * Sets the value of the '{@link iOTMetaModel.EdgeNode#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Integer value);

	/**
	 * Returns the value of the '<em><b>Additionalconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additionalconfiguration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additionalconfiguration</em>' containment reference.
	 * @see #setAdditionalconfiguration(AdditionalConfiguration)
	 * @see iOTMetaModel.IOTMetaModelPackage#getEdgeNode_Additionalconfiguration()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='false'"
	 * @generated
	 */
	AdditionalConfiguration getAdditionalconfiguration();

	/**
	 * Sets the value of the '{@link iOTMetaModel.EdgeNode#getAdditionalconfiguration <em>Additionalconfiguration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additionalconfiguration</em>' containment reference.
	 * @see #getAdditionalconfiguration()
	 * @generated
	 */
	void setAdditionalconfiguration(AdditionalConfiguration value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Data)
	 * @see iOTMetaModel.IOTMetaModelPackage#getEdgeNode_Data()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash' color='51,51,204' width='3'"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link iOTMetaModel.EdgeNode#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

} // EdgeNode
