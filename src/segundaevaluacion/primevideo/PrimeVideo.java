/**
 * 
 */
package segundaevaluacion.primevideo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sjgui
 *
 */
public class PrimeVideo {

	private List<Cliente> suscriptores;
	private List<Multimedia> catalogo;
	private double ganancias;
	
	/**
	 * 
	 */
	public PrimeVideo() {
		super();
		this.suscriptores = new ArrayList<Cliente>();
		this.catalogo = new ArrayList<Multimedia>();
		this.ganancias = 0;
		
	}
	
	public void addSuscriptor(Cliente cliente) {
		this.suscriptores.add(cliente);
	}
	
	public void addMultimedia(Multimedia multimedia) {
		this.catalogo.add(multimedia);
	}
	
	public void ver(Multimedia m, Cliente c) {
		if (!c.esPro()) {
			this.ganancias += m.getPrecio();
		} //Los clientes pro no pagan por las pelis
	}
	
	public double getGanancias() {
		double gananciasSus=0;
		for(Cliente c: this.suscriptores) {
			gananciasSus += c.getPrecioMensual()*12;
		}
		
		return this.ganancias + gananciasSus;
	}

	/**
	 * @return the suscriptores
	 */
	public List<Cliente> getSuscriptores() {
		return suscriptores;
	}

	/**
	 * @return the catalogo
	 */
	public List<Multimedia> getCatalogo() {
		return catalogo;
	}
	
	
	
	
	
}
