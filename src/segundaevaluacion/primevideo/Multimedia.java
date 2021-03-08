/**
 * 
 */
package segundaevaluacion.primevideo;

/**
 * @author sjgui
 *
 */
public class Multimedia {

	protected static long autoincremento = 1;

	protected long codigo;
	protected String titulo;
	protected boolean plus;
	protected double precio;
	protected Genero genero;
	
	/**
	 * 
	 */
	public Multimedia() {
		super();
	}

	/**
	 * @param titulo
	 * @param plus
	 * @param precio
	 * @param genero
	 */
	public Multimedia(String titulo, boolean plus, double precio, Genero genero) {
		super();
		this.codigo = Multimedia.autoincremento;
		Multimedia.autoincremento++;
		this.titulo = titulo;
		this.plus = plus;
		this.precio = precio;
		this.genero = genero;
	}

	/**
	 * @return the autoincremento
	 */
	public static long getAutoincremento() {
		return autoincremento;
	}

	/**
	 * @param autoincremento the autoincremento to set
	 */
	public static void setAutoincremento(long autoincremento) {
		Multimedia.autoincremento = autoincremento;
	}

	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(long codigo) {
		this.codigo = codigo;
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
	 * @return the Plus
	 */
	public boolean isPlus() {
		return plus;
	}

	/**
	 * @param Plus the esPlus to set
	 */
	public void setPlus(boolean plus) {
		this.plus = plus;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Multimedia [codigo=");
		builder.append(codigo);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", esPlus=");
		builder.append(plus);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", genero=");
		builder.append(genero);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigo ^ (codigo >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Multimedia))
			return false;
		Multimedia other = (Multimedia) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	
	
	
}
