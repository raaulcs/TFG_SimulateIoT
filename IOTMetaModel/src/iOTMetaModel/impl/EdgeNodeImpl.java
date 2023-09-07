/**
 */
package iOTMetaModel.impl;

import iOTMetaModel.AdditionalConfiguration;
import iOTMetaModel.Data;
import iOTMetaModel.EdgeNode;
import iOTMetaModel.IOTMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.impl.EdgeNodeImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link iOTMetaModel.impl.EdgeNodeImpl#getAdditionalconfiguration <em>Additionalconfiguration</em>}</li>
 *   <li>{@link iOTMetaModel.impl.EdgeNodeImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EdgeNodeImpl extends NodeImpl implements EdgeNode {
	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer QUANTITY_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Integer quantity = QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAdditionalconfiguration() <em>Additionalconfiguration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalconfiguration()
	 * @generated
	 * @ordered
	 */
	protected AdditionalConfiguration additionalconfiguration;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTMetaModelPackage.Literals.EDGE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(Integer newQuantity) {
		Integer oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.EDGE_NODE__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalConfiguration getAdditionalconfiguration() {
		return additionalconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalconfiguration(AdditionalConfiguration newAdditionalconfiguration, NotificationChain msgs) {
		AdditionalConfiguration oldAdditionalconfiguration = additionalconfiguration;
		additionalconfiguration = newAdditionalconfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.EDGE_NODE__ADDITIONALCONFIGURATION, oldAdditionalconfiguration, newAdditionalconfiguration);
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
	public void setAdditionalconfiguration(AdditionalConfiguration newAdditionalconfiguration) {
		if (newAdditionalconfiguration != additionalconfiguration) {
			NotificationChain msgs = null;
			if (additionalconfiguration != null)
				msgs = ((InternalEObject)additionalconfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IOTMetaModelPackage.EDGE_NODE__ADDITIONALCONFIGURATION, null, msgs);
			if (newAdditionalconfiguration != null)
				msgs = ((InternalEObject)newAdditionalconfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IOTMetaModelPackage.EDGE_NODE__ADDITIONALCONFIGURATION, null, msgs);
			msgs = basicSetAdditionalconfiguration(newAdditionalconfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.EDGE_NODE__ADDITIONALCONFIGURATION, newAdditionalconfiguration, newAdditionalconfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject)data;
			data = (Data)eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IOTMetaModelPackage.EDGE_NODE__DATA, oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData(Data newData) {
		Data oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.EDGE_NODE__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IOTMetaModelPackage.EDGE_NODE__ADDITIONALCONFIGURATION:
				return basicSetAdditionalconfiguration(null, msgs);
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
			case IOTMetaModelPackage.EDGE_NODE__QUANTITY:
				return getQuantity();
			case IOTMetaModelPackage.EDGE_NODE__ADDITIONALCONFIGURATION:
				return getAdditionalconfiguration();
			case IOTMetaModelPackage.EDGE_NODE__DATA:
				if (resolve) return getData();
				return basicGetData();
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
			case IOTMetaModelPackage.EDGE_NODE__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case IOTMetaModelPackage.EDGE_NODE__ADDITIONALCONFIGURATION:
				setAdditionalconfiguration((AdditionalConfiguration)newValue);
				return;
			case IOTMetaModelPackage.EDGE_NODE__DATA:
				setData((Data)newValue);
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
			case IOTMetaModelPackage.EDGE_NODE__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case IOTMetaModelPackage.EDGE_NODE__ADDITIONALCONFIGURATION:
				setAdditionalconfiguration((AdditionalConfiguration)null);
				return;
			case IOTMetaModelPackage.EDGE_NODE__DATA:
				setData((Data)null);
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
			case IOTMetaModelPackage.EDGE_NODE__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case IOTMetaModelPackage.EDGE_NODE__ADDITIONALCONFIGURATION:
				return additionalconfiguration != null;
			case IOTMetaModelPackage.EDGE_NODE__DATA:
				return data != null;
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
		result.append(" (quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //EdgeNodeImpl
