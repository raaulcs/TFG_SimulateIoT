/**
 */
package iOTMetaModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cloud Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iOTMetaModel.IOTMetaModelPackage#getCloudType()
 * @model
 * @generated
 */
public enum CloudType implements Enumerator {
	/**
	 * The '<em><b>AWS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AWS_VALUE
	 * @generated
	 * @ordered
	 */
	AWS(0, "AWS", "AWS"),

	/**
	 * The '<em><b>Azure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AZURE_VALUE
	 * @generated
	 * @ordered
	 */
	AZURE(1, "Azure", "Azure"),

	/**
	 * The '<em><b>Heroku</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEROKU_VALUE
	 * @generated
	 * @ordered
	 */
	HEROKU(2, "Heroku", "Heroku"),

	/**
	 * The '<em><b>Open Shift</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_SHIFT_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_SHIFT(3, "OpenShift", "OpenShift"),

	/**
	 * The '<em><b>Undefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(4, "Undefined", "Undefined");

	/**
	 * The '<em><b>AWS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AWS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AWS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AWS_VALUE = 0;

	/**
	 * The '<em><b>Azure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Azure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AZURE
	 * @model name="Azure"
	 * @generated
	 * @ordered
	 */
	public static final int AZURE_VALUE = 1;

	/**
	 * The '<em><b>Heroku</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Heroku</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEROKU
	 * @model name="Heroku"
	 * @generated
	 * @ordered
	 */
	public static final int HEROKU_VALUE = 2;

	/**
	 * The '<em><b>Open Shift</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open Shift</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_SHIFT
	 * @model name="OpenShift"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_SHIFT_VALUE = 3;

	/**
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undefined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model name="Undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Cloud Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CloudType[] VALUES_ARRAY =
		new CloudType[] {
			AWS,
			AZURE,
			HEROKU,
			OPEN_SHIFT,
			UNDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Cloud Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CloudType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cloud Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CloudType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CloudType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cloud Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CloudType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CloudType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cloud Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CloudType get(int value) {
		switch (value) {
			case AWS_VALUE: return AWS;
			case AZURE_VALUE: return AZURE;
			case HEROKU_VALUE: return HEROKU;
			case OPEN_SHIFT_VALUE: return OPEN_SHIFT;
			case UNDEFINED_VALUE: return UNDEFINED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CloudType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CloudType
