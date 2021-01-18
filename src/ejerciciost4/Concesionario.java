/**
 * 
 */
package ejerciciost4;

/**
 * @author alumno
 * Clase que almacena varios coches
 */
public class Concesionario {

	private Coche[] coches; //Almacenamos un array de objetos Coche
	private String nombre;
	private String direccion;
	private int numCoches; //El número de coches que hay en el concesionario
	private int numCochesMaximo; //El número de coches máximo que puede haber en el concesionario
	private double ganancias;
	
			
	/**
	 * @param nombre
	 * @param direccion
	 * @param numCochesMaximo - el número de coches máximo que habrá en el concesionario
	 */
	public Concesionario(String nombre, String direccion, int numCochesMaximo) {
		this.numCoches = 0;
		this.numCochesMaximo = numCochesMaximo;
		this.coches = new Coche[numCochesMaximo]; //Reservando 100 elementos en el array coches
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
		return numCoches;
	}

	/**
	 * @return the numCochesMaximo
	 */
	public int getNumCochesMaximo() {
		return numCochesMaximo;
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
		for(int i=0; i<this.getNumCoches(); i++) {
			builder.append(this.coches[i]);
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
		builder.append(numCoches);
		builder.append(", numCochesMaximo=");
		builder.append(numCochesMaximo);
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
		if (this.numCoches < this.numCochesMaximo) { //No puedo añadir más de numCochesMaximo
			this.coches[this.numCoches] = unCoche;
			this.numCoches++; //Incrementar el número de coches que hay en el concesionario
			return true;
		} else {
			return false;
		}
	}
	
	
	/**
	 * Quita el coche de los que tiene el concesionario
	 * @param unCoche - contiene los datos del coche del concesionario a borrar
	 * @return
	 */
	public boolean venderCoche(Coche unCoche, double precio) {
		
		for(int i=0; i<this.numCoches; i++) {
			//Cuando encuentre el coche con esos datos lo borro
			if (this.coches[i].equals(unCoche)) { //==
				//Eliminarlo del array desplazando desde la posición i hasta numCoches hacia la izquierda
				for(int j=i; j<this.numCoches; j++)
					this.coches[j] = this.coches[j+1];
				
				this.ganancias += (precio - unCoche.getPrecio()); //Vendo a un precio mayor que el comprado, y sumo las ganancias
				this.numCoches--; //He quitado un coche
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	
	
	/*
	public boolean venderCoche(Coche unCoche, double precio) {
		//Recorremos todos los coches hasta encontrar el que se va a vender
		for(int i=0; i<this.numCoches; i++) {
			if (this.coches[i].equals(unCoche)) {
				//Se podría comprobar que no se venda a menor precio.
				this.ganancias += (precio - this.coches[i].getPrecio());
				
				//Ese coche lo borramos del array poniendo el elemento de su posición a null
				this.coches[i] = null;
				
				//Desplazamos los coches siguientes hacia la izquierda para no dejar nulls en medio
				for (int j=i; i<this.getNumCochesMaximo()-1; i++)
					this.coches[j]=this.coches[j+1];

				this.numCoches--;
				
				return true;
			}
		}
		
		return false;
	}
	*/



	
	
}
