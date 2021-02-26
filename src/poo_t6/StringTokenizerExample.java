package poo_t6;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringTokenizerExample {
	
	public static void main(String[] args) {
		
		List<String> partes = new ArrayList<String>();
		
		String url = "triangulo -- circulo -- cuadrado -- rectangulo";        
		StringTokenizer st = new StringTokenizer(url, "--");        
		while (st.hasMoreTokens()) {     
			partes.add(st.nextToken().trim());
		    //System.out.println(st.nextToken());        
		}
		
		for(String i : partes) {
			System.out.println(i);
		}

		
	}

}

