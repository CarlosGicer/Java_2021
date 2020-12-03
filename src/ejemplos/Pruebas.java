package ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class Pruebas {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla = new int[100];
		int aux;
		boolean flag = false;
		int numero=0;
		
		for (int i=0; i < tabla.length; ++i) {
			tabla[i] = (int) ((Math.random()*99)+1);
		}
		
		for (int i= tabla.length; i >0; --i) {
			for (int j=0; j<i-1; j++) {
				if (tabla[j]>tabla[j+1]) {
					
					aux = tabla[j+1];
					tabla[j+1]=tabla[j];
					tabla[j]=aux;
					flag = true;
				} else {
					if (flag = false) {
						break;
					}
				}
			}
		}
		
		//el primer for es para ver los numeros que si hay
		for (int i =0; i < tabla.length; ++i) {
					System.out.println(tabla[i]);
			}
		
		//el segundo for para los que no hay
		System.out.println("Los numeros que falta son: ");
			
		boolean encontrado=false;
		for (int i=1; i < 100; ++i) {
			encontrado=false;
			for (int j=0; j < tabla.length; j++) {
				if (i == tabla[j]) {
					encontrado = true;
					break;
				}
				if (i<tabla[j])
					break; //Que no siga buscando en todo el array
			}
			if (!encontrado)
				System.out.println(i);
		}	
		
		
	}

}
