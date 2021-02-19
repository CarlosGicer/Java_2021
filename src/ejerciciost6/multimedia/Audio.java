/**
 * 
 */
package ejerciciost6.multimedia;

import java.time.LocalTime;

/**
 * @author sjgui
 *
 */
public class Audio extends Multimedia {

	private String genero;

	/**
	 * @param titulo
	 * @param autor
	 * @param formato
	 * @param duracion
	 */
	public Audio(String titulo, String autor, Formato formato, LocalTime duracion, String genero) {
		super(titulo, autor, formato, duracion);
		this.genero = genero;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
}
