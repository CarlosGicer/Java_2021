package poo_t6;

public abstract class Vehiculo {

	private String color;
	private double peso;
	private String matricula;
	
	/**
	 * @param color
	 * @param peso
	 * @param matricula
	 */
	public Vehiculo(String color, double peso, String matricula) {
		super();
		this.color = color;
		this.peso = peso;
		this.matricula = matricula;
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
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehiculo [color=");
		builder.append(color);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append("]");
		return builder.toString();
	}
	
	//Consumo a los cien. Lo implementarán las subclases
	public abstract double gastoCien();
	
	
	
}
