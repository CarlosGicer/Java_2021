/**
 * 
 */
package poo_t5;

import ejerciciost4.Coche;

/**
 * @author sjgui
 *
 */
public class Rectangulo implements Cloneable,Figura {

	private int ancho;
	private int alto;
	private String nombre;
	
	/**
	 * @param ancho
	 * @param alto
	 * @param nombre
	 */
	public Rectangulo(int ancho, int alto, String nombre) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.nombre = nombre;
	}
	
	/**
	 * Constructor copia
	 * @param Rectangulo rectangulo
	 */
	public Rectangulo(Rectangulo rc) {
		this.ancho = rc.ancho;
		this.alto = rc.alto;
		this.nombre = rc.nombre;
	}

	/**
	 * @return the ancho
	 */
	public int getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the alto
	 */
	public int getAlto() {
		return alto;
	}

	/**
	 * @param alto the alto to set
	 */
	public void setAlto(int alto) {
		this.alto = alto;
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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangulo [ancho=");
		builder.append(ancho);
		builder.append(", alto=");
		builder.append(alto);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}

	public Rectangulo incrementarAncho() {
		this.ancho++;
		return this;
	}
	
	public Rectangulo incrementarAlto() {
		this.alto++;
		return this;
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException ex) {
			System.out.println("Error clonando objeto");
		}
		
		return obj;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + alto;
		result = prime * result + ancho;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Rectangulo))
			return false;
		Rectangulo other = (Rectangulo) obj;
		if (alto != other.alto)
			return false;
		if (ancho != other.ancho)
			return false;
		return true;
	}
	
	/**
	 * Area - método implementado del interfaz Figura
	 * @return área del rectángulo
	 */
	public int area() {
		return this.alto * this.ancho;
	}
	
	/**
	 * Perímetro - método implementado del interfaz Figura
	 * @return perímetro del rectángulo
	 */
	public int perimetro() {
		return ((2 * this.ancho) + (2 * this.alto)); 
	}
	
}
