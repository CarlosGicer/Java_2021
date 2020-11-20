/**
 * 
 */
package ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author alumno
 *
 */
public class Clase1 {

	/*
	 * primo - comprueba si un número pasado por parámetro es o no primo
	 * @param number - el número a comprobar
	 */
	public static boolean primo(int numero) {
		boolean esPrimo = true;
		
		//Para comprobar si es o no primo lo dividimos entre todos los números menores hasta el 2.
		//Si algún resto es cero, significa que es divisible y no es primo
		for (int i=2; i<numero; i++) {
			if (numero%i == 0) {
				esPrimo = false;
				break;
			}
		}
		
		return esPrimo;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=1;
		int menor=201;
		int mayor=0;
		int media=0;
		
		try {
			Scanner sc = new Scanner(System.in);
			while ((number != 0)) {
				
				//Bucle para pedir números mientras no estén en el rango 0 - 200
				do {
					System.out.println("Introduce número: ");
					number = sc.nextInt();
					
					//Mensaje de error si el número no está entre 1 y 200
					if ((number < 0) || (number > 200)) 
						System.out.println("El Número introducido no está entre 0 y 200");
						
				}
				while ((number < 0) || (number > 200));
				
				//Actualizar mayor y menor
				if (number > mayor)
					mayor = number;
				if (number < menor)
					menor = number;
				
				if (primo(number))
					System.out.println("Este es un número primo");
										
			}
			
			media = (mayor + menor) / 2;
		} catch (InputMismatchException ex) {
			System.out.println("Error: tipo de dato de entrada no se corresponde");
		}
		
		System.out.println("El mayor es: "+mayor+" y el menor es: "+menor);
		System.out.println("La media de los dos es "+media);

	}

}
