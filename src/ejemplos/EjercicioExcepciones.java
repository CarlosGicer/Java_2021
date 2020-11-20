/**
 * 
 */
package ejemplos;

/**
 * @author alumno
 * Calcular el área y volumen de un cilindro
 * Area = 2 * PI * R * (R + H)
 * Volumen = PI * R * R * H
 *
 */
public class EjercicioExcepciones {

	public static double dividir(int a, int b) {
		double resultado=0;
		
		if (b==0) {
			throw new IllegalArgumentException("dividir(a,b) -> El segundo parámetro no puede ser cero.");
		} else {
			resultado = a / b;
		}
		
		return resultado;
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
			dividir(3,0);
		} catch (ArithmeticException ex) {
			System.out.println("Error aritmético: "+ex.getMessage());
		} catch (IllegalArgumentException ex) {
			System.out.println("Error argumentos: "+ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Error desconocido: "+ex.getMessage());
		}
		

	}

}


