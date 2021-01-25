package poo_t5;

public class Triangulo extends FiguraGeo {
	
	private int base;
	private int altura;
	
	/**
	 * @param color
	 * @param nombre
	 * @param base
	 * @param altura
	 */
	public Triangulo(String color, String nombre, int base, int altura) {
		super(color, nombre);
		this.base = base;
		this.altura = altura;
	}

	/**
	 * @param base
	 * @param altura
	 */
	public Triangulo(int base, int altura) {
		super("Blanco", "Triángulo solitario");
		this.base = base;
		this.altura = altura;
	}

	/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Triangulo [base=");
		builder.append(base);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", color=");
		builder.append(color);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double area() {
		System.out.println("area en Triángulo");
		return this.base * this.altura;
	}
	

}
