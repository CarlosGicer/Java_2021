/**
 * 
 */
package ejerciciost7.lecturaEscritura.paises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author sjgui
 *
 */
public class Visitado {

	private TreeMap<String, List<String>> paisesYCiudades;

	/**
	 * 
	 */
	public Visitado() {
		super();
		
		//Va cualquiera de las dos formas
		
		//Primera forma
		//paisesYCiudades = new TreeMap<>(Comparator.reverseOrder());
		
		//Segunda forma
		paisesYCiudades = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
		
		
	}

	/**
	 * @return the paisesYCiudades
	 */
	public TreeMap<String, List<String>> getPaisesYCiudades() {
		return paisesYCiudades;
	}
	
	public boolean addPais(String pais) {
		if (!paisesYCiudades.containsKey(pais)) {
			//Para que queden ordenadas las ciudades hay que meter un Comparator
			paisesYCiudades.put(pais, new ArrayList<String>());
			return true;
		} else {
			return false;
		}
	}
	
	public boolean addCiudad(String pais, String ciudad) {

		if (!paisesYCiudades.get(pais).contains(ciudad)) {
			paisesYCiudades.get(pais).add(ciudad);
			Collections.sort(paisesYCiudades.get(pais)); //Cada vez que añadimos ordenamos la lista
			return true;
		} else
			return false;
		
	}
	
	public String mostrarVisitados() {
		StringBuilder sb = new StringBuilder();
		Set<String> paises = paisesYCiudades.keySet();
		for(String pais: paises) {
			sb.append(pais + ": ");
			for (String ciudad : paisesYCiudades.get(pais))
				sb.append(ciudad + ", ");
			sb.append(System.getProperty("line.separator"));
		}
		return sb.toString();
	}
	
	public boolean heVisitado(String pais, String ciudad) {
		if (!paisesYCiudades.containsKey(pais)) {
			return false;
		} else {
			if (!paisesYCiudades.get(pais).contains(ciudad)) {
				return false;
			} else
				return true;
		}
	}
	
	public Set<String> getPaises(String pais) {
		return paisesYCiudades.headMap(pais).keySet();
	}
	
	public static void main(String[] args) {
		Visitado vis = new Visitado();
		vis.addPais("Francia");
		vis.addPais("Polonia");
		vis.addPais("Dinamarca");
		vis.addPais("Alemania");
		vis.addPais("Rusia");
		vis.addCiudad("Francia", "Paris");
		vis.addCiudad("Francia", "Chartres");
		vis.addCiudad("Francia", "Blois");
		vis.addCiudad("Polonia", "Cracovia");
		vis.addCiudad("Polonia", "Varsovia");
		vis.addCiudad("Dinamarca", "Copenague");
		vis.addCiudad("Dinamarca", "Roskilde");
		vis.addCiudad("Dinamarca", "Aalborg");
		
		System.out.println(vis.mostrarVisitados());
		System.out.println(vis.heVisitado("Dinamarca", "Aarhus"));
		System.out.println(vis.heVisitado("Dinamarca", "Roskilde"));
		
		System.out.println(vis.getPaises("Francia"));
		
	}
	
}
