package AgendaVitaminada;

import java.util.ArrayList;
import java.util.Scanner;

public class TestAgenda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int opcion,op;
		String nombre, telefono, dni, email, cif, codigoCliente;
		
		Scanner opciones = new Scanner(System.in);
		
		Agenda agenda = new Agenda();
		
		do {
			System.out.println("AGENDA TELEF�NICA\n"
					+ "-----------------\n"
					+ "1. A�adir nuevo contacto\n"
					+ "2. Listar contactos\n"
					+ "3. Buscar contacto\n"
					+ "4. Eliminar contacto\n"
					+ "5. Estado de la agenda\n"
					+ "6. Salir\n"
					+ "Elige una opci�n:");
			opcion = Integer.parseInt(opciones.nextLine());
			
			switch(opcion) {
				case 1:
					System.out.println("Añadir Cliente(1), Contacto(2) o Proveedor(3): ");
					op = Integer.parseInt(opciones.nextLine());
					switch(op) {
					case 1:
						System.out.println("Introduce un nombre: ");
						nombre = opciones.nextLine();
						System.out.println("Introduce un numero de telefono: ");
						telefono = opciones.nextLine();
						System.out.println("Introduce un Dni: ");
						dni = opciones.nextLine();
						System.out.println("Introduce un email: ");
						email = opciones.nextLine();
					
						if(agenda.addContacto(new Cliente(nombre, telefono, dni, email))) {
							System.out.println("El contacto se a�adio con exito");
						}else {
							System.out.println("El contacto no se pudo añadir, agenda llena o ya existe");
						}	
						break;
					case 2:
						System.out.println("Introduce un nombre: ");
						nombre = opciones.nextLine();
						System.out.println("Introduce un numero de telefono: ");
						telefono = opciones.nextLine();
					
						if(agenda.addContacto(new Contacto(nombre, telefono))) {
							System.out.println("El contacto se a�adio con exito");
						}else {
							System.out.println("El contacto no se pudo añadir, agenda llena o ya existe");
						}			
						break;
					case 3:
						System.out.println("Introduce un nombre: ");
						nombre = opciones.nextLine();
						System.out.println("Introduce un numero de telefono: ");
						telefono = opciones.nextLine();
						System.out.println("Introduce un CIF: ");
						cif = opciones.nextLine();
						System.out.println("Introduce un codigoCliente: ");
						codigoCliente = opciones.nextLine();
					
						if(agenda.addContacto(new Proveedor(nombre, telefono, cif, codigoCliente))) {
							System.out.println("El contacto se a�adio con exito");
						}else {
							System.out.println("El contacto no se pudo añadir, agenda llena o ya existe");
						}	
						break;						
					}
					
	
					break;
				case 2:
					System.out.println("Lista de Contactos: ");
					System.out.println(agenda.listarContactos());
					break;
				case 3:
					System.out.println("Introduce un nombre: ");
					nombre = opciones.nextLine();
				
					Agenda cs = agenda.buscarContacto(nombre);
					if (! cs.estaVacia() ) {
						System.out.println(cs.listarContactos());
					} else {
						System.out.println("Ese contacto no existe");
					}
					
					break;
				case 4:
					System.out.println("Introduce un nombre: ");
					nombre = opciones.nextLine();				
				
					if (agenda.eliminarContacto(new Contacto(nombre,""))) {
						System.out.println("Contacto eliminado");
					} else {
						System.out.println("No he encontrado ese teléfono para eliminar");
					}
					break;
				case 5:
					if(agenda.agendaLlena()) {
						System.out.println("La agenda esta llena.");
					}else {
						System.out.println("La agenda esta vacia.");
					}
					break;
				case 6:
					System.out.println("Usted acaba de salir del programa.");
					break;
			}
		}while(!(opcion == 6));
	}

}
