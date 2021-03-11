package ejerciciost6.practica1;

public class UltimaCifra {
	
	/**
	 * @param numero
	 * @return
	 */
	public static int ultimaCifraNumero(int numero) {
		String numeroString = Integer.toString(numero);
		return Integer.parseInt(Integer.toString(numero).substring(numeroString.length()-1));
	}



	public static void main(String[] args) {
		System.out.println(ultimaCifraNumero(229));
	}

}
