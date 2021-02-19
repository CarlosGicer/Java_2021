/**
 * 
 */
package ejerciciost6.multimedia;

import java.time.LocalTime;
import java.util.ArrayList;

/**
 * @author sjgui
 *
 */
public class Pelicula extends Multimedia {

	private ArrayList<String> reparto;

	/**
	 * @param titulo
	 * @param autor
	 * @param formato
	 * @param duracion
	 */
	public Pelicula(String titulo, String autor, Formato formato, LocalTime duracion) {
		super(titulo, autor, formato, duracion);
		
		this.reparto = new ArrayList<String>(); //Crear el objeto ArrayList para luego poder añadir objetos a él
	}
	
	public void nuevoActor(String actor) {
		this.reparto.add(actor);
	}
	
	public String getActores() {
		StringBuilder sb = new StringBuilder();
		for(String actor : reparto) {
			sb.append(actor);
		}
		
		return sb.toString();
	}
	
	public String getActor(String nombre) {
		
		for(String actor : reparto) {
			if (actor.equals(nombre))
				return actor;
		}
		
		return "No encontrado";
		
	}
	
	
	
}
