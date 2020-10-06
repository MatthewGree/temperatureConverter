/**
 * Package with classes needed for temperature converter.
 */
package temperature;

/**
 * Class that defines celcius temperature object.
 */
public class CelciusTemperature extends AbstractTemperature {
	/**
	 * Variable that stores value of temperature.
	 */
	private final float temp;

	/**
	 * Main constructor.
	 * @param temp value of temperature
	 */
	public CelciusTemperature(final float temp) {
		this.temp = temp;
	}

	/**
	 * Method that converts temperature.
	 * @return temperature in Fahrenheits
	 */
	public float convert() {
		return (32 + (float) 9 / 5 * temp);
	}
}
