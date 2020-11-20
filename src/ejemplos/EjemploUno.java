/**
 *  Paquete de ejemplos de clase Tema1
 */
package ejemplos;

import java.util.Scanner;

/**
 * @author Javier
 * Primer ejemplo de clase
 *
 */
public class EjemploUno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Me queda a�adir otro mensaje.
		int h=0,m=0,s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los segundos: ");
		int t = sc.nextInt();
		h = t / 3600;
		m = (t - h * 3600) / 60;
		s = t - (h * 3600 + m * 60);
		System.out.println("Los segundos "+ t +" son "+ h +" : "+ m +" : "+ s);

	}

}
