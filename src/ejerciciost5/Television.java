/**
 * 
 */
package ejerciciost5;

/**
 * @author sjgui
 *
 */
public class Television extends Electrodomestico {

	private int pulgadas;
	private String tecnologia = "";
	private String resolucion = "";
	
	/**
	 * 
	 */
	public Television() {
		super();
	}
	
	/**
	 * @param marca
	 * @param modelo
	 * @param precioBase
	 * @param peso
	 * @param consumoEnergetico
	 * @param color
	 */
	public Television(String marca, String modelo, double precioBase, double peso, char consumoEnergetico,
			String color, int pulgadas, String tecnologia, String resolucion) {
		
		super(marca, modelo, precioBase, peso, consumoEnergetico, color);
		this.pulgadas = pulgadas;
		this.tecnologia = tecnologia;
		this.resolucion = resolucion;
	}

	/**
	 * @return the pulgadas
	 */
	public int getPulgadas() {
		return pulgadas;
	}

	/**
	 * @return the tecnologia
	 */
	public String getTecnologia() {
		return tecnologia;
	}

	/**
	 * @return the resolucion
	 */
	public String getResolucion() {
		return resolucion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Television [pulgadas=");
		builder.append(pulgadas);
		builder.append(", tecnologia=");
		builder.append(tecnologia);
		builder.append(", resolucion=");
		builder.append(resolucion);
		builder.append(", ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double precioFinal() {
		double precioMas = 0;
		if (this.pulgadas > 50)
			precioMas += 50;
		if (this.pulgadas > 65)
			precioMas += 75;
		if (this.tecnologia.equals("oled"))
			precioMas += 150;
		if (this.resolucion.equals("4K"))
			precioMas += 100;
		if (this.resolucion.equals("8K"))
			precioMas += 200;
		
		return super.precioFinal() + precioMas;
	}
	
	
	
	
	
}
