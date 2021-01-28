/**
 * 
 */
package ejerciciost5;

import java.util.ArrayList;

/**
 * @author sjgui
 *
 */
public class EjemploClonacion implements Cloneable {
	    
	private String nombre;
	private ArrayList<String> apellidos;
	
	
	/**
	 * @param nombre
	 */
	public EjemploClonacion(String nombre) {
		super();
		this.nombre = nombre;
		this.apellidos = new ArrayList<String>(2);
	}


	/**
	 * @param nombre
	 * @param apellidos
	 */
	public EjemploClonacion(String nombre, ArrayList<String> apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the apellidos
	 */
	public ArrayList<String> getApellidos() {
		return apellidos;
	}


	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(ArrayList<String> apellidos) {
		this.apellidos = apellidos;
	}


	public Object clone() {
	        Object clone = null;
	         try {
	             clone = super.clone();
	         } catch(CloneNotSupportedException e) {
	             // No debería ocurrir
	         }
	         
	         // Aqui viene la implementacion de la clonación "profunda" ('deep clone')
	         ((EjemploClonacion)clone).setNombre(this.nombre);
	         ((EjemploClonacion)clone).setApellidos((ArrayList<String>)this.apellidos.clone());
	         
	         return clone;
	    }
	
}