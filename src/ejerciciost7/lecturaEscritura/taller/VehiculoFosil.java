/**
 * 
 */
package ejerciciost7.lecturaEscritura.taller;

/**
 * @author sjgui
 *
 */
public class VehiculoFosil extends Vehiculo {

	private int capacidadDeposito;
	private String tipoFosil;
	
	/**
	 * 
	 */
	public VehiculoFosil() {
		super();
		this.capacidadDeposito = 0;
		this.tipoFosil = "";
	}

	/**
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param precio
	 * @param cv
	 * @param estado
	 */
	public VehiculoFosil(String matricula, String marca, String modelo, String color, double precio, int cv,
			int capacidadDeposito, String tipoFosil) {
		super(matricula, marca, modelo, color, precio, cv);
		this.capacidadDeposito = capacidadDeposito;
		this.tipoFosil = tipoFosil;
	}

	/**
	 * @return the capacidadDeposito
	 */
	public int getCapacidadDeposito() {
		return capacidadDeposito;
	}

	/**
	 * @param capacidadDeposito the capacidadDeposito to set
	 */
	public void setCapacidadDeposito(int capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}

	/**
	 * @return the tipoFosil
	 */
	public String getTipoFosil() {
		return tipoFosil;
	}

	/**
	 * @param tipoFosil the tipoFosil to set
	 */
	public void setTipoFosil(String tipoFosil) {
		this.tipoFosil = tipoFosil;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("[capacidadDep= ");
		builder.append(capacidadDeposito);
		builder.append(", tipo= ");
		builder.append(tipoFosil);
		builder.append("]");
		return builder.toString();
	}

}
