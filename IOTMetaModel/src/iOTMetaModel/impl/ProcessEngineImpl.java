/**
 */
package iOTMetaModel.impl;

import iOTMetaModel.IOTMetaModelPackage;
import iOTMetaModel.ProcessEngine;
import iOTMetaModel.ProcessEngineProvider;
import iOTMetaModel.Rule;

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
 * An implementation of the model object '<em><b>Process Engine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.impl.ProcessEngineImpl#getProcessEngineProvider <em>Process Engine Provider</em>}</li>
 *   <li>{@link iOTMetaModel.impl.ProcessEngineImpl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProcessEngineImpl extends ComponentImpl implements ProcessEngine {
	/**
	 * The default value of the '{@link #getProcessEngineProvider() <em>Process Engine Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessEngineProvider()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessEngineProvider PROCESS_ENGINE_PROVIDER_EDEFAULT = ProcessEngineProvider.ESPER_TECH;

	/**
	 * The cached value of the '{@link #getProcessEngineProvider() <em>Process Engine Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessEngineProvider()
	 * @generated
	 * @ordered
	 */
	protected ProcessEngineProvider processEngineProvider = PROCESS_ENGINE_PROVIDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessEngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTMetaModelPackage.Literals.PROCESS_ENGINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessEngineProvider getProcessEngineProvider() {
		return processEngineProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessEngineProvider(ProcessEngineProvider newProcessEngineProvider) {
		ProcessEngineProvider oldProcessEngineProvider = processEngineProvider;
		processEngineProvider = newProcessEngineProvider == null ? PROCESS_ENGINE_PROVIDER_EDEFAULT : newProcessEngineProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.PROCESS_ENGINE__PROCESS_ENGINE_PROVIDER, oldProcessEngineProvider, processEngineProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rule> getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList<Rule>(Rule.class, this, IOTMetaModelPackage.PROCESS_ENGINE__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IOTMetaModelPackage.PROCESS_ENGINE__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
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
			case IOTMetaModelPackage.PROCESS_ENGINE__PROCESS_ENGINE_PROVIDER:
				return getProcessEngineProvider();
			case IOTMetaModelPackage.PROCESS_ENGINE__RULE:
				return getRule();
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
			case IOTMetaModelPackage.PROCESS_ENGINE__PROCESS_ENGINE_PROVIDER:
				setProcessEngineProvider((ProcessEngineProvider)newValue);
				return;
			case IOTMetaModelPackage.PROCESS_ENGINE__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends Rule>)newValue);
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
			case IOTMetaModelPackage.PROCESS_ENGINE__PROCESS_ENGINE_PROVIDER:
				setProcessEngineProvider(PROCESS_ENGINE_PROVIDER_EDEFAULT);
				return;
			case IOTMetaModelPackage.PROCESS_ENGINE__RULE:
				getRule().clear();
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
			case IOTMetaModelPackage.PROCESS_ENGINE__PROCESS_ENGINE_PROVIDER:
				return processEngineProvider != PROCESS_ENGINE_PROVIDER_EDEFAULT;
			case IOTMetaModelPackage.PROCESS_ENGINE__RULE:
				return rule != null && !rule.isEmpty();
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
		result.append(" (ProcessEngineProvider: ");
		result.append(processEngineProvider);
		result.append(')');
		return result.toString();
	}

} //ProcessEngineImpl
