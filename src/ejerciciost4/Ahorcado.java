package ejerciciost4;

public class Ahorcado {
	
	private static String[] palabras = {"cascanueces", "navegante"};
	private String palabraAdivinar; //palabraAdivinar.length
	private String palabraIntentada; //la palabra a adivinar con las letras acertadas  a__a__
	private int numIntentos; //El número de intentos
	
	/**
	 * Devuelve el número de letras de la palabra a adivinar
	 * @return tamaño de palabraAdivinar
	 */
	public int getNumLetrasPalabra() {
		return palabraAdivinar.length();
	}

	public boolean intentar(char letra) {
		
		//Sustituir la letra correspondiente en palabraIntentada en las posiciones que esté en palabraAdivinar
		//Si no se encuentra se incrementa el número de intentos (fallos)
		
		return true;
	}
	
	public boolean resolver(String palabra) {
		//Si palabra y palabraAdivinar son iguales return true, sino false
		
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		//Palabra intentada y el número de intentos
		
		return builder.toString();
	}
	
	public static int getNumPalabrasDiccionario() {
		return Ahorcado.palabras.length;
	}
	
	
}



