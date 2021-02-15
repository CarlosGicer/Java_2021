package Corregir;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Francisco Castro Mañas
 *
 */
public class Ahorcado {
	
	private static String[] palabras = {"ahorcado","telefono","temblar","apostar","criatura","violeta","hoguera","pantalla","plancha","ballena"}; //lista de palabras
	private String adivinar; //la palabra aleatoria
	private int contador; //cuenta de intentos, a 7 pierdes.
	private boolean comprobar;
	private char[] resuelta;
	
	/**
	 * Al crear un nuevo objeto, este coge al azar una palabra del pool de palabras.
	 */
	public Ahorcado() {
		adivinar = palabras[(int)(Math.random()*10)];
		contador=0;
		resuelta = new char[adivinar.length()]; //_ _ _ _

		for (int i =0; i <= adivinar.length()-1;i++) {
			this.resuelta[i] = '_';
		}
		
	}
	
	/**
	 * @return la longitud de la palabra que se haya generado al azar.
	 */
	public int getLargoPalabra() {
		return adivinar.length();
	}
	/**
	 * @return el numero de intentos que llevamos en la partida
	 */
	public int getNumIntentos() {
		return contador;
	}
	/**
	 * @return La palabra que estamos resolviendo letra a letra
	 */
	public char[] getResuelta() {
		return resuelta;
	}
	/**
	 * si alguna letra coincide, devuelve true, si no, false y añade 1 al contador de fallos
	 * @param letra pasada durante el intento de resolver
	 * @return true si la letra existia, false si no.
	 */
	public boolean intentar(char letra) {
		
		this.comprobar = false;
		//comprobamos letra a letra
		for (int i=0; i<this.adivinar.length(); i++) {
			if (this.adivinar.charAt(i) == letra) {
				this.comprobar = true;
				this.resuelta[i] = letra; //_------------------------->
			}
		}	
		if (this.comprobar == false) {
			this.contador ++;
		}
		return comprobar;
	}


	/**
	 * si la palabra coincide, devuelve true, si no, false y añade 1 al contador de fallos
	 * @param palabra pasada durante el intento de resolver por completo
	 * @return correto si es la palabra, falso si era otra.
	 */
	public boolean resolver(String palabra) {
		this.comprobar = false;
		if (palabra.equals(adivinar)) {
			comprobar = true;
		} else {
			this.contador ++;
		}
		return comprobar;
	}
	
	/**
	 * comprobamos que cada letra pasada, en numeros ascii, corresponde con cualquier letra
	 * minuscula o mayuscula, incluso la ñ
	 */
	public boolean esLetra(char intento) {
		boolean valida = false;
		if (((int)intento >= 65 && (int)intento <= 90) || ((int)intento >= 97 && (int)intento <= 122) || ((int)intento >= 164) && (int)intento <= 165) {
			return true;
		}
		return valida;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ahorcado [contador=");
		builder.append(contador);
		builder.append(", resuelta=");
		for(int i=0; i<resuelta.length; i++) {
			builder.append(resuelta[i]+" ");
		}
		builder.append("]");
		return builder.toString();
	}
			
}
