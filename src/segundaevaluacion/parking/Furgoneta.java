/**
 * 
 */
package segundaevaluacion.parking;

import segundaevaluacion.parking.Coche.Combustible;

/**
 * @author sjgui
 *
 */
public class Furgoneta extends Vehiculo {

	private float longitud;
	
	
	/**
	 * 
	 */
	public Furgoneta() {
		super();
		this.marca = "";
		this.matricula = "";
		this.longitud = 0;
	}

	/**
	 * @param matricula
	 * @param marca
	 */
	public Furgoneta(String matricula, String marca, float longitud) {
		super(matricula, marca);
		this.longitud = longitud;
	}
	
	/**
	 * @param matricula
	 * @param marca
	 */
	public Furgoneta(Furgoneta f) {
		this.marca = f.marca;
		this.matricula = f.matricula;
		this.longitud = longitud;
	}

	@Override
	public double descuento() {
		return  (Parking.PRECIO_BASE_POR_MINUTO * this.calcularMinutos()) +	(Parking.PRECIO_BASE_POR_METRO * this.longitud) - 
				(this.descuento() * (Parking.PRECIO_BASE_POR_MINUTO * this.calcularMinutos() + (Parking.PRECIO_BASE_POR_METRO * this.longitud)) );
		
	}

	@Override
	public double calcularImporte() {
		double descuento = 0;
		if (this.calcularMinutos() < 120)
			descuento += 0.03;
		if (this.calcularMinutos() > 3600)
			descuento += 0.2;
		
		if ( !(this.fechaEntrada.getDayOfWeek().toString().toLowerCase().equals("saturday")) &&
		   !(this.fechaEntrada.getDayOfWeek().toString().toLowerCase().equals("sunday")) ) {
			descuento += 0.1;
		}
		
		return descuento;
	}

	/**
	 * @return the longitud
	 */
	public float getLongitud() {
		return longitud;
	}

	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Furgoneta [longitud=");
		builder.append(longitud);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", fechaEntrada=");
		builder.append(fechaEntrada);
		builder.append(", plaza=");
		builder.append(plaza);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	

}
