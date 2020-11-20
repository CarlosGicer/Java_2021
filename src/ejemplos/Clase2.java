/**
 * 
 */
package ejemplos;

/**
 * @author alumno
 *
 */
public class Clase2 {

	/*
	 * factorial - Calcula el factorial de un número
	 * @param number - el número cuyo factorial queremos calcular
	 */
	public static double factorial(int numero) {
		if(numero == 0){
            return 1;
        }
        else
            return numero * factorial(numero-1);		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double anterior=0;
		double actual=0;
		int i=2;
		double e=2; //Los dos primeros números son 1/1 y 1/1
		
		
		do {
			actual = 1/factorial(i);
			anterior = 1 / factorial(i-1);
			e += actual;
			i++;
			
		} while ((anterior - actual) > 0.001 );
		
		System.out.println("Euler: "+e);
		

	}

}
