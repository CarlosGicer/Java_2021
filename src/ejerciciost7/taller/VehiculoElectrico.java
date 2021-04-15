/**
 * 
 */
package ejerciciost7.taller;

/**
 * @author sjgui
 *
 */
public class VehiculoElectrico extends Vehiculo {

	private int kw;

	/**
	 * 
	 */
	public VehiculoElectrico() {
		super();
		this.kw = 0;
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
	public VehiculoElectrico(String matricula, String marca, String modelo, String color, double precio, int cv,int kw) {
		super(matricula, marca, modelo, color, precio, cv);
		this.kw = kw;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("[kw=");
		builder.append(kw);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
