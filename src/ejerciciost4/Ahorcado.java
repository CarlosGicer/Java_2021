package ejerciciost4;

public class Ahorcado {
	
	private static String[] palabras = {"cascanueces", "navegante","complicado","depresion","cansancio","fiesta","cerveza","lechuga","tomate","tiburon","aprobado"};
	private String palabraAdivinar; //palabraAdivinar.length
	private String palabraIntentada; //la palabra a adivinar con las letras acertadas  a__a__
	private int numIntentos; //El número de intentos
	
	
	
	/**
	 * 
	 */
	public Ahorcado() {
		super();
		this.palabraAdivinar = generarPalabra();
		this.palabraIntentada = generarPalabraGuiones();
	}
	
	private String generarPalabra() {
		int num = (int) (Math.random() * 10);
		return palabras[num];
	}
	
	private String generarPalabraGuiones() {
		StringBuilder stb = new StringBuilder(this.getNumLetrasPalabra());
		for(int i=0; i<this.getNumLetrasPalabra(); i++) {
			stb.append("-");
		}
		return stb.toString();
	}

	/**
	 * @return the palabraIntentada
	 */
	public String getPalabraIntentada() {
		return palabraIntentada;
	}

	/**
	 * @param palabraIntentada the palabraIntentada to set
	 */
	public void setPalabraIntentada(String palabraIntentada) {
		this.palabraIntentada = palabraIntentada;
	}

	/**
	 * @return the palabras
	 */
	public static String[] getPalabras() {
		return palabras;
	}

	/**
	 * @return the palabraAdivinar
	 */
	public String getPalabraAdivinar() {
		return palabraAdivinar;
	}

	/**
	 * @return the numIntentos
	 */
	public int getNumIntentos() {
		return numIntentos;
	}

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
		boolean acierto = false;
		StringBuilder resultado = new StringBuilder(this.palabraIntentada);
		
		for(int i=0; i<this.getNumLetrasPalabra(); i++) {
			if (this.palabraAdivinar.charAt(i) == letra) {
				resultado.setCharAt(i,letra);
				acierto = true;
			}
		}
		
		this.palabraIntentada = resultado.toString();
		
		return acierto;
	}
	
	public boolean resolver(String palabra) {
		//Si palabra y palabraAdivinar son iguales return true, sino false
		
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ahorcado [palabraAdivinar=");
		builder.append(palabraAdivinar);
		builder.append(", palabraIntentada=");
		builder.append(palabraIntentada);
		builder.append(", numIntentos=");
		builder.append(numIntentos);
		builder.append("]");
		return builder.toString();
	}

	public static int getNumPalabrasDiccionario() {
		return Ahorcado.palabras.length;
	}
	
	
}



