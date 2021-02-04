/**
 * 
 */
package ejerciciost5;

/**
 * @author sjgui
 *
 */
public class Pez implements Cloneable {

	protected String nombre;

	
	/**
	 * @param nombre
	 */
	public Pez(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Pez(Pez unPez) {
		this.nombre = unPez.nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Pez))
			return false;
		Pez other = (Pez) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pez [nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}

	@Override
	protected Object clone() {
		Object clone = null;
        try {
            clone = super.clone();
        } catch(CloneNotSupportedException e) {
            // No debería ocurrir
        }
		
		//Clonar el string
        ((Pez) clone).setNombre(this.nombre);
		
		return clone;
	}
	
	public static void main(String[] args) {
		Pez pececito = new Pez("Anchoa");
		Pez sardina = (Pez)pececito.clone(); //Clonación en profundidad
		Pez boqueron = new Pez(pececito); //Constructor copia
		
		System.out.println(sardina);
		System.out.println(boqueron);
	}
	
		
}
