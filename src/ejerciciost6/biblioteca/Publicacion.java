/**
 * 
 */
package ejerciciost6.biblioteca;

/**
 * @author alumno
 *
 */
public class Publicacion {

	protected String isbn;
	protected String titulo;
	protected int año;
	protected int paginas;
	
	
	/**
	 * 
	 */
	public Publicacion() {
		super();
	}


	/**
	 * @param isbn
	 * @param titulo
	 * @param año
	 * @param paginas
	 */
	public Publicacion(String isbn, String titulo, int año, int paginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.año = año;
		this.paginas = paginas;
	}


	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}


	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
	 * @return the año
	 */
	public int getAño() {
		return año;
	}


	/**
	 * @param año the año to set
	 */
	public void setAño(int año) {
		this.año = año;
	}


	/**
	 * @return the paginas
	 */
	public int getPaginas() {
		return paginas;
	}


	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Publicacion [isbn=");
		builder.append(isbn);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", año=");
		builder.append(año);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
	
	
	
}
