/**
 * 
 */
package ejerciciost6.series;

/**
 * @author sjgui
 *
 */
public class Multimedia {
	
	protected String titulo="";
	protected String genero="";
	
	
	/**
	 * 
	 */
	public Multimedia() {
		super();
	}


	/**
	 * @param titulo
	 * @param genero
	 */
	public Multimedia(String titulo, String genero) {
		super();
		this.titulo = titulo;
		this.genero = genero;
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


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Multimedia [titulo=");
		builder.append(titulo);
		builder.append(", genero=");
		builder.append(genero);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
