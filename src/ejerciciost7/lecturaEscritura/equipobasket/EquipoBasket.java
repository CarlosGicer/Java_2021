/**
 * 
 */
package ejerciciost7.lecturaEscritura.equipobasket;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;



/**
 * @author sjgui
 *
 */
public class EquipoBasket {

	private HashMap<Integer, JugadorBasket> equipo;

	/**
	 * 
	 */
	public EquipoBasket() {
		super();
		this.equipo = new HashMap<>();
	}
	
	/**
	 * Busca un Jugador en todos los valores del HashMap del equipo
	 * @param jb
	 * @return
	 */
	public JugadorBasket buscarJugador(JugadorBasket jb) {
		if (equipo.containsValue(jb)) {
			LinkedList<JugadorBasket> jugadores = (LinkedList<JugadorBasket>) equipo.values();
			int posicion = Collections.binarySearch(jugadores, jb);
			if (posicion >= 0)
				return jugadores.get(posicion);
			else 
				return null;
		}
		
		return null;
	}
	
	/**
	 * Devuelve directamente el JugadorBasket con el dorsal indicado, siendo este la key devuelve su value
	 * @param dorsal
	 * @return
	 */
	public JugadorBasket buscarJugador(int dorsal) {
		if (equipo.containsKey(dorsal)) {
			return equipo.get(dorsal);
		}
		
		return null;
	}
	
	/**
	 * Devuelve dórsal, nombre y posición de cada Jugador del equipo
	 * @return
	 */
	public String mostrarEquipo() {
		StringBuilder str = new StringBuilder();
		Iterator it = equipo.keySet().iterator(); 
		while(it.hasNext()){ 
		    Integer key = (Integer) it.next();      	
		    str.append("Dorsal: "+key+" -> Jugador: "+equipo.get(key)+"\n"); 
		}
		return str.toString();
	}
	
	/**
	 * Añade un JugadorBasket al equipo usando como key su dorsal
	 * @param j - JugadorBasket a añadir como value
	 * @param dorsal - dorsal del jugador usado como key
	 */
	public void addJugador(JugadorBasket j, int dorsal) {
		equipo.put(dorsal, j);
	}
	
	public boolean removeJugador(int dorsal) {
		if (equipo.containsKey(dorsal)) {
			equipo.remove(dorsal);
			return true;
		}
		
		return false;
	}
	
	
	
}
