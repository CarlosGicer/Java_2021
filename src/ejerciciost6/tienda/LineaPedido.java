/**
 * 
 */
package ejerciciost6.tienda;

/**
 * @author sjgui
 *
 */
public class LineaPedido {

	private Producto producto;
	private int cantidad;
	
	/**
	 * @param producto
	 * @param cantidad
	 */
	public LineaPedido(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LineaPedido [producto=");
		builder.append(producto);
		builder.append(", cantidad=");
		builder.append(cantidad);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
}
