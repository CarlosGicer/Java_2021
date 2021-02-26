package poo_t6;

import java.util.Arrays;

public class PruebaArrays {

	
	public static void main(String[] args) {
		
		double [] sourceArray = {10, 20, 4, 7, 90, 34, 56, 11, 1};
		
		Arrays.sort(sourceArray); //Ordena un array
		System.out.println(Arrays.toString(sourceArray)); //Imprime todos los valores del array sin hacer for
		
		int posicion = Arrays.binarySearch(sourceArray, 11); //Busca en un array ordenado previamente (sort)
		System.out.println(posicion);
		
		double [] destinationArray = Arrays.copyOf(sourceArray, posicion); //Copia un array en otro tantos elementos como indique posicion
		System.out.println(Arrays.toString(destinationArray));
		
		double [] destinationArray2 = Arrays.copyOfRange(sourceArray, posicion, sourceArray.length); //Copia un array en otro desde una posición a otra
		System.out.println(Arrays.toString(destinationArray2));

	}
}
