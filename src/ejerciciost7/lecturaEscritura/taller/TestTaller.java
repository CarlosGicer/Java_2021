package ejerciciost7.lecturaEscritura.taller;

import java.util.Scanner;

import ejerciciost7.biblioteca.Autor;
import ejerciciost7.biblioteca.Biblioteca;
import ejerciciost7.biblioteca.Libro;
import ejerciciost7.biblioteca.Publicacion;
import ejerciciost7.biblioteca.Revista;

public class TestTaller {

public static void main(String[] args) {
		
		Taller taller = new Taller();
		
		//System.out.println(biblio);
		int opcion;
		String titulo;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Ingresar vehículo");
			System.out.println("2. Vehículo reparado");
			System.out.println("3. Eliminar vehículo");
			System.out.println("4. Buscar vehículo");
			System.out.println("5. Listar vehículos taller");
			System.out.println("6. Salir");
			opcion = Integer.parseInt(sc.nextLine()); //Si no escribes un número salta error
			
			switch (opcion) {
			case 1: {
				int tipo;
				do {
					System.out.println("Escribe tipo vehículo:");
					System.out.println("1. Eléctrico. 2. Híbrido. 3. Gasolina. 4. Diésel");
					tipo = Integer.parseInt(sc.nextLine());
				} while (tipo > 4);
				
				System.out.println("Dime matrícula");
				String matricula = sc.nextLine();
				System.out.println("Dime marca");
				String marca = sc.nextLine();
				System.out.println("Dime modelo");
				String modelo = sc.nextLine();
				System.out.println("Dime color");
				String color = sc.nextLine();
				System.out.println("Dime precio");
				double precio = Double.parseDouble(sc.nextLine());
				System.out.println("Dime caballos");
				int cv = Integer.parseInt(sc.nextLine());
				int kw;
				int capacidad;
				String tipoFosil;
				
				switch (tipo) {
				case 1:
					System.out.println("Dime kw");
					kw = Integer.parseInt(sc.nextLine());
					VehiculoElectrico ve = new VehiculoElectrico(matricula, marca, modelo, color, precio, cv, kw);
					taller.ingresarVehiculo(ve);
					break;
				case 2:
					System.out.println("Dime kw");
					kw = Integer.parseInt(sc.nextLine());
					System.out.println("Dime capacidad depósito");
					capacidad = Integer.parseInt(sc.nextLine());
					System.out.println("Dime tipo (gasolina, diésel)");
					tipoFosil = sc.nextLine();
					VehiculoHibrido vh = new VehiculoHibrido(matricula, marca, modelo, color, precio, cv, kw, capacidad,tipoFosil);
					taller.ingresarVehiculo(vh);
					break;
				case 3:
					System.out.println("Dime capacidad depósito");
					capacidad = Integer.parseInt(sc.nextLine());
					VehiculoFosil vf1 = new VehiculoFosil(matricula, marca, modelo, color, precio, cv, capacidad, "Gasolina");
					taller.ingresarVehiculo(vf1);
					break;
				case 4:
					System.out.println("Dime capacidad depósito");
					capacidad = Integer.parseInt(sc.nextLine());
					VehiculoFosil vf2 = new VehiculoFosil(matricula, marca, modelo, color, precio, cv, capacidad, "Diésel");
					taller.ingresarVehiculo(vf2);
					break;
				}
				
				break;
			}
			case 2: {
				System.out.println("Introduce matrícula");
				String matricula = sc.nextLine();
				Vehiculo v = new Vehiculo(matricula);
				taller.vehiculoReparado(v);
				break;
			}
			case 3: {
				System.out.println("Introduce matrícula");
				String matricula = sc.nextLine();
				Vehiculo v = new Vehiculo(matricula);
				taller.eliminarVehiculo(v);
				break;
			}
			case 4: {
				System.out.println("Introduce matrícula");
				String matricula = sc.nextLine();
				Vehiculo v = new Vehiculo(matricula);
				System.out.println(taller.eliminarVehiculo(v));
				break;
			}
			case 5: {
				System.out.println(taller);
				break;
			}
			case 6: {
				System.out.println("Hasta pronto");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
			
		} while (opcion != 6);
		
		

	}
}
