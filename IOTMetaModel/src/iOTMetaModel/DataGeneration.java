/**
 */
package iOTMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Generation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.DataGeneration#getGenerationName <em>Generation Name</em>}</li>
 *   <li>{@link iOTMetaModel.DataGeneration#getGenerationRange <em>Generation Range</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getDataGeneration()
 * @model abstract="true"
 *        annotation="gmf.node label='GenerationName' label.icon='true' label.placement='internal'"
 * @generated
 */
public interface DataGeneration extends DataSource {
	/**
	 * Returns the value of the '<em><b>Generation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Name</em>' attribute.
	 * @see #setGenerationName(String)
	 * @see iOTMetaModel.IOTMetaModelPackage#getDataGeneration_GenerationName()
	 * @model
	 * @generated
	 */
	String getGenerationName();

	/**
	 * Sets the value of the '{@link iOTMetaModel.DataGeneration#getGenerationName <em>Generation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Name</em>' attribute.
	 * @see #getGenerationName()
	 * @generated
	 */
	void setGenerationName(String value);

	/**
	 * Returns the value of the '<em><b>Generation Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Range</em>' containment reference.
	 * @see #setGenerationRange(GenerationRange)
	 * @see iOTMetaModel.IOTMetaModelPackage#getDataGeneration_GenerationRange()
	 * @model containment="true"
	 * @generated
	 */
	GenerationRange getGenerationRange();

	/**
	 * Sets the value of the '{@link iOTMetaModel.DataGeneration#getGenerationRange <em>Generation Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Range</em>' containment reference.
	 * @see #getGenerationRange()
	 * @generated
	 */
	void setGenerationRange(GenerationRange value);

} // DataGeneration
