/**
 * 
 */
package poo_t6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author sjgui
 *
 */
public class Patrones {
	
	public static void main(String[] args) {
		
		//Para sustituir un string o una expresión regular en una cadena
		
		//Lo que quiero buscar, la expresión regular
		Pattern patron = Pattern.compile("/");
		
		//La cadena donde voy a buscar
		String cadenaABuscar = new String("/localhost/restaurante/platos/hola");
		
		//Aplicar el patrón de búsqueda a la cadena a buscar
		Matcher buscador = patron.matcher(cadenaABuscar);
		
		StringBuffer sb = new StringBuffer();
		
		//Mientras coincida el patrón con la cadena
		while (buscador.find()) {
			System.out.println("Encontrado");
			buscador.appendReplacement(sb, "|"); //Vamos sustituyendo cada concordancia de / por el nuevo caracter |
												 //y metemos ese trozo en el StringBuffer
		}
		buscador.appendTail(sb); //Meter en el StringBuffer lo último que quede de la cadena después de encontrar por última vez
		System.out.println(sb.toString());
		
		
		//BUSQUEDA QUE UN STRING EMPIEZE POR ABC
		patron = Pattern.compile("^ABC.*");
		Matcher m = patron.matcher("ABC mundo mucho");
		if (m.matches()) {
			System.out.println("Coincide1");
		}
		
		
		//BUSQUEDA QUE UN STRING NO EMPIEZE POR UN DÍGITO
		patron = Pattern.compile("^[^\\d].*");
		m = patron.matcher("1ABC mundo mucho");
		if (m.matches()) {
			System.out.println("Coincide2");
		}
		
		//BUSQUEDA DE UN STRING DENTRO DE OTRO
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cadena a buscar");
		String strBuscado = sc.nextLine();
		
		Pattern p1 = Pattern.compile(strBuscado); //Lo que busco
		
		System.out.println("Dime cadena donde quieres buscar");
		String strDondeBuscar = sc.nextLine();
		
		Matcher m1 = p1.matcher(strDondeBuscar);
		while (m1.find()) {
			System.out.println("He encontrado " + m1.group() + " en " + m1.start());
		}
		
		
	}

}
