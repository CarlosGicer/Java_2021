/**
 * 
 */
package ejerciciost6.multimedia;

import java.time.LocalTime;

/**
 * @author sjgui
 *
 */
public abstract class Multimedia {

	public enum Formato {
		JPG, PNG, SVG, HTML, WAV, MP3, MP4, MIDI, AVI, MOV, MPG, CDAUDIO, DVD }

	protected String titulo;
	protected String autor;
	protected Formato formato;
	protected LocalTime duracion;
	

	/**
	 * @param titulo
	 * @param autor
	 * @param formato
	 * @param duracion
	 */
	public Multimedia(String titulo, String autor, Formato formato, LocalTime duracion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Multimedia [titulo=");
		builder.append(titulo);
		builder.append(", autor=");
		builder.append(autor);
		builder.append(", formato=");
		builder.append(formato);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the formato
	 */
	public Formato getFormato() {
		return formato;
	}

	/**
	 * @param formato the formato to set
	 */
	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	/**
	 * @return the duracion
	 */
	public LocalTime getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}
	
	
	
	
}
