package poo_t7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class TestJugador {

	public static void main(String[] args) {
		
		//Hacemos el equipo con List
		List<JugadorBasket> equipo = new ArrayList<>();
		
		equipo.add(new JugadorBasket("Mirotic", "Alero"));
		equipo.add(new JugadorBasket("Abrines", "Escolta"));
		equipo.add(new JugadorBasket("Gasol", "Pivot"));
		
		int posicion = Collections.binarySearch(equipo, new JugadorBasket("Gasol","Pivot"));
		System.out.println("El jugador está en la posición "+ posicion +
				" se llama " + equipo.get(posicion).getNombre());
		
		//Ahora hacemos el equipo con HashMap
		HashMap<Integer, JugadorBasket> otroEquipo = new HashMap<>();
		otroEquipo.put(5, new JugadorBasket("Mirotic", "Alero"));
		otroEquipo.put(1, new JugadorBasket("Abrines", "Escolta"));
		otroEquipo.put(3, new JugadorBasket("Gasol", "Pivot"));
		otroEquipo.put(7, new JugadorBasket("Calathes", "Base"));
		
		System.out.println("El jugador con el número 3 es " + otroEquipo.get(3).getNombre());
		System.out.println("------------------");
		
		//Recorremos el HashMap a través de sus keys
		Set<Integer> numeros = otroEquipo.keySet();
		for(Integer i : numeros) {
			System.out.println("El jugador con el número " + i + " es " + 
									otroEquipo.get(i).getNombre());
		}

	}

}
