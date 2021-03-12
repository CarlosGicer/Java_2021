package segundaevaluacion.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Vehiculo implements Descontable {

	protected String matricula;
	protected String marca;
	protected LocalDateTime fechaEntrada;
	protected PlazaAparcamiento plaza;
	
	
	/**
	 * 
	 */
	public Vehiculo() {
		super();
		this.matricula = "";
		this.marca = "";
	}

	/**
	 * @param matricula
	 * @param marca
	 * @param fechaEntrada
	 * @param plaza
	 */
	public Vehiculo(String matricula, String marca) {
		super();
		this.matricula = matricula;
		this.marca = marca;
	}


	public long calcularMinutos() {
		//Calcular minutos entre fecha de entrada y now
		LocalDateTime ahora = LocalDateTime.now();
		
		Duration dur = Duration.between(fechaEntrada, ahora);
		
		return dur.toMinutes();
	}


	@Override
	public abstract double descuento();
	
	public abstract double calcularImporte();

}
