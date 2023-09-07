/**
 */
package iOTMetaModel.impl;

import iOTMetaModel.Arduino;
import iOTMetaModel.ArduinoConfiguration;
import iOTMetaModel.ArduinoModel;
import iOTMetaModel.IOTMetaModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.impl.ArduinoImpl#getArduinoModel <em>Arduino Model</em>}</li>
 *   <li>{@link iOTMetaModel.impl.ArduinoImpl#getArduinoconfiguration <em>Arduinoconfiguration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArduinoImpl extends HIL_NodeImpl implements Arduino {
	/**
	 * The default value of the '{@link #getArduinoModel() <em>Arduino Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduinoModel()
	 * @generated
	 * @ordered
	 */
	protected static final ArduinoModel ARDUINO_MODEL_EDEFAULT = ArduinoModel.YUN;

	/**
	 * The cached value of the '{@link #getArduinoModel() <em>Arduino Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduinoModel()
	 * @generated
	 * @ordered
	 */
	protected ArduinoModel arduinoModel = ARDUINO_MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArduinoconfiguration() <em>Arduinoconfiguration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduinoconfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<ArduinoConfiguration> arduinoconfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArduinoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTMetaModelPackage.Literals.ARDUINO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArduinoModel getArduinoModel() {
		return arduinoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArduinoModel(ArduinoModel newArduinoModel) {
		ArduinoModel oldArduinoModel = arduinoModel;
		arduinoModel = newArduinoModel == null ? ARDUINO_MODEL_EDEFAULT : newArduinoModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.ARDUINO__ARDUINO_MODEL, oldArduinoModel, arduinoModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArduinoConfiguration> getArduinoconfiguration() {
		if (arduinoconfiguration == null) {
			arduinoconfiguration = new EObjectContainmentEList<ArduinoConfiguration>(ArduinoConfiguration.class, this, IOTMetaModelPackage.ARDUINO__ARDUINOCONFIGURATION);
		}
		return arduinoconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IOTMetaModelPackage.ARDUINO__ARDUINOCONFIGURATION:
				return ((InternalEList<?>)getArduinoconfiguration()).basicRemove(otherEnd, msgs);
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
			case IOTMetaModelPackage.ARDUINO__ARDUINO_MODEL:
				return getArduinoModel();
			case IOTMetaModelPackage.ARDUINO__ARDUINOCONFIGURATION:
				return getArduinoconfiguration();
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
			case IOTMetaModelPackage.ARDUINO__ARDUINO_MODEL:
				setArduinoModel((ArduinoModel)newValue);
				return;
			case IOTMetaModelPackage.ARDUINO__ARDUINOCONFIGURATION:
				getArduinoconfiguration().clear();
				getArduinoconfiguration().addAll((Collection<? extends ArduinoConfiguration>)newValue);
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
			case IOTMetaModelPackage.ARDUINO__ARDUINO_MODEL:
				setArduinoModel(ARDUINO_MODEL_EDEFAULT);
				return;
			case IOTMetaModelPackage.ARDUINO__ARDUINOCONFIGURATION:
				getArduinoconfiguration().clear();
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
			case IOTMetaModelPackage.ARDUINO__ARDUINO_MODEL:
				return arduinoModel != ARDUINO_MODEL_EDEFAULT;
			case IOTMetaModelPackage.ARDUINO__ARDUINOCONFIGURATION:
				return arduinoconfiguration != null && !arduinoconfiguration.isEmpty();
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
		result.append(" (arduinoModel: ");
		result.append(arduinoModel);
		result.append(')');
		return result.toString();
	}

} //ArduinoImpl
