/**
 */
package iOTMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.TopicNotification#getPublish_on_topic <em>Publish on topic</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getTopicNotification()
 * @model annotation="gmf.node figure='svg' color='191,248,203' svg.uri='platform:/plugin/IOTMetaModel/imagenes/notification.svg'"
 * @generated
 */
public interface TopicNotification extends Notification {
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
	 * @see iOTMetaModel.IOTMetaModelPackage#getTopicNotification_Publish_on_topic()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash' color='255,93,0' width='3'"
	 * @generated
	 */
	EList<Topic> getPublish_on_topic();

} // TopicNotification
