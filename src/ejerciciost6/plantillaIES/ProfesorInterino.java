/**
 * 
 */
package ejerciciost6.plantillaIES;

import java.time.LocalDate;

/**
 * @author sjgui
 *
 */
public class ProfesorInterino extends Profesor {

	private LocalDate fechaComienzo;

	/**
	 * 
	 */
	public ProfesorInterino() {
		super();
		this.fechaComienzo = LocalDate.now();
	}

	/**
	 * @param unProfesor
	 */
	public ProfesorInterino(ProfesorInterino unProfesor) {
		super(unProfesor);
		this.fechaComienzo = unProfesor.fechaComienzo;
	}

	/**
	 * @param numeroRegistro
	 * @param nombre
	 * @param apellidos
	 * @param fechaNacimiento
	 * @param nominaBase
	 */
	public ProfesorInterino(String numeroRegistro, String nombre, String apellidos, LocalDate fechaNacimiento,
			double nominaBase, LocalDate fechaComienzo)  throws Exception{
		super(numeroRegistro, nombre, apellidos, fechaNacimiento, nominaBase);
		this.fechaComienzo = fechaComienzo;
	}

	/**
	 * @return the fechaComienzo
	 */
	public LocalDate getFechaComienzo() {
		return fechaComienzo;
	}

	/**
	 * @param fechaComienzo the fechaComienzo to set
	 */
	public void setFechaComienzo(LocalDate fechaComienzo) {
		this.fechaComienzo = fechaComienzo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProfesorTitular [numeroRegistro=");
		builder.append(numeroRegistro);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", nominaBase=");
		builder.append(nominaBase);
		builder.append(", fechaComienzo=");
		builder.append(fechaComienzo);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public double importeNomina() {
		return this.nominaBase * 1.1;
	}
	
	
}
