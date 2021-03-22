package ejerciciost6.blackjack;

import java.util.Scanner;

public class Partida {

	private Crupier crupier;
	private JugadorBlack jugador;
	private BarajaInglesa baraja;
	
	
	public Partida() {
		crupier = new Crupier();
		jugador = new JugadorBlack("Jugador");
		baraja = new BarajaInglesa();
	}
	
	public boolean hayGanador() {
		//TO-DO
		
		//Te pasas tú gana el crupier
		//Se pasa el crupier ganas tú
		//Tienes blackjack ganas tú
		//Tiene el crupier blackjack gana él
		
		//Si estoy plantado	comprobar quien tiene valor más próximo a 21
		//Si tenemos el mismo comprobar quien tiene menos cartas
		
		return false;
	}
	
	public void jugar() {
		boolean ganador = false;
		boolean plantado = false;
		do {			
			//Qué hacer
			Scanner sc = new Scanner(System.in);
			int opcion=0;
			do {
				System.out.println("1. Pedir carta");
				System.out.println("2. Plantarse");
				opcion = Integer.parseInt(sc.nextLine());
				switch(opcion) {
					case 1:
						//Repartir cartas
						jugador.nuevaCarta(baraja.azar());
						if (crupier.valorMano() < 17)
							crupier.nuevaCarta(baraja.azar());
						
						System.out.println(jugador);
						System.out.println(crupier.mostrarCrupier());
						
						//Comprueba si hay un ganador
						ganador = hayGanador();	
						
						break;
					case 2:
						plantado=true;
						//El crupier pedirá automáticamente cartas hasta valor > 17
						break;
				}
			} while(opcion != 2 && ganador==false);
			
			//Comprueba si hay un ganador
			ganador = hayGanador();			
		} while(!ganador && !plantado);
	}
	
	public static void main(String[] args) {
		Partida p = new Partida();
		p.jugar();
	}
	
	
}
