/**
 * 
 */
package ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author sjgui
 *
 */
public class EjemploBufferedReader {

	/**
	 * Descuento, que calcula el precio tras aplicarle un descuento
	 * @param precio
	 * @param descuento - se recibe como un número entre 1 y 100, porcentaje de descuento
	 * @return el precio menos el descuento aplicado
	 */
	public static double descuento(double precio, int descuento) {
		return (precio - (precio * descuento / 100));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos el objeto BufferedReader para leer de teclado
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Lectura de teclado
		try {
			System.out.println("Dime nombre de producto: ");
			String nombre = br.readLine();
			System.out.println("Dime tu precio ");
			String precioCadena = br.readLine();
			double precio = Double.parseDouble(precioCadena);
			System.out.println("Dime descuento a aplicar: ");
			String descuentoCadena = br.readLine();
			int descuento = Integer.parseInt(descuentoCadena);
			//El precio final es el precio menos el descuento (%)
			double precioFinal = descuento(precio,descuento);
			
			System.out.println("El producto "+nombre+" cuesta "+precioFinal+" €");
		} catch (IOException ex) {
			System.out.println("Error IO "+ex.getMessage());
		} catch (NumberFormatException ex) {
			System.out.println("Error Formato de Número "+ex.getMessage());
		}
		
	}

}
