/**
 */
package iOTMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iOTMetaModel.ProcessEngine#getProcessEngineProvider <em>Process Engine Provider</em>}</li>
 *   <li>{@link iOTMetaModel.ProcessEngine#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see iOTMetaModel.IOTMetaModelPackage#getProcessEngine()
 * @model abstract="true"
 * @generated
 */
public interface ProcessEngine extends Component {
	/**
	 * Returns the value of the '<em><b>Process Engine Provider</b></em>' attribute.
	 * The default value is <code>"EsperTech"</code>.
	 * The literals are from the enumeration {@link iOTMetaModel.ProcessEngineProvider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Engine Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Engine Provider</em>' attribute.
	 * @see iOTMetaModel.ProcessEngineProvider
	 * @see #setProcessEngineProvider(ProcessEngineProvider)
	 * @see iOTMetaModel.IOTMetaModelPackage#getProcessEngine_ProcessEngineProvider()
	 * @model default="EsperTech"
	 * @generated
	 */
	ProcessEngineProvider getProcessEngineProvider();

	/**
	 * Sets the value of the '{@link iOTMetaModel.ProcessEngine#getProcessEngineProvider <em>Process Engine Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Engine Provider</em>' attribute.
	 * @see iOTMetaModel.ProcessEngineProvider
	 * @see #getProcessEngineProvider()
	 * @generated
	 */
	void setProcessEngineProvider(ProcessEngineProvider value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link iOTMetaModel.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see iOTMetaModel.IOTMetaModelPackage#getProcessEngine_Rule()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='false'"
	 * @generated
	 */
	EList<Rule> getRule();

} // ProcessEngine
