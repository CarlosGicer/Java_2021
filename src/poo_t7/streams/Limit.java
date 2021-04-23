package poo_t7.streams;

import java.util.ArrayList;
import java.util.List;

public class Limit {

	public Limit() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/////// EMPLEADOS
		List<Empleado> ibm = new ArrayList<>();
		for (int i=0; i<10000; i++) {
			ibm.add(new Empleado("Empleado"+i, 20000+i, Empleado.Departamento.COMERCIAL));
		}
		
		ibm.stream()
			.skip(1000) //Salto 1000 empleados
			.limit(10)  //Obtengo los siguientes 10 empleados
			.forEach(System.out::println);

	}

}
