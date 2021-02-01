package ejerciciost4;

public class Millas {

	private static final int cambioMillasMetros = 1852;
	
	/**
	 * 
	 */
	public Millas() {
		super();
	}
	

	public static long millasAMetros(int millas) {
		return Millas.cambioMillasMetros * millas;
	}
	
	public static long millasAKilometros(int millas) {
		return Millas.millasAMetros(millas) / 1000;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Millas.millasAKilometros(3));
		
	}

}
