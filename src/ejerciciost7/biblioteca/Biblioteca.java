package ejerciciost7.biblioteca;

import java.util.ArrayList;
import java.util.Collections;
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
		int posicion = Collections.binarySearch(this.catalogo, new Publicacion("isbn",titulo,2021,100,false));
		if (posicion >= 0)
			return this.catalogo.get(posicion);
		else
			return null;
	}

	/**
	 * Busca todas las publicaciones de la Biblioteca donde está el autor pasado como parámetro
	 * @param a Autor, autor que buscamos en todas las publicaciones
	 * @return
	 */
	public ArrayList<Publicacion> buscar(Autor a) {
		ArrayList<Publicacion> susPublicaciones = new ArrayList<>();
		for(Publicacion publicacion : catalogo) {
			if (publicacion.getAutores().contains(a)) {
				susPublicaciones.add(publicacion);
			}
		}
		
		return susPublicaciones;
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
