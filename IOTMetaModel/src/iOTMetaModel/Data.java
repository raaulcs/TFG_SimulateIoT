/**
 */
package iOTMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.Data#getName <em>Name</em>}</li>
 *   <li>{@link iOTMetaModel.Data#getId <em>Id</em>}</li>
 *   <li>{@link iOTMetaModel.Data#getDataType <em>Data Type</em>}</li>
 *   <li>{@link iOTMetaModel.Data#getDatasource <em>Datasource</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getData()
 * @model annotation="gmf.node label='name' color='226,150,152' tool.small.bundle='IOTMetaModel' tool.small.path='imagenes/data.png' tool.large.bundle='IOTMetaModel' tool.large.path='imagenes/data.png' label.placement='internal' label.icon='true'"
 * @generated
 */
public interface Data extends EObject {
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
	 * @see iOTMetaModel.IOTMetaModelPackage#getData_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Data#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see iOTMetaModel.IOTMetaModelPackage#getData_Id()
	 * @model default="0"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Data#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The default value is <code>"INTEGER"</code>.
	 * The literals are from the enumeration {@link iOTMetaModel.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see iOTMetaModel.DataType
	 * @see #setDataType(DataType)
	 * @see iOTMetaModel.IOTMetaModelPackage#getData_DataType()
	 * @model default="INTEGER"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Data#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see iOTMetaModel.DataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Datasource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datasource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasource</em>' containment reference.
	 * @see #setDatasource(DataSource)
	 * @see iOTMetaModel.IOTMetaModelPackage#getData_Datasource()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment collapsible='false'"
	 * @generated
	 */
	DataSource getDatasource();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Data#getDatasource <em>Datasource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datasource</em>' containment reference.
	 * @see #getDatasource()
	 * @generated
	 */
	void setDatasource(DataSource value);

} // Data
