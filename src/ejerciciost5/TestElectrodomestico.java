package ejerciciost5;

import java.util.ArrayList;

public class TestElectrodomestico {

	private ArrayList<Electrodomestico> tienda;
	
	
	public TestElectrodomestico() {
		super();
		this.tienda = new ArrayList<Electrodomestico>();
	}
	
	public void addElectrodomestico(Electrodomestico elec) {
		this.tienda.add(elec);
	}	
	
		
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestElectrodomestico [=");
		builder.append("\n");
		//Recorrer todos los electrodomesticos dentro de la tienda y pintarlos uno a uno
		for(Electrodomestico e : this.tienda) {
			builder.append("     ");
			builder.append(e.toString() + e.precioFinal() + "\n");
		}
		
		builder.append("]");
		return builder.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Electrodomestico e1 = new Electrodomestico();
		Electrodomestico e2 = new Electrodomestico("Bosch", "Frigorífico 456", 450, 30);
		Electrodomestico e3 = new Electrodomestico("Bosch", "Vitro 43-A", 250, 5, 'J', "rojo");		
		Lavadora l1 = new Lavadora();
		Lavadora l2 = new Lavadora("Fagor", "Lavadora 32Plus", 500, 35, 'A', "gris", 12);		
		Television t1 = new Television();
		Television t2 = new Television("Sony", "AC8", 1500, 20, 'B', "negro", 55, "oled", "4K");
		
		TestElectrodomestico elec1 = new TestElectrodomestico();
		elec1.addElectrodomestico(e1);
		elec1.addElectrodomestico(e2);
		elec1.addElectrodomestico(e3);
		elec1.addElectrodomestico(l1);
		elec1.addElectrodomestico(l2);
		elec1.addElectrodomestico(t1);
		elec1.addElectrodomestico(t2);
		
		System.out.println(elec1);		
		
		
	}

}
