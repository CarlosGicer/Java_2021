/**
 * 
 */
package poo_t7.finaltema;

import java.util.LinkedList;

/**
 * @author sjgui
 *
 */
public class ColaGen<T> {

	private LinkedList<T> cola;
	
	/**
	 * 
	 */
	public ColaGen() {
		cola = new LinkedList<>();
	}

	
	public void insertar(T t) {
		cola.offer(t);
	}
	
	public T sacar() {
		return cola.poll();
	}
	
	public T mostrar() {
		return cola.peek();
	}
	
	public String mostrarTodo() {
		StringBuilder sb = new StringBuilder();
		for(T t: cola) {
			sb.append(t + System.getProperty("line.separator"));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		ColaGen<Persona> filaVacunas = new ColaGen<>();
		filaVacunas.insertar(new Persona("Javier","Guillén",35));
		filaVacunas.insertar(new Persona("Edwin","Haaland",21));
		filaVacunas.insertar(new Persona("Rocío","Carrasco",45));
		System.out.println(filaVacunas.sacar());
		System.out.println("La cola es: ");
		System.out.println(filaVacunas.mostrarTodo());
		
	}
	
}
