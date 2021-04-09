package poo_t7.finaltema;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TestHotel {

	/*
	// Comparador para comparar por id
	public class Comparador implements Comparator<Hotel> {

		@Override
		public int compare(Hotel o1, Hotel o2) {
			return o1.getIdHotel() - o2.getIdHotel();
		}
		
	}
	*/
	
	private HashSet<Hotel> hoteles;
	
	/**
	 * Constructor que inicializa el Set de Hoteles
	 */
	public TestHotel() {
		super();
		//Creamos el conjunto sin ordenar de hoteles
		hoteles = new HashSet<>();
	}
	
	/**
	 * Devuelve el conjunto de hoteles
	 * @return
	 */
	public HashSet<Hotel> getHoteles() {
		return hoteles;
	}

	/**
	 * Devuelve un conjunto ordenado de hoteles, con los hoteles en esa zona
	 * @param zona
	 * @return
	 */
	public TreeSet<Hotel> buscarOrdenadoId(String zona) {
		//Crear un TreeSet
		//Le paso el Comparator como una clase anónima con el método compare únicamente
		TreeSet<Hotel> hotelesOrder = new TreeSet<>( new Comparator<Hotel>() {
				@Override
				public int compare(Hotel o1, Hotel o2) {
					return o1.getIdHotel() - o2.getIdHotel();
				}
		});
		
		//Recorrer todos los hoteles, y si coincide la zona meto ese hotel en el TreeSet
		for(Hotel h : hoteles) {
			//Si coincide la zona lo añado al TreeSet
			if (h.getZona().equals(zona)) {
				hotelesOrder.add(h); //Ya lo añade ordenado
			}
		}
		
		//Devolver el TreeSet
		return hotelesOrder;
	}
	
	/**
	 * Devuelve un conjunto ordenado de hoteles, con los hoteles en esa zona
	 * @param zona
	 * @return
	 */
	public TreeSet<Hotel> buscarOrdenadoNombre(String zona) {
		//Crear un TreeSet
		//Le paso el Comparator como una clase anónima con el método compare únicamente
		TreeSet<Hotel> hotelesOrder = new TreeSet<>( new Comparator<Hotel>() {
				@Override
				public int compare(Hotel o1, Hotel o2) {
					return o1.getNombre().compareTo(o2.getNombre());
				}
		});
		
		//Recorrer todos los hoteles, y si coincide la zona meto ese hotel en el TreeSet
		for(Hotel h : hoteles) {
			//Si coincide la zona lo añado al TreeSet
			if (h.getZona().equals(zona)) {
				hotelesOrder.add(h); //Ya lo añade ordenado
			}
		}
		
		//Devolver el TreeSet
		return hotelesOrder;
	}
	
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		TestHotel th = new TestHotel();
		
		//Añadimos 10 hoteles de cada zona
		for(int i=0; i<10; i++) {
			th.getHoteles().add(new Hotel(i,"Hotel"+i,"playa",200-(10*i)));
		}
		for(int i=10; i<20; i++) {
			th.getHoteles().add(new Hotel(i,"Hotel"+i,"montaña",300-(10*i)));
		}
		for(int i=20; i<30; i++) {
			th.getHoteles().add(new Hotel(i,"Hotel"+i,"rural",400-(10*i)));
		}
		
		for(Hotel h : th.getHoteles()) {
			System.out.println(h);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Dónde quieres el hotel?");
		System.out.println("1. Playa");
		System.out.println("2. Montaña");
		System.out.println("3. Rural");
		String opcion = sc.nextLine();
		switch (opcion) {
		case "1": {
			System.out.println(th.buscarOrdenadoNombre("playa"));
			break;
		}
		case "2": {
			System.out.println(th.buscarOrdenadoNombre("montaña"));
			break;
		}
		case "3": {
			System.out.println(th.buscarOrdenadoNombre("rural"));
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
		

	}

}
