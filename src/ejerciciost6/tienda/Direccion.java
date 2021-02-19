/**
 * 
 */
package ejerciciost6.tienda;

/**
 * @author sjgui
 *
 */
public class Direccion {

	private String tipoVia;
	private String nombreVia;
	private int numero;
	private String ciudad;
	private String provincia;
	private String codigoPostal;
	private String país;
	
	/**
	 * @param tipoVia
	 * @param nombreVia
	 * @param numero
	 * @param ciudad
	 * @param provincia
	 * @param codigoPostal
	 * @param país
	 */
	public Direccion(String tipoVia, String nombreVia, int numero, String ciudad, String provincia, String codigoPostal,
			String país) {
		super();
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.numero = numero;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
		this.país = país;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Direccion [tipoVia=");
		builder.append(tipoVia);
		builder.append(", nombreVia=");
		builder.append(nombreVia);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", ciudad=");
		builder.append(ciudad);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append(", codigoPostal=");
		builder.append(codigoPostal);
		builder.append(", país=");
		builder.append(país);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the tipoVia
	 */
	public String getTipoVia() {
		return tipoVia;
	}

	/**
	 * @param tipoVia the tipoVia to set
	 */
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	/**
	 * @return the nombreVia
	 */
	public String getNombreVia() {
		return nombreVia;
	}

	/**
	 * @param nombreVia the nombreVia to set
	 */
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
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
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	/**
	 * @return the codigoPostal
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	/**
	 * @return the país
	 */
	public String getPaís() {
		return país;
	}

	/**
	 * @param país the país to set
	 */
	public void setPaís(String país) {
		this.país = país;
	}
	
	
	
	
}
