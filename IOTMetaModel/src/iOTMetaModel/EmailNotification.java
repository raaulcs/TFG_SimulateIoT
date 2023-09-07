/**
 */
package iOTMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.EmailNotification#getDestinyNotification <em>Destiny Notification</em>}</li>
 *   <li>{@link iOTMetaModel.EmailNotification#getUsername <em>Username</em>}</li>
 *   <li>{@link iOTMetaModel.EmailNotification#getSMTPserver <em>SMT Pserver</em>}</li>
 *   <li>{@link iOTMetaModel.EmailNotification#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getEmailNotification()
 * @model annotation="gmf.node tool.small.bundle='IOTMetaModel' color='191,248,203' figure='svg' svg.uri='platform:/plugin/IOTMetaModel/imagenes/gmail.svg' tool.small.path='imagenes/gmail.png' tool.large.bundle='IOTMetaModel' tool.large.path='imagenes/gmail.png' label.placement='external'"
 * @generated
 */
public interface EmailNotification extends Notification {
	/**
	 * Returns the value of the '<em><b>Destiny Notification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destiny Notification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destiny Notification</em>' attribute.
	 * @see #setDestinyNotification(String)
	 * @see iOTMetaModel.IOTMetaModelPackage#getEmailNotification_DestinyNotification()
	 * @model
	 * @generated
	 */
	String getDestinyNotification();

	/**
	 * Sets the value of the '{@link iOTMetaModel.EmailNotification#getDestinyNotification <em>Destiny Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destiny Notification</em>' attribute.
	 * @see #getDestinyNotification()
	 * @generated
	 */
	void setDestinyNotification(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see iOTMetaModel.IOTMetaModelPackage#getEmailNotification_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link iOTMetaModel.EmailNotification#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>SMT Pserver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SMT Pserver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SMT Pserver</em>' attribute.
	 * @see #setSMTPserver(String)
	 * @see iOTMetaModel.IOTMetaModelPackage#getEmailNotification_SMTPserver()
	 * @model
	 * @generated
	 */
	String getSMTPserver();

	/**
	 * Sets the value of the '{@link iOTMetaModel.EmailNotification#getSMTPserver <em>SMT Pserver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SMT Pserver</em>' attribute.
	 * @see #getSMTPserver()
	 * @generated
	 */
	void setSMTPserver(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see iOTMetaModel.IOTMetaModelPackage#getEmailNotification_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link iOTMetaModel.EmailNotification#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // EmailNotification
