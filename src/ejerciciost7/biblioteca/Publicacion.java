/**
 * 
 */
package ejerciciost7.biblioteca;

import java.util.TreeSet;

/**
 * @author alumno
 *
 */
public class Publicacion implements Comparable<Publicacion> {

	protected String isbn;
	protected String titulo;
	protected int año;
	protected int paginas;
	protected TreeSet<Autor> autores;
	
	
	/**
	 * 
	 */
	public Publicacion() {
		super();
		autores = new TreeSet<>();
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
		autores = new TreeSet<>();
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


	@Override
	public int compareTo(Publicacion o) {
		return this.getTitulo().compareTo(o.getTitulo());
	}

	
	public void addAutor(String nombre, String apellidos) {
		Autor a = new Autor(nombre, apellidos);
		a.getLibrosPublicados().add(this); //Añadimos la publicación a las del autor
		autores.add(a);
	}

	public boolean deleteAutor(String nombre, String apellidos) {
		return autores.remove(new Autor(nombre, apellidos));
	}

	public TreeSet<Autor> getAutores() {
		return autores;
	}
		
	
	
	
}
