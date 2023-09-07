/**
 */
package iOTMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.Input#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getInput()
 * @model annotation="gmf.node label='input' figure='svg' svg.uri='platform:/plugin/IOTMetaModel/imagenes/telegram.svg' tool.small.bundle='IOTMetaModel' tool.small.path='imagenes/telegram.png' tool.large.bundle='IOTMetaModel' tool.large.path='imagenes/telegram.png' label.placement='external' label.icon='false'"
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(Integer)
	 * @see iOTMetaModel.IOTMetaModelPackage#getInput_Input()
	 * @model
	 * @generated
	 */
	Integer getInput();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Input#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Integer value);

} // input
