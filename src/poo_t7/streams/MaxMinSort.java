package poo_t7.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxMinSort {

	public MaxMinSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
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
			
			//Contar elementos en un stream
			System.out.println(ibm.stream().count());
			
			//Cuanto es el salario máximo de los empleados
			System.out.println("El salario máximo es: " +
					ibm.stream()
						.max( (e1,e2) -> (int) (e1.getSalario() - e2.getSalario()) )
						.orElse(new Empleado("No hay",0,Empleado.Departamento.RRHH))
			);
			
			//Cuanto es el salario mínimo de los empleados
			System.out.println("El salario mínimo es: " +
					ibm.stream()
						.map(e -> e.getSalario())
						.min(Comparator.naturalOrder()) //Comparator ya trae comoaradores
						.orElse(Double.valueOf(0))
			);
			
			//Empleados ordenados por nombre
			ibm.stream()
				//Si la clase del stream implementa comparable no hay que pasarle nada, ordena
			    //por ese compareTo. Sino, le pasamos aquí el compareTo
				.sorted( (e1,e2) -> e2.getNombre().compareTo(e1.getNombre()) )
				.forEach(System.out::println);

	}

}
