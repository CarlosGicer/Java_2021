package ejemplos;

import java.util.Arrays;

public class Ordenacion {


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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear array
		int[] vector = new int[50];
		for (int i=0; i<vector.length;i++)
			vector[i] = (int) (Math.random()*100);
		
		for(int i=0; i<vector.length;i++)
			System.out.print(" "+vector[i]);
/*		
		System.out.println();
		long tiempo = System.nanoTime();
		Arrays.sort(vector);
		tiempo = System.nanoTime() - tiempo;
		System.out.println(tiempo);
		
*/		
		
		System.out.println();
		long tiempo = System.nanoTime();
		
		//Ordenación burbuja
		vector = burbuja(vector);
		
		tiempo = System.nanoTime() - tiempo;
		System.out.println(tiempo);		
		
		System.out.println();
		for(int i=0; i<vector.length;i++)
			System.out.print(" "+vector[i]);	
		
		
		
	}

}
