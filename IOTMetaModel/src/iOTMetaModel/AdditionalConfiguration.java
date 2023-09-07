/**
 */
package iOTMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.AdditionalConfiguration#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getAdditionalConfiguration()
 * @model annotation="gmf.node label='id' figure='svg' svg.uri='platform:/plugin/IOTMetaModel/imagenes/machineLearning.svg' tool.small.bundle='IOTMetaModel' tool.small.path='imagenes/machine_learning.png' tool.large.bundle='IOTMetaModel' tool.large.path='imagenes/machine_learning.png' label.placement='external' label.icon='false'"
 * @generated
 */
public interface AdditionalConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see iOTMetaModel.IOTMetaModelPackage#getAdditionalConfiguration_Id()
	 * @model default="0"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link iOTMetaModel.AdditionalConfiguration#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

} // AdditionalConfiguration
