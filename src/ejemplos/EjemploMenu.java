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
public class EjemploMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variable que llevará la opción pulsada
		int opcion,numero1,numero2;
		
		//Creamos el objeto Scanner fuera del bucle
		Scanner tcl = new Scanner(System.in);
		
		try {
			do {
				
				//Opciones del menú
				System.out.println("----------MENÚ---------");
				System.out.println("1. Sumar");
				System.out.println("2. Restar");
				System.out.println("3. Multiplicar");
				System.out.println("4. Salir");
				
				//Pedir por teclado un número
				do {
					opcion = tcl.nextInt();
					
					switch (opcion) {
						case 1: 
							System.out.println("Introduce primer número ");
							numero1 = tcl.nextInt();
							System.out.println("Introduce segundo número ");
							numero2 = tcl.nextInt();	
							System.out.println("El resultado es "+(numero1 + numero2));
							break;
						case 2:
							System.out.println("Introduce primer número ");
							numero1 = tcl.nextInt();
							System.out.println("Introduce segundo número ");
							numero2 = tcl.nextInt();	
							System.out.println("El resultado es "+(numero1 - numero2));
							break;
						case 3:
							System.out.println("Introduce primer número ");
							numero1 = tcl.nextInt();
							System.out.println("Introduce segundo número ");
							numero2 = tcl.nextInt();	
							System.out.println("El resultado es "+(numero1 * numero2));
							break;
						case 4:
							System.out.println("Pulsado 4");
							break;
						default: 
							System.out.println("Opción incorrecta. Pulsa una opción (1,2,3,4)");
					}
					
					
				} while (opcion < 1 || opcion > 4); //Que pida por teclado mientras no escriba 1,2,3 o 4
				
			} while(opcion != 4);
			
			//Cerrar el Scanner
			tcl.close();
		} catch (InputMismatchException ex) {
			System.out.println("Error: no has introducido un valor numérico por teclado");
		} catch (Exception ex) {
			System.out.println("Error: "+ex.getMessage());
		}


	}

}
