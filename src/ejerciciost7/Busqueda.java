package ejerciciost7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ejerciciost7.tienda.Producto;

public class Busqueda {

	private List<Producto> carrito;
	
	public Busqueda() {
		 carrito = new ArrayList<>();
	}
	
	public void nuevoProducto(Producto p) {
		carrito.add(p);
	}

	public List<Producto> getCarrito() {
		return carrito;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Busqueda [carrito=");
		for(Producto p: carrito) {
			builder.append(p);
			builder.append(System.getProperty("line.separator"));
		}
		builder.append("]");
		return builder.toString();
	}
	
	public Producto busqueda(String nombre) {
		for(Producto p : carrito) {
			if (p.equals(new Producto(nombre,"",1000,1.21))) {
				return p;
			}
		}
		
		return null;
	}
	
	public Producto busquedaBinaria(String nombre) {
		Collections.sort(carrito); //Ordena la lista
		int posicion = Collections.binarySearch(carrito,new Producto(nombre,"",1000,1.21));
		if (posicion >= 0) { //Encontrado
			return carrito.get(posicion);
		} else
			return null;
	}
	
	public static void main(String[] args) {
		Busqueda bus = new Busqueda();
		bus.nuevoProducto(new Producto("Samsung Galaxy S16", "Buen móvil", 1000, 1.21));
		bus.nuevoProducto(new Producto("Samsung Galaxy S12", "Buen móvil", 1000, 1.21));
		bus.nuevoProducto(new Producto("Samsung Galaxy S17", "Buen móvil", 1000, 1.21));
		bus.nuevoProducto(new Producto("Samsung Galaxy S14", "Buen móvil", 1000, 1.21));
		bus.nuevoProducto(new Producto("Samsung Galaxy S15", "Buen móvil", 1000, 1.21));
		
		Collections.sort(bus.getCarrito());
		
		System.out.println(bus);
		//System.out.println(bus.busqueda("Samsung Galaxy S14"));
		//System.out.println(bus.busquedaBinaria("Samsung Galaxy S14"));
	}
	
	

}
