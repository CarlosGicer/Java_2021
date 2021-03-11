package ejerciciost6.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private List<Publicacion> catalogo;
	private String direccion;
	
		
	public Biblioteca() {
		catalogo = new ArrayList<>();
	}


	/**
	 * @param direccion
	 */
	public Biblioteca(String direccion) {
		super();
		catalogo = new ArrayList<>();
		this.direccion = direccion;
	}


	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}


	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	/**
	 * @return the catalogo
	 */
	public List<Publicacion> getCatalogo() {
		return catalogo;
	}
	
	/**
	 * Añade una Publicacion (Libro o Revista) al catálogo de publicaciones
	 * @param unaPub
	 */
	public void adquirirMaterial(Publicacion unaPub) {
		catalogo.add(unaPub);
	}
	
	
	/**
	 * Busca por título una Publicación dentro del catálogo. Lo reccorremos entero.
	 * @param titulo
	 * @return
	 */
	public Publicacion buscar(String titulo) {
		for(Publicacion pub : catalogo) {
			if (pub.getTitulo().equals(titulo))
				return pub;
		}
		
		return null;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Biblioteca [catalogo=");
		builder.append(catalogo);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}
	
	

}
