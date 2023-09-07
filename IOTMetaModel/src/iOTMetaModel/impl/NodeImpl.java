/**
 */
package iOTMetaModel.impl;

import iOTMetaModel.Coordinates;
import iOTMetaModel.HIL_Node;
import iOTMetaModel.IOTMetaModelPackage;
import iOTMetaModel.Node;
import iOTMetaModel.Topic;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link iOTMetaModel.impl.NodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link iOTMetaModel.impl.NodeImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link iOTMetaModel.impl.NodeImpl#getSuscribe_on_topic <em>Suscribe on topic</em>}</li>
 *   <li>{@link iOTMetaModel.impl.NodeImpl#getPublish_on_topic <em>Publish on topic</em>}</li>
 *   <li>{@link iOTMetaModel.impl.NodeImpl#getHil_node_configuration <em>Hil node configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeImpl extends EObjectImpl implements Node {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Integer id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoordinates() <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinates()
	 * @generated
	 * @ordered
	 */
	protected Coordinates coordinates;

	/**
	 * The cached value of the '{@link #getSuscribe_on_topic() <em>Suscribe on topic</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuscribe_on_topic()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> suscribe_on_topic;

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
	 * The cached value of the '{@link #getHil_node_configuration() <em>Hil node configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHil_node_configuration()
	 * @generated
	 * @ordered
	 */
	protected HIL_Node hil_node_configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTMetaModelPackage.Literals.NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Integer newId) {
		Integer oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.NODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coordinates getCoordinates() {
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinates(Coordinates newCoordinates, NotificationChain msgs) {
		Coordinates oldCoordinates = coordinates;
		coordinates = newCoordinates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.NODE__COORDINATES, oldCoordinates, newCoordinates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoordinates(Coordinates newCoordinates) {
		if (newCoordinates != coordinates) {
			NotificationChain msgs = null;
			if (coordinates != null)
				msgs = ((InternalEObject)coordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IOTMetaModelPackage.NODE__COORDINATES, null, msgs);
			if (newCoordinates != null)
				msgs = ((InternalEObject)newCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IOTMetaModelPackage.NODE__COORDINATES, null, msgs);
			msgs = basicSetCoordinates(newCoordinates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.NODE__COORDINATES, newCoordinates, newCoordinates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Topic> getSuscribe_on_topic() {
		if (suscribe_on_topic == null) {
			suscribe_on_topic = new EObjectResolvingEList<Topic>(Topic.class, this, IOTMetaModelPackage.NODE__SUSCRIBE_ON_TOPIC);
		}
		return suscribe_on_topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Topic> getPublish_on_topic() {
		if (publish_on_topic == null) {
			publish_on_topic = new EObjectResolvingEList<Topic>(Topic.class, this, IOTMetaModelPackage.NODE__PUBLISH_ON_TOPIC);
		}
		return publish_on_topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HIL_Node getHil_node_configuration() {
		return hil_node_configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHil_node_configuration(HIL_Node newHil_node_configuration, NotificationChain msgs) {
		HIL_Node oldHil_node_configuration = hil_node_configuration;
		hil_node_configuration = newHil_node_configuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.NODE__HIL_NODE_CONFIGURATION, oldHil_node_configuration, newHil_node_configuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHil_node_configuration(HIL_Node newHil_node_configuration) {
		if (newHil_node_configuration != hil_node_configuration) {
			NotificationChain msgs = null;
			if (hil_node_configuration != null)
				msgs = ((InternalEObject)hil_node_configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IOTMetaModelPackage.NODE__HIL_NODE_CONFIGURATION, null, msgs);
			if (newHil_node_configuration != null)
				msgs = ((InternalEObject)newHil_node_configuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IOTMetaModelPackage.NODE__HIL_NODE_CONFIGURATION, null, msgs);
			msgs = basicSetHil_node_configuration(newHil_node_configuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.NODE__HIL_NODE_CONFIGURATION, newHil_node_configuration, newHil_node_configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IOTMetaModelPackage.NODE__COORDINATES:
				return basicSetCoordinates(null, msgs);
			case IOTMetaModelPackage.NODE__HIL_NODE_CONFIGURATION:
				return basicSetHil_node_configuration(null, msgs);
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
			case IOTMetaModelPackage.NODE__NAME:
				return getName();
			case IOTMetaModelPackage.NODE__ID:
				return getId();
			case IOTMetaModelPackage.NODE__COORDINATES:
				return getCoordinates();
			case IOTMetaModelPackage.NODE__SUSCRIBE_ON_TOPIC:
				return getSuscribe_on_topic();
			case IOTMetaModelPackage.NODE__PUBLISH_ON_TOPIC:
				return getPublish_on_topic();
			case IOTMetaModelPackage.NODE__HIL_NODE_CONFIGURATION:
				return getHil_node_configuration();
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
			case IOTMetaModelPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case IOTMetaModelPackage.NODE__ID:
				setId((Integer)newValue);
				return;
			case IOTMetaModelPackage.NODE__COORDINATES:
				setCoordinates((Coordinates)newValue);
				return;
			case IOTMetaModelPackage.NODE__SUSCRIBE_ON_TOPIC:
				getSuscribe_on_topic().clear();
				getSuscribe_on_topic().addAll((Collection<? extends Topic>)newValue);
				return;
			case IOTMetaModelPackage.NODE__PUBLISH_ON_TOPIC:
				getPublish_on_topic().clear();
				getPublish_on_topic().addAll((Collection<? extends Topic>)newValue);
				return;
			case IOTMetaModelPackage.NODE__HIL_NODE_CONFIGURATION:
				setHil_node_configuration((HIL_Node)newValue);
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
			case IOTMetaModelPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IOTMetaModelPackage.NODE__ID:
				setId(ID_EDEFAULT);
				return;
			case IOTMetaModelPackage.NODE__COORDINATES:
				setCoordinates((Coordinates)null);
				return;
			case IOTMetaModelPackage.NODE__SUSCRIBE_ON_TOPIC:
				getSuscribe_on_topic().clear();
				return;
			case IOTMetaModelPackage.NODE__PUBLISH_ON_TOPIC:
				getPublish_on_topic().clear();
				return;
			case IOTMetaModelPackage.NODE__HIL_NODE_CONFIGURATION:
				setHil_node_configuration((HIL_Node)null);
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
			case IOTMetaModelPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IOTMetaModelPackage.NODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IOTMetaModelPackage.NODE__COORDINATES:
				return coordinates != null;
			case IOTMetaModelPackage.NODE__SUSCRIBE_ON_TOPIC:
				return suscribe_on_topic != null && !suscribe_on_topic.isEmpty();
			case IOTMetaModelPackage.NODE__PUBLISH_ON_TOPIC:
				return publish_on_topic != null && !publish_on_topic.isEmpty();
			case IOTMetaModelPackage.NODE__HIL_NODE_CONFIGURATION:
				return hil_node_configuration != null;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
