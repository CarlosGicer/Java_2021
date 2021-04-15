/**
 * 
 */
package ejerciciost7.biblioteca;

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
			l.addAutor("Arturo", "Pérez Reverte"+i);
			biblio.adquirirMaterial(l);
		}
		for(int i=0; i<10; i++) {
			Revista r = new Revista("R000"+i, "Desperta Ferro"+i, 2020, 75, false, i);
			r.addAutor("Luis", "Fernández"+i);
			biblio.adquirirMaterial(r);
		}
		
		//System.out.println(biblio);
		int opcion;
		String titulo;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Prestar");
			System.out.println("2. Devolver");
			System.out.println("3. Buscar");
			System.out.println("4. Salir");
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
				System.out.println("Hasta pronto");
				System.out.println(biblio.buscar(new Autor("Arturo", "Pérez Reverte1")));
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
			
		} while (opcion != 4);
		
		

	}

}
