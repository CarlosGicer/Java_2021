/**
 * 
 */
package ejerciciost6.tienda;

/**
 * @author sjgui
 *
 */
public class ProductoSoftware extends Producto {
	
	private double version;

	/**
	 * @param codigo
	 * @param nombre
	 * @param descripcion
	 * @param precioUnitario
	 */
	public ProductoSoftware(String codigo, String nombre, String descripcion, double precioUnitario, double version) {
		super(codigo, nombre, descripcion, precioUnitario);
		this.version = version;

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductoSoftware [version=");
		builder.append(version);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
