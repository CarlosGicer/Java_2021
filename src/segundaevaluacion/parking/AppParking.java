package segundaevaluacion.parking;

import java.util.Scanner;

import segundaevaluacion.parking.Coche.Combustible;

public class AppParking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu=0;
		
		Parking parking = new Parking();
		
		do {
			System.out.println("Elige opcion: ");
			System.out.println("0. Salir");
			System.out.println("1. Registrar entrada vehículo");
			System.out.println("2. Registrar salida vehículo");
			System.out.println("3. Número de plazas disponibles");
			System.out.println("4. Imprimir estado del parking");
			System.out.println("5. Saldo acumulado");
			menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
				case 0: {
					System.out.println("Adiós");
					break;
				}
				case 1: {
					System.out.println("Dime una matrícula");
					String matricula = sc.nextLine();
					System.out.println("Dime una marca");
					String marca = sc.nextLine();
					System.out.println(parking.registrarEntradaVehiculo(new Coche(matricula.toUpperCase(),marca,Combustible.DIESEL)));
					break;
				}
				case 2: {
					System.out.println("Dime una matrícula");
					String matricula = sc.nextLine();
					Coche c = new Coche(matricula.toUpperCase());
					System.out.println(parking.registrarSalidaVehiculo(c));
					break;
				}
				case 3: {
					System.out.println(parking.getNumeroPlazasLibres());
					break;
				}
				case 4: {
					System.out.println(parking);
					break;
				}
				case 5: {
					System.out.println(parking.getSaldoAcumulado());
					break;
				}
				default:
					System.out.println("Comando incorrecto");
			}
			
			
		} while (menu != 0);
				
		
		sc.close();
	}

}
