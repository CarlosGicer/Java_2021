/**
 * 
 */
package primeraevaluacion;

/**
 * @author sjgui
 *
 */
public class Ejercicio3 {

	public static int[] burbuja(int[] vector) {
		
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
		
		return vector;
	}
	
	/**
	 * ordenaFilas
	 * @param int[][] matriz - matriz a ordenar 
	 */
	public static void ordenaFilas(int[][] matriz) {
		for(int i=0; i<matriz.length; i++)
			burbuja(matriz[i]);
	}
	
	/**
	 * ordenaColumnas
	 * @param int[][] matriz - matriz a ordenar 
	 */
	public static void ordenaColumnas(int[][] matriz) {
		int[] vector = new int[matriz.length];
		
		for(int i=0; i<matriz.length; i++) {
			//Saco cada columna
			for(int j=0; j<matriz[0].length; j++) {
				vector[j] = matriz[j][i];
			}
			
			//La ordeno
			burbuja(vector);
			
			//La copio a la matriz
			for(int j=0; j<matriz[i].length; j++) {
				matriz[j][i] = vector[j];
			}
		}
	}
	
	
	/**
	 * pintarMatriz
	 * @param int[][] matriz - matriz a pintar
	 */
	public static void pintarMatriz(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[5][5];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random()*500 + 1);
			}
		}
		
		pintarMatriz(matriz);
		//ordenaFilas(matriz);
		//pintarMatriz(matriz);
		ordenaColumnas(matriz);
		pintarMatriz(matriz);
		
	}

}
