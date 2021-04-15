/**
 * 
 */
package ejerciciost7.taller;

/**
 * @author sjgui
 *
 */
public class VehiculoHibrido extends Vehiculo {

	private int kw;
	private int capacidadDeposito;
	private String tipoFosil;
	
	/**
	 * 
	 */
	public VehiculoHibrido() {
		super();
		this.kw = 0;
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
	public VehiculoHibrido(String matricula, String marca, String modelo, String color, double precio, int cv,
			int kw, int capacidadDeposito, String tipoFosil) {
		super(matricula, marca, modelo, color, precio, cv);
		this.kw = kw;
		this.capacidadDeposito = capacidadDeposito;
		this.tipoFosil = tipoFosil;
	}

	/**
	 * @return the kw
	 */
	public int getKw() {
		return kw;
	}

	/**
	 * @param kw the kw to set
	 */
	public void setKw(int kw) {
		this.kw = kw;
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
		builder.append("[kw=");
		builder.append(kw);
		builder.append(", capacidadDep= ");
		builder.append(capacidadDeposito);
		builder.append(", tipo= ");
		builder.append(tipoFosil);
		builder.append("]");
		return builder.toString();
	}

	
}
