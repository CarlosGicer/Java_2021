package ejerciciost6.blackjack;

public class Crupier extends Jugador {

	private final String nombre="Crupier";
	private static final int limite=17;
	
	/**
	 * 
	 */
	public Crupier() {
		super();
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Devuelve el límite a partir del cual no puede pedir más cartas
	 * @return
	 */
	public int getLimite() {
		return limite;
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
	
	public String mostrarCrupier() {
		StringBuilder builder = new StringBuilder();
		builder.append("JugadorBlack [");
		builder.append(nombre);
		builder.append(" ,Mano=");
		for(int i=0; i<mano.size(); i++) {
			if (i==0) {
				builder.append(mano.get(i).getNombreCorto());
			} else  
				builder.append(", X");
		}		
		builder.append("]");
		return builder.toString();
	}
	
		
	public static void main(String[] args) {
		BarajaInglesa bi = new BarajaInglesa();
		Crupier j = new Crupier();
		j.nuevaCarta(bi.repartirCarta());
		j.nuevaCarta(bi.repartirCarta());
		j.nuevaCarta(bi.azar());
		j.nuevaCarta(bi.azar());
		System.out.println(j.mostrarCrupier());
	}

	
	
}
