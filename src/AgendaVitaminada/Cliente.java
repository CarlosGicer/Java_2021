package AgendaVitaminada;

public class Cliente extends Contacto {

	private String dni;
	private String email;
	
	public Cliente(String nombre, String telefono, String dni, String email) {
		super(nombre, telefono);
		this.dni = dni;
		this.email = email;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nombre=");
		builder.append(getNombre());
		builder.append(", Telefono=");
		builder.append(getTelefono());
		builder.append(", DNI=");
		builder.append(dni);
		builder.append(", Email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	
	

}
