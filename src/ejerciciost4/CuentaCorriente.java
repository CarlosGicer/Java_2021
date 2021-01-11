/**
 * 
 */
package ejerciciost4;

/**
 * @author alumno
 *
 */
public class CuentaCorriente {

	//ATRIBUTOS
	private String numero;
	private double saldo;

	
	/**
	 * Se genera aleatoriamente un string con 10 números aleatorios
	 */
	public CuentaCorriente() {
		this.saldo = 0;
		generarNumero();
	}


	/**
	 * @param numero - numero de cuenta que va a tener
	 */
	public CuentaCorriente(String numero) {
		this.numero = numero;
		this.saldo = 0;
	}


	public void generarNumero() {
		StringBuffer strb = new StringBuffer();
		//10 número aleatorios
		int j;
		for (int i=0; i<10; i++) {
			strb.append( (int) (Math.random() * 10) );
		}
		
		this.numero = strb.toString();
	}


	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}


	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}


	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}


	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaCorriente [numero=");
		builder.append(numero);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * Ingresa una cantidad en una cuenta
	 * @param cantidad - dinero a ingresar
	 */
	public void ingreso(double cantidad) {
		this.saldo += cantidad;
	}
	
	/**
	 * Saca una cantidad de una cuenta
	 * @param cantidad - dinero a sacar
	 * @return true si se ha podido retirar (cantidad <= saldo)
	 */
	public boolean cargo(double cantidad) {
		boolean trans = false;
		
		if ( (this.saldo != 0) && (this.saldo >= cantidad) ) {
			this.saldo -= cantidad;
			trans = true;
		}
		
		return trans;
	}

	/**
	 * Transfiere cantidad de la cuenta pasada como parámetro a esta cuenta
	 * @param cc - Cuenta desde la que hacer la transferencia
	 * @param cantidad - cantidad a transferir de la cuenta cc a esta cuenta 
	 * @return true si se ha podido realizar la transferencia (hay suficiente saldo)
	 */
	public boolean transferencia(CuentaCorriente cc, double cantidad) {
		boolean trans = false;
		
		if ( cc.cargo(cantidad) ) { 
			this.ingreso(cantidad);
			trans = true;
		}
		
		return trans;
	}
	
	
	
	
}
