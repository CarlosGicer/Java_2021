/**
 * 
 */
package ejerciciost6.tienda;

/**
 * @author sjgui
 *
 */
public class Proveedor extends Persona {

	private String cuentaProveedor;
	private double descuento;
	
	/**
	 * @param identificador
	 * @param nombre
	 * @param email
	 * @param movil
	 * @param direccion
	 */
	public Proveedor(String identificador, String nombre, String email, String movil, Direccion direccion, 
					 String cuentaProveedor, double descuento) {
		super(identificador, nombre, email, movil, direccion);
		this.cuentaProveedor = cuentaProveedor;
		this.descuento = descuento;
	}
	
	

	
	
}
