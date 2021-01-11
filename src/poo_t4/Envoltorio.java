/**
 * 
 */
package poo_t4;

import java.util.Scanner;

/**
 * @author alumno
 *
 */
public class Envoltorio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i = 5;
		Double d = 4.55;
		
		i = Integer.valueOf("10");
		
		int resultado = i + 5;
		System.out.println(resultado);
		
		System.out.println(i.doubleValue());
		System.out.println(d.intValue());
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int numero = Integer.parseInt(str);
		
		numero++;
		System.out.println(numero);
		
		Integer otro = 66; //Autoboxing
		System.out.println(otro);
		
		Double d2 = 1.45E22; 
		System.out.println(d2);

		int resul = 5 + otro;
		
		
	}

}
