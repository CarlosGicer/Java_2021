/**
 * 
 */
package ejerciciost4;

/**
 * @author sjgui
 *
 */
public class Peso {
	
	private double pesoKilogramos;

	/**
	 * @param pesoKilogramos
	 */
	public Peso(double peso, String medida) {
		super();
		this.pesoKilogramos = convertir(peso, medida);
	} 
	
	public double convertir(double peso, String medida) {
		
		switch (medida) {
			case "Lb": {
				return (peso * 0.483);
			}
			case "Li": {
				return (peso * 14.59);
			}
			case "Oz": {
				return (peso * 0.02835);
			}
			case "P": {
				return (peso * 0.00155);
			}
			case "K": {
				return (peso);
			}
			case "G": {
				return (peso / 1000);
			}
			case "Q": {
				return (peso * 43.3);
			}
			default: {
				return 0;
			}
		}

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Peso [pesoKilogramos=");
		builder.append(pesoKilogramos);
		builder.append("]");
		return builder.toString();
	}
	
	
	public double getPeso(String medida) {
		
		switch (medida) {
			case "Lb": {
				return (this.pesoKilogramos / 0.483);
			}
			case "Li": {
				return (this.pesoKilogramos / 14.59);
			}
			case "Oz": {
				return (this.pesoKilogramos / 0.02835);
			}
			case "P": {
				return (this.pesoKilogramos / 0.00155);
			}
			case "K": {
				return (this.pesoKilogramos);
			}
			case "G": {
				return (this.pesoKilogramos * 1000);
			}
			case "Q": {
				return (this.pesoKilogramos / 43.3);
			}
			default: {
				return 0;
			}
			
		}
	}
	
	public double getLibras() {
		return getPeso("Lb");
	}
	
	public double getLingotes() {
		return getPeso("Li");
	}
	
	
}
