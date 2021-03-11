package ejerciciost6.practica1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio3 {

	public static String normalToAmericano(String s) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate parsedDate = LocalDate.parse(s, formatter);
		
		DateTimeFormatter formatterSalida = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		return parsedDate.format(formatterSalida);

	}

	public static String americanoToNormal(String s) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate parsedDate = LocalDate.parse(s, formatter);
		
		DateTimeFormatter formatterSalida = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return parsedDate.format(formatterSalida);

	}
	
	public static void main(String[] args) {
		System.out.println(americanoToNormal(normalToAmericano("22/10/1977")));
		
	}
}
