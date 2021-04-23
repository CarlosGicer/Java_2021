/**
 * 
 */
package ejerciciost7.lecturaEscritura.equipobasket;

/**
 * @author sjgui
 *
 */

public class JugadorBasket implements Comparable<JugadorBasket> {

	public enum Posicion { BASE, ALERO, ESCOLTA, ALAPIVOT, PIVOT }
	
	private String nombre;
	private Posicion posicion;
	
	/**
	 * 
	 */
	public JugadorBasket() {
		super();
		this.nombre = "";
		this.posicion = null;
	}

	/**
	 * @param nombre
	 * @param posicion
	 */
	public JugadorBasket(String nombre, Posicion posicion) {
		super();
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
	public Posicion getPosicion() {
		return posicion;
	}

	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof JugadorBasket))
			return false;
		JugadorBasket other = (JugadorBasket) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
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
	public int compareTo(JugadorBasket o) {
		
		return this.nombre.compareTo(o.nombre);
	}

	
	
	
	
	
}
