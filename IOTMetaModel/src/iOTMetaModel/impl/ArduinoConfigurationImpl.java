/**
 */
package iOTMetaModel.impl;

import iOTMetaModel.ArduinoConfiguration;
import iOTMetaModel.ArduinoDeviceType;
import iOTMetaModel.IOTMetaModelPackage;
import iOTMetaModel.Input;
import iOTMetaModel.Input;

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
 * An implementation of the model object '<em><b>Arduino Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.impl.ArduinoConfigurationImpl#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link iOTMetaModel.impl.ArduinoConfigurationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link iOTMetaModel.impl.ArduinoConfigurationImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArduinoConfigurationImpl extends EObjectImpl implements ArduinoConfiguration {
	/**
	 * The default value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceType()
	 * @generated
	 * @ordered
	 */
	protected static final ArduinoDeviceType DEVICE_TYPE_EDEFAULT = ArduinoDeviceType.THERMISTOR;

	/**
	 * The cached value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceType()
	 * @generated
	 * @ordered
	 */
	protected ArduinoDeviceType deviceType = DEVICE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Integer output = OUTPUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> input;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArduinoConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTMetaModelPackage.Literals.ARDUINO_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArduinoDeviceType getDeviceType() {
		return deviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceType(ArduinoDeviceType newDeviceType) {
		ArduinoDeviceType oldDeviceType = deviceType;
		deviceType = newDeviceType == null ? DEVICE_TYPE_EDEFAULT : newDeviceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.ARDUINO_CONFIGURATION__DEVICE_TYPE, oldDeviceType, deviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutput(Integer newOutput) {
		Integer oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.ARDUINO_CONFIGURATION__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Input>(Input.class, this, IOTMetaModelPackage.ARDUINO_CONFIGURATION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IOTMetaModelPackage.ARDUINO_CONFIGURATION__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
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
			case IOTMetaModelPackage.ARDUINO_CONFIGURATION__DEVICE_TYPE:
				return getDeviceType();
			case IOTMetaModelPackage.ARDUINO_CONFIGURATION__OUTPUT:
				return getOutput();
			case IOTMetaModelPackage.ARDUINO_CONFIGURATION__INPUT:
				return getInput();
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
			case IOTMetaModelPackage.ARDUINO_CONFIGURATION__DEVICE_TYPE:
				setDeviceType((ArduinoDeviceType)newValue);
				return;
			case IOTMetaModelPackage.ARDUINO_CONFIGURATION__OUTPUT:
				setOutput((Integer)newValue);
				return;
			case IOTMetaModelPackage.ARDUINO_CONFIGURATION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Input>)newValue);
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
			case IOTMetaModelPackage.ARDUINO_CONFIGURATION__DEVICE_TYPE:
				setDeviceType(DEVICE_TYPE_EDEFAULT);
				return;
			case IOTMetaModelPackage.ARDUINO_CONFIGURATION__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
				return;
			case IOTMetaModelPackage.ARDUINO_CONFIGURATION__INPUT:
				getInput().clear();
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
			case IOTMetaModelPackage.ARDUINO_CONFIGURATION__DEVICE_TYPE:
				return deviceType != DEVICE_TYPE_EDEFAULT;
			case IOTMetaModelPackage.ARDUINO_CONFIGURATION__OUTPUT:
				return OUTPUT_EDEFAULT == null ? output != null : !OUTPUT_EDEFAULT.equals(output);
			case IOTMetaModelPackage.ARDUINO_CONFIGURATION__INPUT:
				return input != null && !input.isEmpty();
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
		result.append(" (deviceType: ");
		result.append(deviceType);
		result.append(", output: ");
		result.append(output);
		result.append(')');
		return result.toString();
	}

} //ArduinoConfigurationImpl
