/**
 * 
 */
package ejerciciost7.ordenacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author sjgui
 *
 */
public class OrdenacionMezcla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> lista1 = Arrays.asList(1,2,3,4,5,10,20,30,40,50);
		List<Integer> lista2 = Arrays.asList(6,7,8,9,10,15,25,35,45,100);
		
		Queue<Integer> q1 = new LinkedList<>(lista1);
		Queue<Integer> q2 = new LinkedList<>(lista2);
		
		List<Integer> resultado = new ArrayList<>();
			
		int valor1=q1.poll();
		int valor2=q2.poll();
		
		//IMPLEMENTADO PARA LISTAS DEL MISMO TAMAÑO
		//Sino al final del bucle habría que ver que lista no está vacía y meter lo que le queda
		while ( (q1.peek() != null) || (q2.peek() != null) ) {
			if (valor1 < valor2) {
				resultado.add(valor1);
				if (q1.peek() != null)
					valor1 = q1.poll();
			} else {
				resultado.add(valor2);
				if (q2.peek() != null)
					valor2 = q2.poll();
			}
			System.out.println(valor1 + " - " + valor2);
		}
		
		//Quedan los últimos que se han leído con poll
		if (valor1 < valor2) {
			resultado.add(valor1);
			resultado.add(valor2);
		} else {
			resultado.add(valor2);
			resultado.add(valor1);
		}
			
		
		System.out.println(resultado);
		
		
		
	}

}
