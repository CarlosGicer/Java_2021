/**
 * 
 */
package ejerciciost7.lecturaEscritura.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @author alumno
 *
 */
public class Publicacion implements Prestable, Comparable<Publicacion> {

	private boolean prestado;
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
	}


	/**
	 * @param isbn
	 * @param titulo
	 * @param año
	 * @param paginas
	 */
	public Publicacion(String isbn, String titulo, int año, int paginas, boolean prestado) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.año = año;
		this.paginas = paginas;
		this.prestado = prestado;
		this.autores = new TreeSet<>();
	}


	/**
	 * @return the prestado
	 */
	public boolean isPrestado() {
		return prestado;
	}


	/**
	 * @param prestado the prestado to set
	 */
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
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
		builder.append(", prestado=");
		builder.append(prestado);
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
	public void presta() {
		this.prestado = true;

	}

	@Override
	public void devuelve() {
		this.prestado = false;

	}

	@Override
	public boolean estaPrestado() {
		
		return prestado;
	}


	@Override
	public int compareTo(Publicacion o) {
		return this.getTitulo().compareTo(o.getTitulo());
	}
	
	public void addAutor(String nombre, String apellidos) {
		
		Autor a = new Autor(nombre,apellidos);
		//a.addPublicacion(this); //Al autor le ponemos esta publicacion
		autores.add(a); //No hace falta contains
	}
	
	public boolean deleteAutor(String nombre, String apellidos) {
		return autores.remove(new Autor(nombre,apellidos));
	}
	
	public TreeSet<Autor> getAutores() {
		return autores;
	}
	
}
