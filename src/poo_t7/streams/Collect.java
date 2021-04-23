package poo_t7.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import poo_t7.streams.Empleado.Departamento;

public class Collect {

	public Collect() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/////// EMPLEADOS
		List<Empleado> ibm = new ArrayList<>();
		for (int i=0; i<10000; i++) {
			ibm.add(new Empleado("Empleado"+i, 20000+i, Empleado.Departamento.COMERCIAL));
		}
		
		List<Empleado> salarios = ibm.stream()
								.filter(e -> e.getSalario() >= 25000 )
								.collect(Collectors.toList()); //List<Empleado>
		//Para pintar el List.
		for(Empleado e: salarios) {
			System.out.println(e);
		}
		
		List<Double> salarios2 = ibm.stream()
								.filter(e -> e.getSalario() >= 25000 )
								.map(e -> e.getSalario())      //Empleado -> Double
								.collect(Collectors.toList()); //List<Double>
		
		//Para pintar el List.
		for(Double e: salarios2) {
			System.out.println(e);
		}
					
		
		//Grouping by
		/////// EMPLEADOS
		List<Empleado> ibm2 = new ArrayList<>();
		for (int i=0; i<1000; i=i+3) {
			ibm2.add(new Empleado("Empleado"+i, 20000+i, Empleado.Departamento.COMERCIAL));
			ibm2.add(new Empleado("Empleado"+(i+1), 20000+i, Empleado.Departamento.RRHH));
			ibm2.add(new Empleado("Empleado"+(i+2), 20000+i, Empleado.Departamento.DESARROLLO));
		}
		
		ibm2.stream().forEach(System.out::println); //Pintar el List
		
		//Vamos a crear un map agrupando los empleados por Departamento
		HashMap<Empleado.Departamento, List<Empleado>> empleadoGroup = 
				(HashMap<Departamento, List<Empleado>>) ibm2.stream()
					.collect(Collectors.groupingBy(Empleado::getDepartamento)); //* Collectors
		
		//Lo pintamos
		empleadoGroup.get(Empleado.Departamento.COMERCIAL).stream().forEach(System.out::println);
		empleadoGroup.get(Empleado.Departamento.DESARROLLO).stream().forEach(System.out::println);
		empleadoGroup.get(Empleado.Departamento.RRHH).stream().forEach(System.out::println);
		
		//Vamos a crear un map agrupando los empleados por Departamento, y diciendo 
		//cuántos hay de cada departamento
		HashMap<Empleado.Departamento, Long> cuantos = 
				(HashMap<Departamento, Long>) ibm2.stream()
				.collect(Collectors.groupingBy(Empleado::getDepartamento, Collectors.counting()));
		System.out.println(cuantos.get(Empleado.Departamento.COMERCIAL));
		System.out.println(cuantos.get(Empleado.Departamento.DESARROLLO));
		System.out.println(cuantos.get(Empleado.Departamento.RRHH));
		
		//Cuantos empleados hay en total
		System.out.println(ibm2.stream().collect(Collectors.counting()));
		
		//El nombre de todos los empleados separados por comas
		String nombres = ibm2.stream()
								.map(e -> e.getNombre())
								.sorted(Comparator.naturalOrder())
								.collect(Collectors.joining(", ")); //se puede hacer con reduce
		System.out.println(nombres);
	}

}
