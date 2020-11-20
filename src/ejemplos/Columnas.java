package ejemplos;

public class Columnas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = { {1,1,1} , {2,2,2}, {3,3,3} };
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
		
		for(int i=0; i<matriz[0].length; i++) {
			for(int j=0; j<matriz.length; j++) {
				System.out.print(matriz[j][i]);
			}
			System.out.println();
		}
		

	}

}
