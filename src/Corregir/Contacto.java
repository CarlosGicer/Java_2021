package Corregir;

public class Contacto {

	private String nombre;
	private int telef;
	
	/**
	 * 
	 */
	public Contacto( ) {
		super();
		this.nombre = " ";
		this.telef = 0;
	}

	/**
	 * @param nombre
	 * @param telef
	 */
	public Contacto(String nombre, int telef) {
		super();
		this.nombre = nombre;
		this.telef = telef;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el telef
	 */
	public int getTelef() {
		return telef;
	}

	/**
	 * @param telef el telef a establecer
	 */
	public void setTelef(int telef) {
		this.telef = telef;
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
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Contacto other = (Contacto) obj;
		if (nombre == null) {
			if (other.nombre != null) {
				return false;
			}
		} else if (!nombre.equals(other.nombre)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contacto [nombre=");
		builder.append(nombre);
		builder.append(", telef=");
		builder.append(telef);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
}

