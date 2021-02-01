/**
 * 
 */
package ejerciciost5;

/**
 * @author sjgui
 *
 */
public class Lavadora extends Electrodomestico {

	private int carga = 5;

	/**
	 * 
	 */
	public Lavadora() {
		super();
	}
	
	/**
	 * @param marca
	 * @param modelo
	 * @param precioBase
	 * @param peso
	 * @param consumoEnergetico
	 * @param color
	 * @param marca
	 */
	public Lavadora(String marca, String modelo, double precioBase, double peso, char consumoEnergetico, String color, int carga) {
		super(marca, modelo, precioBase, peso, consumoEnergetico, color);
		this.carga = carga;
	}

	/**
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lavadora [carga=");
		builder.append(carga);
		builder.append(", ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double precioFinal() {
		double precioMas = 0;
		if (this.carga >= 8)  //Le sumo 50 al precio si la carga es más de 8kg
			precioMas = 50;
		
		return super.precioFinal() + precioMas;
	}
	
	
	
	
	
	
}
