/**
 * 
 */
package ejemplos;

/**
 * @author alumno
 *
 */
public class Ej1AlgOrd {

	//Algoritmo Burbuja
	public static void burbuja(int[] vector) {
		
		int aux;
		for (int i=vector.length;i>0;i--) {
			for(int j=0;j<i-1;j++) {
				if (vector[j] > vector[j+1]) {
					aux = vector[j+1];
					vector[j+1] = vector[j];
					vector[j] = aux;
				}
			}
		}
	}
	
	//Pintar vector
	public static void pintarVector(int[] vector) {
		for (int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vector = new int[50];
		for(int i=0; i<vector.length; i++) {
			vector[i] = (int) (Math.random()*100+1);
		}
		
		pintarVector(vector);System.out.println();
		burbuja(vector);
		pintarVector(vector);
		
	}

}
