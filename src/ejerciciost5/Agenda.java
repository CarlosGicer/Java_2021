/**
 * 
 */
package ejerciciost5;

import java.util.ArrayList;

/**
 * @author alumno
 *
 */
public class Agenda {
	/**
	 * Atributos
	 */
	private ArrayList<Contacto> agenda;
	private static final int maximo=10;
	
	/**
	 * Constructor
	 */
	public Agenda() {
		agenda = new ArrayList<Contacto>(Agenda.maximo);
	}
	
	
	public boolean existeContacto(Contacto c) {
		for(int i=0; i<agenda.size(); i++) {
			if(agenda.get(i).equals(c)) { //Comparo el nombre
				return true;
			}
		}
		return false;
	}
	
	public boolean agendaLlena() {
		if (agenda.size() >= Agenda.maximo)
			return true;
		
		return false;
	}
	
	public boolean addContacto(Contacto c) {
		if(!agendaLlena()) { //Si la agenda no está llena
			if(!existeContacto(c)) { //Y no está ya el contacto dentro
				agenda.add(c);
				return true;
			}
		}
		
		return false;
	}
	
	public int huecosLibres() {
		return (Agenda.maximo - agenda.size());
	}
	
	public String listarContactos() {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<agenda.size(); i++) {
			sb.append(agenda.get(i)+"\n");
		}
		return sb.toString();
	}
	
	public Agenda buscarContacto(String nombre) {
		Agenda ag = new Agenda();
		for(int i=0; i<agenda.size(); i++) {
			if(agenda.get(i).getNombre().toLowerCase().indexOf(nombre.toLowerCase()) >= 0)  {
				 ag.addContacto(agenda.get(i));
			}
		}
		return ag;
	}
	
	public boolean eliminarContacto(Contacto c) {
		for(int i=0; i<agenda.size(); i++) {
			if(agenda.get(i).equals(c)) {
				agenda.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	public boolean estaVacia() {
		if (agenda.size() == 0)
			return true;
		else 
			return false;
	}
}