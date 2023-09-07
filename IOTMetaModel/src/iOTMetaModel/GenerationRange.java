/**
 */
package iOTMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generation Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.GenerationRange#getId <em>Id</em>}</li>
 *   <li>{@link iOTMetaModel.GenerationRange#getLower <em>Lower</em>}</li>
 *   <li>{@link iOTMetaModel.GenerationRange#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getGenerationRange()
 * @model annotation="gmf.node label='id' figure='svg' svg.uri='platform:/plugin/IOTMetaModel/imagenes/range.svg' tool.small.bundle='IOTMetaModel' tool.small.path='imagenes/range.png' tool.large.bundle='IOTMetaModel' tool.large.path='imagenes/range.png' label.placement='external' label.icon='false'"
 * @generated
 */
public interface GenerationRange extends EObject {
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
	 * @see iOTMetaModel.IOTMetaModelPackage#getGenerationRange_Id()
	 * @model default="0"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link iOTMetaModel.GenerationRange#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(Integer)
	 * @see iOTMetaModel.IOTMetaModelPackage#getGenerationRange_Lower()
	 * @model
	 * @generated
	 */
	Integer getLower();

	/**
	 * Sets the value of the '{@link iOTMetaModel.GenerationRange#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Integer value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(Integer)
	 * @see iOTMetaModel.IOTMetaModelPackage#getGenerationRange_Upper()
	 * @model
	 * @generated
	 */
	Integer getUpper();

	/**
	 * Sets the value of the '{@link iOTMetaModel.GenerationRange#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Integer value);

} // GenerationRange
