/**
 * 
 */
package ejerciciost5;

import java.util.ArrayList;

/**
 * @author alumno
 * Clase que almacena varios coches
 */
public class Concesionario {

	private ArrayList<Coche> coches; //Almacenamos un array de objetos Coche
	private String nombre;
	private String direccion;
	private double ganancias;
	
			
	/**
	 * @param nombre
	 * @param direccion
	 * @param numCochesMaximo - el número de coches máximo que habrá en el concesionario
	 */
	public Concesionario(String nombre, String direccion, int numCochesMaximo) {
		this.coches = new ArrayList<Coche>(numCochesMaximo); //Reservando x elementos en el array coches
		this.nombre = nombre;
		this.direccion = direccion;
		this.ganancias = 0;
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
	 * @return the numCoches
	 */
	public int getNumCoches() {
		return this.coches.size();
	}


	/**
	 * @return the ganancias
	 */
	public double getGanancias() {
		return ganancias;
	}
	
	/**
	 * Devuelve como String todos los coches del concesionario
	 * @return String con los coches que hay en el concesionario
	 */
	public String mostrarCoches() {
		StringBuilder builder = new StringBuilder();
		for(Coche i : this.coches) {
			builder.append(i);
			builder.append("\n");
		}		
		return builder.toString();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Concesionario [nombre=");
		builder.append(nombre);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", numCoches=");
		builder.append(this.getNumCoches());
		builder.append(", Ganancias=");
		builder.append(ganancias);
		builder.append("€]");
		return builder.toString();
	}
	
	

	/**
	 * Añade un coche al concesionario
	 * @param unCoche
	 * @return si se ha podido añadir o no (no se podrá si hay el máximo de coches permitido)
	 */
	
	public boolean adquirirCoche(Coche unCoche) {
		this.coches.add(unCoche);
		return true;
		
	}
	
	
	/**
	 * Quita el coche de los que tiene el concesionario
	 * @param unCoche - contiene los datos del coche del concesionario a borrar
	 * @return
	 */
	public boolean venderCoche(Coche unCoche, double precio) {
		
		for(int i=0; i<this.coches.size(); i++) {
			//Cuando encuentre el coche con esos datos lo borro
			if (this.coches.get(i).equals(unCoche)) { //==
				//Eliminarlo del array desplazando desde la posición i hasta numCoches hacia la izquierda
				this.coches.remove(i);
				
				this.ganancias += (precio - unCoche.getPrecio()); //Vendo a un precio mayor que el comprado, y sumo las ganancias
				return true;
			}
		}
		
		return false;
	}
	
		
}
