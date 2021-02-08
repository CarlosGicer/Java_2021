package Corregir;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Francisco Castro Mañas
 *
 */
public class Ahorcado {
	
	//Atributos
			private static String[] palabras = {"coche", "bicicleta", "montaña", "carretera", "puerto", "playa", "gato", "perro", "patinete", "globo"};
			private String palabraAdivinar; //palabrAdeivinar.length
			private char[] palabraIntentada;//palabra adivinar con las letras acertadas a_a
			private int numeroIntentos;//El  numero de intentos
			
			//Constructor
			/**
			 * @param palabraAdivinar
			 * @param palabraIntentada
			 */
			public Ahorcado( ) {
				int pos = ((int) (Math.random()*10));
				this.palabraAdivinar=palabras[pos];
				palabraIntentada = new char[this.palabraAdivinar.length()];
				for(int i=0; i<palabraAdivinar.length();i++)
					this.palabraIntentada[i] = '_';
			}
			
			//Cuerpo
			/**
			 * @return el palabraAdivinar
			 */
			public String getPalabraAdivinar() {
							
				return palabraAdivinar;
			}
			/**
			 * @param palabraAdivinar el palabraAdivinar a establecer
			 */
			public void setPalabraAdivinar(String palabraAdivinar) {
				this.palabraAdivinar = palabraAdivinar;
			}
			/**
			 * @return el palabraIntentada
			 */
			public String getPalabraIntentada() {
				return String.valueOf(palabraIntentada);
			}
			/**
			 * @param palabraIntentada el palabraIntentada a establecer
			 */
			public void setPalabraIntentada(String palabraIntentada) {
				this.palabraIntentada = palabraIntentada.toCharArray();
			}
			/**
			 * @return el palabras
			 */
			public static String[] getPalabras() {
				return palabras;
			}
			
			/***
			 *Metodo devuelve le numero de letras de la palabra adivinar
			 * @return
			 */
		     public int getNumLetrasPalabra() {

				return palabraAdivinar.length();
			}
			
		
			public boolean intentar(char letra) {
				//Sustituir la letra correspondent en la palabraIntentada en las posiciones que este la plabra adivinarAdivinar
				//Si no se encuentra se incrementa el  numero de intentos (fallos)
				if(numeroIntentos<=6) {
					for(int i=0; i<palabraAdivinar.length(); i++) {
						if( this.palabraAdivinar.charAt(i)==letra) {
							this.palabraIntentada[i]=letra;
						}
					}
					
					}
					else {
						return false;
					}
				numeroIntentos++;
				return true;

			}
			
			public boolean resolver(String palabra) {
				
				if(this.palabraAdivinar.equals(palabra))
						return true;
				else
					return false;
			}

			
			@Override
			public String toString() {
				StringBuilder builder = new StringBuilder();
				builder.append("Ahorcado [palabraAdivinar=");
				builder.append(palabraAdivinar);
				builder.append(", palabraIntentada=");
				builder.append(palabraIntentada);
				builder.append(", numeroIntentos=");
				builder.append(numeroIntentos);
				builder.append(", La palabra tiene =");
				builder.append(getNumLetrasPalabra());
				builder.append(" letras ]");
				return builder.toString();
			}
			
}
