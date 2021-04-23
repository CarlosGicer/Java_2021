package poo_t7.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Reduccion {

	public Reduccion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/////// EMPLEADOS
		List<Empleado> ibm = new ArrayList<>();
		for (int i=0; i<10000; i++) {
			ibm.add(new Empleado("Empleado"+i, 20000+i, Empleado.Departamento.COMERCIAL));
		}

		//El máximo salario
		Optional<Double> salariomin = ibm.stream()
			.map(e -> e.getSalario())
			.reduce(Double::max); //Vamos aplicando  max(s1,s2)
		
		if (salariomin.isPresent())
			System.out.println(salariomin);
		
		//Concatena el nombre de los 10 primeros empleados
		String nombre = ibm.stream()
			.map( e -> e.getNombre()) //A partir de aquí el stream es solo de nombres String
			.limit(10)
			.reduce( "" , (x,y) -> x.concat(y+" ")); //"" primer elemento. Se puede usar +
		    //Luego va concatenando cada elemento del stream
			//Se va operando el resultado de la operación con el siguiente elemento
		
		System.out.println(nombre);
		
		Optional<Double> total1 = ibm.stream()
			.map( e -> e.getSalario())
			.reduce(Double::sum);
		System.out.println(total1.orElse((double) 0));
		
		//Si le doy el primer elemento a reduce, ya no devuelve un Optional
		Double total2 = ibm.stream()
			.map( e -> e.getSalario())
			.reduce( (double) 0, (e1,e2) -> e1 + e2);
		System.out.println(total2);

	}

}
