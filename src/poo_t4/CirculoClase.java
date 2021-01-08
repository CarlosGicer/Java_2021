/**
 * 
 */
package poo_t4;

/**
 * @author sjgui
 *
 */
public class CirculoClase {
	
	private double puntoX;
	private double puntoY;
	private double radio;
	/**
	 * 
	 */
	public CirculoClase() {
		super();
		this.puntoX=0;
		this.puntoY=0;
		this.radio=0;
	}

	/**
	 * @param radio
	 */
	public CirculoClase(double radio) {
		this();
		this.radio = radio;
	}

	/**
	 * @param puntoX
	 * @param puntoY
	 * @param radio
	 */
	public CirculoClase(double puntoX, double puntoY, double radio) {
		super();
		this.puntoX = puntoX;
		this.puntoY = puntoY;
		this.radio = radio;
	}

	/**
	 * @return the puntoX
	 */
	public double getPuntoX() {
		return puntoX;
	}

	/**
	 * @param puntoX the puntoX to set
	 */
	public void setPuntoX(double puntoX) {
		this.puntoX = puntoX;
	}

	/**
	 * @return the puntoY
	 */
	public double getPuntoY() {
		return puntoY;
	}

	/**
	 * @param puntoY the puntoY to set
	 */
	public void setPuntoY(double puntoY) {
		this.puntoY = puntoY;
	}

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circulo (X=");
		builder.append(puntoX);
		builder.append(", Y=");
		builder.append(puntoY);
		builder.append(", radio=");
		builder.append(radio);
		builder.append(")");
		return builder.toString();
	}
	
	public double area() {
		return (Math.PI * Math.pow(this.radio, 2));
	}
	
	public double longitud() {
		return (2 * Math.PI * this.radio);
	}
	

	
	
	

}
