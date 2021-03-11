/**
 * 
 */
package ejerciciost6.practica1;

import java.util.Scanner;

/**
 * @author Francisco Castro Ma�as
 *
 */
public class DoctoradoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String nombre, titulacion, nombreTesis;
		double notaMedia, notaTesis;
		
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Introduce los datos del alumno de doctorado: ");
		System.out.print("Nombre del alumno: ");
		nombre = datos.nextLine();
		System.out.print("Nota media: ");
		notaMedia = datos.nextDouble();
		System.out.print("Titulacion: ");
		titulacion = datos.nextLine();
		titulacion = datos.nextLine();
		System.out.println("Nota de la tesis: ");
		notaTesis = datos.nextDouble();
		System.out.println("Nombre de la tesis: ");
		nombreTesis = datos.nextLine();
		nombreTesis = datos.nextLine();
		
		Doctorado doctorado = new Doctorado(nombre, notaMedia,titulacion, nombreTesis, notaTesis);
		
		System.out.println("\nLos datos introducidos son: ");
		System.out.println(doctorado.toString());
		
	}

}
