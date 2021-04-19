package ejerciciost7.biblioteca;

public class Libro extends Publicacion implements Prestable {

	private boolean prestado;
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}

	public Libro(String isbn, String titulo, int año, int paginas, boolean prestado) {
		super(isbn, titulo, año, paginas);
		this.prestado = prestado;
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
		
		return prestado;
	}

}
