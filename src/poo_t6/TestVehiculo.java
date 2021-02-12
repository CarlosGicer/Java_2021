package poo_t6;

import java.util.ArrayList;

public class TestVehiculo {

	public static void main(String[] args) {
		
		ArrayList<Vehiculo> garaje = new ArrayList<Vehiculo>();
		
		VElectrico ve1 = new VElectrico("blanco", 1800, "8888-JJJ", 450, 80);
		VHibrido vh1 = new VHibrido("gris", 2100, "7878-HHH", 15, 50, 6, 50);
		
		
		System.out.println(ve1 + " GastoCien = " + ve1.gastoCien());
		System.out.println(vh1 + " GastoCien = " + vh1.gastoCien());

		
		garaje.add(ve1);
		garaje.add(vh1);
		
		for(Vehiculo v: garaje) {
			System.out.println(v.getMatricula() + " " + v.gastoCien());
			
			//Hay que intentar evitar esto. Preguntar por el tipo concreto en tiempo de ejecución
			if (v instanceof VHibrido) {
				System.out.println(((VHibrido) v).getCapacidadTanque());
			}
		}
			
	}

}
