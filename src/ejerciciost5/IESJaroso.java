/**
 * 
 */
package ejerciciost5;

import java.time.LocalDate;
import java.util.Scanner;

import ejerciciost5.Expediente.Modalidad;

/**
 * @author sjgui
 *
 */
public class IESJaroso {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] materias1 = { "Sistemas", "Programación", "Bases de datos", "Entornos", "FOL" };
		Expediente ex1 = new Expediente(Modalidad.GRADOSUPERIOR, "Manuel", "Campoy", 'h', LocalDate.of(2005, 1, 26), 1, materias1);
		
		String[] materias2 = { "PWESE", "PWEC", "Diseño", "Despliegue", "Empresas" };
		Expediente ex2 = new Expediente(Modalidad.GRADOSUPERIOR, "Luis", "Pérez", 'h', LocalDate.of(1997, 10, 5), 2, materias2);
		
		ex1.updateNota(new NotasCurso("Sistemas",1,5,6,7));
		ex1.updateNota(new NotasCurso("Programación",1,5,6,7));
		ex1.updateNota(new NotasCurso("Bases de datos",1,5,6,7));
		ex1.updateNota(new NotasCurso("Entornos",1,5,6,7));
		ex1.updateNota(new NotasCurso("FOL",1,5,6,7));
		
		System.out.println(ex1);
		System.out.println(ex1.getMayorEdad());	
		if (ex1.titula()) {
			System.out.println("Enhorabuena, has aprobado, pasas de curso");
		} else {
			System.out.println("Lo siento, te toca repetir curso");
		}
		System.out.println(ex1.mediaExpediente());
		
		
		ex2.updateNota("PWESE", 2, 5, 6, 6);
		ex2.updateNota("PWEC", 2, 4, 6, 8);
		ex2.updateNota("Diseño", 2, 9, 6, 9);
		ex2.updateNota("Despliegue", 2, 7, 7, 6);
		ex2.updateNota("Empresas", 2, 9, 10, 9);
		System.out.println(ex2);
		if (ex2.titula()) {
			System.out.println("Enhorabuena, has aprobado, pasas de curso");
		} else {
			System.out.println("Lo siento, te toca repetir curso");
		}
		System.out.println(ex2.mediaExpediente());
		
		
	}

}
