package ejerciciost7.lecturaEscritura.agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class TestAgenda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int opcion;
		String nombre, telefono;
		
		Scanner opciones = new Scanner(System.in);
		
		Agenda agenda = new Agenda();
		
		do {
			System.out.println("AGENDA TELEFONICA\n"
					+ "-----------------\n"
					+ "1. Añadir nuevo contacto\n"
					+ "2. Listar contactos\n"
					+ "3. Buscar contacto\n"
					+ "4. Eliminar contacto\n"
					+ "5. Salir\n"
					+ "Elige una opción:");
			opcion = Integer.parseInt(opciones.nextLine());
			
			switch(opcion) {
				case 1:
					System.out.println("Introduce un nombre: ");
					nombre = opciones.nextLine();
					System.out.println("Introduce un numero de telefono: ");
					telefono = opciones.nextLine();
				
					if(agenda.addContacto(nombre,telefono)) {
						System.out.println("El contacto se a�adio con exito");
					}else {
						System.out.println("El contacto no se pudo añadir, agenda llena o ya existe");
					}
	
					break;
				case 2:
					System.out.println("Lista de Contactos: ");
					System.out.println(agenda.listarContactos());
					break;
				case 3:
					System.out.println("Introduce un nombre: ");
					nombre = opciones.nextLine();
				
					String cs = agenda.buscarContacto(nombre);
					if (cs.equals("No encontrado") ) {
						System.out.println("Ese contacto no existe");
					} else {
						System.out.println(cs);
					}
					
					break;
				case 4:
					System.out.println("Introduce un nombre: ");
					nombre = opciones.nextLine();				
				
					if (agenda.eliminarContacto(nombre)) {
						System.out.println("Contacto eliminado");
					} else {
						System.out.println("No he encontrado ese teléfono para eliminar");
					}
					break;
				
				case 5:
					System.out.println("Usted acaba de salir del programa.");
					break;
			}
		}while(!(opcion == 5));
	}

}
