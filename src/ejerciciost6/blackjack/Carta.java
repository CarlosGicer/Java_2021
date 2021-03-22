/**
 * 
 */
package ejerciciost6.blackjack;

/**
 * @author alumno
 *
 */
public class Carta {

	private int valor;
	private String figura;
	
	
	/**
	 * @param valor
	 * @param figura
	 */
	public Carta(int valor, String figura) {
		super();
		this.valor = valor;
		this.figura = figura;
	}
	
	public Carta(Carta unaCarta) {
		this.valor = unaCarta.valor;
		this.figura = unaCarta.figura;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * @return the figura
	 */
	public String getFigura() {
		return figura;
	}

	/**
	 * @param figura the figura to set
	 */
	public void setFigura(String figura) {
		this.figura = figura;
	}
	
	public String getNombreCorto() {
		return "" + valor + (char) figura.charAt(0) + " ";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carta [valor=");
		builder.append(valor);
		builder.append(", figura=");
		builder.append(figura);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
