/**
 * 
 */
package ejerciciost7.lecturaEscritura.taller;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author sjgui
 *
 */
public class Taller {

	private ArrayList<Vehiculo> vehiculos;

	/**
	 * 
	 */
	public Taller() {
		super();
		vehiculos = new ArrayList<>();
	}
	
	public void ingresarVehiculo(Vehiculo v) {
		vehiculos.add(v);
	}
	
	public boolean vehiculoReparado(Vehiculo v) {
		int posicion = Collections.binarySearch(vehiculos, v);
		if (posicion >= 0) {
			vehiculos.get(posicion).setEstado("reparado");
			return true;
		}
		return false;
	}
	
	public boolean eliminarVehiculo(Vehiculo v) {
		int posicion = Collections.binarySearch(vehiculos, v);
		if (posicion >= 0) {
			vehiculos.remove(posicion);
			return true;
		}
		return false;
	}
	
	public Vehiculo buscarVehiculo(String matricula) {
		//Creamos vehículo solo con la matrícula, pues contains busca por equals, y equals solo mira la matrícula
		Vehiculo v = new Vehiculo();
		v.setMatricula(matricula);
		
		//Si lo encontramos lo devolvemos
		int posicion = Collections.binarySearch(vehiculos, v);
		if (posicion >= 0) {
			return vehiculos.get(posicion);
		}
		return null;
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Taller [vehiculos=");
		builder.append(vehiculos);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
