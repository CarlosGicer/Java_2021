/**
 * 
 */
package ejerciciost6.series;

/**
 * @author sjgui
 *
 */
public class Videojuego extends Multimedia implements Entregable {

	private int horasEstimadas=100;
	private String desarrollador="";
	private boolean prestado=false;
	
	
	/**
	 * 
	 */
	public Videojuego() {
		super();
	}

	/**
	 * @param titulo
	 * @param horasEstimadas
	 */
	public Videojuego(String titulo, int horasEstimadas) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}


	/**
	 * @param titulo
	 * @param horasEstimadas
	 * @param genero
	 * @param desarrollador
	 */
	public Videojuego(String titulo, int horasEstimadas, String genero, String desarrollador) {
		super(titulo,genero);
		this.horasEstimadas = horasEstimadas;
		this.desarrollador = desarrollador;
	}

	/**
	 * @return the horasEstimadas
	 */
	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	/**
	 * @param horasEstimadas the horasEstimadas to set
	 */
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}


	/**
	 * @return the desarrollador
	 */
	public String getDesarrollador() {
		return desarrollador;
	}

	/**
	 * @param desarrollador the desarrollador to set
	 */
	public void setDesarrollador(String desarrollador) {
		this.desarrollador = desarrollador;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Videojuego [titulo=");
		builder.append(titulo);
		builder.append(", horasEstimadas=");
		builder.append(horasEstimadas);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", desarrollador=");
		builder.append(desarrollador);
		builder.append(", prestado=");
		builder.append(prestado);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
}
