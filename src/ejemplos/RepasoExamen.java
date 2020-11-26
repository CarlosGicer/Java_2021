/**
 * 
 */
package ejemplos;

/**
 * @author alumno
 *
 */
public class RepasoExamen {
	
	public static void pintarMatriz(int[][] matriz) {
		for (int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}	

	public static void pintarVector(int[] vector) {
		for (int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}

	//Obtener una columna de una matriz
	public static int[] obtenerColumna(int[][] matriz,int x) {
		int tam = matriz.length; //Número de columnas
		int[] vector = new int[tam];
		
		for(int i=0; i<tam; i++) {
			vector[i] = matriz[i][x];
		}
		
		return vector;
	}
	
	//Sumar columna de una matriz
	public static int obtenerSumaColumna(int[][] matriz,int x) {
		int tam = matriz.length; //Número de columnas
		int[] vector = new int[tam];
		int suma=0;
		
		for(int i=0; i<tam; i++) {
			suma += matriz[i][x];
		}
		
		return suma;
	}	
	
	//Calcular la suma de una matriz por columnas
	public static int[] sumarColumnas(int[][] matriz) {
		int tam = matriz[0].length;
		int[] sumas = new int[tam];
		int suma=0;
		
		for(int j=0; j<matriz[0].length; j++) {
			for(int i=0; i<matriz.length; i++) {
				suma += matriz[i][j];
			}
			sumas[j] = suma;
			suma = 0;
		}
		
		return sumas;
	}
	
	//Sumar columnas versión Ismael
	public static int[] sumarColumnas2(int[][] matriz) {
		int tam = matriz[0].length;
		int[] sumas = new int[tam];
		int[] columna =new int[tam];
		int suma=0;
		
		for(int j=0; j<matriz[0].length; j++) {
			sumas[j] = obtenerSumaColumna(matriz,j);	
		}
		
		return sumas;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] matriz = new int[5][6];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				matriz[i][j] = (int) (Math.random()*100)+1; 
			}
		}
		pintarMatriz(matriz);
		//pintarVector(matriz[3]);
		//pintarVector(matriz[1]);
		
		//pintarVector( obtenerColumna(matriz,2) );
		pintarVector( sumarColumnas(matriz) );
		pintarVector( sumarColumnas2(matriz) );

	}

}
