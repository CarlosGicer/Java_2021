/**
 * 
 */
package poo_t7.finaltema;

/**
 * @author sjgui
 *
 */
public class Hotel implements Comparable<Hotel> {

	private int idHotel;
	private String nombre;
	private String zona;
	private double precio;
	
	/**
	 * 
	 */
	public Hotel() {
		this.idHotel = 0;
		this.nombre = "ninguno";
		this.zona = "no asignada";
		this.precio = 0;
	}

	/**
	 * @param idHotel
	 * @param zona
	 * @param precio
	 */
	public Hotel(int idHotel, String nombre, String zona, double precio) {
		super();
		this.idHotel = idHotel;
		this.nombre = nombre;
		this.zona = zona;
		this.precio = precio;
	}

	/**
	 * @return the idHotel
	 */
	public int getIdHotel() {
		return idHotel;
	}

	/**
	 * @param idHotel the idHotel to set
	 */
	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	/**
	 * @return the zona
	 */
	public String getZona() {
		return zona;
	}

	/**
	 * @param zona the zona to set
	 */
	public void setZona(String zona) {
		this.zona = zona;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hotel [idHotel=");
		builder.append(idHotel);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", zona=");
		builder.append(zona);
		builder.append(", precio=");
		builder.append(precio);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idHotel;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Hotel))
			return false;
		Hotel other = (Hotel) obj;
		if (idHotel != other.idHotel)
			return false;
		return true;
	}

	@Override
	public int compareTo(Hotel o) {
		return (int) (this.getPrecio() - o.getPrecio()); //Uso la resta para comparar valores numéricos
	}


	
	
	
	

}
