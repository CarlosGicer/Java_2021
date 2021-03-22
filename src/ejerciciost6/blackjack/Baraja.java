/**
 * 
 */
package ejerciciost6.blackjack;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author alumno
 *
 */
public abstract class Baraja {
	
	protected ArrayList<Carta> baraja;

	/**
	 * 
	 */
	public Baraja() {
		super();
		baraja = new ArrayList<>();
	} 
	
	
	public void barajar() {
		Collections.shuffle(baraja);

	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Baraja [ ");
		for(Carta c : baraja) 
			builder.append(c.getNombreCorto());
		builder.append("]");
		return builder.toString();
	}
	
	public Carta repartirCarta() {
		Carta c = baraja.get(0);
		baraja.remove(0);
		return c;
	}
	
	public Carta azar() {
		this.barajar();
		return this.repartirCarta();
	}
	
	

}
