/**
 * 
 */
package ejemplos;

/**
 * @author sjgui
 *
 */
public class GeneradorStrings {

	/**
	 * Genera un string aleatorio entre 2 y 20 letras con letras minúsculas
	 */
	public static String generarString() {
		int longitud = (int) (Math.random()*18)+2;
		StringBuffer strb = new StringBuffer();
		int ascii=0;
		char[] vocales = {'a','e','i','o','u'};
		char[] consonantes = {'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};
		
		for(int i=0; i<longitud; i+=2) {
			strb.append(vocales[(int) (Math.random()*5)]);
			strb.append(consonantes[(int) (Math.random()*22)]);
		}
		
		return strb.toString();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(generarString());
	}

}
