package poo_t7.streams;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsUtils {

	public static void main(String[] args) {
	
List<String> palabras = Arrays.asList("hola", "don", "pepito", "hola", "don", "jose", "amalia", "zizou", "dani");
		
		System.out.println(palabras.stream().filter( c -> c.length() > 3 ).count());
		
		//palabras.sort( (s1, s2) -> s1.compareToIgnoreCase(s2) );
		
		//palabras.sort(String::compareToIgnoreCase);
		
		palabras.stream()
					.filter( c -> c.length() > 3 )
					.sorted()
					//.filter( c -> c.contains("o"))
					.forEach(System.out::println);
		
		System.out.println("------------------");
		
		System.out.println(palabras.stream()
				.filter( c -> c.length() > 3 )
				.map( s -> s.length())
				.sorted()
				.reduce( (s1,s2) -> s1 + s2));
				
		System.out.println("------------------");
		
		List<String> largas = palabras.stream()
								.filter( c -> c.length() > 4 )
								.peek( s -> {
									System.out.println("Depurando " + s);
								})
								.collect(Collectors.toList());  //Lo paso a una lista List<String>
		//largas.stream().forEach(System.out::println);
					
		/*
		Stream<Integer> numeros = Stream.of(1,2,3,9,4,6,5);
		numeros.filter( n -> n > 5)
				.forEach(System.out::println);
		
		Stream<Integer> infinito = Stream.iterate(1,  x -> x + 2).limit(1000);
		infinito.forEach(System.out::println);
		
		Stream<Float> random = Stream.generate(new Random()::nextFloat).limit(10);
		random.forEach(System.out::println);
		*/

	}

}
