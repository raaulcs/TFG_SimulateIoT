/**
 */
package iOTMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.CloudNode#getCloudType <em>Cloud Type</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getCloudNode()
 * @model annotation="gmf.node tool.small.bundle='IOTMetaModel' color='191,248,203' tool.small.path='imagenes/cloud.png' tool.large.bundle='IOTMetaModel' tool.large.path='imagenes/cloud.png' label.placement='internal'"
 * @generated
 */
public interface CloudNode extends ProcessNode {
	/**
	 * Returns the value of the '<em><b>Cloud Type</b></em>' attribute.
	 * The default value is <code>"AWS"</code>.
	 * The literals are from the enumeration {@link iOTMetaModel.CloudType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Type</em>' attribute.
	 * @see iOTMetaModel.CloudType
	 * @see #setCloudType(CloudType)
	 * @see iOTMetaModel.IOTMetaModelPackage#getCloudNode_CloudType()
	 * @model default="AWS"
	 * @generated
	 */
	CloudType getCloudType();

	/**
	 * Sets the value of the '{@link iOTMetaModel.CloudNode#getCloudType <em>Cloud Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Type</em>' attribute.
	 * @see iOTMetaModel.CloudType
	 * @see #getCloudType()
	 * @generated
	 */
	void setCloudType(CloudType value);

} // CloudNode
