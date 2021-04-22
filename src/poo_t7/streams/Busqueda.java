package poo_t7.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Busqueda {

	public Busqueda() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> capitales = Arrays.asList("Jaén", "Córdoba", "Sevilla", "Huelva", "Cádiz", "Málaga", "Granada",
				"Almería");

		// Verificamos si TODOS los elementos cumplen una condición
		// En particular, que la longitud de la cadena de caracteres sea mayor o igual que 4.
		boolean longitud = capitales.stream().allMatch(s -> s.length() >= 4);
		
		String mensajeLongitud = (longitud) ? "Todas las capitales tienen 4 o más caracteres"
				: "Hay alguna capital con menos de 4 caracteres";

		System.out.println(mensajeLongitud);
		
		System.out.println("");
		
		
		// Verificamos si ALGUNO de los elementos cumple con una condición
		boolean jaen = capitales.stream().anyMatch((s) -> s.equalsIgnoreCase("jaén"));
		
		String mensajeJaen = (jaen) ? "Jaén está en la lista de capitales" : "Jaén no está en la lista de capitales";
		
		System.out.println(mensajeJaen);
		
		System.out.println("");
		
		
		// La inversa de allMatch es noneMatch
		boolean noneMatchLongitud = capitales.stream().noneMatch(s -> s.length() >= 4);

		String mensajenoneMatchLongitud = (noneMatchLongitud) ? "Todas las capitales tienen menos de 4 caracteres"
				: "Hay alguna capital con 4 caracteres o más";

		System.out.println(mensajenoneMatchLongitud);
		
		System.out.println("");
		
		
		// Localiza algún elemento (cualquiera) del Stream. Recomendado para streams paralelos
		Optional<String> unaCapital = capitales.stream()
									.filter(s -> s.contains("x"))
									.findAny();
		System.out.println(unaCapital.orElse("Ninguna capital tiene una x"));
		System.out.println("");
		
		// Localiza el primer elemento del Stream. NO RECOMENDADO para streams paralelos
		Optional<String> primeraCapital = capitales.stream()
									.filter(s -> (s.contains("a")) && (s.length()>6) )
									.findFirst();
		System.out.println(primeraCapital.orElse("No quedan capitales en el Stream"));
		System.out.println("");
		
		/////// EMPLEADOS
		List<Empleado> ibm = new ArrayList<>();
		for (int i=0; i<10000; i++) {
			ibm.add(new Empleado("Empleado"+i, 20000+i, Empleado.Departamento.COMERCIAL));
		}
		
		Optional<Empleado> empleadoMes = ibm.stream()
									.filter( e -> e.getSalario() > 35000)
									.findFirst();
		System.out.println(empleadoMes
					.orElse(new Empleado("No hay",0,Empleado.Departamento.RRHH)));
		
			

	}

}
