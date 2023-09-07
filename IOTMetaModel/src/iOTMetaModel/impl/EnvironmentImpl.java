/**
 */
package iOTMetaModel.impl;

import iOTMetaModel.Data;
import iOTMetaModel.Environment;
import iOTMetaModel.IOTMetaModelPackage;
import iOTMetaModel.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.impl.EnvironmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link iOTMetaModel.impl.EnvironmentImpl#getSimulationSpeed <em>Simulation Speed</em>}</li>
 *   <li>{@link iOTMetaModel.impl.EnvironmentImpl#getNumberOfMessages <em>Number Of Messages</em>}</li>
 *   <li>{@link iOTMetaModel.impl.EnvironmentImpl#getNode <em>Node</em>}</li>
 *   <li>{@link iOTMetaModel.impl.EnvironmentImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentImpl extends EObjectImpl implements Environment {
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
	 * The default value of the '{@link #getSimulationSpeed() <em>Simulation Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Float SIMULATION_SPEED_EDEFAULT = new Float(1.0F);

	/**
	 * The cached value of the '{@link #getSimulationSpeed() <em>Simulation Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationSpeed()
	 * @generated
	 * @ordered
	 */
	protected Float simulationSpeed = SIMULATION_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfMessages() <em>Number Of Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfMessages()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_MESSAGES_EDEFAULT = new Integer(100);

	/**
	 * The cached value of the '{@link #getNumberOfMessages() <em>Number Of Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfMessages()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfMessages = NUMBER_OF_MESSAGES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTMetaModelPackage.Literals.ENVIRONMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.ENVIRONMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getSimulationSpeed() {
		return simulationSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimulationSpeed(Float newSimulationSpeed) {
		Float oldSimulationSpeed = simulationSpeed;
		simulationSpeed = newSimulationSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.ENVIRONMENT__SIMULATION_SPEED, oldSimulationSpeed, simulationSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumberOfMessages() {
		return numberOfMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfMessages(Integer newNumberOfMessages) {
		Integer oldNumberOfMessages = numberOfMessages;
		numberOfMessages = newNumberOfMessages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.ENVIRONMENT__NUMBER_OF_MESSAGES, oldNumberOfMessages, numberOfMessages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Node>(Node.class, this, IOTMetaModelPackage.ENVIRONMENT__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, IOTMetaModelPackage.ENVIRONMENT__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IOTMetaModelPackage.ENVIRONMENT__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case IOTMetaModelPackage.ENVIRONMENT__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
			case IOTMetaModelPackage.ENVIRONMENT__NAME:
				return getName();
			case IOTMetaModelPackage.ENVIRONMENT__SIMULATION_SPEED:
				return getSimulationSpeed();
			case IOTMetaModelPackage.ENVIRONMENT__NUMBER_OF_MESSAGES:
				return getNumberOfMessages();
			case IOTMetaModelPackage.ENVIRONMENT__NODE:
				return getNode();
			case IOTMetaModelPackage.ENVIRONMENT__DATA:
				return getData();
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
			case IOTMetaModelPackage.ENVIRONMENT__NAME:
				setName((String)newValue);
				return;
			case IOTMetaModelPackage.ENVIRONMENT__SIMULATION_SPEED:
				setSimulationSpeed((Float)newValue);
				return;
			case IOTMetaModelPackage.ENVIRONMENT__NUMBER_OF_MESSAGES:
				setNumberOfMessages((Integer)newValue);
				return;
			case IOTMetaModelPackage.ENVIRONMENT__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends Node>)newValue);
				return;
			case IOTMetaModelPackage.ENVIRONMENT__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
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
			case IOTMetaModelPackage.ENVIRONMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IOTMetaModelPackage.ENVIRONMENT__SIMULATION_SPEED:
				setSimulationSpeed(SIMULATION_SPEED_EDEFAULT);
				return;
			case IOTMetaModelPackage.ENVIRONMENT__NUMBER_OF_MESSAGES:
				setNumberOfMessages(NUMBER_OF_MESSAGES_EDEFAULT);
				return;
			case IOTMetaModelPackage.ENVIRONMENT__NODE:
				getNode().clear();
				return;
			case IOTMetaModelPackage.ENVIRONMENT__DATA:
				getData().clear();
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
			case IOTMetaModelPackage.ENVIRONMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IOTMetaModelPackage.ENVIRONMENT__SIMULATION_SPEED:
				return SIMULATION_SPEED_EDEFAULT == null ? simulationSpeed != null : !SIMULATION_SPEED_EDEFAULT.equals(simulationSpeed);
			case IOTMetaModelPackage.ENVIRONMENT__NUMBER_OF_MESSAGES:
				return NUMBER_OF_MESSAGES_EDEFAULT == null ? numberOfMessages != null : !NUMBER_OF_MESSAGES_EDEFAULT.equals(numberOfMessages);
			case IOTMetaModelPackage.ENVIRONMENT__NODE:
				return node != null && !node.isEmpty();
			case IOTMetaModelPackage.ENVIRONMENT__DATA:
				return data != null && !data.isEmpty();
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
		result.append(", simulationSpeed: ");
		result.append(simulationSpeed);
		result.append(", numberOfMessages: ");
		result.append(numberOfMessages);
		result.append(')');
		return result.toString();
	}

} //EnvironmentImpl
