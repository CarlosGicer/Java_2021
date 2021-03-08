/**
 * 
 */
package segundaevaluacion.primevideo;

/**
 * @author sjgui
 *
 */
public class ClientePrimePro extends Cliente {

	private static final double PRECIO = 5;
	/**
	 * 
	 */
	public ClientePrimePro() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param dni
	 * @param nombre
	 * @param email
	 * @param precioMensual
	 */
	public ClientePrimePro(String dni, String nombre, String email) {
		super(dni, nombre, email);
		this.precioMensual = ClientePrimePro.PRECIO;
	}
	

	public boolean esPro() {
		return true;
	}
	
	public double getPrecioMensual() {
		return ClientePrimePro.PRECIO;
	}
}
