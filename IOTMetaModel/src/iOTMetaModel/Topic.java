/**
 */
package iOTMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.Topic#getName <em>Name</em>}</li>
 *   <li>{@link iOTMetaModel.Topic#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getTopic()
 * @model annotation="gmf.node label='name' figure='svg' svg.uri='platform:/plugin/IOTMetaModel/imagenes/topic.svg' label.placement='external' tool.small.bundle='IOTMetaModel' tool.small.path='imagenes/topic.png' tool.large.bundle='IOTMetaModel' tool.large.path='imagenes/topic.png' label.icon='false'"
 * @generated
 */
public interface Topic extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iOTMetaModel.IOTMetaModelPackage#getTopic_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Topic#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see iOTMetaModel.IOTMetaModelPackage#getTopic_Data()
	 * @model
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Topic#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

} // Topic
