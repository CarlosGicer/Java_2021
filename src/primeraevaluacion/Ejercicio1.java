/**
 * 
 */
package primeraevaluacion;

/**
 * @author sjgui
 *
 */
public class Ejercicio1 {

	/**
	 * Factorial n
	 */
	public static double factorial(int numero) {
		if (numero == 0)
			return 1;
		double factorial = 1;
		while (numero > 1) {
			factorial = factorial * numero;
			numero--;
		}
		return factorial;
	}
	
	/**
	 * Coseno
	 * @param x, número del que calcular el coseno
	 * @param n, número de términos de la fórmula a sumar para calcular el coseno
	 */
	public static double coseno(int x, int n) {
		double cos = 0;
		for(int i=0; i<=n; i++) {
			cos += Math.pow(-1, i) * ( Math.pow(x, 2*i) / factorial(2 * i) );
		}
		
		return cos;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(10));
		System.out.println(coseno(10,20)+" - "+Math.cos(10));
		
		System.out.println("Porcentaje "+Math.cos(10)*100/coseno(10,20));
	}

}
