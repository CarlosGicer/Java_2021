package ejemplos;

import java.util.Scanner;

public class RendimientoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Hola, bienvenido al IES Jaroso");
		sb.append(" el ciclo de DAW es la leche.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un nombre: ");
		sb.insert(5, sc.next());
			
		sb.replace(sb.indexOf("Jaroso"),sb.indexOf("Jaroso")+6,"JAROSO");
		System.out.println(sb);
		
		int numero=0;
		for(int i=0; i<sb.length(); i++) {
			//Usamos equals por que no se pueden comparar String con ==
			if (sb.substring(i,i+1).equals("O"))
				numero++;
			//Se podría hacer con sb.charAt(i) == 'o'
		}
		
		System.out.println("El número de oes es: " + numero);
		
		sb.delete(sb.indexOf("Hola,"),"Hola,".length());
		System.out.println(sb);
		
		System.out.println("El tamaño del stringbuffer es: "+sb.length());
		System.out.println("La cadena al revés es: "+sb.reverse());
		
		
		//Buscar una subcadena en un texto y contar las veces que aparece
		StringBuffer texto = new StringBuffer("de En un lugar de la Mancha"
				+ "de cuyo nombre no quiero acordarme, vivía"
				+ "un hidalgo de nombre Don Quijote ...");
		
		int indice=0;
		int contador=0;		
		while (indice != -1) {
			indice = texto.indexOf("de",indice+1);	
			if (indice > 0)
				contador++;
			else
				break;
		}
		
		System.out.println(contador);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
