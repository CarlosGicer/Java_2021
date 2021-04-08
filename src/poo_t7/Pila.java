/**
 * 
 */
package poo_t7;

import java.util.Collections;
import java.util.LinkedList;
import poo_t6.VElectrico;

/**
 * @author alumno
 *
 */
public class Pila<E> {
	private LinkedList<E> pila;

	/**
	 * 
	 */
	public Pila() {
		super();
		pila = new LinkedList<>();
	}
	
	public void meter(E elemento) {
		pila.push(elemento);
	}
	
	public E sacar() {
		return pila.pop();
	}
	
	public E mostrar() {
		return pila.peek();
	}
	
	
	public static void main(String[] args) {
		
		Pila<VElectrico> mipila = new Pila<>();

		mipila.meter(new VElectrico("rojo",1500, "9659GGG",500,60));
		mipila.meter(new VElectrico("azul",1500, "1659GGG",400,50));
		System.out.println(mipila.mostrar());
		System.out.println(mipila.sacar());
		
	}
	
	

}
