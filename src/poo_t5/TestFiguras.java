package poo_t5;

import java.util.ArrayList;

public class TestFiguras {
	
	private ArrayList<FiguraGeo> figuras;

	
	TestFiguras() {
		figuras = new ArrayList<FiguraGeo>();
	}
	
	public void addFigura(FiguraGeo fg) {
		figuras.add(fg);
	}

	public double area() {
		double area=0;
		for(FiguraGeo i : this.figuras) {
			area += i.area(); //Aquí habrá polimorfismo, porque se ejecutará el método area() de la clase correspondiente
		}
		return area;
	}
	
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
		
		//Añadimos figuras a FiguraGeo
		TestFiguras tf = new TestFiguras();
		tf.addFigura(c1);
		tf.addFigura(t1);
		tf.addFigura(c2);
		tf.addFigura(t2);
		tf.addFigura(f1);
		System.out.println(tf.area());
		
		tf = null; //Liberaría toda la memoria de tf, y todas las figuras que tiene dentro

		
	}

}
