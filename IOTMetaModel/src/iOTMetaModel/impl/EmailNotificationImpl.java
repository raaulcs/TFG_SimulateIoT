/**
 */
package iOTMetaModel.impl;

import iOTMetaModel.EmailNotification;
import iOTMetaModel.IOTMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Email Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.impl.EmailNotificationImpl#getDestinyNotification <em>Destiny Notification</em>}</li>
 *   <li>{@link iOTMetaModel.impl.EmailNotificationImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link iOTMetaModel.impl.EmailNotificationImpl#getSMTPserver <em>SMT Pserver</em>}</li>
 *   <li>{@link iOTMetaModel.impl.EmailNotificationImpl#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmailNotificationImpl extends NotificationImpl implements EmailNotification {
	/**
	 * The default value of the '{@link #getDestinyNotification() <em>Destiny Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinyNotification()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINY_NOTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinyNotification() <em>Destiny Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinyNotification()
	 * @generated
	 * @ordered
	 */
	protected String destinyNotification = DESTINY_NOTIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSMTPserver() <em>SMT Pserver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMTPserver()
	 * @generated
	 * @ordered
	 */
	protected static final String SMT_PSERVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSMTPserver() <em>SMT Pserver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMTPserver()
	 * @generated
	 * @ordered
	 */
	protected String smtPserver = SMT_PSERVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmailNotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IOTMetaModelPackage.Literals.EMAIL_NOTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDestinyNotification() {
		return destinyNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinyNotification(String newDestinyNotification) {
		String oldDestinyNotification = destinyNotification;
		destinyNotification = newDestinyNotification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.EMAIL_NOTIFICATION__DESTINY_NOTIFICATION, oldDestinyNotification, destinyNotification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.EMAIL_NOTIFICATION__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSMTPserver() {
		return smtPserver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSMTPserver(String newSMTPserver) {
		String oldSMTPserver = smtPserver;
		smtPserver = newSMTPserver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.EMAIL_NOTIFICATION__SMT_PSERVER, oldSMTPserver, smtPserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IOTMetaModelPackage.EMAIL_NOTIFICATION__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IOTMetaModelPackage.EMAIL_NOTIFICATION__DESTINY_NOTIFICATION:
				return getDestinyNotification();
			case IOTMetaModelPackage.EMAIL_NOTIFICATION__USERNAME:
				return getUsername();
			case IOTMetaModelPackage.EMAIL_NOTIFICATION__SMT_PSERVER:
				return getSMTPserver();
			case IOTMetaModelPackage.EMAIL_NOTIFICATION__PASSWORD:
				return getPassword();
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
			case IOTMetaModelPackage.EMAIL_NOTIFICATION__DESTINY_NOTIFICATION:
				setDestinyNotification((String)newValue);
				return;
			case IOTMetaModelPackage.EMAIL_NOTIFICATION__USERNAME:
				setUsername((String)newValue);
				return;
			case IOTMetaModelPackage.EMAIL_NOTIFICATION__SMT_PSERVER:
				setSMTPserver((String)newValue);
				return;
			case IOTMetaModelPackage.EMAIL_NOTIFICATION__PASSWORD:
				setPassword((String)newValue);
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
			case IOTMetaModelPackage.EMAIL_NOTIFICATION__DESTINY_NOTIFICATION:
				setDestinyNotification(DESTINY_NOTIFICATION_EDEFAULT);
				return;
			case IOTMetaModelPackage.EMAIL_NOTIFICATION__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case IOTMetaModelPackage.EMAIL_NOTIFICATION__SMT_PSERVER:
				setSMTPserver(SMT_PSERVER_EDEFAULT);
				return;
			case IOTMetaModelPackage.EMAIL_NOTIFICATION__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
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
			case IOTMetaModelPackage.EMAIL_NOTIFICATION__DESTINY_NOTIFICATION:
				return DESTINY_NOTIFICATION_EDEFAULT == null ? destinyNotification != null : !DESTINY_NOTIFICATION_EDEFAULT.equals(destinyNotification);
			case IOTMetaModelPackage.EMAIL_NOTIFICATION__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case IOTMetaModelPackage.EMAIL_NOTIFICATION__SMT_PSERVER:
				return SMT_PSERVER_EDEFAULT == null ? smtPserver != null : !SMT_PSERVER_EDEFAULT.equals(smtPserver);
			case IOTMetaModelPackage.EMAIL_NOTIFICATION__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
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
		result.append(" (destinyNotification: ");
		result.append(destinyNotification);
		result.append(", username: ");
		result.append(username);
		result.append(", SMTPserver: ");
		result.append(smtPserver);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //EmailNotificationImpl
