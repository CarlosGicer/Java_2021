/**
 * 
 */
package ejerciciost4;

/**
 * @author alumno
 *
 */
public class Coche {

	private String marca;
	private String modelo;
	private String color;
	private double largo;
	private double ancho;
	private double alto;
	private int caballos;
	private double consumoALosCien;
	/**
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param largo
	 * @param ancho
	 * @param alto
	 * @param caballos
	 * @param consumoALosCien
	 */
	public Coche(String marca, String modelo, String color, double largo, double ancho, double alto, int caballos,
			double consumoALosCien) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
		this.caballos = caballos;
		this.consumoALosCien = consumoALosCien;
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
	 * @return the largo
	 */
	public double getLargo() {
		return largo;
	}
	/**
	 * @param largo the largo to set
	 */
	public void setLargo(double largo) {
		this.largo = largo;
	}
	/**
	 * @return the ancho
	 */
	public double getAncho() {
		return ancho;
	}
	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	/**
	 * @return the alto
	 */
	public double getAlto() {
		return alto;
	}
	/**
	 * @param alto the alto to set
	 */
	public void setAlto(double alto) {
		this.alto = alto;
	}
	/**
	 * @return the caballos
	 */
	public int getCaballos() {
		return caballos;
	}
	/**
	 * @param caballos the caballos to set
	 */
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	/**
	 * @return the consumoALosCien
	 */
	public double getConsumoALosCien() {
		return consumoALosCien;
	}
	/**
	 * @param consumoALosCien the consumoALosCien to set
	 */
	public void setConsumoALosCien(double consumoALosCien) {
		this.consumoALosCien = consumoALosCien;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", color=");
		builder.append(color);
		builder.append(", largo=");
		builder.append(largo);
		builder.append(", ancho=");
		builder.append(ancho);
		builder.append(", alto=");
		builder.append(alto);
		builder.append(", caballos=");
		builder.append(caballos);
		builder.append(", consumoALosCien=");
		builder.append(consumoALosCien);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
