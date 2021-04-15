package poo_t8;

public class Cliente {

	private int id;
	private String nombre;
	private String direccion;
	private String localidad;
	private String movil;
	private String dni;
	
	/**
	 * Este constructor se usará si el id lo genera el gestor de Base de Datos
	 * @param nombre
	 * @param direccion
	 * @param localidad
	 * @param movil
	 * @param dni
	 */
	public Cliente(String nombre, String direccion, String localidad, String movil, String dni) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.localidad = localidad;
		this.movil = movil;
		this.dni = dni;
	}
	
	/**
	 * @param id
	 * @param nombre
	 * @param direccion
	 * @param localidad
	 * @param movil
	 * @param dni
	 */
	public Cliente(int id, String nombre, String direccion, String localidad, String movil, String dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.localidad = localidad;
		this.movil = movil;
		this.dni = dni;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", movil=");
		builder.append(movil);
		builder.append(", dni=");
		builder.append(dni);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	
	
}
