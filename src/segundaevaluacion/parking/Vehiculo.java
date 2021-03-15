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
	
	public void setPlazaAparcamiento(PlazaAparcamiento p) {
		this.plaza = p;
	}
	
	public PlazaAparcamiento getPlazaAparcamiento() {
		return this.plaza;
	}

	/**
	 * @param fechaEntrada the fechaEntrada to set
	 */
	public void setFechaEntrada(LocalDateTime fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @return the fechaEntrada
	 */
	public LocalDateTime getFechaEntrada() {
		return fechaEntrada;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Vehiculo))
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	
}
