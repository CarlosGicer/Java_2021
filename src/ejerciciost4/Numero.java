package ejerciciost4;

public class Numero {

	private int numero;
	
		/**
	 * 
	 */
	public Numero() {
		super();
		this.numero = 0;
	}
	
	/**
	 * @param numero
	 */
	public Numero(int numero) {
		super();
		this.numero = numero;
	}

	public void suma(int valor) {
		this.numero += valor;
	}
	
	public void resta(int valor) {
		this.numero -= valor;
	}

	
	/**
	 * @return the numero * 2
	 */
	public int getDoble() {
		return numero * 2;
	}
	
	/**
	 * @return the numero * 3
	 */
	public int getTriple() {
		return numero * 3;
	}	

	/**
	 * @return the numero
	 */
	public int getValor() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
