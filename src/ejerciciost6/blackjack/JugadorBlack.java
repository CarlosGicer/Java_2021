package ejerciciost6.blackjack;

public class JugadorBlack extends Jugador {

	private String nombre;

	/**
	 * 
	 */
	public JugadorBlack(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JugadorBlack [");
		builder.append(nombre);
		builder.append(", Valor= ");
		builder.append(valorMano());
		builder.append(" ,Mano=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	public static void main(String[] args) {
		BarajaInglesa bi = new BarajaInglesa();
		JugadorBlack j = new JugadorBlack("Javier");
		j.nuevaCarta(bi.repartirCarta());
		j.nuevaCarta(bi.repartirCarta());
		j.nuevaCarta(bi.azar());
		j.nuevaCarta(bi.azar());
		System.out.println(j);
	}
	
	
	
}
