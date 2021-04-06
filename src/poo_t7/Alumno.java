package poo_t7;

public class Alumno {

	private String nombre;
	private double mediaExp;
	
	public Alumno(String n, double m) {
		this.nombre = n;
		this.mediaExp = m;
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
	 * @return the mediaExp
	 */
	public double getMediaExp() {
		return mediaExp;
	}

	/**
	 * @param mediaExp the mediaExp to set
	 */
	public void setMediaExp(double mediaExp) {
		this.mediaExp = mediaExp;
	}

	
}
