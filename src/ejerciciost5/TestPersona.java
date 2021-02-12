package ejerciciost5;

import java.util.Scanner;

public class TestPersona {

	public static void main(String[] args) {

		Persona p = new Persona();
		
		Scanner sc = new Scanner(System.in);
		
		//Manera 1
		System.out.println("Dime tu nombre: ");
		p.setNombre(sc.nextLine());
		System.out.println("Dime tu edad: ");
		p.setEdad(Integer.parseInt(sc.nextLine()));
		System.out.println("Dime tu sexo: ");
		p.setSexo(sc.nextLine().charAt(0)  );
		System.out.println("Dime tu peso: ");
		p.setPeso(Double.parseDouble(sc.nextLine()));
		System.out.println("Dime tu altura: ");
		p.setAltura(Double.parseDouble(sc.nextLine()));
		
		System.out.println(p);
		
		//Manera 2
		System.out.println("Dime tu nombre: ");
		p.setNombre(sc.nextLine());
		System.out.println("Dime tu edad: ");
		p.setEdad(sc.nextInt());
		
		//Si después de un nextInt o nextDouble o nextLong, ..., viene un nextLine, 
		//se pone antes otro nextLine para que tome el salto de línea
		sc.nextLine();
		
		System.out.println("Dime tu sexo: ");
		p.setSexo(sc.nextLine().charAt(0)  );
		System.out.println("Dime tu peso: ");
		p.setPeso(sc.nextDouble());
		System.out.println("Dime tu altura: ");
		p.setAltura(sc.nextDouble());
		
		System.out.println(p);

	}

}
