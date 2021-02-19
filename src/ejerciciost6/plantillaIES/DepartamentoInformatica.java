/**
 * 
 */
package ejerciciost6.plantillaIES;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author sjgui
 *
 */
public class DepartamentoInformatica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Profesor> departamentoI = new ArrayList<Profesor>(3);
		
		try {
			departamentoI.add(new ProfesorTitular("025", "Javier", "Guillén", LocalDate.of(1977, 10, 10), 1000, false));
			departamentoI.add(new ProfesorTitular("026", "Cati", "Flores", LocalDate.of(1974, 8, 20), 1100, true));
			departamentoI.add(new ProfesorInterino("037", "Paqui", "García", LocalDate.of(1978, 10, 03), 400, LocalDate.of(2021, 9, 1)));
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			//e.printStackTrace();
		}
		
		
		for(Profesor profe : departamentoI) {
			System.out.println(profe.getNombre() + " cobra " + profe.importeNomina());
		}

	}

}
