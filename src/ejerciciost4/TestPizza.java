package ejerciciost4;

public class TestPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hay " + Pizza.getPedidas() + " pizzas pedidas.");
		System.out.println("Hay " + Pizza.getServidas() + " pizzas servidas.");

		Pizza pi1 = new Pizza("Familiar","Cuatro Quesos");
		System.out.println(pi1);
		
		Pizza pi2 = new Pizza("Normal", "Vegetal");
		System.out.println(pi2);
		
		pi1.servir();
		System.out.println(pi1);
		
		System.out.println("Hay " + Pizza.getPedidas() + " pizzas pedidas.");
		System.out.println("Hay " + Pizza.getServidas() + " pizzas servidas.");
	}

}
