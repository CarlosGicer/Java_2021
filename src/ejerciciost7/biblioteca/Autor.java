package ejerciciost7.biblioteca;

public class Autor implements Comparable<Autor> {

	private String nombre;
	private String apellidos;
	private int edad;
	private String ciudad;
	private String direccion;
	private String email;
	
	/**
	 * 
	 */
	public Autor() {
		super();
	}

	
	/**
	 * @param nombre
	 * @param apellidos
	 */
	public Autor(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = 0;
		this.ciudad = "";
		this.direccion = "";
		this.email = "";
	}


	/**
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param ciudad
	 * @param direccion
	 * @param email
	 */
	public Autor(String nombre, String apellidos, int edad, String ciudad, String direccion, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Autor))
			return false;
		Autor other = (Autor) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
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
		builder.append("Autor [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", ciudad=");
		builder.append(ciudad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Autor a) {
		
		return this.apellidos.compareTo(a.apellidos);
	}
	
	
	
}
