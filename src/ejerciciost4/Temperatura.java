/**
 * 
 */
package ejerciciost4;

/**
 * @author sjgui
 *
 */
public class Temperatura {
	
	public static double celsiusToFarenheit(double celsius) {
		return (1.8 * celsius) + 32;
	}

	public static double farenheitToCelsius(double farenheit) {
		return (farenheit - 32) / 1.8;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Temperatura.celsiusToFarenheit(30));
	}
}
