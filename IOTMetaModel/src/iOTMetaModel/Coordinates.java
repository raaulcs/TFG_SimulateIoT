/**
 */
package iOTMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.Coordinates#getName <em>Name</em>}</li>
 *   <li>{@link iOTMetaModel.Coordinates#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link iOTMetaModel.Coordinates#getLongitude <em>Longitude</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getCoordinates()
 * @model annotation="gmf.node label='name' tool.small.bundle='IOTMetaModel' tool.small.path='imagenes/xy.png' tool.large.bundle='IOTMetaModel' tool.large.path='imagenes/xy.png' label.icon='true' label.placement='external'"
 * @generated
 */
public interface Coordinates extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iOTMetaModel.IOTMetaModelPackage#getCoordinates_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Coordinates#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(Integer)
	 * @see iOTMetaModel.IOTMetaModelPackage#getCoordinates_Latitude()
	 * @model
	 * @generated
	 */
	Integer getLatitude();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Coordinates#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(Integer value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(Integer)
	 * @see iOTMetaModel.IOTMetaModelPackage#getCoordinates_Longitude()
	 * @model
	 * @generated
	 */
	Integer getLongitude();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Coordinates#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(Integer value);

} // Coordinates
