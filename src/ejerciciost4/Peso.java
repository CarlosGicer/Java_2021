/**
 * 
 */
package ejerciciost4;

/**
 * @author sjgui
 *
 */

public class Peso {
	
	private double peso;
	private String medida;
	

	/**
	 * @param peso
	 * @param medida
	 */
	public Peso(double peso, String medida) {
		super();
		//PESO SE TOMA COMO MEDIDA INICIAL EN KILOS Y LURGO SE PASA A LA MEDIDA ELEGIDA 
		this.peso = peso;
		this.medida = medida;
	}
	
	private double cambiarAKilos() {
		double num = 1 ;
		switch (this.medida) {
			case "Lb": 
				num = this.peso * 0.453;
				break;
			case "Li": 
				num = this.peso * 14.59;
				break;
			case "Oz": 
				num = this.peso * 0.02835;
				break;
			case "P": 
				num = this.peso * 0.00155;
				break;
			case "K": 
				num = this.peso * 1;
				break;
			case "G": 
				num = this.peso * 0.001;
				break;
			case "Q": 
				num = this.peso * 43.3;
				break;
			default:
				num = this.peso * 1;
		}
		
		return num;	
	}
	
	private double cambiarAMedida(String medida) {
		double num = 1;
		double kilos = cambiarAKilos();
		switch (medida) {
			case "Lb": 
				num = kilos / 0.453;
				break;
			case "Li": 
				num = kilos / 14.59;
				break;
			case "Oz": 
				num = kilos / 0.02835;
				break;
			case "P": 
				num = kilos / 0.00155;
				break;
			case "K": 
				num = kilos / 1;
				break;
			case "G": 
				num = kilos / 0.001;
				break;
			case "Q": 
				num = kilos / 43.3;
				break;
			default:
				num = kilos * 1;
		}
		
		return num;
	}
	
	public double getLibras() {
		return cambiarAMedida("Lb");
		
	}
	
	public double getLingotes() {
		return cambiarAMedida("Li");
		
	}
	
	public double getPeso(String medida) {
		
		return cambiarAMedida(medida);
		
	}
	
	public static void main(String[] args) {
		Peso p1 = new Peso(150,"Lb");
		System.out.println(p1.getLibras());
		System.out.println(p1.getPeso("K"));
		
		Peso p2 = new Peso(67.95,"K");
		System.out.println(p2.getLibras());
		System.out.println(p2.getPeso("K"));
	}
}
