package ejerciciost4;

public class Finanzas {

	
	private double cambio;
	

	/**
	 * 
	 */
	public Finanzas() {
		super();
		this.cambio = 1.36;
	} 
	
	/**
	 * @param cambio
	 */
	public Finanzas(double cambio) {
		super();
		this.cambio = cambio;
	}


	public double dolaresToEuros(double dolares) {
		return (dolares * this.cambio);
	}
	
	public double eurosToDolares(double euros) {
		return (euros / this.cambio);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Finanzas f = new Finanzas(1.40);
		System.out.println(f.dolaresToEuros(1500));
		
	}

}
