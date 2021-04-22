package poo_t7.streams;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public ForEach() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/////// EMPLEADOS
		List<Empleado> ibm = new ArrayList<>();
		for (int i=0; i<10000; i++) {
			ibm.add(new Empleado("Empleado"+i, 20000+i, Empleado.Departamento.COMERCIAL));
		}
		
		ibm.stream()
			.forEach(System.out::println); //Pinta el objeto entero
		
		ibm.stream()
			.forEach(e -> {
				System.out.println("Nombre: " + e.getNombre()); //Pinto lo que me interese
			});

	}

}
