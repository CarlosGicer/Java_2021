/**
 * 
 */
package poo_t7;

/**
 * @author sjgui
 *
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Openwebinars
 *
 */
public class EjemploFuncional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> lista = Arrays.asList("En", "un", "lugar", "de", "La", "Mancha", "otro");
		
		//Comparator es un interfaz funcional
		Collections.sort(lista, new Comparator<String>() { //Clase anónima

			//Ordenamos la cadena por su longitud
			@Override
			public int compare(String str1, String str2) {
				return str1.length()-str2.length();
			}
			
		});
		
		//Lo mismo de antes con lambda, 
		Collections.sort(lista, (str1, str2)-> str1.length()-str2.length());
		
		//Acepta una instancia de una interfaz funcional, Consumer
		//se le pasa referencia a un método
		lista.forEach(System.out::println);

	}

}