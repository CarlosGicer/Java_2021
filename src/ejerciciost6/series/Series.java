/**
 * 
 */
package ejerciciost6.series;

/**
 * @author sjgui
 *
 */
public class Series extends Multimedia implements Entregable {

	private int numTemporadas;
	private String creador;
	private boolean prestado;
	
	/**
	 * 
	 */
	public Series() {
		super();
		this.numTemporadas = 3;
		this.creador = "";
		this.prestado = false;
	}

	/**
	 * @param numTemporadas
	 * @param creador
	 * @param prestado
	 */
	public Series(String titulo, int numTemporadas, String genero, String creador) {
		super(titulo,genero);
		this.numTemporadas = numTemporadas;
		this.creador = creador;
		this.prestado = false;
	}

	/**
	 * @param titulo
	 * @param creador
	 */
	public Series(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
		this.numTemporadas = 3;
		this.genero = "";
		this.prestado = false;
	}


	/**
	 * @return the numTemporadas
	 */
	public int getNumTemporadas() {
		return numTemporadas;
	}

	/**
	 * @param numTemporadas the numTemporadas to set
	 */
	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}


	/**
	 * @return the creador
	 */
	public String getCreador() {
		return creador;
	}

	/**
	 * @param creador the creador to set
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Series [titulo=");
		builder.append(titulo);
		builder.append(", numTemporadas=");
		builder.append(numTemporadas);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", creador=");
		builder.append(creador);
		builder.append(", prestado=");
		builder.append(prestado);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void entregar() {
		this.prestado = true;
	}

	@Override
	public void devolver() {
		this.prestado = false;
	}

	@Override
	public boolean isPrestado() {
		return this.prestado;
	}
	

	
	
	
}
