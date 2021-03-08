/**
 * 
 */
package segundaevaluacion.primevideo;

/**
 * @author sjgui
 *
 */
public class ClientePrime extends Cliente {

	private static final double PRECIO = 3;
	/**
	 * 
	 */
	public ClientePrime() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param dni
	 * @param nombre
	 * @param email
	 * @param precioMensual
	 */
	public ClientePrime(String dni, String nombre, String email) {
		super(dni, nombre, email);
		this.precioMensual = ClientePrime.PRECIO;
	}
	

	public boolean esPro() {
		return false;
	}
	
	public double getPrecioMensual() {
		return ClientePrime.PRECIO;
	}
}
