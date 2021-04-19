package ejerciciost7.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

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
		/*
		for(Publicacion pub : catalogo) {
			if (pub.getTitulo().equals(titulo))
				return pub;
		}
		*/
		int posicion = Collections.binarySearch(catalogo, new Publicacion("",titulo,0,0));
		if (posicion >= 0)
			return catalogo.get(posicion);
		
		return null;
	}
	
	public List<Publicacion> buscar(String nombre, String apellidos) {
		List<Publicacion> lista = new ArrayList<>();
		//Si hay que recorrer todas las publicaciones no es del todo eficiente
		for(Publicacion p : catalogo) { 
			if (p.getAutores().contains(new Autor(nombre,apellidos))) {
				lista.add(p);
			}
		}
		return lista;
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
