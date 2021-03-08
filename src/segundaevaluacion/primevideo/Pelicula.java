/**
 * 
 */
package segundaevaluacion.primevideo;

/**
 * @author sjgui
 *
 */
public class Pelicula extends Multimedia {

	private int duracion;
	
	/**
	 * 
	 */
	public Pelicula() {
		super();
	}
	
	/**
	 * @param titulo
	 * @param plus
	 * @param precio
	 */
	public Pelicula(String titulo, boolean plus, double precio, Genero genero, int duracion) {
		super(titulo, plus, precio, genero);
		this.duracion = duracion;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pelicula [duracion=");
		builder.append(duracion);
		builder.append(", genero=");
		builder.append(getGenero());
		builder.append(", codigo=");
		builder.append(getCodigo());
		builder.append(", titulo=");
		builder.append(getTitulo());
		builder.append(", Plus=");
		builder.append(isPlus());
		builder.append(", precio=");
		builder.append(getPrecio());
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public double getPrecio() {
		if (this.isPlus()) {
			return this.precio; //Si es de las pelis plus hay que pagarla
		} else 
			return 0;
	}
	
	
	
}
