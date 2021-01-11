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
	
	
	public CuentaCorriente() {
		this.saldo = 0;
		generarNumero();
	}


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


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public double getSaldo() {
		return saldo;
	}


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
	
	
	public void ingreso(double cantidad) {
		this.saldo += cantidad;
	}
	
	public void cargo(double cantidad) {
		if ( (this.saldo != 0) && ((this.saldo-cantidad) >= 0) )
			this.saldo -= cantidad;
	}


	
	
	
	
}
