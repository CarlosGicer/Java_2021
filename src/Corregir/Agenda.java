package Corregir;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contacto> contactos;

	/**
	 * 
	 */
	public Agenda() {
		
		this.contactos= new ArrayList<Contacto>(10);
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Agenda [contactos=");
		builder.append(this.listarContactos());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contactos == null) ? 0 : contactos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Agenda other = (Agenda) obj;
		if (contactos == null) {
			if (other.contactos != null) {
				return false;
			}
		} else if (!contactos.equals(other.contactos)) {
			return false;
		}
		return true;
	}
	
	public boolean existeContacto(Contacto unContacto ) {
		
		boolean existe=false;
		
		for(int i=0; i<this.contactos.size(); i++) {
			if(this.contactos.get(i).equals(unContacto))
				existe=true;
			else 
				existe=false;
		}
		return existe;
	}
	
	public boolean agendaLlena() {
	
		return true;
	}
	
	public boolean huecosLibres() {
		return true;
	}
	
	public boolean addContacto(String nombre, int telefono ) {
		 	
			//Variable auxiliar que contendrá la referencia a cada contacto nuevo.
			Contacto aux = new Contacto();
			
			//se asignan valores a los atributos del nuevo objeto
			aux.setNombre(nombre);
			aux.setTelef(telefono);
			if(!existeContacto(aux)) {
			//se añade el objeto al final del array
				this.contactos.add(aux);
				return true;
			}else {
				return false;
			}
		
	}
	
	public boolean buscarContacto(String Nombre) {
		
		
			return true;
			
	}
	
	public String listarContactos() {
		StringBuilder builder = new StringBuilder();
		for(Contacto i : this.contactos) {
			builder.append(i);
			builder.append("\n");
		}		
		return builder.toString();
	}
	
	public boolean eliminarContacto(Contacto unContacto) {
		
		boolean existe=false;
		
		for(int i=0; i<this.contactos.size(); i++) {
			if(this.contactos.get(i).equals(unContacto)) {
				this.contactos.remove(i);
				existe=true;
			}else {
				existe=false;
			}
		}
		return existe;
	
		
	}
	
	
	
}
