/**
 * 
 */
package ejerciciost7.agenda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * @author alumno
 *
 */
public class Agenda {
	/**
	 * Atributos
	 */
	private TreeMap<String, String> agenda;
	
	/**
	 * Constructor
	 */
	public Agenda() {
		agenda = new TreeMap<>();
	}
	
	public boolean addContacto(String nomApe, String telefono) {
			if(! agenda.containsKey(nomApe)) { 
				agenda.put(nomApe, telefono);
				return true;
			}
		
		return false;
	}

	
	public String listarContactos() {
		StringBuffer sb = new StringBuffer();
		Iterator it = agenda.keySet().iterator();
		while(it.hasNext()){
		  String key = (String) it.next();
		  sb.append("Nombre: " + key + " -> Valor: " + agenda.get(key));
		}
		
		return sb.toString();
	}
	
	public String buscarContacto(String nombre) {
		if (agenda.containsKey(nombre)) {
			return nombre + " - " + agenda.get(nombre); 
		}
		
		return "No encontrado";
	}
	
	public boolean eliminarContacto(String nombre) {
		if (agenda.containsKey(nombre)) {
			agenda.remove(nombre);
			return true;
		}
		
		return false;
	}
	
	public boolean estaVacia() {
		if (agenda.size() == 0)
			return true;
		else 
			return false;
	}
}