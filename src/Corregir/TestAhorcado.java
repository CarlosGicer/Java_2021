package Corregir;

import java.util.Scanner;

public class TestAhorcado {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Ahorcado ahorcado1 = new Ahorcado( );
		Scanner tcl = new Scanner(System.in);
		int opcion;
		char caracter;
		
		ahorcado1.getPalabraAdivinar( );
		ahorcado1.getNumLetrasPalabra( );
		
		do {
		
			System.out.println("\t\t-- JUEGO DEL AHORCADO ---");
			System.out.println("\t\t ------ ");
			System.out.println("\t\t |     | ");
			System.out.println("\t\t |     O ");
			System.out.println("\t\t |    -|- ");
			System.out.println("\t\t |  _ / |_  ");
			System.out.println("\t\t |        ");
			System.out.println("\t 1) INTENTAR  ");
			System.out.println("\t 2) RESOLVER ");
			System.out.println("\t 3) SALIR");
			
			do {
				opcion = tcl.nextInt();
				
				switch (opcion) {
					case 1:
							System.out.println("Introduce una letra: ");
							caracter = tcl.next().charAt(0);
							
							if(ahorcado1.intentar(caracter)) {
								System.out.println(ahorcado1);
						}else {
					
							System.out.println("\n");
							System.out.println("\t\t ------ ");
							System.out.println("\t\t |     | ");
							System.out.println("\t\t |     O ");
							System.out.println("\t\t |    -|- ");
							System.out.println("\t\t |  _ / |_  ");
							System.out.println("\t\t |        ");
							System.out.println("\t\tGAME OVER!!");
							System.out.println("\t\tESTAS AHORCADO!!");
							System.out.println("\n");
						}
						break;
						
					case 2:
						
						Scanner sc = new Scanner(System.in);
						System.out.println("Dime la palabra: ");
						String palabra = sc.nextLine();
						
						if(ahorcado1.resolver(palabra))
							System.out.println("HAS GANADO!!");
						else
							System.out.println("No has acertado");
						break;
						
					case 3:
						System.out.println("Pulsado 3");
						break;
					
					default: 
						System.out.println("Opción incorrecta. Pulsa una opción (1,2,3)");
				}
				
				
			} while (opcion < 1 || opcion > 3); //Que pida por teclado mientras no escriba 1,2 o 3
			
		} while(opcion != 3);
		
		tcl.close();
		
	}

}
