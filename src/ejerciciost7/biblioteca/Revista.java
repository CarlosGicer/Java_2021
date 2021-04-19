package ejerciciost7.biblioteca;

public class Revista extends Publicacion implements Prestable {

	private int numero;
	private boolean prestado;
	
	public Revista() {
		
	}

	public Revista(String isbn, String titulo, int año, int paginas, int numero, boolean prestado) {
		super(isbn, titulo, año, paginas);
		this.numero = numero;
		this.prestado = prestado;
	}

	
	/**
	 * @return the prestado
	 */
	public boolean isPrestado() {
		return prestado;
	}

	/**
	 * @param prestado the prestado to set
	 */
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
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

	@Override
	public void presta() {
		this.prestado = true;
		
	}

	@Override
	public void devuelve() {
		this.prestado = false;
		
	}

	@Override
	public boolean estaPrestado() {
		// TODO Auto-generated method stub
		return prestado;
	}
	
	

}
