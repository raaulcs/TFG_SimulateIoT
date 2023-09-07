/**
 */
package iOTMetaModel.impl;

import iOTMetaModel.DataBase;
import iOTMetaModel.DataBaseProvider;
import iOTMetaModel.IOTMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.impl.DataBaseImpl#getDataBaseProvider <em>Data Base Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataBaseImpl extends ComponentImpl implements DataBase {
	/**
	 * The default value of the '{@link #getDataBaseProvider() <em>Data Base Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBaseProvider()
	 * @generated
	 * @ordered
	 */
	protected static final DataBaseProvider DATA_BASE_PROVIDER_EDEFAULT = DataBaseProvider.MONGO_DB;

	/**
	 * The cached value of the '{@link #getDataBaseProvider() <em>Data Base Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBaseProvider()
	 * @generated
	 * @ordered
	 */
	protected DataBaseProvider dataBaseProvider = DATA_BASE_PROVIDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTMetaModelPackage.Literals.DATA_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataBaseProvider getDataBaseProvider() {
		return dataBaseProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataBaseProvider(DataBaseProvider newDataBaseProvider) {
		DataBaseProvider oldDataBaseProvider = dataBaseProvider;
		dataBaseProvider = newDataBaseProvider == null ? DATA_BASE_PROVIDER_EDEFAULT : newDataBaseProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.DATA_BASE__DATA_BASE_PROVIDER, oldDataBaseProvider, dataBaseProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IOTMetaModelPackage.DATA_BASE__DATA_BASE_PROVIDER:
				return getDataBaseProvider();
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
			case IOTMetaModelPackage.DATA_BASE__DATA_BASE_PROVIDER:
				setDataBaseProvider((DataBaseProvider)newValue);
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
			case IOTMetaModelPackage.DATA_BASE__DATA_BASE_PROVIDER:
				setDataBaseProvider(DATA_BASE_PROVIDER_EDEFAULT);
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
			case IOTMetaModelPackage.DATA_BASE__DATA_BASE_PROVIDER:
				return dataBaseProvider != DATA_BASE_PROVIDER_EDEFAULT;
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
		result.append(" (DataBaseProvider: ");
		result.append(dataBaseProvider);
		result.append(')');
		return result.toString();
	}

} //DataBaseImpl
