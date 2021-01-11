/**
 * 
 */
package ejerciciost4;

/**
 * @author alumno
 *
 */
public class Pizza {
	
	//DEFINICION DE ATRIBUTOS 
	
	private String tamaño;
	private String tipo;
	private String estado;
	
	private static int pedidas=0; //Los atributos estáticos se inicializan en la definición
	private static int servidas=0;
	
	/**
	 * @param tamaño
	 * @param tipo
	 */
	public Pizza(String tamaño, String tipo) {
		this.tamaño = tamaño;  //En el acceso los atributos es con this
		this.tipo = tipo;
		this.estado = "Pedida";
		Pizza.pedidas++;       //En el acceso los atributos estáticos es con el nombre de la clase
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the tamaño
	 */
	public String getTamaño() {
		return tamaño;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "Pizza [tamaño=" + tamaño + ", tipo=" + tipo + ", estado=" + estado + "]";
	}
	
	public void servir() {
		if (this.estado.equals("Pedida")) {
			this.estado = "Servida";
			Pizza.servidas++;
		}
	}
	
	public static int getPedidas() {
		return Pizza.pedidas;
	}
	
	public static int getServidas() {
		return Pizza.servidas;
	}
	
	
	
	

}
