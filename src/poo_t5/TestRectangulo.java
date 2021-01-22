package poo_t5;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//En los tres casos son referencias distintas
		Rectangulo r1 = new Rectangulo(4,5,"Uno");
		Rectangulo r2 = (Rectangulo) r1.clone(); //Clonación
		Rectangulo r3 = new Rectangulo(r1); //Constructor copia
		Rectangulo r4 = new Rectangulo(r3);
		Rectangulo r5 = r4;
		
		Rectangulo r6 = r1.incrementarAlto();
		r6.incrementarAlto();
		r2.incrementarAncho();
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		System.out.println(r6.toString());
		
		//equals compara referencias por defecto. Si lo sobrescribes compara valores internos (quieras)
		if(r1.equals(r2)) {
			System.out.println("r1 y r2 tienen los mismos valores");
		}
		if (r3.equals(r4)) {
			System.out.println("r3 y r4 tienen los mismos valores");
		}
		
		if (r4 == r5) { //como equals si no lo hubiéramos sobrescrito
			System.out.println("Son el mismo objeto, la misma referencia");
		}
		
		System.out.println(r1.area());
		System.out.println(r1.perimetro());
	}

}
