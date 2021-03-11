/**
 * 
 */
package ejerciciost6.practica1;

/**
 * @author Francisco Castro Mañas
 *
 */
public abstract class Alumno {
	
	//Propiedades
	protected String nombre;
	protected double notaMedia;
	protected String titulacion;
	
	/**
	 * Constructor parametrizado: Un constructor con el nombre y la 
	 * titulaci�n como par�metros, y la nota media por defecto (define 
	 * una constante para este valor por defecto).
	 * @param nombre
	 * @param titulacion
	 */
	public Alumno(String nombre, String titulacion) {
		super();
		this.nombre = nombre;
		this.titulacion = titulacion;
		this.notaMedia = 0;
	}

	/**
	 * Constructor parametrizado: Un constructor con todos los atributos 
	 * como par�metro.
	 * @param nombre
	 * @param notaMedia
	 * @param titulacion
	 */
	public Alumno(String nombre, double notaMedia, String titulacion) {
		super();
		this.nombre = nombre;
		this.notaMedia = notaMedia;
		this.titulacion = titulacion;
	}

	/**
	 * Metodo setter: 
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Metodo getter: 
	 * @return the nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Metodo setter: 
	 * @param notaMedia the notaMedia to set
	 */
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	/**
	 * Metodo getter: 
	 * @return the notaMedia
	 */
	public double getNotaMedia() {
		return this.notaMedia;
	}

	/**
	 * Metodo setter: 
	 * @param titulacion the titulacion to set
	 */
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	/**
	 * Metodo getter: 
	 * @return the titulacion
	 */
	public String getTitulacion() {
		return this.titulacion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Alumno [Nombre: ");
		builder.append(getNombre());
		builder.append(", Titulacion: ");
		builder.append(getTitulacion());
		builder.append(", Nota Media: ");
		builder.append(getNotaMedia());
		builder.append("]");
		return builder.toString();
	}
	
	public abstract double notaFinal();
	
}
