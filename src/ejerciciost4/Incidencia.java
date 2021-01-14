/**
 * 
 */
package ejerciciost4;

/**
 * @author alumno
 *
 */
public class Incidencia {

	private int codigo;
	private String estado;
	private String problema;
	private String solucion;
	
	private static int pendientes=0;
	private static int contadorCodigos=1;
	
	
	
	/**
	 * @param problema
	 */
	public Incidencia(String problema) {
		this.codigo = Incidencia.contadorCodigos; //Cada objeto que sea crea toma el valor de la variable estática
		Incidencia.contadorCodigos++; //Incremento la variable estática que lleva el código
		Incidencia.pendientes++; //Incremento el contador de incidencias pendientes
		this.problema = problema;
		this.estado = "abierta";
		this.solucion = "";
	}
	
	
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	 * @return the problema
	 */
	public String getProblema() {
		return problema;
	}
	/**
	 * @param problema the problema to set
	 */
	public void setProblema(String problema) {
		this.problema = problema;
	}
	/**
	 * @return the solucion
	 */
	public String getSolucion() {
		return solucion;
	}
	/**
	 * @param solucion the solucion to set
	 */
	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}
	/**
	 * @return the pendientes
	 */
	public static int getPendientes() {
		return Incidencia.pendientes;
	}
	/**
	 * @return the contadorCodigos
	 */
	public static int getContadorCodigos() {
		return Incidencia.contadorCodigos;
	}


	@Override
	public String toString() {
		return "Incidencia [codigo=" + codigo + ", estado=" + estado + ", problema=" + problema + ", solucion="
				+ solucion + "]";
	}
	
	
	public void resolver(String solucion) {
		this.estado = "Resuelta";
		this.solucion = solucion;
		Incidencia.pendientes--;
		
	}
	
	
	
}
