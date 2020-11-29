/**
 * 
 */
package ejemplos;

/**
 * @author sjgui
 *
 */
public class DesplazarArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] vector = {1,2,3,4,5,6,7,8,9};
		int posicion = 3;
		
		//Desplazar el array eliminando lo que hay en la posición indicada
		for(int i=posicion; i<vector.length-1; i++) {
			vector[i] = vector[i+1];
		}
		vector[vector.length-1] = -1;
		
		for(int i=0;i<vector.length;i++) {
			System.out.print(vector[i]+" ");
		}
		
		

	}

}
