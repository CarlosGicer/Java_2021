package poo_t8.casopractico;

import java.time.LocalDate;

public class Usuario implements Comparable<Usuario>{

	private String login;
	private String password;
	private String nombre;
	private String apellidos;
	private String email;
	private String localidad;
	private String pais;
	private LocalDate fecha_nac;
	private String sexo;
	
	/**
	 * @param login
	 * @param password
	 * @param nombre
	 * @param apellidos
	 * @param email
	 * @param localidad
	 * @param pais
	 * @param fecha_nac
	 * @param sexo
	 */
	public Usuario(String login, String password, String nombre, String apellidos, String email, String localidad,
			String pais, LocalDate fecha_nac, String sexo) {
		super();
		this.login = login;
		this.password = password;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.localidad = localidad;
		this.pais = pais;
		this.fecha_nac = fecha_nac;
		this.sexo = sexo;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the fecha_nac
	 */
	public LocalDate getFecha_nac() {
		return fecha_nac;
	}

	/**
	 * @param fecha_nac the fecha_nac to set
	 */
	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [login=");
		builder.append(login);
		builder.append(", password=");
		builder.append(password);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", email=");
		builder.append(email);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", pais=");
		builder.append(pais);
		builder.append(", fecha_nac=");
		builder.append(fecha_nac);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {		
		if (this == obj)
			return true;
		if (!(obj instanceof Usuario))
			return false;
		
		Usuario other = (Usuario) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;			
		return true;
	}

	@Override
	public int compareTo(Usuario o) {
		return this.getLogin().compareTo(o.getLogin());
	}
	
	
	
	
}
