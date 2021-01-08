package poo_t4;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Concesionario conc = new Concesionario(10);
		try {
			conc.addCoche();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
