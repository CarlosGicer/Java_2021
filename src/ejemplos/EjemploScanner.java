/**
 * 
 */
package ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author sjgui
 *
 */
public class EjemploScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Dame tu nombre");
			String nombre = sc.nextLine();
	
			System.out.println("Dime tu edad");
			int edad = sc.nextInt();
			
			System.out.println("Hola "+nombre+" tienes "+edad+" años.");
			sc.close();
		} catch (InputMismatchException ex) {
			System.out.println("Error: tipo de dato de entrada no se corresponde");
		}

	}

}
