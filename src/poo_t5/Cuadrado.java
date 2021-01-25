package poo_t5;

public class Cuadrado extends FiguraGeo {

	private int lado;

	/**
	 * @param color
	 * @param lado
	 */
	public Cuadrado(String color, String nombre, int lado) {
		super(color,nombre);
		this.lado = lado;
	}

	/**
	 * @param color
	 * @param lado
	 */
	public Cuadrado(int lado) {
		super("blanco");
		this.lado = lado;
	}

	/**
	 * @return the lado
	 */
	public int getLado() {
		return lado;
	}

	/**
	 * @param lado the lado to set
	 */
	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cuadrado [lado=");
		builder.append(lado);
		builder.append(", color=");
		builder.append(color);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + lado;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Cuadrado))
			return false;
		Cuadrado other = (Cuadrado) obj;
		if (lado != other.lado)
			return false;
		return true;
	}
	
	@Override
	public double area() {
		System.out.println("area en Cuadrado");
		return this.lado*4;
	}



	
	
	
	
	
	
	
}
