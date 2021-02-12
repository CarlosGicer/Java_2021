package poo_t6;

public class VHibrido extends Vehiculo {
	
	private int kw;
	private int autonomia_elec;
	private double consumoCien;
	private int capacidadTanque;
	private static double precioKw = 0.25;
	private static double precioCombustible = 1.2;
	
	/**
	 * @param color
	 * @param peso
	 * @param matricula
	 */
	public VHibrido(String color, double peso, String matricula, int kw, int auto_elec, double consumo, int capacidad) {
		super(color, peso, matricula);
		this.kw = kw;
		this.autonomia_elec = auto_elec;
		this.consumoCien = consumo;
		this.capacidadTanque = capacidad;
	}

	/**
	 * @return the kw
	 */
	public int getKw() {
		return kw;
	}

	/**
	 * @param kw the kw to set
	 */
	public void setKw(int kw) {
		this.kw = kw;
	}

	/**
	 * @return the autonomia_elec
	 */
	public int getAutonomia_elec() {
		return autonomia_elec;
	}

	/**
	 * @param autonomia_elec the autonomia_elec to set
	 */
	public void setAutonomia_elec(int autonomia_elec) {
		this.autonomia_elec = autonomia_elec;
	}

	/**
	 * @return the consumoCien
	 */
	public double getConsumoCien() {
		return consumoCien;
	}

	/**
	 * @param consumoCien the consumoCien to set
	 */
	public void setConsumoCien(double consumoCien) {
		this.consumoCien = consumoCien;
	}

	/**
	 * @return the capacidadTanque
	 */
	public int getCapacidadTanque() {
		return capacidadTanque;
	}

	/**
	 * @param capacidadTanque the capacidadTanque to set
	 */
	public void setCapacidadTanque(int capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VHibrido [kw=");
		builder.append(kw);
		builder.append(", autonomia_elec=");
		builder.append(autonomia_elec);
		builder.append(", consumoCien=");
		builder.append(consumoCien);
		builder.append(", capacidadTanque=");
		builder.append(capacidadTanque);
		builder.append(", ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	//Implementación del método abstracto heredado
	public double gastoCien() {
		
		double kwCien = this.kw * 100 / this.autonomia_elec;
		double consumoElecCien = kwCien * VHibrido.precioKw;
		
		//No está del todo bien el cálculo del consumo a los 100
		return (consumoElecCien + (VHibrido.precioCombustible * this.consumoCien ));
	}
	
	
	

}
