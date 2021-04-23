/**
 * 
 */
package ejerciciost7.lecturaEscritura.taller;

/**
 * @author sjgui
 *
 */
public class Vehiculo implements Comparable<Vehiculo>{

	//matrícula, marca, modelo, color, precio, CV (caballos), estado (en reparación o reparado)
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected String color;
	protected double precio;
	protected int cv;
	protected String estado="reparación";
	
	
	/**
	 * 
	 */
	public Vehiculo() {
		super();
	}

	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
		this.marca = "";
		this.modelo = "";
		this.color = "";
		this.precio = 0;
		this.cv = 0;
		this.estado = "reparación";
	}

	/**
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param precio
	 * @param cv
	 * @param estado
	 */
	public Vehiculo(String matricula, String marca, String modelo, String color, double precio, int cv) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.cv = cv;
		this.estado = "reparación";
	}


	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}


	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}


	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}


	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}


	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
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
	 * @return the cv
	 */
	public int getCv() {
		return cv;
	}


	/**
	 * @param cv the cv to set
	 */
	public void setCv(int cv) {
		this.cv = cv;
	}


	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}


	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Vehiculo))
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", color=");
		builder.append(color);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", cv=");
		builder.append(cv);
		builder.append(", estado=");
		builder.append(estado);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int compareTo(Vehiculo o) {
		
		return this.matricula.compareTo(o.matricula);
	}
	
	
	
	
}
