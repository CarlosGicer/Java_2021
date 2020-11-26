/**
 * 
 */
package ejemplos;

/**
 * @author alumno
 *
 */
public class ExamenString {

	public static String eliminarCaracter(String cadena, String car) {
		//Creamos StringBuffer con la cadena a modificar
		StringBuffer strb = new StringBuffer(cadena);
		int posicion = 0;
		
		//Mientras lo encuentre que siga buscando
		while (posicion != -1) {
			posicion = strb.indexOf(car,posicion);
			//Si lo encuentra que elimine el caracter en esa posición
			//La posición no hay que modificarla puesto que deleteCharAt quita un elemento del StringBuffer
			if (posicion > -1)
				strb.deleteCharAt(posicion);
		}
		
		return strb.toString();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(eliminarCaracter("Hola don Pepito","o"));
		
	}

}
