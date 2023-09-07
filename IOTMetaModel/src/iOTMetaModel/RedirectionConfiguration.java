/**
 */
package iOTMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redirection Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.RedirectionConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link iOTMetaModel.RedirectionConfiguration#getRoute_processnode <em>Route processnode</em>}</li>
 *   <li>{@link iOTMetaModel.RedirectionConfiguration#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getRedirectionConfiguration()
 * @model annotation="gmf.node label='name' figure='svg' svg.uri='platform:/plugin/IOTMetaModel/imagenes/redirect.svg' tool.small.bundle='IOTMetaModel' tool.small.path='imagenes/redirect.png' tool.large.bundle='IOTMetaModel' tool.large.path='imagenes/redirect.png' label.placement='external' label.icon='false'"
 * @generated
 */
public interface RedirectionConfiguration extends AdditionalConfiguration {
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
	 * @see iOTMetaModel.IOTMetaModelPackage#getRedirectionConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iOTMetaModel.RedirectionConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Route processnode</b></em>' reference list.
	 * The list contents are of type {@link iOTMetaModel.ProcessNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route processnode</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route processnode</em>' reference list.
	 * @see iOTMetaModel.IOTMetaModelPackage#getRedirectionConfiguration_Route_processnode()
	 * @model required="true"
	 * @generated
	 */
	EList<ProcessNode> getRoute_processnode();

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' reference.
	 * @see #setTopic(Topic)
	 * @see iOTMetaModel.IOTMetaModelPackage#getRedirectionConfiguration_Topic()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' color='255,93,0' width='3'"
	 * @generated
	 */
	Topic getTopic();

	/**
	 * Sets the value of the '{@link iOTMetaModel.RedirectionConfiguration#getTopic <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' reference.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(Topic value);

} // RedirectionConfiguration
