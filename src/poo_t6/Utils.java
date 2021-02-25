/**
 * 
 */
package poo_t6;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * @author alumno
 *
 */
public class Utils {

	
	
	public static void main(String[] args) {
		
		//LocalDate
		LocalDate f = LocalDate.now();
		System.out.println("Año " + f.getYear());
		System.out.println("Bisiesto " + f.isLeapYear());
		LocalDate f2 = LocalDate.of(2022,10,10);
		System.out.println("Día de la semana " + f2.getDayOfWeek());
		LocalDate f3 = LocalDate.parse("2021-02-03");
		System.out.println(f3.toString());
		
		//LocalTime
		LocalTime t1 = LocalTime.now();
		System.out.println("Hora " + t1.getHour() + "Mins " + t1.getMinute() + "Secs " + t1.getSecond());;
		LocalTime t2 = LocalTime.of(22, 00, 00);
		System.out.println("Hora " + t2.getHour() + "Mins " + t2.getMinute() + "Secs " + t2.getSecond());;		
		LocalTime t3 = LocalTime.parse("17:33:25");
		System.out.println("Hora " + t3.getHour() + "Mins " + t3.getMinute() + "Secs " + t3.getSecond());;
		System.out.println(t3.toString());
		String fecha = t3.toString();
		
		//LocalDateTime
		LocalDateTime ldt1 = LocalDateTime.of(2021,2,25,16,47,25);
		System.out.println(ldt1);
		LocalDateTime ldt2 = LocalDateTime.of(f3,t3);
		System.out.println(ldt2);
		System.out.println("Year "+ldt2.getYear());
		LocalDateTime ldt3 = ldt2.withMonth(3);
		System.out.println(ldt3);
		
		Instant i1 = Instant.now();
		System.out.println(i1.toString() + "|" + i1.toEpochMilli());
		
		//ArrayList<String> as = new ArrayList<String>(100000000);
		String str = new String();
		for(int i=0; i<1000000; i++) {
			str = "javier"+i;
			//as.add(str);
		}
		
		Instant i2 = Instant.now();
		System.out.println(i2.toString() + "|" + i2.toEpochMilli());
		
		System.out.println(Duration.between(i1,i2));
		
		//Period, años de una persona
		LocalDate fnac = LocalDate.of(2001,3,6);
		LocalDate now = LocalDate.now();
		Period tiempo = Period.between(fnac,now);
		System.out.println(tiempo.getYears() + " " + tiempo.getMonths() + " " + tiempo.getDays());
		
		//DateTimeFormatter
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(fnac.format(dtf));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu fecha de nacimiento (dd-MM-yyyy): ");
		String fechaN = sc.nextLine();
		try {
			LocalDate nuevaFecha = LocalDate.parse(fechaN, dtf); //Se le pasa el string y el formato
			System.out.println(nuevaFecha.format(dtf));
		} catch (DateTimeParseException ex) {
			System.out.println("No has introducido una fecha válida siguiendo el patrón indicado");
		}
		
		
	}
	
	
	
}
