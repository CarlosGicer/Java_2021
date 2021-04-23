package poo_t7.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Filter {

	public Filter() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	/////// EMPLEADOS
	List<Empleado> ibm = new ArrayList<>();
	for (int i=0; i<10000; i++) {
		ibm.add(new Empleado("Empleado"+i, 20000+i, Empleado.Departamento.COMERCIAL));
	}
			
	Optional<Empleado> emp = ibm.stream()
		.filter(e -> e.getDepartamento()== Empleado.Departamento.COMERCIAL &&
					 e.getSalario() >= 29000 )
		.findFirst();
	System.out.println(emp.orElse(new Empleado("",0,Empleado.Departamento.RRHH)));
	
	Optional<Empleado> emp2 = ibm.parallelStream()
			.filter(e -> e.getDepartamento()== Empleado.Departamento.COMERCIAL &&
						 e.getSalario() >= 29000 )
			.findAny();
	System.out.println(emp2.orElse(new Empleado("",0,Empleado.Departamento.RRHH)));

	ibm.stream()
			.filter(e -> e.getNombre().length() > 11 )
			.forEach((Empleado p) -> {
				System.out.println(p.getNombre() );
			});
	
	}

}
