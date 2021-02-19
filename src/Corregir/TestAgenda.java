package Corregir;

import java.util.Scanner;

public class TestAgenda {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda();
		Contacto contacto = new Contacto();
		String nombre;
		int telf;
		
		int opc;
		
		do {
			System.out.println("\t\tAGENDA TELEFONICA");
			System.out.println("\t\t-----------------");
			System.out.println("\t\t1. Añadir nuevo contacto");
			System.out.println("\t\t2. Listar contactos");
			System.out.println("\t\t3. Buscar contactos");
			System.out.println("\t\t4. Eliminar contactos");
			System.out.println("\t\t5. Esgtado de la agenda");
			System.out.println("\t\t6. Salir");
			System.out.println("\n");
			System.out.println("\t\tElige una opcion: ");
			
			opc = Integer.parseInt(sc.nextLine());
				
			switch (opc) {
				
			case 1: 
					
					System.out.println("Dime tu nombre: ");
					nombre = sc.nextLine();
					System.out.println("Dime tu telefono: ");
					telf = (Integer.parseInt(sc.nextLine()));
					
					if(agenda.addContacto(nombre,telf))
						System.out.println("Se ha añadido el contacto");
					else
					    System.out.println("El contacto existe");
						
					break;
			
			case 2: 
					
					System.out.println(agenda);
						
					break;
				   
			case 3: 
					
					break;
					
					
			case 4: 
					System.out.println("Dime el contacto a eliminar: ");
					contacto.setNombre(sc.nextLine());
					
					if(agenda.eliminarContacto(contacto)) {
						System.out.println("El contacto ha sido eliminado de la agenda");
					}else
						System.out.println("El contacto no existe");
				
					break;
			
			case 5:
				
					break;
						
			case 6:
					System.out.println("Has salido del porgrama!!");
					break;
			
			default: 
					
				System.out.println("Opción incorrecta. Pulsa una opción (1....6)");		
					
				}
		}while(opc!=6);
	}

	
}
