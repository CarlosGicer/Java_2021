package ejerciciost7.biblioteca;

public class Revista extends Publicacion {

	private int numero;
	
	public Revista() {
		
	}

	public Revista(String isbn, String titulo, int año, int paginas, boolean prestado, int numero) {
		super(isbn, titulo, año, paginas,prestado);
		this.numero = numero;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}
