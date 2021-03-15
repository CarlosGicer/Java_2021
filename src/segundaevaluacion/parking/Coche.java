package segundaevaluacion.parking;

public class Coche extends Vehiculo {

	enum Combustible {
		ELECTRICO, HIDROGENO, HIBRIDO, HIBRIDOENCHUFABLE, DIESEL, GASOLINA
	}
	
	private Combustible comb;
		
	/**
	 * 
	 */
	public Coche() {
		super();
	}

	
	/**
	 * @param matricula
	 * @param marca
	 */
	public Coche(String matricula) {
		this.matricula = matricula;
		this.marca = "";
		this.comb = Combustible.DIESEL;
	}


	/**
	 * @param matricula
	 * @param marca
	 */
	public Coche(String matricula, String marca, Combustible comb) {
		super(matricula, marca);
		this.comb = comb;
	}

	public Coche(Coche c) {
		super(c.matricula, c.marca);
		this.comb = comb;
	}
	
	
	
	
	
	/**
	 * @return the comb
	 */
	public Combustible getComb() {
		return comb;
	}

	/**
	 * @param comb the comb to set
	 */
	public void setComb(Combustible comb) {
		this.comb = comb;
	}

	@Override
	public double descuento() {
		double descuento = 0;
		if (this.calcularMinutos() < 120)
			descuento += 0.05;
		if (this.calcularMinutos() > 3600)
			descuento += 0.3;
		
		if ( (this.fechaEntrada.getDayOfWeek().toString().toLowerCase().equals("saturday")) ||
		   (this.fechaEntrada.getDayOfWeek().toString().toLowerCase().equals("sunday")) ) {
			descuento += 0.1;
		}
		
		//Se puede usar == para comparar Enum (internamente es un String), de hecho es más rápido y seguro cuando son enum, que equals
		if ( (this.comb == Combustible.GASOLINA) || (this.comb == Combustible.DIESEL) ) {
			descuento -= 0.1;
		} else {
			descuento += 0.1;
		}
		
		return descuento;
	}

	@Override
	public double calcularImporte() {
		return  (Parking.PRECIO_BASE_POR_MINUTO * this.calcularMinutos()) - 
				(this.descuento() * (Parking.PRECIO_BASE_POR_MINUTO * this.calcularMinutos()) );
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [comb=");
		builder.append(comb);
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
