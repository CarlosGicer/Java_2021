package ejerciciost6.series;

import java.util.ArrayList;

public class Ejecutable {

	public static void main(String[] args) {
		
		ArrayList<Series> series = new ArrayList<Series>(3);
		ArrayList<Videojuego> vjuegos = new ArrayList<Videojuego>(3);
		
		series.add(new Series("Breaking Bad", "Fulanito"));
		series.add(new Series("Antidisturbios", "Sorogoyen"));
		series.add(new Series("The Witcher", "Otro tipo"));
		
		vjuegos.add(new Videojuego("Cyberpunk 2077",100));
		vjuegos.add(new Videojuego("The Witcher", 150));
		vjuegos.add(new Videojuego("Red dead redemption 2", 200));
		
		series.get(1).entregar();
		vjuegos.get(2).entregar();
		
		for(Series s : series) {
			System.out.println(s);
		}
		
		for(Videojuego v : vjuegos) {
			System.out.println(v);
		}
		
		
		//VERSIÓN CON POLIMORFISMO DE INTERFACES
		ArrayList<Multimedia> cosas = new ArrayList<Multimedia>();
		cosas.add(new Series("Breaking Bad", "Fulanito"));
		cosas.add(new Series("Antidisturbios", "Sorogoyen"));
		cosas.add(new Series("The Witcher", "Otro tipo"));
		cosas.add(new Videojuego("Cyberpunk 2077",100));
		cosas.add(new Videojuego("The Witcher", 150));
		cosas.add(new Videojuego("Red dead redemption 2", 200));
		
		((Entregable) cosas.get(1)).entregar();
		((Entregable) cosas.get(4)).entregar();
		((Entregable) cosas.get(1)).entregar();
		((Entregable) cosas.get(5)).devolver();
		
		for(Multimedia e : cosas) {
			System.out.println(e);
			
			if (e instanceof Series) {
				System.out.println(((Series) e).getNumTemporadas());
			}
		}
		
		
		
		
		
		

	}

}
