package Corregir;

import java.util.Scanner;

/**
 * @author Francisco Castro Mañas
 *
 */
public class Pez implements Cloneable{
	
	//Propiedades
	protected String nombre; //Atributo nombre
	private static int numPeces; //Atributo numero peces
	
	/**
	 * Constructor parametrizado: 
	 * @param nombre
	 * @param numPeces
	 */
	public Pez(String nombre) {
		super();
		this.nombre = nombre;
		Pez.numPeces++;
	}

	/**
	 * Constructor de copia: 
	 * @param pez
	 */
	public Pez(Pez pez) {
		super();
		this.nombre = pez.nombre;
		Pez.numPeces++;
	}

	/**
	 * Metodo setter: 
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 
	
	/**
	 * Metodo getter: 
	 * @return the nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Metodo getNumeroPeces: Se encarga de contar las clase creadas 
	 * @return retorna el numero de clases Pez creadas
	 */
	public static int getNumeroPeces() {
		return Pez.numPeces;
	}

	/**
	 * Metodo equals: Compara los datos de la clase
	 * @paran obj
	 * @return retorna si los datos son iguales es true y si no son iguales es false 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pez other = (Pez) obj;
		if (!this.nombre.equals(other.getNombre())) {
			return false;
		}
		return true;
	}
	
	/**
	 * Metodo clone: Se encarga de clonar clases
	 * @return retorna la clase copiada
	 */
	@Override
	protected Object clone() {
		Object clone = null;
		
		try {
			clone = super.clone();
		}catch(CloneNotSupportedException ex) {
			System.out.println("Error no duplica");
		}
		
		return clone;
	}
	
public static void main(String[] args) {
		
		Pez pez1 = new Pez("Boqueron");
		Pez pez2 = (Pez) pez1.clone();
		Pez pez3 = new Pez("Caballa");
		Pez pez4 = (Pez) pez3.clone();
		Pez pez5 = new Pez(pez1);
		Pez pez6 = new Pez(pez5);
		
		System.out.println("Hay " + Pez.getNumeroPeces() + " peces");
		
		if(pez1.equals(pez2)) {
			System.out.println(pez1.getNombre() + " y " + pez2.getNombre());
			System.out.println("Son iguales");
		}else {
			System.out.println(pez1.getNombre() + " y " + pez2.getNombre());
			System.out.println("No son iguales");
		}
		
		if(pez3.equals(pez4)) {
			System.out.println(pez3.getNombre() + " y " + pez4.getNombre());
			System.out.println("Son iguales");
		}else {
			System.out.println(pez3.getNombre() + " y " + pez4.getNombre());
			System.out.println("No son iguales");
		}
		
		if(pez1.equals(pez3)) {
			System.out.println(pez1.getNombre() + " y " + pez3.getNombre());
			System.out.println("Son iguales");
		}else {
			System.out.println(pez1.getNombre() + " y " + pez3.getNombre());
			System.out.println("No son iguales");
		}
		
		if(pez2.equals(pez4)) {
			System.out.println(pez2.getNombre() + " y " + pez4.getNombre());
			System.out.println("Son iguales");
		}else {
			System.out.println(pez2.getNombre() + " y " + pez4.getNombre());
			System.out.println("No son iguales");
		}
		
		if(pez5.equals(pez6)) {
			System.out.println(pez5.getNombre() + " y " + pez6.getNombre());
			System.out.println("Son iguales");
		}else {
			System.out.println(pez5.getNombre() + " y " + pez6.getNombre());
			System.out.println("No son iguales");
		}
		
	}
	
}

