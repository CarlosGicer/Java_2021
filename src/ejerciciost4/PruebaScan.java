package ejerciciost4;

import java.util.Scanner;

public class PruebaScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce tu edad");
		int edad = Integer.parseInt(sc.nextLine());
		
		//sc.nextLine(); //Esto se come el enter del sc.nextInt
		
		System.out.println("Introduce tu nombre");
		nombre = sc.nextLine();
		System.out.println("Introduce tu edad");
		edad = sc.nextInt();
		
		System.out.println("Nombre: "+nombre+" edad: "+edad);
		
	}

}
