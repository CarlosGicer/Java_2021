package AgendaVitaminada;

public class Proveedor extends Contacto {

	private String CIF;
	private String codigoCliente;
	
	/**
	 * 
	 */
	public Proveedor(String nombre, String telefono, String CIF, String codigoCliente) {
		super(nombre, telefono);
		this.CIF = CIF;
		this.codigoCliente = codigoCliente;
	}

	/**
	 * @return the cIF
	 */
	public String getCIF() {
		return CIF;
	}

	/**
	 * @param cIF the cIF to set
	 */
	public void setCIF(String cIF) {
		CIF = cIF;
	}

	/**
	 * @return the codigoCliente
	 */
	public String getCodigoCliente() {
		return codigoCliente;
	}

	/**
	 * @param codigoCliente the codigoCliente to set
	 */
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();	
		builder.append("Nombre=");
		builder.append(getNombre());
		builder.append(", Telefono=");
		builder.append(getTelefono());
		builder.append(", CIF=");
		builder.append(CIF);
		builder.append(", codigoCliente=");
		builder.append(codigoCliente);		
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
