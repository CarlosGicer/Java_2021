/**
 * 
 */
package ejemplos;

public class Persona {
	private String nombre;
	private String apellidos;
	
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public Persona(Persona unaPersona) {
		this.nombre = unaPersona.nombre;
		this.apellidos = unaPersona.apellidos;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
	}
}

class Test {

	public static void main(String[] args) {
		Persona p1 = new Persona("Javier","Guillén");
		Persona p2 = new Persona(p1); //Constructor copia
		try {
			Persona p3 = (Persona) p1.clone(); //Clonación
		} catch (CloneNotSupportedException ex) {
			System.out.println(ex.getMessage());
		}
	}
}