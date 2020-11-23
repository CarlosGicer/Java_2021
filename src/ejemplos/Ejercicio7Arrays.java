package ejemplos;

public class Ejercicio7Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vector = new int[10];
		for (int i=0; i<vector.length; i++)
			vector[i]=i;
		
		for (int i=0; i<vector.length; i++)
			System.out.print(vector[i]+" ");	
		
		int posicion=3;
		
		
		for(int i=vector.length-2; i>=posicion; i--) {
			vector[i+1]=vector[i];
		}
		vector[posicion]=10;
		
		System.out.println();
		for (int i=0; i<vector.length; i++)
			System.out.print(vector[i]+" ");	
	}

}
