/**
 * Package with classes needed for temperature converter.
 */
package temperature;

/**
 * Class that defines exception thrown by class {@link temperature TemperatureConverter}.
 */
public class TempException extends Exception {
	/**
	 * Main constructor.
	 * @param message message thrown by exeption
	 */
	public TempException(final String message) {
		super(message);
	}
}
