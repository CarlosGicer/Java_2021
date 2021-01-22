package poo_t6;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	
	
	public static void main(String[] args) {
		String nombre = " Pepe ;  Franco ; García  ";        
		StringTokenizer tokens;        
		tokens = new StringTokenizer(nombre, ";");        
		while (tokens.hasMoreTokens()) {               
		     System.out.println(tokens.nextToken().trim());        
		}

		
	}

}

