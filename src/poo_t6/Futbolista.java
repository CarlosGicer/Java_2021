package poo_t6;

public class Futbolista {

	private int dorsal;
	private String Nombre;
	private Demarcacion demarcacion;
	private Equipo equipo;

	public Futbolista(String nombre, int dorsal, Demarcacion demarcacion, Equipo equipo) {
		this.dorsal = dorsal;
		Nombre = nombre;
		this.demarcacion = demarcacion;
		this.equipo = equipo;
	}

	// Metodos getter y setter aquí

	@Override
	public String toString() {
		return this.dorsal + " - " + this.Nombre + " - "
				+ this.demarcacion.name() + " - " + this.equipo.getNombreClub();
	}
	
	public static void main(String[] args) {
		Futbolista casillas = new Futbolista("Casillas", 1, Demarcacion.PORTERO, Equipo.REAL_MADRID);
		Futbolista capdevila = new Futbolista("Capdevila", 11, Demarcacion.DEFENSA, Equipo.VILLAREAL);
		Futbolista iniesta = new Futbolista("Iniesta", 6, Demarcacion.CENTROCAMPISTA, Equipo.BARÇA);
		Futbolista navas = new Futbolista("Navas", 22, Demarcacion.DELANTERO, Equipo.SEVILLA);
		
		System.out.println(casillas.toString());
		System.out.println(capdevila.toString());
		System.out.println(iniesta.toString());
		System.out.println(navas.toString());
	}
}
