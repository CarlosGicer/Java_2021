package segundaevaluacion.parking;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Parking {

	private ArrayList<Vehiculo> vehiculos;
	private ArrayList<PlazaAparcamiento> plazas;
	private int plazasDisponibles;
	private float saldoAcumulado;
	public static final float  PRECIO_BASE_POR_MINUTO = 0.04f;
	public static final float PRECIO_BASE_POR_METRO = 0.2f;
	
	/**
	 * 
	 */
	public Parking() {
		super();
		vehiculos = new ArrayList<>();
		plazas = new ArrayList<>();
		saldoAcumulado = 0;
		plazasDisponibles = 100;
		
		for(int i=1; i<=plazasDisponibles; i++) {
			PlazaAparcamiento plaza = new PlazaAparcamiento(i,true);
			plazas.add(plaza);
		}
	}
	
	public int getNumeroPlazasLibres() {
		return plazasDisponibles;
	}
	
	public ArrayList<Vehiculo> getVehiculosAparcados() {
		return vehiculos;
	}
	
	public float saldoAcumulado() {
		return saldoAcumulado;
	}
	
	public void imprimeParking() {
		for(Vehiculo v : vehiculos) {
			System.out.println(v);
			
		}
	}
	
	public String registrarEntradaVehiculo(Vehiculo v) {
		if (plazasDisponibles > 0) {
			for(PlazaAparcamiento p : plazas) {
				if (p.isLibre()) {
					v.setPlazaAparcamiento(p);
					v.setFechaEntrada(LocalDateTime.now());
					vehiculos.add(v);
					p.setLibre(false);
					plazasDisponibles--;
					return "El coche " + v.getMatricula() + " aparcado en la plaza " + p.getPlaza();
				}
			}
			
		} else {
			return "El parking está lleno";
		}
		
		return "";
	}
	
	public String registrarSalidaVehiculo(Vehiculo v) {
		boolean encontrado=false;
		Vehiculo vEncontrado = null;
		for(Vehiculo ve: vehiculos) {
			if (ve.equals(v)) {
				encontrado = true;
				vEncontrado = ve;
			}
		}
		
		if (!encontrado) {
			return "Ese coche no está en el parking";
		} else {
			long minutos = vEncontrado.calcularMinutos();
			this.saldoAcumulado+= vEncontrado.calcularImporte();
			vEncontrado.getPlazaAparcamiento().setLibre(true);
			this.plazasDisponibles++;
			this.vehiculos.remove(vEncontrado);
			return "Vehículo matrícula " + vEncontrado.getMatricula() + " entró en " + vEncontrado.getFechaEntrada() + 
					" salió a " + LocalDateTime.now() + " estando " + minutos + " costando " + vEncontrado.calcularImporte() + "€";
		}
	}

	/**
	 * @return the saldoAcumulado
	 */
	public float getSaldoAcumulado() {
		return saldoAcumulado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parking [vehiculos=");
		builder.append(vehiculos);
		builder.append(", plazas=");
		builder.append(plazas);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
