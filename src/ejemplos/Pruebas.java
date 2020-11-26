package ejemplos;

public class Pruebas {

	public static int[] fila(int i, int[][] matriz) {
		return matriz[i];
	}
	
	public static void pintarVector(int[] vector) {
		for (int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}
	
	public static void pintarMatriz(int[][] matriz) {
		for (int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = new int[10][10];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0;j<matriz.length; j++) {
				matriz[i][j] = i+j;
			}
		}
		System.out.println("Matriz:");
		pintarMatriz(matriz);
		
		int[] fila = fila(2,matriz);
		System.out.println("Vector:");
		pintarVector(fila);

	}

}
