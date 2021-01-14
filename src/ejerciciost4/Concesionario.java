/**
 * 
 */
package ejerciciost4;

/**
 * @author alumno
 *
 */
public class Concesionario {

	private Coche[] coches; //Almacenamos un array de objetos Coche
	private String nombre;
	private String direccion;
	private int numCoches; //El número de coches que hay en el concesionario
	private int numCochesMaximo;
	
	/**
	 * @param nombre
	 * @param direccion
	 */
	public Concesionario(String nombre, String direccion, int numCochesMaximo) {
		this.numCoches = 0;
		this.numCochesMaximo = numCochesMaximo;
		this.coches = new Coche[numCochesMaximo]; //Reservando 100 elementos en el array coches
		this.nombre = nombre;
		this.direccion = direccion;
	}

	//Todos los getters y setters mentos setCoches y setNumCochesMaximo
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the coches
	 */
	public String mostrarCoches() {
		StringBuilder builder = new StringBuilder();
		for(int i=0; i<this.getNumCoches(); i++) {
			builder.append(this.coches[i]);
		}		
		return builder.toString();
	}

	/**
	 * @return the numCoches
	 */
	public int getNumCoches() {
		return numCoches;
	}

	/**
	 * @return the numCochesMaximo
	 */
	public int getNumCochesMaximo() {
		return numCochesMaximo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Concesionario [nombre=");
		builder.append(nombre);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", numCoches=");
		builder.append(numCoches);
		builder.append(", numCochesMaximo=");
		builder.append(numCochesMaximo);
		builder.append("]");
		return builder.toString();
	}
	
	
	public String adquirirCoche(Coche unCoche) {
		if (this.numCoches < this.numCochesMaximo) { //No puedo añadir más de numCochesMaximo
			this.coches[this.numCoches] = unCoche;
			this.numCoches++;
			return "Coche comprado correctamente";
		} else {
			return "No puedes comprar más coches, no te caben";
		}
	}
	

	
	
}
