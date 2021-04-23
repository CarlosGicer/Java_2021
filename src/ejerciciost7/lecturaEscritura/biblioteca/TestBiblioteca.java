/**
 * 
 */
package ejerciciost7.lecturaEscritura.biblioteca;

import java.util.Scanner;

/**
 * @author alumno
 *
 */
public class TestBiblioteca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Biblioteca biblio = new Biblioteca("Calle de la lectura, 3");
		for(int i=0; i<10; i++) {
			Libro l = new Libro("L000"+i, "La sombra del viento"+i, 2015, 750, false);
			l.addAutor("Patrick","Rothfuss");
			l.addAutor("Javier","Guillén");
			biblio.adquirirMaterial(l);
		}
		for(int i=0; i<10; i++) {
			Revista r = new Revista("R000"+i, "Desperta Ferro"+i, 2020, 75, i,false);
			r.addAutor("Pepito","Pérez");
			r.addAutor("Javier","Guillén");
			biblio.adquirirMaterial(r);
		}
		
		//System.out.println(biblio);
		int opcion;
		String titulo,nombreAutor,apellidoAutor;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Prestar");
			System.out.println("2. Devolver");
			System.out.println("3. Buscar");
			System.out.println("4. Listar");
			System.out.println("5. Buscar autor");
			System.out.println("6. Salir");
			opcion = Integer.parseInt(sc.nextLine()); //Si no escribes un número salta error
			
			switch (opcion) {
			case 1: {
				System.out.println("Escribe título de la publicación a prestar:");
				titulo = sc.nextLine();
				
				Publicacion p = biblio.buscar(titulo);
				if (p != null) {
					if ( p instanceof Libro)
						((Libro) p).presta();
					else
						System.out.println("Eso es una revista y éstas no se puede prestar");
					
				} else {
					System.out.println("Libro no encontrado");
				}
				
				break;
			}
			case 2: {
				System.out.println("Escribe título de la publicación a devolver:");
				titulo = sc.nextLine();
				
				Publicacion p = biblio.buscar(titulo);
				if (p != null) {
					if ( p instanceof Libro) {
						if (((Libro) p).estaPrestado()) {
							((Libro) p).devuelve();
							System.out.println("Libro devuelto");
						} else {
							System.out.println("Ese libro no está prestado");
						}
					} else {
						System.out.println("Eso es una revista y éstas no se puede prestar/devolver");
					}
					
				} else {
					System.out.println("Libro no encontrado");
				}
				break;
			}
			case 3: {
				System.out.println("Escribe título de la publicación a buscar:");
				titulo = sc.nextLine();
				
				Publicacion p = biblio.buscar(titulo);
				if (p != null) {
					System.out.println(p);
					
				} else {
					System.out.println("Publicacion no encontrada");
				}
				break;
			}
			case 4: {
				System.out.println(biblio);
				break;
			}
			
			case 5: {
				System.out.println("Escribe nombre autor:");
				nombreAutor = sc.nextLine();
				System.out.println("Escribe apellidos autor:");
				apellidoAutor = sc.nextLine();
				System.out.println(biblio.buscar(new Autor(nombreAutor,apellidoAutor)));
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
