package ejerciciost7.streams.ej1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ejercicio1 {

	public Ejercicio1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		List<String> lista = Arrays.asList("The", "Quick", "BROWN", "Fox", "Jumped", "Over", 
				"The", "LAZY","DOG", "In", "THE", "Street");
		
		//Crea una nueva lista con todos los strings en minúscula y muéstralos después con System.out.
		lista.stream()
			.map(s -> s.toLowerCase())
			.forEach(System.out::println);
		
		lista.stream()
			.forEach((String s) -> {
				System.out.println(s.toLowerCase());
			});
		
		System.out.println("-----------------------------------------------------");
		
		//Haz lo mismo, pero sólo con los strings que tengan más de tres caracteres
		lista.stream()
			.map(s -> s.toLowerCase())
			.filter(s -> s.length() > 3)
			.forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------");
		
		//Haz lo mismo que el anterior, a partir de ese resultado añade que salte los dos primeros strings,
		//y devuelve sólo tres strings del resultado.
		lista.stream()
			.map(s -> s.toLowerCase())
			.filter(s -> s.length() > 3)
			.skip(2)
			.limit(3)
			.forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------");
		
		//Toma la lista y directamente imprímela ordenada.
		lista.stream()
			.sorted(Collections.reverseOrder()) //Ordena al revés
			.forEach(System.out::println);
		
		System.out.println("-----------------------------------------------------");
		
		//Cuenta cuántos strings tienes más de 4 caracteres.
		long total = lista.stream()
			.filter(s -> s.length() > 4)
			.count();
		System.out.println(total);
		System.out.println(lista.stream().filter(s -> s.length() > 4).count());
		
		System.out.println("-----------------------------------------------------");
		
		//Usando una reducción devuelve una cadena uniendo todas las cadenas separadas por un “-“
		String cadena1 = lista.stream()
			.reduce("", (s1,s2) -> s1 + "-" + s2);
		System.out.println(cadena1);
		
		String cadena2 = lista.stream()
				.collect(Collectors.joining("-"));
		System.out.println(cadena2);
		
		System.out.println("-----------------------------------------------------");
		
		//Devuelve la primera cadena que cumpla que contiene (contains) la “O”. (Usar filter con un
		//		Predicate).
		Optional<String> os = lista.stream()
			.filter(s -> s.contains("X"))
			.findFirst();
		System.out.println(os.orElse("No encontrado"));
		
		//Sin Optional
		String ss = lista.stream()
				.filter(s -> s.contains("X"))
				.findFirst()
				.orElse("No encontrado");
		
		System.out.println(ss);
		
		
		
	}

}
