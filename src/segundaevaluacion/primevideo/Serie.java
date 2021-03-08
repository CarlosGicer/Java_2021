/**
 * 
 */
package segundaevaluacion.primevideo;

import java.util.ArrayList;

/**
 * @author sjgui
 *
 */
public class Serie extends Multimedia {

	private ArrayList<Temporada> temporadas;

	
	/**
	 * @param titulo
	 * @param plus
	 * @param precio
	 * @param genero
	 */
	public Serie(String titulo, boolean plus, double precio, Genero genero) {
		super(titulo, plus, precio, genero);
		this.temporadas = new ArrayList<Temporada>();
	}

	/**
	 * 
	 */
	public Serie() {
		super();
		this.temporadas = new ArrayList<Temporada>();
	}

	/**
	 * @return the temporadas
	 */
	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}

	/**
	 * @param temporadas the temporadas to set
	 */
	public void setTemporadas(ArrayList<Temporada> temporadas) {
		this.temporadas = temporadas;
	}
	
	public int getNumeroTemporadas() {
		return this.temporadas.size();
	}
	
	public void addTemporada(Temporada temporada) {
		temporada.setSerie(this);
		this.temporadas.add(temporada);
	}
	
	public boolean delTemporada(Temporada temporada) {
		for(int i=0; i<this.temporadas.size(); i++) {
			if (this.temporadas.get(i).equals(temporada)) {
				this.temporadas.remove(i);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [temporadas=");
		builder.append(temporadas);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
