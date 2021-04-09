/**
 * 
 */
package poo_t7.finaltema;

/**
 * @author sjgui
 *
 */
public class Producto implements Comparable<Producto> {

	private String nombre;
	private String categoria;
	private double precio;
	
	/**
	 * @param nombre
	 * @param categoria
	 * @param precio
	 */
	public Producto(String nombre, String categoria, double precio) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [nombre=");
		builder.append(nombre);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append(", precio=");
		builder.append(precio);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Producto o) {
		return (int) (this.getPrecio() - o.getPrecio());
	}
	
	
	
	
}
