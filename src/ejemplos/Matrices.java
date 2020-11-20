/**
 * 
 */
package ejemplos;

import java.util.Scanner;

/**
 * @author alumno
 *
 */
public class Matrices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Materias y alumnos
		String[] asignaturas = {"Programación","Sistemas","BBDD","LMarcas"};
		String[] alumnos = {"Emilio","Juan","Fran","Ismael","Dani"};
		
		//Array donde se guardan las notas, filas número de alumnos, columnas número de materias
		double[][] notas = new double[alumnos.length][asignaturas.length];
		
		//Pedimos notas por teclado y lo vamos guardando en la matriz de notas
		Scanner sc = new Scanner(System.in);
		try {
			for(int i=0; i<notas.length; i++) {
				System.out.println("Dime las notas de "+alumnos[i]);
				for(int j=0; j<notas[i].length; j++) {
					System.out.print(asignaturas[j]+" = ");
					notas[i][j] = sc.nextDouble();
				}
			}			
		} catch (Exception ex) {
			System.out.println("Error "+ex.getMessage());
		}
		sc.close();
		
		
		//Cálculo del número de suspensos
		int suspensos=0;
		for(int i=0; i<notas.length; i++) {
			suspensos=0;
			for(int j=0; j<notas[i].length; j++) {
				if (notas[i][j] < 5)
					suspensos++;
			}
			System.out.println(alumnos[i]+" tiene "+suspensos+" suspensos");
			
		}
		
		
		//Cálculo de la nota media por materia
		double media=0;
		for(int i=0; i<asignaturas.length; i++) {
			for(int j=0; j<alumnos.length; j++) {
				media += notas[j][i];
			}
			System.out.println(asignaturas[i]+" tiene una media de "+media/alumnos.length);
			media=0;
		}
		
		//Pintamos las notas
		System.out.println(asignaturas);
		for(int i=0; i<notas.length; i++) {
			System.out.print(alumnos[i]+" - ");
			for(int j=0; j<notas[i].length; j++) {
				System.out.print(notas[i][j]+" ");
			}
			System.out.println("");
		}			
		
		
	}

}
