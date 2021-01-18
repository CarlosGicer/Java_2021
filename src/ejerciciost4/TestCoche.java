package ejerciciost4;

public class TestCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche c1 = new Coche("Peugeot","407","Rojo",4.8, 2.2, 1.6, 165, 6, 30000);
		Coche c2 = new Coche("Toyota", "Auris", "Blanco", 4, 2, 1.7, 135, 4.7, 22000);
		
		System.out.println(c1);
		System.out.println(c2);
		
		Concesionario antasMotor = new Concesionario("AntasMotor", "Su calle nº 33", 10);
		System.out.println(antasMotor);
		
		if (antasMotor.adquirirCoche(c1))
			System.out.println(antasMotor);
		else
			System.out.println("No se ha podido comprar, tenemos el máximo de coches");
		
		if (antasMotor.adquirirCoche(c2))
			System.out.println(antasMotor);
		else
			System.out.println("No se ha podido comprar, tenemos el máximo de coches");		
		
		//Sacar los coches que hay en el concesionario
		System.out.println(antasMotor.mostrarCoches());
		
		Coche v1 = new Coche("Peugeot","407","Rojo",4.8, 2.2, 1.6, 165, 6, 30000);
		if (antasMotor.venderCoche(v1,32000))
			System.out.println("Has vendido un coche");
		else
			System.out.println("Coche no encontrado");
		
		if (antasMotor.venderCoche(c1,32000))
			System.out.println("Has vendido un coche");
		else
			System.out.println("Coche no encontrado");
		
		if (antasMotor.venderCoche(c2,25000))
			System.out.println("Has vendido un coche");
		else
			System.out.println("Coche no encontrado");
			
		System.out.println(antasMotor);
		System.out.println(antasMotor.mostrarCoches());
		
	}

}
