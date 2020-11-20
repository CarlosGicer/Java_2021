package ejemplos;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vectorA = {1,2,3,4,5};
		int[] vectorB = {6,7,8,9,10};
		
		int[] vectorC = new int[10];
		
		int posicion=0;
		for(int i=0; i<vectorA.length; i++) {
			vectorC[posicion] = vectorA[i];
			vectorC[posicion+1] = vectorB[i];
			posicion += 2;
 		}
		
		for(int i=0; i<vectorC.length; i++) {
			System.out.print(vectorC[i] + " ");
		}
		
		posicion=0;
		for(int i=0; i<10; i+=2) {
			vectorC[i] = vectorA[posicion];
			vectorC[i+1] = vectorB[posicion];
			posicion++;
		}
		
		for(int i=0; i<vectorC.length; i++) {
			System.out.print(vectorC[i] + " ");
		}

	}

}
