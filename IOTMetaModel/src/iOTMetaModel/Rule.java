/**
 */
package iOTMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.Rule#getApply_to <em>Apply to</em>}</li>
 *   <li>{@link iOTMetaModel.Rule#getId <em>Id</em>}</li>
 *   <li>{@link iOTMetaModel.Rule#getEventType <em>Event Type</em>}</li>
 *   <li>{@link iOTMetaModel.Rule#getRule <em>Rule</em>}</li>
 *   <li>{@link iOTMetaModel.Rule#getGenerates_notification <em>Generates notification</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getRule()
 * @model annotation="gmf.node label='eventType' color='191,248,203' tool.small.bundle='IOTMetaModel' tool.small.path='imagenes/rule.png' tool.large.bundle='IOTMetaModel' tool.large.path='imagenes/rule.png' label.placement='internal' label.icon='true'"
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Apply to</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply to</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply to</em>' reference.
	 * @see #setApply_to(Topic)
	 * @see iOTMetaModel.IOTMetaModelPackage#getRule_Apply_to()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' color='46,204,113' width='3'"
	 * @generated
	 */
	Topic getApply_to();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Rule#getApply_to <em>Apply to</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply to</em>' reference.
	 * @see #getApply_to()
	 * @generated
	 */
	void setApply_to(Topic value);

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
	 * @see iOTMetaModel.IOTMetaModelPackage#getRule_Id()
	 * @model default="0"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Rule#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' attribute.
	 * @see #setEventType(String)
	 * @see iOTMetaModel.IOTMetaModelPackage#getRule_EventType()
	 * @model
	 * @generated
	 */
	String getEventType();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Rule#getEventType <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' attribute.
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(String value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' attribute.
	 * @see #setRule(String)
	 * @see iOTMetaModel.IOTMetaModelPackage#getRule_Rule()
	 * @model
	 * @generated
	 */
	String getRule();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Rule#getRule <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' attribute.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(String value);

	/**
	 * Returns the value of the '<em><b>Generates notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generates notification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generates notification</em>' containment reference.
	 * @see #setGenerates_notification(Notification)
	 * @see iOTMetaModel.IOTMetaModelPackage#getRule_Generates_notification()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='false'"
	 * @generated
	 */
	Notification getGenerates_notification();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Rule#getGenerates_notification <em>Generates notification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generates notification</em>' containment reference.
	 * @see #getGenerates_notification()
	 * @generated
	 */
	void setGenerates_notification(Notification value);

} // Rule
