/**
 * 
 */
package ejerciciost6.plantillaIES;

import java.time.LocalDate;

/**
 * @author sjgui
 *
 */
public class ProfesorTitular extends Profesor {

	private boolean esCatedratico;
	
	/**
	 * 
	 */
	public ProfesorTitular() {
		super();
		this.esCatedratico = false;
	}

	/**
	 * @param unProfesor
	 */
	public ProfesorTitular(ProfesorTitular unProfesor) {
		super(unProfesor);
		this.esCatedratico = unProfesor.esCatedratico;
	}

	/**
	 * @param numeroRegistro
	 * @param nombre
	 * @param apellidos
	 * @param fechaNacimiento
	 * @param nominaBase
	 */
	public ProfesorTitular(String numeroRegistro, String nombre, String apellidos, LocalDate fechaNacimiento,
			double nominaBase, boolean esCatedratico) throws Exception {
		super(numeroRegistro, nombre, apellidos, fechaNacimiento, nominaBase);
		this.esCatedratico = esCatedratico;
	}

	/**
	 * @return the esCatedratico
	 */
	public boolean isEsCatedratico() {
		return esCatedratico;
	}

	/**
	 * @param esCatedratico the esCatedratico to set
	 */
	public void setEsCatedratico(boolean esCatedratico) {
		this.esCatedratico = esCatedratico;
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
		builder.append(", esCatedratico=");
		builder.append(esCatedratico);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double importeNomina() {
		return this.nominaBase * 1.3;
	}
	
	
	
	
	
	

}
