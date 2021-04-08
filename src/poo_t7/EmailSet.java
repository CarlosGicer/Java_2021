/**
 * 
 */
package poo_t7;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import poo_t6.VElectrico;

/**
 * @author alumno
 *
 */
public class EmailSet {
	private TreeSet<VElectrico> elementos;



	public EmailSet() {
		super();
		this.elementos = new TreeSet<>(new Comparador());
	}
	
	public void insertar(VElectrico s) {
		elementos.add(s);
	}
	
	public void eliminar(VElectrico s) {
		elementos.remove(s);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmailSet [elementos=");
		builder.append(elementos);
		builder.append("]");
		return builder.toString();
	}
	
	public static void main(String[] args) {
		EmailSet e = new EmailSet();
		e.insertar(new VElectrico("rojo",1500, "9659GGG",500,60));
		e.insertar(new VElectrico("rojo",1600, "9659GGG",600,70));
		e.insertar(new VElectrico("rojo",1700, "9659GGG",700,10));
		e.insertar(new VElectrico("rojo",1800, "9659GGG",300,20));
		System.out.println(e);
		
		
		
		
	}
	
	//Quitar si quiero usar la ordenación que viene en VElectrico
	public class Comparador implements Comparator<VElectrico>{

		@Override
		public int compare(VElectrico o1, VElectrico o2) {
			if (o1.getKw() > o2.getKw())
				return 1;
			if (o1.getKw() < o2.getKw())
				return -1;
			return 0;
		}
		
	}

	
	
	
	
}
