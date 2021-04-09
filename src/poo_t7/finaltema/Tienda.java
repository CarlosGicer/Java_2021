/**
 * 
 */
package poo_t7.finaltema;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author sjgui
 *
 */
public class Tienda {

	//Se ordena por la clave, en este caso String, que ya implementa Comparable, con lo cual ordena por clave de Producto
	private TreeMap<String, Producto> tienda;   // "p0001" -> Producto["Teclado Logitech","Periféricos",100]
	
	/**
	 * 
	 */
	public Tienda() {
		tienda = new TreeMap<>();
	}

	/**
	 * Añade un producto a la tienda
	 * @param clave
	 * @param valor
	 */
	public void nuevoProducto(String clave, Producto valor) {
		tienda.put(clave,  valor);
	}
	
	/**
	 * Elimina un Producto dada una clave
	 * @param clave
	 * @return true/false en función si ha podido borrar el Producto asociado a la clave dada
	 */
	public boolean eliminarProducto(String clave) {
		boolean realizado = false;
		
		Producto p = tienda.remove(clave);
		
		//Si lo ha podido borrar p es distinto de null
		if (p != null)
			return true;
		
		return realizado;
	}
	
	/**
	 * Busca un Producto por su clave (String)
	 * @param clave
	 * @return
	 */
	public Producto buscar(String clave) {
		return tienda.get(clave);
	}
	
	/**
	 * Muestra cada producto de la tienda en una línea
	 * @return
	 */
	public String mostraTienda() {
		StringBuilder sb = new StringBuilder();
		
		//Obtengo en un conjunto todas las claves (String)
		Set<String> claves = tienda.keySet(); 
		
		//Recorrer las claves con un foreach
		/*
		for(String clave : claves) {
			sb.append("Producto: " + clave + " -> " + tienda.get(clave));
		}
		*/
		
		int contador=0;
		//Me voy a recorrer las claves (Set) con un Iterator
		Iterator it = claves.iterator();
		while (it.hasNext()) {
			String clave = (String) it.next();
			sb.append("Producto: " + clave + " -> " + tienda.get(clave));
			sb.append(System.getProperty("line.separator"));
			contador++;
		}
		sb.append("Hay " + contador + " productos en la tienda");
		
		return sb.toString();
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tienda t = new Tienda();
		for(int i=0; i<20000; i++) {
			t.nuevoProducto("pXX-"+i, new Producto("Producto"+i, "tecnología", Math.random()*250+100));
		}
		
		t.eliminarProducto("pXX-708");
		System.out.println(t.mostraTienda());

	}

}
