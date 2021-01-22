package poo_t6;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
/*
		LocalDate fecha = LocalDate.of(2017, 3, 18);
		int año = fecha.getYear();
		Month mes = fecha.getMonth();
		int dia = fecha.getDayOfMonth();
		DayOfWeek diaSemana = fecha.getDayOfWeek();
		int len = fecha.lengthOfMonth();
		boolean bisiesto = fecha.isLeapYear();
		
		LocalDate hoy = LocalDate.now();
		
		int fanio = hoy.get(ChronoField.YEAR);
		int fmes = hoy.get(ChronoField.MONTH_OF_YEAR);
		int fdia = hoy.get(ChronoField.DAY_OF_MONTH);
		
		
		LocalTime hora = LocalTime.of(13, 45, 20);
		int horas = hora.getHour();
		int minutos = hora.getMinute();
		int segundos = hora.getSecond();
	
		//Pasar de String a fecha:
		LocalDate ldfecha = LocalDate.parse("2014-03-18");
		LocalTime lthora = LocalTime.parse("13:45:20"); 

		LocalTime time = LocalTime.of(14, 30, 35); //14:30:35
		LocalTime time1 = time.withHour(20); //20:30:35
		LocalTime time2 = time.withMinute(25); //14:25:35
		LocalTime time3 = time.withSecond(23); //14:30:23
		LocalTime time4 = time.withNano(24); //14:30:35.000000024
		LocalTime time5 = time.with(ChronoField.HOUR_OF_DAY, 23); //23:30:35
*/

		// 2014-03-18T13:45:20
		LocalDate fecha = LocalDate.parse("2014-03-18");
		LocalTime hora = LocalTime.parse("13:45:20"); 
		
		LocalDateTime dt1 = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 20);
		LocalDateTime dt2 = LocalDateTime.of(fecha, hora);
		LocalDateTime dt3 = fecha.atTime(13, 45, 20); //Combina fecha y hora
		LocalDateTime dt4 = fecha.atTime(hora);       // "
		LocalDateTime dt5 = hora.atDate(fecha);       //Combina hora y fecha

		LocalDateTime dateTime1 = dt1.withYear(2017);
		LocalDateTime dateTime2 = dt1.withMonth(8);
		LocalDateTime dateTime3 = dt1.withDayOfMonth(27);
		LocalDateTime dateTime4 = dt1.withHour(20);
		LocalDateTime dateTime5 = dt1.withMinute(25);
		LocalDateTime dateTime6 = dt1.withSecond(23);
		LocalDateTime dateTime7 = dt1.withNano(24);
		LocalDateTime dateTime8 = dt1.with(ChronoField.HOUR_OF_DAY, 23);

		
		Instant.ofEpochSecond(3);

		Instant instanteA=Instant.now();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Instant instanteB= Instant.now();
		System.out.println(Duration.between(instanteA, instanteB));
			
		LocalDate fechaA = LocalDate.of(2018, 8, 26);
		LocalDate fechaB = LocalDate.of(2020, 9, 28);
		Period period = Period.between(fechaA, fechaB);
		System.out.printf("Periodo %s y %s" + "hay %d años, %d meses" + " y %d dias%n", 
							fechaA, fechaB,period.getYears(),period.getMonths(),period.getDays());

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha1 = LocalDate.of(2020, 3, 18);
		String fechaFormateada1 = fecha1.format(formato);
		
		//Pasar de string formateada con una fecha y el formato, a una fecha LocalDate
		LocalDate fecha2 = LocalDate.parse(fechaFormateada1, formato); 

		LocalDateTime dt = LocalDateTime.of(fecha, hora);
		String fechaFormateada2 = dt.format(formato);
		
		
		

	}

}
