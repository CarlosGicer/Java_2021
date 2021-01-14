/**
 * 
 */
package ejerciciost4;

/**
 * @author alumno
 *
 */
public class TarjetaRegalo {

	private String numero;
	private double saldo;
	private boolean activa;
	
	/**
	 * 
	 */
	public TarjetaRegalo() {
		this.saldo = 0;
		this.activa = true;
		this.generarNumero();
		
	}

	/**
	 * @param saldo
	 */
	public TarjetaRegalo(double saldo) {
		this();
		this.saldo = saldo;
	}
	
	
	public void generarNumero() {
		StringBuffer strb = new StringBuffer();
		//12 número aleatorios
		int j;
		for (int i=0; i<12; i++) {
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

	/**
	 * @return the activa
	 */
	public boolean isActiva() {
		return activa;
	}

	/**
	 * @param activa the activa to set
	 */
	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TarjetaRegalo numero ");
		builder.append(numero);
		builder.append(" con saldo de ");
		builder.append(saldo);
		builder.append("€. ");
		builder.append("Activa (");
		builder.append(activa);
		builder.append(")");
		return builder.toString();
	}
	
	
	public void fusionarTarjeta(TarjetaRegalo tarjeta) {
		this.saldo += tarjeta.getSaldo(); //El saldo de tarjeta se lo paso a este objeto
		tarjeta.setSaldo(0); //El saldo del objeto parámetro lo pongo a 0
		tarjeta.setActiva(false); //Dejo inactiva la tarjeta pasada como parámetro
	}
	
	
	
	
}
