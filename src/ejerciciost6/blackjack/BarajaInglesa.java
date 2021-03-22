package ejerciciost6.blackjack;

public class BarajaInglesa extends Baraja {

	private static final int[] valores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
	private static final String[] figuras = { "Corazones", "Diamantes", "Tréboles", "Picas" };
	
	public BarajaInglesa() {
		super();
		for(int i=0; i<valores.length; i++)
			for(int j=0; j<figuras.length; j++) {
				this.baraja.add(new Carta(valores[i],figuras[j]));
			}
	}
	
	
	public static void main(String[] args) {
		BarajaInglesa bi = new BarajaInglesa();
		System.out.println(bi);
	}
	
	
	
}
