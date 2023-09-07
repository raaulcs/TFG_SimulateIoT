/**
 */
package iOTMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.ProcessNode#getEdge_node <em>Edge node</em>}</li>
 *   <li>{@link iOTMetaModel.ProcessNode#getRedirect <em>Redirect</em>}</li>
 *   <li>{@link iOTMetaModel.ProcessNode#getRedirectionTime <em>Redirection Time</em>}</li>
 *   <li>{@link iOTMetaModel.ProcessNode#getCreate_topic <em>Create topic</em>}</li>
 *   <li>{@link iOTMetaModel.ProcessNode#getSize <em>Size</em>}</li>
 *   <li>{@link iOTMetaModel.ProcessNode#getComponent <em>Component</em>}</li>
 *   <li>{@link iOTMetaModel.ProcessNode#getBrokerType <em>Broker Type</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getProcessNode()
 * @model abstract="true"
 * @generated
 */
public interface ProcessNode extends Node {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"XS"</code>.
	 * The literals are from the enumeration {@link iOTMetaModel.Size}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see iOTMetaModel.Size
	 * @see #setSize(Size)
	 * @see iOTMetaModel.IOTMetaModelPackage#getProcessNode_Size()
	 * @model default="XS"
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link iOTMetaModel.ProcessNode#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see iOTMetaModel.Size
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

	/**
	 * Returns the value of the '<em><b>Redirection Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redirection Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redirection Time</em>' attribute.
	 * @see #setRedirectionTime(Integer)
	 * @see iOTMetaModel.IOTMetaModelPackage#getProcessNode_RedirectionTime()
	 * @model default="0"
	 * @generated
	 */
	Integer getRedirectionTime();

	/**
	 * Sets the value of the '{@link iOTMetaModel.ProcessNode#getRedirectionTime <em>Redirection Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redirection Time</em>' attribute.
	 * @see #getRedirectionTime()
	 * @generated
	 */
	void setRedirectionTime(Integer value);

	/**
	 * Returns the value of the '<em><b>Broker Type</b></em>' attribute.
	 * The default value is <code>"Mosquitto"</code>.
	 * The literals are from the enumeration {@link iOTMetaModel.BrokerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Broker Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker Type</em>' attribute.
	 * @see iOTMetaModel.BrokerType
	 * @see #setBrokerType(BrokerType)
	 * @see iOTMetaModel.IOTMetaModelPackage#getProcessNode_BrokerType()
	 * @model default="Mosquitto"
	 * @generated
	 */
	BrokerType getBrokerType();

	/**
	 * Sets the value of the '{@link iOTMetaModel.ProcessNode#getBrokerType <em>Broker Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broker Type</em>' attribute.
	 * @see iOTMetaModel.BrokerType
	 * @see #getBrokerType()
	 * @generated
	 */
	void setBrokerType(BrokerType value);

	/**
	 * Returns the value of the '<em><b>Edge node</b></em>' reference list.
	 * The list contents are of type {@link iOTMetaModel.EdgeNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge node</em>' reference list.
	 * @see iOTMetaModel.IOTMetaModelPackage#getProcessNode_Edge_node()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash' color='0,102,0' width='3'"
	 * @generated
	 */
	EList<EdgeNode> getEdge_node();

	/**
	 * Returns the value of the '<em><b>Redirect</b></em>' reference list.
	 * The list contents are of type {@link iOTMetaModel.ProcessNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redirect</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redirect</em>' reference list.
	 * @see iOTMetaModel.IOTMetaModelPackage#getProcessNode_Redirect()
	 * @model annotation="gmf.link target.decoration='arrow' color='255,0,236' width='3'"
	 * @generated
	 */
	EList<ProcessNode> getRedirect();

	/**
	 * Returns the value of the '<em><b>Create topic</b></em>' containment reference list.
	 * The list contents are of type {@link iOTMetaModel.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create topic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create topic</em>' containment reference list.
	 * @see iOTMetaModel.IOTMetaModelPackage#getProcessNode_Create_topic()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='false'"
	 * @generated
	 */
	EList<Topic> getCreate_topic();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link iOTMetaModel.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see iOTMetaModel.IOTMetaModelPackage#getProcessNode_Component()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='false'"
	 * @generated
	 */
	EList<Component> getComponent();

} // ProcessNode
