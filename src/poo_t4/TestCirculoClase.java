package poo_t4;

public class TestCirculoClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CirculoClase c1 = new CirculoClase(3);
		System.out.println(c1);
		
		CirculoClase c2 = new CirculoClase(3,-2,10);
		
		
		System.out.println(c2);
		
		System.out.println(c1.area() + " " + c1.longitud());
		System.out.println(c2.area() + " " + c2.longitud());
		
	}

}
