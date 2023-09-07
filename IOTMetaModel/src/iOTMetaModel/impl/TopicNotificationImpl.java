/**
 */
package iOTMetaModel.impl;

import iOTMetaModel.IOTMetaModelPackage;
import iOTMetaModel.Topic;
import iOTMetaModel.TopicNotification;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.impl.TopicNotificationImpl#getPublish_on_topic <em>Publish on topic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopicNotificationImpl extends NotificationImpl implements TopicNotification {
	/**
	 * The cached value of the '{@link #getPublish_on_topic() <em>Publish on topic</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublish_on_topic()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> publish_on_topic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicNotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTMetaModelPackage.Literals.TOPIC_NOTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Topic> getPublish_on_topic() {
		if (publish_on_topic == null) {
			publish_on_topic = new EObjectResolvingEList<Topic>(Topic.class, this, IOTMetaModelPackage.TOPIC_NOTIFICATION__PUBLISH_ON_TOPIC);
		}
		return publish_on_topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IOTMetaModelPackage.TOPIC_NOTIFICATION__PUBLISH_ON_TOPIC:
				return getPublish_on_topic();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IOTMetaModelPackage.TOPIC_NOTIFICATION__PUBLISH_ON_TOPIC:
				getPublish_on_topic().clear();
				getPublish_on_topic().addAll((Collection<? extends Topic>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IOTMetaModelPackage.TOPIC_NOTIFICATION__PUBLISH_ON_TOPIC:
				getPublish_on_topic().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IOTMetaModelPackage.TOPIC_NOTIFICATION__PUBLISH_ON_TOPIC:
				return publish_on_topic != null && !publish_on_topic.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TopicNotificationImpl
