/**
 */
package iOTMetaModel.impl;

import iOTMetaModel.BrokerType;
import iOTMetaModel.Component;
import iOTMetaModel.EdgeNode;
import iOTMetaModel.IOTMetaModelPackage;
import iOTMetaModel.ProcessNode;
import iOTMetaModel.Size;
import iOTMetaModel.Topic;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.impl.ProcessNodeImpl#getEdge_node <em>Edge node</em>}</li>
 *   <li>{@link iOTMetaModel.impl.ProcessNodeImpl#getRedirect <em>Redirect</em>}</li>
 *   <li>{@link iOTMetaModel.impl.ProcessNodeImpl#getRedirectionTime <em>Redirection Time</em>}</li>
 *   <li>{@link iOTMetaModel.impl.ProcessNodeImpl#getCreate_topic <em>Create topic</em>}</li>
 *   <li>{@link iOTMetaModel.impl.ProcessNodeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link iOTMetaModel.impl.ProcessNodeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link iOTMetaModel.impl.ProcessNodeImpl#getBrokerType <em>Broker Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProcessNodeImpl extends NodeImpl implements ProcessNode {
	/**
	 * The cached value of the '{@link #getEdge_node() <em>Edge node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge_node()
	 * @generated
	 * @ordered
	 */
	protected EList<EdgeNode> edge_node;

	/**
	 * The cached value of the '{@link #getRedirect() <em>Redirect</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirect()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessNode> redirect;

	/**
	 * The default value of the '{@link #getRedirectionTime() <em>Redirection Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirectionTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REDIRECTION_TIME_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getRedirectionTime() <em>Redirection Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirectionTime()
	 * @generated
	 * @ordered
	 */
	protected Integer redirectionTime = REDIRECTION_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreate_topic() <em>Create topic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreate_topic()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> create_topic;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Size SIZE_EDEFAULT = Size.XS;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Size size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The default value of the '{@link #getBrokerType() <em>Broker Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokerType()
	 * @generated
	 * @ordered
	 */
	protected static final BrokerType BROKER_TYPE_EDEFAULT = BrokerType.MOSQUITTO;

	/**
	 * The cached value of the '{@link #getBrokerType() <em>Broker Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokerType()
	 * @generated
	 * @ordered
	 */
	protected BrokerType brokerType = BROKER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTMetaModelPackage.Literals.PROCESS_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Size getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(Size newSize) {
		Size oldSize = size;
		size = newSize == null ? SIZE_EDEFAULT : newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.PROCESS_NODE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRedirectionTime() {
		return redirectionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedirectionTime(Integer newRedirectionTime) {
		Integer oldRedirectionTime = redirectionTime;
		redirectionTime = newRedirectionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.PROCESS_NODE__REDIRECTION_TIME, oldRedirectionTime, redirectionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BrokerType getBrokerType() {
		return brokerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrokerType(BrokerType newBrokerType) {
		BrokerType oldBrokerType = brokerType;
		brokerType = newBrokerType == null ? BROKER_TYPE_EDEFAULT : newBrokerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.PROCESS_NODE__BROKER_TYPE, oldBrokerType, brokerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EdgeNode> getEdge_node() {
		if (edge_node == null) {
			edge_node = new EObjectResolvingEList<EdgeNode>(EdgeNode.class, this, IOTMetaModelPackage.PROCESS_NODE__EDGE_NODE);
		}
		return edge_node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessNode> getRedirect() {
		if (redirect == null) {
			redirect = new EObjectResolvingEList<ProcessNode>(ProcessNode.class, this, IOTMetaModelPackage.PROCESS_NODE__REDIRECT);
		}
		return redirect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Topic> getCreate_topic() {
		if (create_topic == null) {
			create_topic = new EObjectContainmentEList<Topic>(Topic.class, this, IOTMetaModelPackage.PROCESS_NODE__CREATE_TOPIC);
		}
		return create_topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this, IOTMetaModelPackage.PROCESS_NODE__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IOTMetaModelPackage.PROCESS_NODE__CREATE_TOPIC:
				return ((InternalEList<?>)getCreate_topic()).basicRemove(otherEnd, msgs);
			case IOTMetaModelPackage.PROCESS_NODE__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IOTMetaModelPackage.PROCESS_NODE__EDGE_NODE:
				return getEdge_node();
			case IOTMetaModelPackage.PROCESS_NODE__REDIRECT:
				return getRedirect();
			case IOTMetaModelPackage.PROCESS_NODE__REDIRECTION_TIME:
				return getRedirectionTime();
			case IOTMetaModelPackage.PROCESS_NODE__CREATE_TOPIC:
				return getCreate_topic();
			case IOTMetaModelPackage.PROCESS_NODE__SIZE:
				return getSize();
			case IOTMetaModelPackage.PROCESS_NODE__COMPONENT:
				return getComponent();
			case IOTMetaModelPackage.PROCESS_NODE__BROKER_TYPE:
				return getBrokerType();
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
			case IOTMetaModelPackage.PROCESS_NODE__EDGE_NODE:
				getEdge_node().clear();
				getEdge_node().addAll((Collection<? extends EdgeNode>)newValue);
				return;
			case IOTMetaModelPackage.PROCESS_NODE__REDIRECT:
				getRedirect().clear();
				getRedirect().addAll((Collection<? extends ProcessNode>)newValue);
				return;
			case IOTMetaModelPackage.PROCESS_NODE__REDIRECTION_TIME:
				setRedirectionTime((Integer)newValue);
				return;
			case IOTMetaModelPackage.PROCESS_NODE__CREATE_TOPIC:
				getCreate_topic().clear();
				getCreate_topic().addAll((Collection<? extends Topic>)newValue);
				return;
			case IOTMetaModelPackage.PROCESS_NODE__SIZE:
				setSize((Size)newValue);
				return;
			case IOTMetaModelPackage.PROCESS_NODE__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case IOTMetaModelPackage.PROCESS_NODE__BROKER_TYPE:
				setBrokerType((BrokerType)newValue);
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
			case IOTMetaModelPackage.PROCESS_NODE__EDGE_NODE:
				getEdge_node().clear();
				return;
			case IOTMetaModelPackage.PROCESS_NODE__REDIRECT:
				getRedirect().clear();
				return;
			case IOTMetaModelPackage.PROCESS_NODE__REDIRECTION_TIME:
				setRedirectionTime(REDIRECTION_TIME_EDEFAULT);
				return;
			case IOTMetaModelPackage.PROCESS_NODE__CREATE_TOPIC:
				getCreate_topic().clear();
				return;
			case IOTMetaModelPackage.PROCESS_NODE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case IOTMetaModelPackage.PROCESS_NODE__COMPONENT:
				getComponent().clear();
				return;
			case IOTMetaModelPackage.PROCESS_NODE__BROKER_TYPE:
				setBrokerType(BROKER_TYPE_EDEFAULT);
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
			case IOTMetaModelPackage.PROCESS_NODE__EDGE_NODE:
				return edge_node != null && !edge_node.isEmpty();
			case IOTMetaModelPackage.PROCESS_NODE__REDIRECT:
				return redirect != null && !redirect.isEmpty();
			case IOTMetaModelPackage.PROCESS_NODE__REDIRECTION_TIME:
				return REDIRECTION_TIME_EDEFAULT == null ? redirectionTime != null : !REDIRECTION_TIME_EDEFAULT.equals(redirectionTime);
			case IOTMetaModelPackage.PROCESS_NODE__CREATE_TOPIC:
				return create_topic != null && !create_topic.isEmpty();
			case IOTMetaModelPackage.PROCESS_NODE__SIZE:
				return size != SIZE_EDEFAULT;
			case IOTMetaModelPackage.PROCESS_NODE__COMPONENT:
				return component != null && !component.isEmpty();
			case IOTMetaModelPackage.PROCESS_NODE__BROKER_TYPE:
				return brokerType != BROKER_TYPE_EDEFAULT;
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
		result.append(" (redirectionTime: ");
		result.append(redirectionTime);
		result.append(", size: ");
		result.append(size);
		result.append(", BrokerType: ");
		result.append(brokerType);
		result.append(')');
		return result.toString();
	}

} //ProcessNodeImpl
