/**
 * Package with classes needed for temperature converter.
 */
package temperature;

/**
 * Class that defines fahrenheit temperature object.
 */
public class FahrenheitTemperature extends AbstractTemperature {
	/**
	 * Variable that stores value of temperature.
	 */
	private final float temp;

	/**
	 * Main constructor.
	 * @param temp value of temperature
	 */
	public FahrenheitTemperature(final float temp) {
		this.temp = temp;
	}

	/**
	 * Method that converts temperature.
	 * @return temperature in Celcius
	 */
	public float convert() {
		return ((float) 5 / 9 * (temp - 32));
	}
}
