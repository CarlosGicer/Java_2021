/**
 * 
 */
package segundaevaluacion.primevideo;

import java.util.ArrayList;

/**
 * @author sjgui
 *
 */
public class Temporada {

	private ArrayList<Episodio> episodios;
	private int numero;
	private Serie serie; // ?????
	
	/**
	 * 
	 */
	public Temporada() {
		super();
	}
	/**
	 * @param numero
	 */
	public Temporada(int numero) {
		super();
		this.numero = numero;
		this.episodios = new ArrayList<Episodio>();
	}
	
	/**
	 * @return the temporadas
	 */
	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}
	/**
	 * @param temporadas the temporadas to set
	 */
	public void setEpisodios(ArrayList<Episodio> episodios) {
		this.episodios = episodios;
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
	/**
	 * @return the serie
	 */
	public Serie getSerie() {
		return serie;
	}
	/**
	 * @param serie the serie to set
	 */
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	public void addEpisodio(Episodio episodio) {
		episodio.setTemporada(this); // Ojo a esto. 
								     // Marca que el episodio pertenece a la termporada 
		                             // que lo quiere añadir. 
		
		this.episodios.add(episodio); //Luego añado el episodio a la temporada
	}
	
	public boolean delEpisodio(Episodio episodio) {
		for(int i=0; i<this.episodios.size(); i++) {
			if (this.episodios.get(i).equals(episodio)) {
				this.episodios.remove(i);
				return true;
			}
		}
		
		return false;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Temporada [numero=");
		builder.append(numero);
		builder.append(" ,serie=");
		builder.append(serie.getTitulo());
		builder.append(" ,episodios=\n");
		builder.append(episodios);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
