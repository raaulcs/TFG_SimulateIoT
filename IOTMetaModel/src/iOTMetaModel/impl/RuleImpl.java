/**
 */
package iOTMetaModel.impl;

import iOTMetaModel.IOTMetaModelPackage;
import iOTMetaModel.Notification;
import iOTMetaModel.Rule;
import iOTMetaModel.Topic;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.impl.RuleImpl#getApply_to <em>Apply to</em>}</li>
 *   <li>{@link iOTMetaModel.impl.RuleImpl#getId <em>Id</em>}</li>
 *   <li>{@link iOTMetaModel.impl.RuleImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link iOTMetaModel.impl.RuleImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link iOTMetaModel.impl.RuleImpl#getGenerates_notification <em>Generates notification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
	/**
	 * The cached value of the '{@link #getApply_to() <em>Apply to</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApply_to()
	 * @generated
	 * @ordered
	 */
	protected Topic apply_to;

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
	 * The default value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected String eventType = EVENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRule() <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected String rule = RULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenerates_notification() <em>Generates notification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerates_notification()
	 * @generated
	 * @ordered
	 */
	protected Notification generates_notification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTMetaModelPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Topic getApply_to() {
		if (apply_to != null && apply_to.eIsProxy()) {
			InternalEObject oldApply_to = (InternalEObject)apply_to;
			apply_to = (Topic)eResolveProxy(oldApply_to);
			if (apply_to != oldApply_to) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.RESOLVE, IOTMetaModelPackage.RULE__APPLY_TO, oldApply_to, apply_to));
			}
		}
		return apply_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic basicGetApply_to() {
		return apply_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApply_to(Topic newApply_to) {
		Topic oldApply_to = apply_to;
		apply_to = newApply_to;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, IOTMetaModelPackage.RULE__APPLY_TO, oldApply_to, apply_to));
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
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, IOTMetaModelPackage.RULE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventType(String newEventType) {
		String oldEventType = eventType;
		eventType = newEventType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, IOTMetaModelPackage.RULE__EVENT_TYPE, oldEventType, eventType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRule(String newRule) {
		String oldRule = rule;
		rule = newRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, IOTMetaModelPackage.RULE__RULE, oldRule, rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Notification getGenerates_notification() {
		return generates_notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerates_notification(Notification newGenerates_notification, NotificationChain msgs) {
		Notification oldGenerates_notification = generates_notification;
		generates_notification = newGenerates_notification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, IOTMetaModelPackage.RULE__GENERATES_NOTIFICATION, oldGenerates_notification, newGenerates_notification);
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
	public void setGenerates_notification(Notification newGenerates_notification) {
		if (newGenerates_notification != generates_notification) {
			NotificationChain msgs = null;
			if (generates_notification != null)
				msgs = ((InternalEObject)generates_notification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IOTMetaModelPackage.RULE__GENERATES_NOTIFICATION, null, msgs);
			if (newGenerates_notification != null)
				msgs = ((InternalEObject)newGenerates_notification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IOTMetaModelPackage.RULE__GENERATES_NOTIFICATION, null, msgs);
			msgs = basicSetGenerates_notification(newGenerates_notification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, IOTMetaModelPackage.RULE__GENERATES_NOTIFICATION, newGenerates_notification, newGenerates_notification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IOTMetaModelPackage.RULE__GENERATES_NOTIFICATION:
				return basicSetGenerates_notification(null, msgs);
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
			case IOTMetaModelPackage.RULE__APPLY_TO:
				if (resolve) return getApply_to();
				return basicGetApply_to();
			case IOTMetaModelPackage.RULE__ID:
				return getId();
			case IOTMetaModelPackage.RULE__EVENT_TYPE:
				return getEventType();
			case IOTMetaModelPackage.RULE__RULE:
				return getRule();
			case IOTMetaModelPackage.RULE__GENERATES_NOTIFICATION:
				return getGenerates_notification();
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
			case IOTMetaModelPackage.RULE__APPLY_TO:
				setApply_to((Topic)newValue);
				return;
			case IOTMetaModelPackage.RULE__ID:
				setId((Integer)newValue);
				return;
			case IOTMetaModelPackage.RULE__EVENT_TYPE:
				setEventType((String)newValue);
				return;
			case IOTMetaModelPackage.RULE__RULE:
				setRule((String)newValue);
				return;
			case IOTMetaModelPackage.RULE__GENERATES_NOTIFICATION:
				setGenerates_notification((Notification)newValue);
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
			case IOTMetaModelPackage.RULE__APPLY_TO:
				setApply_to((Topic)null);
				return;
			case IOTMetaModelPackage.RULE__ID:
				setId(ID_EDEFAULT);
				return;
			case IOTMetaModelPackage.RULE__EVENT_TYPE:
				setEventType(EVENT_TYPE_EDEFAULT);
				return;
			case IOTMetaModelPackage.RULE__RULE:
				setRule(RULE_EDEFAULT);
				return;
			case IOTMetaModelPackage.RULE__GENERATES_NOTIFICATION:
				setGenerates_notification((Notification)null);
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
			case IOTMetaModelPackage.RULE__APPLY_TO:
				return apply_to != null;
			case IOTMetaModelPackage.RULE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IOTMetaModelPackage.RULE__EVENT_TYPE:
				return EVENT_TYPE_EDEFAULT == null ? eventType != null : !EVENT_TYPE_EDEFAULT.equals(eventType);
			case IOTMetaModelPackage.RULE__RULE:
				return RULE_EDEFAULT == null ? rule != null : !RULE_EDEFAULT.equals(rule);
			case IOTMetaModelPackage.RULE__GENERATES_NOTIFICATION:
				return generates_notification != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", eventType: ");
		result.append(eventType);
		result.append(", rule: ");
		result.append(rule);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
