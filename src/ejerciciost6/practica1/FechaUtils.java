package ejerciciost6.practica1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class FechaUtils {

	public enum SignosZodiaco {
		ARIES, TAURO, GÉMINIS, CÁNCER, LEO, VIRGO, LIBRA, ESCORPIO, SAGITARIO, 
		CAPRICORNIO, ACUARIO, PISCIS
	};
	
	public static void cuentaAtras(LocalDateTime fechaHasta, String titulo) {
		LocalDateTime fechaActual = LocalDateTime.now();		
		
		Period cuentaAtras = Period.between(fechaHasta.toLocalDate(),fechaActual.toLocalDate());
		Duration cuentaAtras2 = Duration.between(fechaHasta.toLocalTime(),fechaActual.toLocalTime());
		
		System.out.println("Faltan " + cuentaAtras.getYears() + " años, " + cuentaAtras.getMonths() + " meses, " + cuentaAtras.getDays() 
				+ " dias, " + cuentaAtras2.toHours() + " horas, " + cuentaAtras2.toMinutes() + " minutos y " + cuentaAtras2.toSeconds() 
				+ " segundos para " + titulo);
	}
	
	public static String diaCumple(LocalDate fechaCumple, int año) {
		
		LocalDate fecha = fechaCumple.withYear(año);
		
		Locale numeroDiaSemana = Locale.forLanguageTag("es-ES");
		String diaSemana = fecha.format(DateTimeFormatter.ofPattern("EEEE", numeroDiaSemana));
		
		return diaSemana;
	}
	
	public static int numYears(LocalDate fechaCumple) {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaCumple, fechaActual);

		return periodo.getYears();
	}
	
	public static String zodiaco(LocalDate fecha) {
		SignosZodiaco signo = null;
		
		switch(fecha.getMonthValue()) {
			case 1:
				if(fecha.getDayOfMonth() <= 20) {
					signo = SignosZodiaco.CAPRICORNIO;
				}else if(fecha.getDayOfMonth() >= 21){
					signo = SignosZodiaco.ACUARIO;
				}
				break;
			case 2:
				if(fecha.getDayOfMonth() <= 18) {
					signo = SignosZodiaco.ACUARIO;
				}else if(fecha.getDayOfMonth() >= 19){
					signo = SignosZodiaco.PISCIS;
				}
				break;
			case 3:
				if(fecha.getDayOfMonth() >= 21) {
					signo = SignosZodiaco.ARIES;
				}else if(fecha.getDayOfMonth() <= 20){
					signo = SignosZodiaco.PISCIS;
				}
				break;
			case 4:
				if(fecha.getDayOfMonth() <= 20) {
					signo = SignosZodiaco.ARIES;
				}else if(fecha.getDayOfMonth() >= 21){
					signo = SignosZodiaco.TAURO;
				}
				break;
			case 5:
				if(fecha.getDayOfMonth() <= 20) {
					signo = SignosZodiaco.TAURO;
				}else if(fecha.getDayOfMonth() >= 21){
					signo = SignosZodiaco.GÉMINIS;
				}
				break;
			case 6:
				if(fecha.getDayOfMonth() <= 21) {
					signo = SignosZodiaco.GÉMINIS;
				}else if(fecha.getDayOfMonth() >= 22){
					signo = SignosZodiaco.CÁNCER;
				}
				break;
			case 7:
				if(fecha.getDayOfMonth() <= 22) {
					signo = SignosZodiaco.CÁNCER;
				}else if(fecha.getDayOfMonth() >= 23){
					signo = SignosZodiaco.LEO;
				}
				break;
			case 8:
				if(fecha.getDayOfMonth() <= 22) {
					signo = SignosZodiaco.LEO;
				}else if(fecha.getDayOfMonth() >= 23){
					signo = SignosZodiaco.VIRGO;
				}
				break;
			case 9:
				if(fecha.getDayOfMonth() <= 22) {
					signo = SignosZodiaco.VIRGO;
				}else if(fecha.getDayOfMonth() >= 23){
					signo = SignosZodiaco.LIBRA;
				}
				break;
			case 10:
				if(fecha.getDayOfMonth() <= 22) {
					signo = SignosZodiaco.LIBRA;
				}else if(fecha.getDayOfMonth() >= 23){
					signo = SignosZodiaco.ESCORPIO;
				}
				break;
			case 11:
				if(fecha.getDayOfMonth() <= 22) {
					signo = SignosZodiaco.ESCORPIO;
				}else if(fecha.getDayOfMonth() >= 23){
					signo = SignosZodiaco.SAGITARIO;
				}
				break;
			case 12:
				if(fecha.getDayOfMonth() <= 21) {
					signo = SignosZodiaco.SAGITARIO;
				}else if(fecha.getDayOfMonth() >= 22){
					signo = SignosZodiaco.CAPRICORNIO;
				}
				break;
		}
		
		return signo.toString();
	}
	
	public static boolean isIntervalo(LocalDateTime inicio, LocalDateTime fin, LocalDateTime fecha) {
		/*
		 * if ( (inicio.compareTo(fecha) <= 0) && (fin.compareTo(fecha) >= 0) )
			return true;
		*/
		
		if (inicio.isBefore(fecha) && fin.isAfter(fecha))
			return true;
		
		return false;
	}
	
	public static LocalDateTime fechaAzar(LocalDateTime inicio, LocalDateTime fin) {
		ZoneOffset zone = ZoneOffset.of("Z"); //UTC
		long startEpochDay = inicio.toEpochSecond(zone);
	    long endEpochDay = fin.toEpochSecond(zone);
	    long randomDay = ThreadLocalRandom
	      .current()
	      .nextLong(startEpochDay, endEpochDay);

	    return LocalDateTime.ofEpochSecond(randomDay,0,zone);
	}
	
	
	public static void main(String[] args) {
		cuentaAtras(LocalDateTime.parse("1977-10-10T10:15:30"),"Cumple");
		System.out.println(diaCumple(LocalDate.of(1977, 10, 10), 2001));
		System.out.println(numYears(LocalDate.of(1977, 10, 10)));
		System.out.println(zodiaco(LocalDate.of(1977, 10, 10)));
		System.out.println(isIntervalo(LocalDateTime.of(1977, 10, 10,10,10),LocalDateTime.now(), LocalDateTime.of(1999, 10, 10,10,10)));
		System.out.println(fechaAzar(LocalDateTime.of(2015, 10, 10,10,10),LocalDateTime.now()));
	}

}
