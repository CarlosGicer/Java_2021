package poo_t7;

public class Matriz <T extends Number>{
	private T[][] matriz;
	private int longitud=10;

	
	
	/**
	 * @param matriz
	 */
	public Matriz() {
		super();
		matriz = (T[][]) new Number[longitud][longitud];
	}
	
	public void crear(T elemento) {
		for(int i=0; i<longitud; i++)
			for(int j=0; j<longitud; j++)
				matriz[i][j] = elemento;
	}
	
	public void pintar() {
		for(int i=0; i<longitud; i++) {
			for(int j=0; j<longitud; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Matriz<Integer> ml = new Matriz<>();
		ml.crear(Integer.valueOf(24));
		ml.pintar();
		
	}
	
	

}
