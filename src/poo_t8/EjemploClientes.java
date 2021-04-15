package poo_t8;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Scanner;

/**
 * @author Openwebinars
 *
 */
public class EjemploClientes {

	static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			sc = new Scanner(System.in);
			int opcion;
			DAOClientes dao = DAOClientes.getInstance();

			do {
				menu();
				opcion = Integer.parseInt(sc.nextLine());

				switch (opcion) {
				case 1:
					listarTodosClientes(dao);
					break;
				case 2:
					listarUnCliente(dao);
					break;
				case 3:
					nuevoCliente(dao);
					break;
				case 4:
					actualizarUnCliente(dao);
					break;
				case 5:
					eliminarUnCliente(dao);
					break;

				}

			} while (opcion != 0);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	
	public static void menu() {

		System.out.println("SISTEMA DE GESTIÓN DE CLIENTES");
		System.out.println("===============================");
		System.out.println("0. Salir");
		System.out.println("1. Listar todos los clientes");
		System.out.println("2. Listar un cliente por su ID");
		System.out.println("3. Insertar un nuevo cliente");
		System.out.println("4. Actualizar un cliente");
		System.out.println("5. Eliminar un cliente");

	}
	
	private static void listarTodosClientes(DAOClientes dao) {
		
		List<Cliente> lista = null;
		try {
			lista = dao.findAll();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		if (lista != null)
			lista.forEach((e) -> {
				System.out.printf("%d %s %s %s %s %s %n", e.getId(), e.getNombre(), e.getDireccion(), e.getLocalidad(), e.getMovil(), e.getDni());
			});
		else
			System.out.println("No hay clientes registrados en la base de datos");
		
		System.out.println("");
		
	}
	
	private static void listarUnCliente(DAOClientes dao) {
		System.out.println("Búsqueda de un empleado");
		System.out.print("Introduzca el ID del empleado: ");
		int id = Integer.parseInt(sc.nextLine());
		
		Cliente e = null;
		try {
			e = dao.findByPk(id);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		if (e != null) {
			System.out.printf("%d %s %s %s %s %s %n", e.getId(), e.getNombre(), e.getDireccion(), e.getLocalidad(), e.getMovil(), e.getDni());
		} else {
			System.out.println("No existe ningún registro con ese ID");
		}
		
		System.out.println("");
		
	}

	private static void nuevoCliente(DAOClientes dao) {
		System.out.println("Inserción de un nuevo cliente");
		System.out.print("Introduzca el nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Introduzca la direccion: ");
		String direccion = sc.nextLine();
		System.out.print("Introduzca la localidad: ");
		String localidad = sc.nextLine();
		System.out.print("Introduzca el movil: ");
		String movil = sc.nextLine();
		System.out.print("Introduzca el dni: ");
		String dni = sc.nextLine();

		try {
			dao.insert(new Cliente(nombre, direccion, localidad, movil, dni));
			System.out.println("Nuevo registro insertado");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("");

	}
	
	
	private static void actualizarUnCliente(DAOClientes dao) {
		System.out.println("Actualización de un cliente");
		System.out.print("Introduzca el ID del cliente: ");
		int id = Integer.parseInt(sc.nextLine());
		
		Cliente e = null;
		try {
			e = dao.findByPk(id);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		if (e == null) {
			System.out.println("El cliente a modificar no está registrado en la base de datos");			
		} else {
			System.out.print("Introduzca el nombre: ");
			String nombre = sc.nextLine();
			System.out.print("Introduzca la direccion: ");
			String direccion = sc.nextLine();
			System.out.print("Introduzca la localidad: ");
			String localidad = sc.nextLine();
			System.out.print("Introduzca el movil: ");
			String movil = sc.nextLine();
			System.out.print("Introduzca el dni: ");
			String dni = sc.nextLine();
			e.setNombre(nombre);
			e.setDireccion(direccion);
			e.setLocalidad(localidad);
			e.setMovil(movil);
			e.setDni(dni);
						
			try {
				dao.update(e);
				System.out.println("Registro actualizado");
			} catch (SQLException ex) {				
				ex.printStackTrace();
			}
			
		}
		
		System.out.println("");
		
	}

	private static void eliminarUnCliente(DAOClientes dao) {
		System.out.println("Borrado de un cliente");
		System.out.print("Introduzca el ID del cliente: ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("¿Está usted seguro de eliminar dicho registro? (S/N)");
		String opcion = sc.nextLine();
		
		if (opcion.equalsIgnoreCase("S")) {
			try {
				dao.delete(id);
				System.out.println("Registro eliminado");
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
		
		System.out.println("");
		
	}



	
}