/**
 */
package iOTMetaModel.impl;

import iOTMetaModel.IOTMetaModelPackage;
import iOTMetaModel.ProcessNode;
import iOTMetaModel.RedirectionConfiguration;
import iOTMetaModel.Topic;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redirection Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.impl.RedirectionConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link iOTMetaModel.impl.RedirectionConfigurationImpl#getRoute_processnode <em>Route processnode</em>}</li>
 *   <li>{@link iOTMetaModel.impl.RedirectionConfigurationImpl#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedirectionConfigurationImpl extends AdditionalConfigurationImpl implements RedirectionConfiguration {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoute_processnode() <em>Route processnode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute_processnode()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessNode> route_processnode;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected Topic topic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedirectionConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTMetaModelPackage.Literals.REDIRECTION_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.REDIRECTION_CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessNode> getRoute_processnode() {
		if (route_processnode == null) {
			route_processnode = new EObjectResolvingEList<ProcessNode>(ProcessNode.class, this, IOTMetaModelPackage.REDIRECTION_CONFIGURATION__ROUTE_PROCESSNODE);
		}
		return route_processnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Topic getTopic() {
		if (topic != null && topic.eIsProxy()) {
			InternalEObject oldTopic = (InternalEObject)topic;
			topic = (Topic)eResolveProxy(oldTopic);
			if (topic != oldTopic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IOTMetaModelPackage.REDIRECTION_CONFIGURATION__TOPIC, oldTopic, topic));
			}
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic basicGetTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopic(Topic newTopic) {
		Topic oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.REDIRECTION_CONFIGURATION__TOPIC, oldTopic, topic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IOTMetaModelPackage.REDIRECTION_CONFIGURATION__NAME:
				return getName();
			case IOTMetaModelPackage.REDIRECTION_CONFIGURATION__ROUTE_PROCESSNODE:
				return getRoute_processnode();
			case IOTMetaModelPackage.REDIRECTION_CONFIGURATION__TOPIC:
				if (resolve) return getTopic();
				return basicGetTopic();
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
			case IOTMetaModelPackage.REDIRECTION_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case IOTMetaModelPackage.REDIRECTION_CONFIGURATION__ROUTE_PROCESSNODE:
				getRoute_processnode().clear();
				getRoute_processnode().addAll((Collection<? extends ProcessNode>)newValue);
				return;
			case IOTMetaModelPackage.REDIRECTION_CONFIGURATION__TOPIC:
				setTopic((Topic)newValue);
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
			case IOTMetaModelPackage.REDIRECTION_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IOTMetaModelPackage.REDIRECTION_CONFIGURATION__ROUTE_PROCESSNODE:
				getRoute_processnode().clear();
				return;
			case IOTMetaModelPackage.REDIRECTION_CONFIGURATION__TOPIC:
				setTopic((Topic)null);
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
			case IOTMetaModelPackage.REDIRECTION_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IOTMetaModelPackage.REDIRECTION_CONFIGURATION__ROUTE_PROCESSNODE:
				return route_processnode != null && !route_processnode.isEmpty();
			case IOTMetaModelPackage.REDIRECTION_CONFIGURATION__TOPIC:
				return topic != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RedirectionConfigurationImpl
