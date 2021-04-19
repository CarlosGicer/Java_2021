/**
 * 
 */
package poo_t7;

/**
 * @author alumno
 *
 */
public class JugadorBasket implements Comparable<JugadorBasket> {

	private String nombre;
	private String posicion; //Podría ser un enum { BASE, ESCOLTA, ALERO, ALA-PIVOT, PIVOT }
	
	public JugadorBasket(String nombre, String posicion) {
		this.nombre = nombre;
		this.posicion = posicion;
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
	 * @return the posicion
	 */
	public String getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JugadorBasket [nombre=");
		builder.append(nombre);
		builder.append(", posicion=");
		builder.append(posicion);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
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
		JugadorBasket other = (JugadorBasket) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		
		return true;
	}

	@Override
	public int compareTo(JugadorBasket o) {
		return this.getNombre().compareTo(o.getNombre());
	}

	
	
	

}
