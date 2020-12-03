/**
 * 
 */
package primeraevaluacion;

import java.util.Scanner;

/**
 * @author sjgui
 *
 */
public class Ejercicio4 {

	public static void imprimirNumero(int[] numero) {
		for(int i=0; i<numero.length;i++) {
			System.out.print(numero[i]);
		}
		System.out.println();
	}
	
	public static int convertir(int[] numero) {
		int resultado=0;
		for(int i=0; i<numero.length; i++) {
			resultado += numero[i]*Math.pow(10, i);
		}
		
		return resultado;
	}
	
	public static int comprobar(String adivinado, int[] numero) {
		int aciertos = 0;
		
		if (adivinado.length() != numero.length)
			return -1;
		
		for(int i=0; i<numero.length;i++) {
			if (Integer.parseInt(Character.toString(adivinado.charAt(i))) == numero[i])
				aciertos++;
		}
		
		return aciertos;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int longitud;
		int[] numero;
		String adivinado = "";
		int aciertos;
		
		Scanner sc = new Scanner(System.in);
		
		int opcion=0;
		while (opcion != 2) {
			System.out.println("1. Nueva partida");
			System.out.println("2. Salir");
			opcion = sc.nextInt();
			
			//Nueva partida
			if (opcion == 1) {
				//Generar cadena nueva
				longitud = (int) (Math.random()*7 + 2);
				numero = new int[longitud];
				for(int i=0; i<longitud;i++) {
					numero[i] = (int) (Math.random() * 9 + 1);
				}
				
				imprimirNumero(numero);
				
				System.out.println("Introduce un número de "+numero.length+" cifras");
				
				while ( (adivinado != "0" ) ) {
					adivinado = sc.nextLine();
					
					aciertos = comprobar(adivinado, numero);
					
					if (aciertos == -1) {
						System.out.println("Introduce un número de la misma longitud del número");
					} else {
						System.out.print("Tienes "+aciertos+" aciertos");
						if (aciertos == numero.length) {
							System.out.println(" ACERTASTE");
							break;
						} else {
							System.out.println(" Vuelve a intentarlo");
						}
					}
				}
				
			}
		}
		sc.close();
		
		System.out.println("Adiós, hasta otra");
	}

}
