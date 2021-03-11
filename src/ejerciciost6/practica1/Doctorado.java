/**
 * 
 */
package ejerciciost6.practica1;

/**
 * @author Francisco Castro Mañas
 *
 */
public class Doctorado extends Alumno {

	//Propiedades
	private String nombreTesis;
	private double notaTesis;
	
	public static final double notaTesisDefecto = 8.5;
	
	/**
	 * Constructor parametrizado: 
	 * @param nombre
	 * @param titulacion
	 * @param nombreTesis
	 */
	public Doctorado(String nombre, String titulacion, String nombreTesis) {
		super(nombre, titulacion);
		this.nombreTesis = nombreTesis;
		this.notaTesis = Doctorado.notaTesisDefecto;
	}
	
	/**
	 * Constructor parametrizado: 
	 * @param nombre
	 * @param titulacion
	 * @param nombreTesis
	 * @param notaTesis
	 */
	public Doctorado(String nombre, String titulacion, String nombreTesis, double notaTesis) {
		super(nombre, titulacion);
		this.nombreTesis = nombreTesis;
		this.notaTesis = notaTesis;
	}

	/**
	 * Constructor parametrizado: 
	 * @param nombre
	 * @param notaMedia
	 * @param titulacion
	 * @param nombreTesis
	 * @param notaTesis
	 */
	public Doctorado(String nombre, double notaMedia, String titulacion, String nombreTesis, 
			double notaTesis) {
		super(nombre, notaMedia, titulacion);
		this.nombreTesis = nombreTesis;
		this.notaTesis = notaTesis;
	}

	/**
	 * Metodo setter: 
	 * @param nombreTesis the nombreTesis to set
	 */
	public void setNombreTesis(String nombreTesis) {
		this.nombreTesis = nombreTesis;
	}
	
	/**
	 * Metodo getter: 
	 * @return the nombreTesis
	 */
	public String getNombreTesis() {
		return this.nombreTesis;
	}
	
	/**
	 * Metodo setter: 
	 * @param notaTesis the notaTesis to set
	 */
	public void setNotaTesis(double notaTesis) {
		this.notaTesis = notaTesis;
	}
	
	/**
	 * Metodo getter: 
	 * @return the notaTesis
	 */
	public double getNotaTesis() {
		return this.notaTesis;
	}

	/**
	 * Metodo toString: Hay que pensar como aprovechar la herencia
	 * @return retorna los datos del objeto
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Alumno: ");
		builder.append(getNombre());
		builder.append("\nTitulacion: ");
		builder.append(getTitulacion());
		builder.append(" (");
		builder.append(getNotaMedia());
		builder.append(" nota media)");
		builder.append("\nTesis doctoral: ");
		builder.append(getNombreTesis());
		builder.append(" (");
		builder.append(getNotaTesis());
		builder.append(" nota obtenida)");
		builder.append("\nNota final: ");
		builder.append(notaFinal());
		return builder.toString();
	}

	/**
	 * Metodo notaFinal: 
	 * @return retorna la nota final del alumno en doctorado
	 */
	@Override
	public double notaFinal() {
		return (this.notaMedia+this.notaTesis)/2;
	}
	
}
