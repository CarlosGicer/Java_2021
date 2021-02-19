/**
 * 
 */
package ejerciciost6.tienda;

import java.util.ArrayList;

/**
 * @author sjgui
 *
 */
public class Pedido {

	private String codigoPedido;
	private Cliente cliente;
	private ArrayList<LineaPedido> lineasPedido;
	
	/**
	 * @param codigoPedido
	 * @param cliente
	 */
	public Pedido(String codigoPedido, Cliente cliente) {
		super();
		this.codigoPedido = codigoPedido;
		this.cliente = cliente;
		this.lineasPedido = new ArrayList<LineaPedido>();
	}

	/**
	 * @return the codigoPedido
	 */
	public String getCodigoPedido() {
		return codigoPedido;
	}

	/**
	 * @param codigoPedido the codigoPedido to set
	 */
	public void setCodigoPedido(String codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the lineasPedido
	 */
	public ArrayList<LineaPedido> getLineasPedido() {
		return lineasPedido;
	}

	/**
	 * @param lineasPedido the lineasPedido to set
	 */
	public void setLineasPedido(ArrayList<LineaPedido> lineasPedido) {
		this.lineasPedido = lineasPedido;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [codigoPedido=");
		builder.append(codigoPedido);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append(", lineasPedido=");
		builder.append(lineasPedido);
		builder.append("]");
		return builder.toString();
	}
	
	public void nuevaLinea(LineaPedido lp) {
		this.lineasPedido.add(lp);
	}
	
	
	
		
}
