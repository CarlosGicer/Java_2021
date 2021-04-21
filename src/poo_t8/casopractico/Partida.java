package poo_t8.casopractico;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.TreeSet;

public class Partida {
	
	public enum Estado { ABIERTA, CERRADA };
	public enum Nivel { PROFESIONAL, ALTO, MEDIO, BAJO, PRINCIPIANTE };
	
	private int id;
	private String nombre;
	private Estado estado;
	private LocalDateTime fecha_inicio;
	private Nivel nivel;
	private int max_jugadores;
	private TreeSet<Usuario> jugadores;
	
	/**
	 * @param nombre
	 * @param estado
	 * @param fecha_inicio
	 * @param nivel
	 * @param max_jugadores
	 */
	public Partida(String nombre, Estado estado, LocalDateTime fecha_inicio, Nivel nivel, int max_jugadores) {
		super();
		this.nombre = nombre;
		this.estado = estado;
		this.fecha_inicio = fecha_inicio;
		this.nivel = nivel;
		this.max_jugadores = max_jugadores;
		this.jugadores = new TreeSet<>();
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the estado
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	/**
	 * @return the fecha_inicio
	 */
	public LocalDateTime getFecha_inicio() {
		return fecha_inicio;
	}

	/**
	 * @param fecha_inicio the fecha_inicio to set
	 */
	public void setFecha_inicio(LocalDateTime fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	/**
	 * @return the nivel
	 */
	public Nivel getNivel() {
		return nivel;
	}

	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	/**
	 * @return the max_jugadores
	 */
	public int getMax_jugadores() {
		return max_jugadores;
	}

	/**
	 * @param max_jugadores the max_jugadores to set
	 */
	public void setMax_jugadores(int max_jugadores) {
		this.max_jugadores = max_jugadores;
	}

	/**
	 * @return the jugadores
	 */
	public TreeSet<Usuario> getJugadores() {
		return jugadores;
	}

	/**
	 * @param jugadores the jugadores to set
	 */
	public void setJugadores(TreeSet<Usuario> jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Partida [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", fecha_inicio=");
		builder.append(fecha_inicio);
		builder.append(", nivel=");
		builder.append(nivel);
		builder.append(", max_jugadores=");
		builder.append(max_jugadores);
		builder.append(System.getProperty("line.separator"));
		for(Usuario u: jugadores) {
			builder.append(u.getLogin() + ", ");
		}
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Partida))
			return false;
		Partida other = (Partida) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	private void addJugador(Usuario u) {
		jugadores.add(u);
	}

	

	
	
	

}
