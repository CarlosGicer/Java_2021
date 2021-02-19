package ejerciciost6.tienda;

public class ProductoHardware extends Producto {
	
	private String cadena;

	/**
	 * @param codigo
	 * @param nombre
	 * @param descripcion
	 * @param precioUnitario
	 */
	public ProductoHardware(String codigo, String nombre, String descripcion, double precioUnitario, String cadena) {
		super(codigo, nombre, descripcion, precioUnitario);
		this.cadena = cadena;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductoHardware [cadena=");
		builder.append(cadena);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
