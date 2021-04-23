package poo_t7.streams;

import java.util.ArrayList;
import java.util.List;

public class Map {

	public Map() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/////// EMPLEADOS
		List<Empleado> ibm = new ArrayList<>();
		for (int i=0; i<10000; i++) {
			ibm.add(new Empleado("Empleado"+i, 20000+i, Empleado.Departamento.COMERCIAL));
		}
		
		ibm.stream()  //Aquí tengo un Stream<Empleado>
			.map(e -> e.getNombre()) //A partir de aquí tengo un Stream<String>
			.map(e -> e.toLowerCase()) //Seguiría igual pero con nombres en minúscula
			.forEach(System.out::println);
			
		//Sacar la longitud de los nombres
		Integer total = ibm.stream()  //Aquí tengo un Stream<Empleado>
		.map(e -> e.getNombre()) //A partir de aquí tengo un Stream<String>
		.map(e -> e.toLowerCase()) //Seguiría igual pero con nombres en minúscula
		.map(e -> e.length()) //Stream<Integer>
		.reduce(0, (x,y) -> x + y);
		System.out.println(total);

	}

}
