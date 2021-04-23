/**
 * 
 */
package ejerciciost7.lecturaEscritura.equipobasket;

import java.util.TreeMap;

import ejerciciost7.lecturaEscritura.equipobasket.JugadorBasket.Posicion;

/**
 * @author sjgui
 *
 */
public class LigaACB {

	private TreeMap<String, EquipoBasket> ligaACB;

	/**
	 * 
	 */
	public LigaACB() {
		super();
		ligaACB = new TreeMap<>();
	}

	public void addEquipo(EquipoBasket equipo, String nombreEquipo) {
		ligaACB.put(nombreEquipo, equipo);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LigaACB");
		for(String nombreEquipo : ligaACB.keySet()) {
			builder.append("\nEquipo: ");
			builder.append(nombreEquipo+"\n");
			builder.append(ligaACB.get(nombreEquipo).mostrarEquipo());
		}
		builder.append("]");
		return builder.toString();
	}
	
	
	
	public static void main(String[] args) {
		EquipoBasket RMadrid = new EquipoBasket();
		RMadrid.addJugador(new JugadorBasket("Tavares", Posicion.PIVOT), 22);
		RMadrid.addJugador(new JugadorBasket("Garuba", Posicion.PIVOT), 16);
		RMadrid.addJugador(new JugadorBasket("Thomkins", Posicion.ALAPIVOT), 33);
		RMadrid.addJugador(new JugadorBasket("Randolph", Posicion.ALAPIVOT), 3);
		RMadrid.addJugador(new JugadorBasket("Taylor", Posicion.ALERO), 44);
		RMadrid.addJugador(new JugadorBasket("Deck", Posicion.ALERO), 14);
		RMadrid.addJugador(new JugadorBasket("Rudy", Posicion.ALERO), 5);
		RMadrid.addJugador(new JugadorBasket("Carroll", Posicion.ESCOLTA), 20);
		RMadrid.addJugador(new JugadorBasket("Llull", Posicion.BASE), 23);
		RMadrid.addJugador(new JugadorBasket("Alocén", Posicion.BASE), 12);
		RMadrid.addJugador(new JugadorBasket("Laprovittola", Posicion.BASE), 8);

		System.out.println(RMadrid.buscarJugador(23));
		System.out.println(RMadrid.mostrarEquipo());
		
		LigaACB liga = new LigaACB();
		liga.addEquipo(RMadrid, "RealMadrid");
		liga.addEquipo(RMadrid, "Baskonia");
		liga.addEquipo(RMadrid, "Barcelona");
		
		System.out.println(liga);
		
	}
	
	
}
