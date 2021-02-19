package ejerciciost6.tienda;

public class Test {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("0101222", "Manolo García", "manolog@gmail.com", "656222111", 
					new Direccion("Calle", "Miguel Unamuno", 7, "Vera", "Almería", "04635", "España"));

		Pedido pedido1 = new Pedido("x000111", cliente1);
		
		pedido1.nuevaLinea( new LineaPedido(new ProductoHardware("p1111", "Xiaomi MI 11", "Telefonaco", 800,"c"), 2) );
		pedido1.nuevaLinea( new LineaPedido(new ProductoHardware("p1112", "Samsung S13", "Telefonaco", 1000,"cb"), 1) );
		
		System.out.println(pedido1);
		
		for(LineaPedido linea : pedido1.getLineasPedido()) {
			System.out.println("Codigo " + linea.getProducto().getCodigo() + " Precio " + linea.getProducto().getPrecioUnitario()
					+ " Cantidad " + linea.getCantidad());
		}
	}

}
