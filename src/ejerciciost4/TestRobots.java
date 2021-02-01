package ejerciciost4;

public class TestRobots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robots rb1 = new Robots();
		System.out.println(rb1);
		rb1.irAbajo();
		System.out.println(rb1);
		rb1.irArriba();
		System.out.println(rb1);
		rb1.irDerecha();
		System.out.println(rb1);
		rb1.setPosicionX(10);
		System.out.println(rb1);
		
		Robots rb2 = new Robots(4,89);
		for(int i=0; i<12; i++) {
			rb2.irAbajo();
			rb2.irDerecha();
		}
			
		System.out.println(rb2);
	}

}
