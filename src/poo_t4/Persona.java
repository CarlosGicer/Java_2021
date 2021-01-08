/**
 * 
 */
package poo_t4;

/**
 * @author sjgui
 *
 */
public class Persona {

	//Propiedades (estructura)
	private String nombre;
	private int edad;
	private String colorPiel;
	
	//Constructores

	/**
	 * Constructor sin parámetros
	 */
	public Persona() {
		super();
		this.nombre = "";
		this.edad = 0;
		this.colorPiel = "";
	}

	/**
	 * Constructor solo con el nombre
	 * @param nombre
	 */
	public Persona(String nombre) {
		this.nombre = nombre;
		this.edad = 0;
	}
	
	/**
	 * Constructor solo con la edad, el nombre lo pone como "Nada"
	 * @param edad
	 */
	public Persona(int edad) {
		this.nombre = "Nada";
		this.edad = edad;
	}
	
	/**
	 * Constructor con todas las propiedades
	 * @param nombre
	 * @param edad
	 * @param colorPiel
	 */
	public Persona(String nombre, int edad, String colorPiel) {
		this.nombre = nombre;
		this.edad = edad;
		this.colorPiel = colorPiel;
	}



	//Métodos Getters y setters
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}


	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * @return the colorPiel
	 */
	public String getColorPiel() {
		return colorPiel;
	}


	/**
	 * @param colorPiel the colorPiel to set
	 */
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	
	
	//Métodos (comportamiento)

	@Override
	public String toString() {
		return "Persona [" + nombre + " " + edad + " " + colorPiel + "]";
	}
	
	/**
	 * Nos devuelve un String con la calificación de la persona en función de su edad (Niño, Joven, ...)
	 */
	public String calificacionEdad() {
		String mensajeFinal = new String("Raro");
		if (edad < 7) {
			return "Niño";
		} else if ( (edad >= 7) && (edad <= 12) ) {
			return "Chaval";
		} else if ( (edad > 12) && (edad <= 17) ) {
			return "Adolescente";
		} else if ( (edad > 18) && (edad <= 30) ) {
			return "Joven";
		} else if ( (edad > 30) && (edad <= 45) ) {
			return "Viejoven";
		} else if (edad > 45) {
			return "Viejete";
		} else {
			return mensajeFinal;
		}
	}
	

}
