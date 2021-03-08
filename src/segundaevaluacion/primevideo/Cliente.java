/**
 * 
 */
package segundaevaluacion.primevideo;

/**
 * @author sjgui
 *
 */
public abstract class Cliente {

	protected String dni;
	protected String nombre;
	protected String email;
	protected double precioMensual=0;
	
	/**
	 * @param dni
	 * @param nombre
	 * @param email
	 * @param precioMensual
	 */
	public Cliente(String dni, String nombre, String email) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
	}

	/**
	 * 
	 */
	public Cliente() {
		super();
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the precioMensual
	 */
	public abstract double getPrecioMensual();
	

	/**
	 * @param precioMensual the precioMensual to set
	 */
	public void setPrecioMensual(double precioMensual) {
		this.precioMensual = precioMensual;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [dni=");
		builder.append(dni);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", email=");
		builder.append(email);
		builder.append(", precioMensual=");
		builder.append(precioMensual);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cliente))
			return false;
		Cliente other = (Cliente) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	
	public abstract boolean esPro();
	
}
