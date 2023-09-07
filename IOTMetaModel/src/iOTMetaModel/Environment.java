/**
 */
package iOTMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.Environment#getName <em>Name</em>}</li>
 *   <li>{@link iOTMetaModel.Environment#getSimulationSpeed <em>Simulation Speed</em>}</li>
 *   <li>{@link iOTMetaModel.Environment#getNumberOfMessages <em>Number Of Messages</em>}</li>
 *   <li>{@link iOTMetaModel.Environment#getNode <em>Node</em>}</li>
 *   <li>{@link iOTMetaModel.Environment#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getEnvironment()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface Environment extends EObject {
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
	 * @see iOTMetaModel.IOTMetaModelPackage#getEnvironment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Environment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Simulation Speed</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulation Speed</em>' attribute.
	 * @see #setSimulationSpeed(Float)
	 * @see iOTMetaModel.IOTMetaModelPackage#getEnvironment_SimulationSpeed()
	 * @model default="1.0"
	 * @generated
	 */
	Float getSimulationSpeed();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Environment#getSimulationSpeed <em>Simulation Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulation Speed</em>' attribute.
	 * @see #getSimulationSpeed()
	 * @generated
	 */
	void setSimulationSpeed(Float value);

	/**
	 * Returns the value of the '<em><b>Number Of Messages</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Messages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Messages</em>' attribute.
	 * @see #setNumberOfMessages(Integer)
	 * @see iOTMetaModel.IOTMetaModelPackage#getEnvironment_NumberOfMessages()
	 * @model default="100"
	 * @generated
	 */
	Integer getNumberOfMessages();

	/**
	 * Sets the value of the '{@link iOTMetaModel.Environment#getNumberOfMessages <em>Number Of Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Messages</em>' attribute.
	 * @see #getNumberOfMessages()
	 * @generated
	 */
	void setNumberOfMessages(Integer value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link iOTMetaModel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see iOTMetaModel.IOTMetaModelPackage#getEnvironment_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link iOTMetaModel.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see iOTMetaModel.IOTMetaModelPackage#getEnvironment_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

} // Environment
