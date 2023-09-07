/**
 */
package iOTMetaModel.impl;

import iOTMetaModel.IOTMetaModelPackage;
import iOTMetaModel.Sensor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.impl.SensorImpl#getGeneration_speed <em>Generation speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends EdgeNodeImpl implements Sensor {
	/**
	 * The default value of the '{@link #getGeneration_speed() <em>Generation speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneration_speed()
	 * @generated
	 * @ordered
	 */
	protected static final Float GENERATION_SPEED_EDEFAULT = new Float(1.0F);

	/**
	 * The cached value of the '{@link #getGeneration_speed() <em>Generation speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneration_speed()
	 * @generated
	 * @ordered
	 */
	protected Float generation_speed = GENERATION_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTMetaModelPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getGeneration_speed() {
		return generation_speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneration_speed(Float newGeneration_speed) {
		Float oldGeneration_speed = generation_speed;
		generation_speed = newGeneration_speed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.SENSOR__GENERATION_SPEED, oldGeneration_speed, generation_speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IOTMetaModelPackage.SENSOR__GENERATION_SPEED:
				return getGeneration_speed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IOTMetaModelPackage.SENSOR__GENERATION_SPEED:
				setGeneration_speed((Float)newValue);
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
			case IOTMetaModelPackage.SENSOR__GENERATION_SPEED:
				setGeneration_speed(GENERATION_SPEED_EDEFAULT);
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
			case IOTMetaModelPackage.SENSOR__GENERATION_SPEED:
				return GENERATION_SPEED_EDEFAULT == null ? generation_speed != null : !GENERATION_SPEED_EDEFAULT.equals(generation_speed);
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
		result.append(" (generation_speed: ");
		result.append(generation_speed);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
