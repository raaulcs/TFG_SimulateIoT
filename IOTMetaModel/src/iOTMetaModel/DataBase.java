/**
 */
package iOTMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.DataBase#getDataBaseProvider <em>Data Base Provider</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getDataBase()
 * @model abstract="true"
 * @generated
 */
public interface DataBase extends Component {
	/**
	 * Returns the value of the '<em><b>Data Base Provider</b></em>' attribute.
	 * The default value is <code>"MongoDB"</code>.
	 * The literals are from the enumeration {@link iOTMetaModel.DataBaseProvider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Base Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Base Provider</em>' attribute.
	 * @see iOTMetaModel.DataBaseProvider
	 * @see #setDataBaseProvider(DataBaseProvider)
	 * @see iOTMetaModel.IOTMetaModelPackage#getDataBase_DataBaseProvider()
	 * @model default="MongoDB"
	 * @generated
	 */
	DataBaseProvider getDataBaseProvider();

	/**
	 * Sets the value of the '{@link iOTMetaModel.DataBase#getDataBaseProvider <em>Data Base Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Base Provider</em>' attribute.
	 * @see iOTMetaModel.DataBaseProvider
	 * @see #getDataBaseProvider()
	 * @generated
	 */
	void setDataBaseProvider(DataBaseProvider value);

} // DataBase
