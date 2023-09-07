/**
 */
package iOTMetaModel.impl;

import iOTMetaModel.CloudNode;
import iOTMetaModel.CloudType;
import iOTMetaModel.IOTMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.impl.CloudNodeImpl#getCloudType <em>Cloud Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudNodeImpl extends ProcessNodeImpl implements CloudNode {
	/**
	 * The default value of the '{@link #getCloudType() <em>Cloud Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudType()
	 * @generated
	 * @ordered
	 */
	protected static final CloudType CLOUD_TYPE_EDEFAULT = CloudType.AWS;

	/**
	 * The cached value of the '{@link #getCloudType() <em>Cloud Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudType()
	 * @generated
	 * @ordered
	 */
	protected CloudType cloudType = CLOUD_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTMetaModelPackage.Literals.CLOUD_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CloudType getCloudType() {
		return cloudType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudType(CloudType newCloudType) {
		CloudType oldCloudType = cloudType;
		cloudType = newCloudType == null ? CLOUD_TYPE_EDEFAULT : newCloudType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.CLOUD_NODE__CLOUD_TYPE, oldCloudType, cloudType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IOTMetaModelPackage.CLOUD_NODE__CLOUD_TYPE:
				return getCloudType();
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
			case IOTMetaModelPackage.CLOUD_NODE__CLOUD_TYPE:
				setCloudType((CloudType)newValue);
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
			case IOTMetaModelPackage.CLOUD_NODE__CLOUD_TYPE:
				setCloudType(CLOUD_TYPE_EDEFAULT);
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
			case IOTMetaModelPackage.CLOUD_NODE__CLOUD_TYPE:
				return cloudType != CLOUD_TYPE_EDEFAULT;
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
		result.append(" (CloudType: ");
		result.append(cloudType);
		result.append(')');
		return result.toString();
	}

} //CloudNodeImpl
