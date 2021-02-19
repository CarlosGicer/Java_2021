/**
 * 
 */
package ejerciciost6.plantillaIES;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author sjgui
 *
 */
public abstract class Profesor {

	protected String numeroRegistro;
	protected String nombre;
	protected String apellidos;
	protected LocalDate fechaNacimiento;  //LocalDate, LocalTime, LocalDateTime
	protected double nominaBase;
	private LocalDate endDateExclusive;
	
	/**
	 * 
	 */
	public Profesor() {
		this.numeroRegistro = "-";
		this.nombre = "";
		this.apellidos = "";
		this.fechaNacimiento = LocalDate.now();
		this.nominaBase = 0;
	}
	
	
	/**
	 * @param numeroRegistro
	 * @param nombre
	 * @param apellidos
	 * @param fechaNacimiento
	 * @param nominaBase
	 * @throws Exception 
	 */
	public Profesor(String numeroRegistro, String nombre, String apellidos, LocalDate fechaNacimiento,
			double nominaBase) throws Exception {
		super();
		this.numeroRegistro = numeroRegistro;
		this.nombre = nombre;
		this.apellidos = apellidos;
		
		//Comprobación que la nómina sea mayor que 500
		if (nominaBase >= 500) {
			this.nominaBase = nominaBase;
		} else {
			throw new Exception("La nómina de " + this.nombre + " debe ser mayor de 500€");
		}
		
		//Comprobación que la edad es mayor de 22 años
		if (this.getEdad(fechaNacimiento) >= 22) {
			this.fechaNacimiento = fechaNacimiento;
		} else {
			throw new Exception("Edad incorrecta, debe ser mayor de 22 años");
		}
		
	}
	
	/**
	 * Constructor copia
	 * @param unProfesor
	 */
	public Profesor(Profesor unProfesor) {
		this.numeroRegistro = unProfesor.numeroRegistro;
		this.nombre = unProfesor.nombre;
		this.apellidos = unProfesor.apellidos;
		this.fechaNacimiento = unProfesor.fechaNacimiento;
		this.nominaBase = unProfesor.nominaBase;
	}


	/**
	 * @return the numeroRegistro
	 */
	public String getNumeroRegistro() {
		return numeroRegistro;
	}


	/**
	 * @param numeroRegistro the numeroRegistro to set
	 */
	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
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
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	/**
	 * @return the nominaBase
	 */
	public double getNominaBase() {
		return nominaBase;
	}


	/**
	 * @param nominaBase the nominaBase to set
	 */
	public void setNominaBase(double nominaBase) {
		this.nominaBase = nominaBase;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Profesor [numeroRegistro=");
		builder.append(numeroRegistro);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", nominaBase=");
		builder.append(nominaBase);
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * 
	 * @return Importe calculado de la nómina en función del tipo de profesor
	 */
	public abstract double importeNomina();
	
	/**
	 * 
	 * @return La edad en años de una persona calculada con su fecha de nacimiento
	 */
	public int getEdad(LocalDate fNacimiento) {
		Period periodo = Period.between(fNacimiento, LocalDate.now());
		
		return periodo.getYears();
	}
	
	
	
}
