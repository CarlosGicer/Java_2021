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
	
	

}
