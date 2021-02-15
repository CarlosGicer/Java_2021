package Corregir;

import java.util.Scanner;

public class TestAhorcado {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int opcion = 0;
		Scanner tcl = new Scanner(System.in);
		char letra;
		int intentos = 7;
		String palabra;
		
		
		//voy a utilizar parte del codigo del master mind del examen para hacerlo jugable
		
		do {
			//Opciones del menu
					
			System.out.println("------Ahorcado------");
			System.out.println("1. Nueva partida");
			System.out.println("2. Salir");
			//Pedir por teclado un numero
					
			do {
				opcion = tcl.nextInt();
				switch (opcion) {
				
				case 1:
					boolean flag = false; //si volvemos a crear una partida, reinicia el flag
							
					Ahorcado ah = new Ahorcado();//Creamos un objeto nuevo con una palabra "aleatoria"
					System.out.println("Adivina una palabra de "+ ah.getLargoPalabra()+" letras");
					System.out.println("Tienes 7 intentos");	
					do {
						//Otro menu para resolver
							
						if (ah.getNumIntentos() == intentos) {
							System.out.println("Lamentablamente, te has quedado sin intentos");
							flag = true;
							break;
						}
						System.out.println("------Partida------");
						System.out.println("1. Pedir letra");
						System.out.println("2. Resolver palabra");
						System.out.println("3. Rendirse");
							
						opcion = tcl.nextInt();
						switch (opcion) {
						case 1:
							do {
								System.out.println("Introduce la letra a intentar");
								letra = tcl.next().charAt(0);
							}while (ah.esLetra(letra) == false);
								
							
							if (ah.intentar(letra)) {
								System.out.println("Esa letra era correcta");
								System.out.println(ah);
								//Comprobar que está resuelta
								//Si es así me salgo con un boolean o con un break;
								
							} else {
								System.out.println("Esa letra no estaba");
								System.out.println("Tienes "+(7 - ah.getNumIntentos()) +" intentos mas");
								System.out.println(ah);
							}
							break;
						case 2:
							System.out.println("Introduce la palabra a intentar");
							palabra = tcl.next();
							if (ah.resolver(palabra)) {
								System.out.println("Exacto! esa era la palabra!");
								System.out.println("Lo has conseguido en "+ah.getNumIntentos()+" intentos");
								flag = true;
							} else {
								System.out.println("Esa no era la palabra");
								System.out.println("Tienes "+(7 - ah.getNumIntentos()) +" intentos mas");
							}
							break;
						case 3:
							System.out.println("Vaya, ni siquiera lo has intentado");
							flag = true;
							
							break;
						default:
							System.out.println("Opcion incorrecta");
						}
								
					}while (flag == false);
			
					
				case 2:		
					break;	
				default:
					System.out.println("Opcion incorrecta. Pulsa una opocion (1 o 2)");		
			
				}
			}while (opcion < 1 || opcion > 2); //Que pida por teclado mientras no escriba 1 o 2.
		} while(opcion != 2); //si introduces el 2, salimos.
		tcl.close();
	}			
		
}


