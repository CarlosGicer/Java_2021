/**
 * 
 */
package ejemplos;

/**
 * @author sjgui
 *
 */
public class Ejercicio14T2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0; i<4; i++) {
			//Imprimir espacios
			for (int j=4; j>i+1; j--) {
				System.out.print(" ");
			}
			//Imprimir asteriscos
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
