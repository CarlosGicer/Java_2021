package poo_t7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UtilsMap {

	private TreeMap<String, List<String>> diccionario;

	/**
	 * @param diccionario
	 */
	public UtilsMap() {
		super();
		this.diccionario = new TreeMap<>();
	}
	
	public void add(String palabra, List<String> significado) {
		diccionario.put(palabra, significado);
	}
	
	public List<String> buscar(String clave) {
		if (diccionario.containsKey(clave)) {
			return diccionario.get(clave);
		}
		return null;
	}
	
	public Set<String> claves() {
		return diccionario.keySet();
	}

	public Collection<List<String>> valores() {
		return diccionario.values();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UtilsMap [diccionario=");
		builder.append(diccionario);
		builder.append("]");
		return builder.toString();
	}
	
	public String mostrar() {
		StringBuilder builder = new StringBuilder();
		//Manera 1 de recorrer un Map, a través de las claves
		
		//Saco todas las keys
		Set<String> keys = this.claves();
		//Recorro las keys y para cada clave saco su valor
		for(String k : keys) {
			builder.append(k + " -> ");
			builder.append(diccionario.get(k) + "\n");
		}
		
		return builder.toString();
		
	}
	
	public String mostrar2() {
		StringBuilder builder = new StringBuilder();
		//Manera 2 de recorrer un Map, a través de un iterador
		Set set = diccionario.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
		    System.out.print("Clave: "+me.getKey() + " -> ");
		    System.out.println("Valor: "+me.getValue());
		}
		
		return builder.toString();
	}

	public static void main(String[] args) {
		UtilsMap um = new UtilsMap();
		um.add("araña", Arrays.asList("lámpara","arácnido")); //Devuelve un List<String>
		um.add("casa", Arrays.asList("Sitio donde vivir"));
		um.add("balón", Arrays.asList("objeto inflable para jugar"));
		
		System.out.println(um);
		System.out.println(um.buscar("casa"));
		System.out.println(um.claves());
		System.out.println(um.valores());
		System.out.println(um.mostrar());
		System.out.println(um.mostrar2());
	}
	
}
