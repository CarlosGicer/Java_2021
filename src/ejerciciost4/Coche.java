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
	private double precio;
	
	/**
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param largo
	 * @param ancho
	 * @param alto
	 * @param caballos
	 * @param consumoALosCien
	 * @param precio
	 */
	public Coche(String marca, String modelo, String color, double largo, double ancho, double alto, int caballos,
			double consumoALosCien, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
		this.caballos = caballos;
		this.consumoALosCien = consumoALosCien;
		this.precio = precio;
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
		builder.append(", precio=");
		builder.append(precio);
		builder.append("€]");
		return builder.toString();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		 if (this == obj)
			 return true;
		 if (obj == null)
			 return false;

		 if (getClass() != obj.getClass()) //Compruebo que sean de la misma clase
			 return false;
		 
		 Coche other=(Coche) obj; //Casting, ver a obj (Object) como un Coche
		 //Comparar que tengan internamente los mismos valores
		 if ( (!marca.equals(other.getMarca())) ||
				 (!modelo.equals(other.getModelo())) ||
				 (!color.equals(other.getColor())) ||
				 (largo != other.getLargo()) ||
				 (ancho != other.getAncho()) ||
				 (alto != other.getAlto()) ||
				 (caballos != other.getCaballos()) ||
				 (consumoALosCien != other.getConsumoALosCien()) ||
				 (precio != other.getPrecio()) )
			 return false;
		
		 return true;
	}
	
	
	
}
