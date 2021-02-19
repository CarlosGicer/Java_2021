/**
 * 
 */
package ejerciciost6.tienda;

/**
 * @author sjgui
 *
 */
public class Persona {

	private String identificador;
	private String nombre;
	private String email;
	private String movil;
	
	private Direccion direccion;

	/**
	 * @param identificador
	 * @param nombre
	 * @param email
	 * @param movil
	 * @param direccion
	 */
	public Persona(String identificador, String nombre, String email, String movil, Direccion direccion) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.email = email;
		this.movil = movil;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [identificador=");
		builder.append(identificador);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", email=");
		builder.append(email);
		builder.append(", movil=");
		builder.append(movil);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the identificador
	 */
	public String getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
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
	 * @return the movil
	 */
	public String getMovil() {
		return movil;
	}

	/**
	 * @param movil the movil to set
	 */
	public void setMovil(String movil) {
		this.movil = movil;
	}

	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
}
