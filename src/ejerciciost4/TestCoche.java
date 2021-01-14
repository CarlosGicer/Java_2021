package ejerciciost4;

public class TestCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche c1 = new Coche("Peugeot","407","Rojo",4.8, 2.2, 1.6, 165, 6);
		Coche c2 = new Coche("Toyota", "Auris", "Blanco", 4, 2, 1.7, 135, 4.7);
		
		System.out.println(c1);
		System.out.println(c2);
		
		Concesionario antasMotor = new Concesionario("AntasMotor", "Su calle nº 33", 10);
		System.out.println(antasMotor);
		
		System.out.println(antasMotor.adquirirCoche(c1));
		System.out.println(antasMotor.adquirirCoche(c2));
		
		System.out.println(antasMotor);
		
		//Sacar los coches que hay en el concesionario
		System.out.println(antasMotor.mostrarCoches());
		
		
	}

}
