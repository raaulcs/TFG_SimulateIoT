/**
 */
package iOTMetaModel.impl;

import iOTMetaModel.DataGeneration;
import iOTMetaModel.GenerationRange;
import iOTMetaModel.IOTMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Generation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.impl.DataGenerationImpl#getGenerationName <em>Generation Name</em>}</li>
 *   <li>{@link iOTMetaModel.impl.DataGenerationImpl#getGenerationRange <em>Generation Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataGenerationImpl extends DataSourceImpl implements DataGeneration {
	/**
	 * The default value of the '{@link #getGenerationName() <em>Generation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerationName() <em>Generation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationName()
	 * @generated
	 * @ordered
	 */
	protected String generationName = GENERATION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenerationRange() <em>Generation Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationRange()
	 * @generated
	 * @ordered
	 */
	protected GenerationRange generationRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataGenerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTMetaModelPackage.Literals.DATA_GENERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGenerationName() {
		return generationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerationName(String newGenerationName) {
		String oldGenerationName = generationName;
		generationName = newGenerationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.DATA_GENERATION__GENERATION_NAME, oldGenerationName, generationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenerationRange getGenerationRange() {
		return generationRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerationRange(GenerationRange newGenerationRange, NotificationChain msgs) {
		GenerationRange oldGenerationRange = generationRange;
		generationRange = newGenerationRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.DATA_GENERATION__GENERATION_RANGE, oldGenerationRange, newGenerationRange);
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
	public void setGenerationRange(GenerationRange newGenerationRange) {
		if (newGenerationRange != generationRange) {
			NotificationChain msgs = null;
			if (generationRange != null)
				msgs = ((InternalEObject)generationRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IOTMetaModelPackage.DATA_GENERATION__GENERATION_RANGE, null, msgs);
			if (newGenerationRange != null)
				msgs = ((InternalEObject)newGenerationRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IOTMetaModelPackage.DATA_GENERATION__GENERATION_RANGE, null, msgs);
			msgs = basicSetGenerationRange(newGenerationRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.DATA_GENERATION__GENERATION_RANGE, newGenerationRange, newGenerationRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IOTMetaModelPackage.DATA_GENERATION__GENERATION_RANGE:
				return basicSetGenerationRange(null, msgs);
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
			case IOTMetaModelPackage.DATA_GENERATION__GENERATION_NAME:
				return getGenerationName();
			case IOTMetaModelPackage.DATA_GENERATION__GENERATION_RANGE:
				return getGenerationRange();
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
			case IOTMetaModelPackage.DATA_GENERATION__GENERATION_NAME:
				setGenerationName((String)newValue);
				return;
			case IOTMetaModelPackage.DATA_GENERATION__GENERATION_RANGE:
				setGenerationRange((GenerationRange)newValue);
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
			case IOTMetaModelPackage.DATA_GENERATION__GENERATION_NAME:
				setGenerationName(GENERATION_NAME_EDEFAULT);
				return;
			case IOTMetaModelPackage.DATA_GENERATION__GENERATION_RANGE:
				setGenerationRange((GenerationRange)null);
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
			case IOTMetaModelPackage.DATA_GENERATION__GENERATION_NAME:
				return GENERATION_NAME_EDEFAULT == null ? generationName != null : !GENERATION_NAME_EDEFAULT.equals(generationName);
			case IOTMetaModelPackage.DATA_GENERATION__GENERATION_RANGE:
				return generationRange != null;
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
		result.append(" (GenerationName: ");
		result.append(generationName);
		result.append(')');
		return result.toString();
	}

} //DataGenerationImpl
