package ejerciciost6.blackjack;

import java.util.ArrayList;

public class Jugador {

	protected ArrayList<Carta> mano;

	/**
	 * 
	 */
	public Jugador() {
		super();
		mano = new ArrayList<>();
	}
	
	public void nuevaCarta(Carta unaCarta) {
		mano.add(unaCarta);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[ ");
		for(Carta c : mano) 
			builder.append(c.getNombreCorto());
		builder.append("]");
		return builder.toString();
	}
	
	/**
	 * @return the mano
	 */
	public ArrayList<Carta> getMano() {
		return mano;
	}
	
	/**
	 * Calcula el valor de las cartas que tiene el jugador en su mano
	 * @return
	 */
	public int valorMano() {
		int valor=0;
		for(Carta c : mano) {			
			//Las figuras (J, Q, K) su valor suma 10
			if (c.getValor() > 10) {
				valor += 10;
			} else { 
				//El resto de cartas suma su valor
				valor += c.getValor();
			}
		}
				
		//Valor sumando los ases como 1 o 11 si no me paso
		for(Carta c : mano) {			
			if (c.getValor() == 1) { //Es un AS
				if (valor + 10 <= 21)
					valor += 10; //Le sumo 10 porque ya le sumé 1
			} 
		}
		
		return valor;
	}
	
	
	
	
	
	
	
	//MAIN
	public static void main(String[] args) {
		BarajaInglesa bi = new BarajaInglesa();
		Jugador j = new Jugador();
		j.nuevaCarta(bi.repartirCarta());
		j.nuevaCarta(bi.repartirCarta());
		j.nuevaCarta(bi.azar());
		j.nuevaCarta(bi.azar());
		System.out.println("" + j + j.valorMano());
		System.out.println(bi);
	}
	
}
