/**
 * 
 */
package primeraevaluacion;

/**
 * @author sjgui
 *
 */
public class Ejercicio2 {

	/**
	 * CifradoRielCesar
	 * @param String mensaje - cadena de texto a cifrar
	 * @param int clave- clave césar para cifrar
	 */
	public static String cifradoRielCesar(String mensaje, int clave) {
		StringBuffer strb1 = new StringBuffer();
		StringBuffer strb2 = new StringBuffer();
		StringBuffer resultado = new StringBuffer(mensaje.length());
			
		for(int i=0; i<mensaje.length();i+=2) {
			strb1.append( (char) (mensaje.charAt(i) + clave) );
			//Cuando la cadena es impar
			if(i<mensaje.length()-1)
				strb2.append( (char) (mensaje.charAt(i+1) + clave) );
		}
		
		resultado.append(strb1);
		resultado.append(strb2);
		
		return resultado.toString();
	}
	
	/**
	 * DescifradoRielCesar
	 * @param String mensaje - cadena de texto a cifrar
	 * @param int clave- clave césar para cifrar
	 */
	public static String descifradoRielCesar(String mensaje, int clave) {
		int longitud = mensaje.length();
		StringBuffer resultado = new StringBuffer();
		
		if (longitud%2 == 0) {
			for(int i=0; i<longitud/2; i++) {
				resultado.append((char) (mensaje.charAt(i) - clave));
				resultado.append((char) (mensaje.charAt(i+Math.floorDiv(longitud, 2)) - clave));
			}			
		} else {
			for(int i=0; i<=longitud/2; i++) {
				resultado.append((char) (mensaje.charAt(i) - clave));
				if(i<longitud/2)
					resultado.append( (char) (mensaje.charAt(i+Math.floorDiv(longitud, 2)+1) - clave) );
			}
		}
		
		
		return resultado.toString();
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(cifradoRielCesar("Hola mundos",5));
		System.out.println(descifradoRielCesar(cifradoRielCesar("Hola mundos",5),5));
	}

}
