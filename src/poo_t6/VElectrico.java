package poo_t6;

public class VElectrico extends Vehiculo {

	private int autonomia;
	private int kw;
	private static double precioKw = 0.25;
	
	
	/**
	 * @param color
	 * @param peso
	 * @param matricula
	 */
	public VElectrico(String color, double peso, String matricula, int autonomia, int kw) {
		super(color, peso, matricula);
		this.autonomia = autonomia;
		this.kw = kw;
		
	}
	/**
	 * @return the autonomia
	 */
	public int getAutonomia() {
		return autonomia;
	}
	/**
	 * @param autonomia the autonomia to set
	 */
	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VElectrico [autonomia=");
		builder.append(autonomia);
		builder.append(", kw=");
		builder.append(kw);
		builder.append(", ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	//Implementación del método abstracto heredado
	public double gastoCien() {
		
		double kwCien = this.kw * 100 / this.autonomia;
		return kwCien * VElectrico.precioKw;
	}
	
	
	
	
	
}
