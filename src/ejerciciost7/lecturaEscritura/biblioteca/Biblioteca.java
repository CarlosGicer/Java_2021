package ejerciciost7.lecturaEscritura.biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {

	private List<Publicacion> catalogo;
	//private List<Autor> autores;
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
		if (!catalogo.contains(unaPub)) //No añadimos repetidos. Para la búsqueda binaria
			catalogo.add(unaPub);
		
		//Ordenamos la lista cada vez que añado un elemento
		Collections.sort(catalogo);
	}
	
	
	/**
	 * Busca por título una Publicación dentro del catálogo. Lo reccorremos entero.
	 * @param titulo
	 * @return
	 */
	public Publicacion buscar(String titulo) {
		int posicion = Collections.binarySearch(catalogo, 
								new Publicacion("", titulo, 2021, 100, false));
		
		if (posicion >= 0) {
			return catalogo.get(posicion);
		}
		
		return null;
	}
	
	/**
	 * Se recorre todas las publicaciones y devuelve una lista con aquellas
	 * en las que aparece el autor como autor de la misma
	 * @param autor
	 * @return
	 */
	public List<Publicacion> buscar(Autor autor) {
		List<Publicacion> pubs = new ArrayList<>();
		boolean encontrado = false;
		//No es realmente eficiente
		for (Publicacion p: catalogo) {
			encontrado = false;
			for (Autor a: p.getAutores()) {
				if (a.equals(autor)) {
					//Añadimos la publicación a las que ha escrito ese autor
					pubs.add(p);
					break;
				}
			}
		}
		
		return pubs;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Biblioteca [catalogo=");
		for (Publicacion p : catalogo)
			builder.append(p + System.getProperty("line.separator"));
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}
	
	

}
