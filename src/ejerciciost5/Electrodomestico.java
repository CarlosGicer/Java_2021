/**
 * 
 */
package ejerciciost5;

/**
 * @author sjgui
 *
 */
public class Electrodomestico {

	private String marca;
	private String modelo;
	private double precioBase = 100;
	private double peso = 5; //En kilogramos
	private char consumoEnergetico = 'F';
	private String color = "blanco";
	
	/**
	 * 
	 */
	public Electrodomestico() {
		super();
	}	

	/**
	 * @param marca
	 * @param modelo
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(String marca, String modelo, double precioBase, double peso) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.peso = peso;
	}

	/**
	 * @param marca
	 * @param modelo
	 * @param precioBase
	 * @param peso
	 * @param consumoEnergetico
	 * @param color
	 */
	public Electrodomestico(String marca, String modelo, double precioBase, double peso, char consumoEnergetico,
			String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.peso = peso;
		this.comprobarConsumoEnergetico(consumoEnergetico);
		this.comprobarColor(color);
	}

	
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @return the precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @return the consumoEnergetico
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Comprobamos que la letra está entre la A y la F antes de asignarla a consumoEnergetico. Sino será la letra F
	 */
	private void comprobarConsumoEnergetico(char letra) {
		if ( (letra == 'A') || (letra == 'B') || (letra == 'C') || (letra == 'D') || (letra == 'E') || (letra == 'F') ) {
			this.consumoEnergetico = letra;
		}
	}
	
	/**
	 * Comprobamos que el color sea blanco, negro, gris o rojo. En otro caso será blanco
	 */
	private void comprobarColor(String color) {
		if ( (color.equals("blanco")) || (color.equals("negro")) || (color.equals("gris")) || (color.equals("rojo")) ) {
			this.color = color;
		}
	}
	
	/**
	 * Calcula el precio final del producto sumándole al precio base unos extras en función de la letra de consumo energético y del peso del electrodoméstico
	 * @return el precio final con los extras
	 */
	public double precioFinal() {
		double precioMas = 0;
		switch (this.consumoEnergetico) {
		case 'A': {
			precioMas = 100;
			break;
		}
		case 'B': {
			precioMas = 80;
			break;
		}
		case 'C': {
			precioMas = 60;
			break;
		}
		case 'D': {
			precioMas = 50;
			break;
		}
		case 'E': {
			precioMas = 30;
			break;
		}
		case 'F': {
			precioMas = 10;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value");
		}
		
		if ( (this.peso > 0) && (this.peso <= 19) ) {
			precioMas += 10;
		} else if ( (this.peso > 19) && (this.peso <= 49) ) {
			precioMas += 60;
		} else if ( (this.peso > 49) && (this.peso <= 79) ) {
			precioMas += 80;
		} else if ( this.peso > 79) {
			precioMas += 100;
		}
		
		return this.precioBase + precioMas;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Electrodomestico [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", precioBase=");
		builder.append(precioBase);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", consumoEnergetico=");
		builder.append(consumoEnergetico);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
