/**
 * 
 */
package ejemplos;

import java.util.Scanner;

/**
 * @author sjgui
 *
 */
public class Ejercicio3Strings {

	public static boolean esPalindromo(String palabra) {
		StringBuffer palabraNueva = new StringBuffer(palabra);
		
		if(palabra.equals(palabraNueva.reverse().toString())) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean esPalindromo2(String palabra) {
		
		int i=0;
		int j=palabra.length()-1;
		
		//Vamos recorriendo la cadena desde el principio y desde el final
		while (i < j) { 
			if (palabra.charAt(i) == palabra.charAt(j)) {
				i++;
				j--;
			} else {
				break;
			}
		}
		
		if(i >= j) 
			return true;
		else
			return false;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cadena: ");
		String cadena = sc.nextLine();
		System.out.println("Introduce subcadena a buscar:");
		String subc = sc.nextLine();
		
		//En un lugar de la mancha de cuyo nombre no quiero de acordarme ...
		
		int posicion=0;
		int veces=0;
		
		//Mientras lo encuentre
		while (posicion != -1) {
			posicion = cadena.indexOf(subc, posicion);
			if (posicion > -1) {
				veces++;
				posicion++;
			}
		}
		
		System.out.println("La subcadena "+subc+" aparece "+veces+" veces en '"+cadena+"'");

		
		//Invertir un String
		String cadena = new String("Hola Mundo");
		char[] resultado = new char[cadena.length()];
		
		int j=0; 
		for(int i=cadena.length()-1; i>=0; i--) {
			resultado[j] = cadena.charAt(i);
			j++;
		}
		
		String resulStr = String.valueOf(resultado);
		
		System.out.println(resultado);
		System.out.println(resulStr);
		
		//Comprobar si es palíndromo
*/		
		
		String palabra;
		Scanner palindromo = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");
		palabra = palindromo.next();
		
		if(esPalindromo2(palabra)) {
			System.out.println("Es Palindromo");
		}else {
			System.out.println("No es Palindromo");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
