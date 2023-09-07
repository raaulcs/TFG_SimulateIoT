/**
 */
package iOTMetaModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Arduino Device Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see iOTMetaModel.IOTMetaModelPackage#getArduinoDeviceType()
 * @model
 * @generated
 */
public enum ArduinoDeviceType implements Enumerator {
	/**
	 * The '<em><b>Thermistor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMISTOR_VALUE
	 * @generated
	 * @ordered
	 */
	THERMISTOR(0, "Thermistor", "Thermistor"),

	/**
	 * The '<em><b>Rotatory Potentiometer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROTATORY_POTENTIOMETER_VALUE
	 * @generated
	 * @ordered
	 */
	ROTATORY_POTENTIOMETER(1, "RotatoryPotentiometer", "RotatoryPotentiometer"),

	/**
	 * The '<em><b>Tilt Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TILT_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	TILT_SENSOR(2, "TiltSensor", "TiltSensor"),

	/**
	 * The '<em><b>Photoresistor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHOTORESISTOR_VALUE
	 * @generated
	 * @ordered
	 */
	PHOTORESISTOR(3, "Photoresistor", "Photoresistor"),

	/**
	 * The '<em><b>Accelerometer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCELEROMETER_VALUE
	 * @generated
	 * @ordered
	 */
	ACCELEROMETER(4, "Accelerometer", "Accelerometer"),

	/**
	 * The '<em><b>Pushbutton Module</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSHBUTTON_MODULE_VALUE
	 * @generated
	 * @ordered
	 */
	PUSHBUTTON_MODULE(5, "PushbuttonModule", "PushbuttonModule"),

	/**
	 * The '<em><b>Linear Potentiometer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEAR_POTENTIOMETER_VALUE
	 * @generated
	 * @ordered
	 */
	LINEAR_POTENTIOMETER(6, "LinearPotentiometer", "LinearPotentiometer"),

	/**
	 * The '<em><b>Touch Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOUCH_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	TOUCH_SENSOR(7, "TouchSensor", "TouchSensor"),

	/**
	 * The '<em><b>Joystick Module</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOYSTICK_MODULE_VALUE
	 * @generated
	 * @ordered
	 */
	JOYSTICK_MODULE(8, "JoystickModule", "JoystickModule"),

	/**
	 * The '<em><b>Gyroscope</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GYROSCOPE_VALUE
	 * @generated
	 * @ordered
	 */
	GYROSCOPE(9, "Gyroscope", "Gyroscope"),

	/**
	 * The '<em><b>Hall Sensor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALL_SENSOR_VALUE
	 * @generated
	 * @ordered
	 */
	HALL_SENSOR(10, "HallSensor", "HallSensor"),

	/**
	 * The '<em><b>LED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LED_VALUE
	 * @generated
	 * @ordered
	 */
	LED(11, "LED", "LED"),

	/**
	 * The '<em><b>High Power LED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_POWER_LED_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_POWER_LED(12, "HighPowerLED", "HighPowerLED"),

	/**
	 * The '<em><b>Mosfet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOSFET_VALUE
	 * @generated
	 * @ordered
	 */
	MOSFET(13, "Mosfet", "Mosfet"),

	/**
	 * The '<em><b>Relay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELAY_VALUE
	 * @generated
	 * @ordered
	 */
	RELAY(14, "Relay", "Relay");

	/**
	 * The '<em><b>Thermistor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Thermistor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THERMISTOR
	 * @model name="Thermistor"
	 * @generated
	 * @ordered
	 */
	public static final int THERMISTOR_VALUE = 0;

	/**
	 * The '<em><b>Rotatory Potentiometer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rotatory Potentiometer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROTATORY_POTENTIOMETER
	 * @model name="RotatoryPotentiometer"
	 * @generated
	 * @ordered
	 */
	public static final int ROTATORY_POTENTIOMETER_VALUE = 1;

	/**
	 * The '<em><b>Tilt Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tilt Sensor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TILT_SENSOR
	 * @model name="TiltSensor"
	 * @generated
	 * @ordered
	 */
	public static final int TILT_SENSOR_VALUE = 2;

	/**
	 * The '<em><b>Photoresistor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Photoresistor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHOTORESISTOR
	 * @model name="Photoresistor"
	 * @generated
	 * @ordered
	 */
	public static final int PHOTORESISTOR_VALUE = 3;

	/**
	 * The '<em><b>Accelerometer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Accelerometer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCELEROMETER
	 * @model name="Accelerometer"
	 * @generated
	 * @ordered
	 */
	public static final int ACCELEROMETER_VALUE = 4;

	/**
	 * The '<em><b>Pushbutton Module</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pushbutton Module</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUSHBUTTON_MODULE
	 * @model name="PushbuttonModule"
	 * @generated
	 * @ordered
	 */
	public static final int PUSHBUTTON_MODULE_VALUE = 5;

	/**
	 * The '<em><b>Linear Potentiometer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Linear Potentiometer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINEAR_POTENTIOMETER
	 * @model name="LinearPotentiometer"
	 * @generated
	 * @ordered
	 */
	public static final int LINEAR_POTENTIOMETER_VALUE = 6;

	/**
	 * The '<em><b>Touch Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Touch Sensor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOUCH_SENSOR
	 * @model name="TouchSensor"
	 * @generated
	 * @ordered
	 */
	public static final int TOUCH_SENSOR_VALUE = 7;

	/**
	 * The '<em><b>Joystick Module</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Joystick Module</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOYSTICK_MODULE
	 * @model name="JoystickModule"
	 * @generated
	 * @ordered
	 */
	public static final int JOYSTICK_MODULE_VALUE = 8;

	/**
	 * The '<em><b>Gyroscope</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gyroscope</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GYROSCOPE
	 * @model name="Gyroscope"
	 * @generated
	 * @ordered
	 */
	public static final int GYROSCOPE_VALUE = 9;

	/**
	 * The '<em><b>Hall Sensor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hall Sensor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALL_SENSOR
	 * @model name="HallSensor"
	 * @generated
	 * @ordered
	 */
	public static final int HALL_SENSOR_VALUE = 10;

	/**
	 * The '<em><b>LED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LED_VALUE = 11;

	/**
	 * The '<em><b>High Power LED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>High Power LED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH_POWER_LED
	 * @model name="HighPowerLED"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_POWER_LED_VALUE = 12;

	/**
	 * The '<em><b>Mosfet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mosfet</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOSFET
	 * @model name="Mosfet"
	 * @generated
	 * @ordered
	 */
	public static final int MOSFET_VALUE = 13;

	/**
	 * The '<em><b>Relay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Relay</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELAY
	 * @model name="Relay"
	 * @generated
	 * @ordered
	 */
	public static final int RELAY_VALUE = 14;

	/**
	 * An array of all the '<em><b>Arduino Device Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArduinoDeviceType[] VALUES_ARRAY =
		new ArduinoDeviceType[] {
			THERMISTOR,
			ROTATORY_POTENTIOMETER,
			TILT_SENSOR,
			PHOTORESISTOR,
			ACCELEROMETER,
			PUSHBUTTON_MODULE,
			LINEAR_POTENTIOMETER,
			TOUCH_SENSOR,
			JOYSTICK_MODULE,
			GYROSCOPE,
			HALL_SENSOR,
			LED,
			HIGH_POWER_LED,
			MOSFET,
			RELAY,
		};

	/**
	 * A public read-only list of all the '<em><b>Arduino Device Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArduinoDeviceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Arduino Device Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArduinoDeviceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArduinoDeviceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arduino Device Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArduinoDeviceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArduinoDeviceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Arduino Device Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArduinoDeviceType get(int value) {
		switch (value) {
			case THERMISTOR_VALUE: return THERMISTOR;
			case ROTATORY_POTENTIOMETER_VALUE: return ROTATORY_POTENTIOMETER;
			case TILT_SENSOR_VALUE: return TILT_SENSOR;
			case PHOTORESISTOR_VALUE: return PHOTORESISTOR;
			case ACCELEROMETER_VALUE: return ACCELEROMETER;
			case PUSHBUTTON_MODULE_VALUE: return PUSHBUTTON_MODULE;
			case LINEAR_POTENTIOMETER_VALUE: return LINEAR_POTENTIOMETER;
			case TOUCH_SENSOR_VALUE: return TOUCH_SENSOR;
			case JOYSTICK_MODULE_VALUE: return JOYSTICK_MODULE;
			case GYROSCOPE_VALUE: return GYROSCOPE;
			case HALL_SENSOR_VALUE: return HALL_SENSOR;
			case LED_VALUE: return LED;
			case HIGH_POWER_LED_VALUE: return HIGH_POWER_LED;
			case MOSFET_VALUE: return MOSFET;
			case RELAY_VALUE: return RELAY;
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
	private ArduinoDeviceType(int value, String name, String literal) {
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
	
} //ArduinoDeviceType
