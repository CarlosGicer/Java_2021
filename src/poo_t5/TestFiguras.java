package poo_t5;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FiguraGeo f1 = new FiguraGeo("Azul","Mar");
		System.out.println(f1.toString());
		
		Cuadrado c1 = new Cuadrado("Rojo","Luis",5);
		System.out.println(c1);
		Cuadrado c2 = new Cuadrado("Rojo","Bob",5);
		System.out.println(c2.toString());
		
		Triangulo t1 = new Triangulo("Rojo", "Tri", 5, 10);
		System.out.println(t1);
		Triangulo t2 = new Triangulo(6, 9);
		System.out.println(t2.toString());
		
		if (t1.equals(c2)) {
			System.out.println("El triángulo y el cuadrado son iguales");
		} else {
			System.out.println("Uff menos mal");
		}
		
		if (c1.equals(c2)) {
			System.out.println("Los dos cuadrados son iguales");
		} else {
			System.out.println("Los dos cuadrados son diferentes");
		}
		
	}

}
