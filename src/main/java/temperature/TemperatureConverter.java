/**
 * Package with classes needed for temperature converter.
 */
package temperature;

import java.util.Scanner;

/**
 * Main class of the app.
 */
public class TemperatureConverter {
	/**
	 * Method that validates letter.
	 * @param letter data to validate
	 * @throws TempException thrown when letter is wrong
	 */
	private static void ifCorrectLetter(final String letter) throws TempException {
		if (!(("c").equals(letter) || ("f").equals(letter))) {
			throw new TempException("Podano niepoprawna litere");
		}

	}

	/**
	 * Main method.
	 * @param args not used
	 */
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Konwerter temperatury-----");
		System.out.println("Wpisz literke 'c', aby przeprowadzic konwersje z stopni Celsjusza na Fahrenheita lub 'f', gdy chcesz"
				+ "przeprowadzic konwersje w druga strone." + "\n" + "Po przecinku wprowadz wartosc temperatury.");
		String input = sc.nextLine();
		String[] data = input.split(",");
		try {
			ifCorrectLetter(data[0]);
			float tempValue = Float.parseFloat(data[1]);
			AbstractTemperature temp;
			if ("c".equals(data[0])) {
				temp = new CelciusTemperature(tempValue);
				System.out.println(temp.convert());
			} else {
				temp = new FahrenheitTemperature(tempValue);
				System.out.println(temp.convert());
			}
		}
		catch (TempException ex) {
			System.out.println(ex.getMessage());
		}
		catch (NumberFormatException ex1) {
			System.out.println(ex1.getMessage());
		}
		sc.close();
	}
}
