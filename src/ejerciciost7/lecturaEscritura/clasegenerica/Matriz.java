/**
 * 
 */
package ejerciciost7.lecturaEscritura.clasegenerica;

import java.time.LocalDate;

/**
 * @author sjgui
 *
 */
public class Matriz<T> {
	
	private T[][] tabla;
	
	public Matriz(int filas, int columnas) {
		tabla = (T[][]) new Object[filas][columnas];
	}
	
	public void set(int fila, int columna, T elemento) {
		tabla[fila][columna] = elemento;
	}
	
	public T get(int fila, int columna) {
		return tabla[fila][columna];
	}
	
	public int columnas() {
		return tabla[0].length;
	}
	
	public int filas() {
		return tabla.length;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		for(int i=0; i < tabla.length; i++) {
			for(int j=0; j < tabla[i].length; j++) {
				str.append(tabla[i][j]);
				str.append("\t");
			}
			str.append("\n");
		}
		
		return str.toString();
	}
	
	public static void main(String[] args) {
		Matriz<Persona> matrizI = new Matriz<Persona>(5,5);
		//Rellenamos
		for(int i=0; i < matrizI.filas(); i++) {
			for(int j=0; j < matrizI.columnas(); j++) {
				matrizI.set(i, j, new Persona("484167"+i+j+"J", "Javier", "Guillén",LocalDate.of(1977, 10, 10)));
			}
		}
		System.out.println(matrizI);
	}
	

}
