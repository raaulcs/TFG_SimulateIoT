/**
 */
package iOTMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.Node#getName <em>Name</em>}</li>
 *   <li>{@link iOTMetaModel.Node#getId <em>Id</em>}</li>
 *   <li>{@link iOTMetaModel.Node#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link iOTMetaModel.Node#getSuscribe_on_topic <em>Suscribe on topic</em>}</li>
 *   <li>{@link iOTMetaModel.Node#getPublish_on_topic <em>Publish on topic</em>}</li>
 *   <li>{@link iOTMetaModel.Node#getHil_node_configuration <em>Hil node configuration</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getNode()
 * @model abstract="true"
 *        annotation="gmf.node label='name'"
 * @generated
 */
public interface Node extends EObject {
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
	 * @see iOTMetaModel.IOTMetaModelPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see iOTMetaModel.IOTMetaModelPackage#getNode_Id()
	 * @model default="0"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Node#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference.
	 * @see #setCoordinates(Coordinates)
	 * @see iOTMetaModel.IOTMetaModelPackage#getNode_Coordinates()
	 * @model containment="true"
	 * @generated
	 */
	Coordinates getCoordinates();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Node#getCoordinates <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' containment reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(Coordinates value);

	/**
	 * Returns the value of the '<em><b>Suscribe on topic</b></em>' reference list.
	 * The list contents are of type {@link iOTMetaModel.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suscribe on topic</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suscribe on topic</em>' reference list.
	 * @see iOTMetaModel.IOTMetaModelPackage#getNode_Suscribe_on_topic()
	 * @model annotation="gmf.link source.decoration='arrow' target.decoration='none' style='dash' color='255,93,0' width='3'"
	 * @generated
	 */
	EList<Topic> getSuscribe_on_topic();

	/**
	 * Returns the value of the '<em><b>Publish on topic</b></em>' reference list.
	 * The list contents are of type {@link iOTMetaModel.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publish on topic</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish on topic</em>' reference list.
	 * @see iOTMetaModel.IOTMetaModelPackage#getNode_Publish_on_topic()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash' color='255,93,0' width='3'"
	 * @generated
	 */
	EList<Topic> getPublish_on_topic();

	/**
	 * Returns the value of the '<em><b>Hil node configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hil node configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hil node configuration</em>' containment reference.
	 * @see #setHil_node_configuration(HIL_Node)
	 * @see iOTMetaModel.IOTMetaModelPackage#getNode_Hil_node_configuration()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='false'"
	 * @generated
	 */
	HIL_Node getHil_node_configuration();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Node#getHil_node_configuration <em>Hil node configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hil node configuration</em>' containment reference.
	 * @see #getHil_node_configuration()
	 * @generated
	 */
	void setHil_node_configuration(HIL_Node value);

} // Node
