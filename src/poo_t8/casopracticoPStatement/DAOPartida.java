package poo_t8.casopracticoPStatement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import poo_t8.casopracticoPStatement.DBConnection;
import poo_t8.casopracticoPStatement.Partida.Estado;
import poo_t8.casopracticoPStatement.Partida.Nivel;

public class DAOPartida {

	
	
	/**
	 * Saca de BD el la partida con el id que se pasa como parámetro
	 * @param login
	 * @return Objeto Partida correspondiente a ese id en BD
	 */
	public static Partida findById(int id) throws SQLException {
		
		Partida partida = null;
		
		// Obtenemos la conexión
		Connection con = DBConnection.getConnection();

		// Creamos el objeto para enviar sentencias
		PreparedStatement ps = con
				.prepareStatement("SELECT * FROM partidas WHERE id = ?");
		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();
		
		if (rs.next()) {
			partida = new Partida(rs.getString("nombre"), Estado.valueOf(rs.getString("estado")), rs.getTimestamp("fecha_inicio").toLocalDateTime(), 
								Nivel.valueOf(rs.getString("nivel")), rs.getInt("max_jugadores"));
			partida.setId(id);
		}
		
		ps.close();
		
		//Sacamos los jugadores de esa partida
		TreeSet<Usuario> jugadores = DAOPartida.getJugadoresPartida(id);
		partida.setJugadores(jugadores);
		
		return partida;
	}
	
	/**
	 * Saca de BD todas las partidas
	 * @return List con las partidas
	 */
	public static List<Partida> findAll() throws SQLException{
		
		List<Partida> partidas = new ArrayList<>();
	
		// Obtenemos la conexión
		Connection con = DBConnection.getConnection();

		// Creamos el objeto para enviar sentencias
		PreparedStatement ps = con
				.prepareStatement("SELECT * FROM partidas");

		ResultSet rs = ps.executeQuery();
	
		// Tomamos cada usuario y lo metemos en una lista a devolver
		while (rs.next()) {
			Partida partida = new Partida(rs.getString("nombre"), Estado.valueOf(rs.getString("estado")), rs.getTimestamp("fecha_inicio").toLocalDateTime(), 
					Nivel.valueOf(rs.getString("nivel")), rs.getInt("max_jugadores"));
			partida.setId(rs.getInt("id"));
			
			//Añadimos la partida
			partidas.add(partida);
		}
		
		ps.close();
		
		//Para cada partida metemos sus jugadores. Los rowset deben estar separados, si no falla
		for(Partida p: partidas) {
			//Sacamos los jugadores de esa partida
			TreeSet<Usuario> jugadores = DAOPartida.getJugadoresPartida(p.getId());
			p.setJugadores(jugadores);
		}
		
		return partidas;
	}
	
	public static void insert(Partida p) throws SQLException {
		
		// Obtenemos la conexión
		Connection con = DBConnection.getConnection();

		// Creamos el objeto para enviar sentencias
		PreparedStatement ps = con
				.prepareStatement("INSERT INTO partidas (nombre,estado,fecha_inicio,nivel,max_jugadores) VALUES (?,?,?,?,?)");
		ps.setString(1, p.getNombre());
		ps.setString(2, p.getEstado().toString());
		ps.setTimestamp(3, Timestamp.valueOf(p.getFecha_inicio())); //LocalDateTime to Timestamp
		ps.setString(4, p.getNivel().toString());
		ps.setInt(5, p.getMax_jugadores());
		ps.executeUpdate();

		ps.close();
		
		//No añadimos los posibles jugadores, para eso usar el método correspondiente de añadir jugador a partida, y mostrar partida
	}
	
	public static void update(int id, Partida p) throws SQLException {
		
		// Obtenemos la conexión
		Connection con = DBConnection.getConnection();

		// Creamos el objeto para enviar sentencias
		PreparedStatement ps = con
				.prepareStatement("UPDATE partidas SET nombre=?,estado=?,fecha_inicio=?,nivel=?,max_jugadores=? WHERE id=?");
		ps.setString(1, p.getNombre());
		ps.setString(2, p.getEstado().toString());
		ps.setTimestamp(3, Timestamp.valueOf(p.getFecha_inicio())); //LocalDateTime to Timestamp
		ps.setString(4, p.getNivel().toString());
		ps.setInt(5, p.getMax_jugadores());
		ps.setInt(6, id);
		ps.executeUpdate();
		
		ps.close();
	}
	
	public static void delete(int id) throws SQLException {
		
		// Obtenemos la conexión
		Connection con = DBConnection.getConnection();

		// Creamos el objeto para enviar sentencias
		PreparedStatement ps = con
				.prepareStatement("DELETE FROM partidas WHERE id = ?");
		ps.setInt(1, id);

		ps.executeUpdate();
		
		ps.close();
	}
	
	
	/**
	 * Obtiene un TreeSet con los Usuarios que participan en una partida pasada como parámetro
	 * Usa la tabla pivote 'unen' para obtener los jugadores
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public static TreeSet<Usuario> getJugadoresPartida(int id) throws SQLException {
		TreeSet<Usuario> jugadores = new TreeSet<Usuario>();
		
		//"SELECT * FROM unen INNER JOIN usuarios ON unen.codigo_usuario = usuarios.login WHERE unen.codigo_partida = ?;"
		// Obtenemos la conexión
		Connection con = DBConnection.getConnection();

		// Creamos el objeto para enviar sentencias
		PreparedStatement ps = con
				.prepareStatement("SELECT * FROM unen INNER JOIN usuarios ON unen.codigo_usuario = usuarios.login WHERE unen.codigo_partida = ?");
		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();
		
		String login;
		Usuario usuario;
		
		while (rs.next()) {
			login = rs.getString("codigo_usuario");			
			usuario = new Usuario(rs.getString("login"), rs.getString("password"), rs.getString("nombre"), rs.getString("apellidos"),
					rs.getString("email"), rs.getString("localidad"), rs.getString("pais"), 
					rs.getDate("fecha_nac").toLocalDate(), rs.getString("sexo"));
			
			boolean resul = jugadores.add(usuario);
		}
		
		ps.close();

		return jugadores;		
	}
	
	/**
	 * Añade un jugador a una partida. Se inserta en la tabla 'unen'
	 * @param idPartida - Partida donde va a unirse el jugador
	 * @param login - Login del usuario que se va a unir a la partida
	 */
	public static void inscribirUsuario(int idPartida, String login) throws SQLException {
		Connection con = DBConnection.getConnection();

		// Creamos el objeto para enviar sentencias
		PreparedStatement ps = con
				.prepareStatement("INSERT INTO unen (codigo_partida,codigo_usuario) VALUES (?,?)");

		ps.setString(2, login);
		ps.setInt(1, idPartida);
		
		ps.executeUpdate();
		
		ps.close();
	}
	
	
	public static void desinscribirJugador(int idPartida, String login) throws SQLException {
		
		// Obtenemos la conexión
		Connection con = DBConnection.getConnection();

		// Creamos el objeto para enviar sentencias
		PreparedStatement ps = con
				.prepareStatement("DELETE FROM unen WHERE codigo_partida = ? and codigo_usuario = ?");
		ps.setString(2, login);
		ps.setInt(1, idPartida);

		ps.executeUpdate();
		
		ps.close();
	}

	
	public static void main(String[] args) {
		try {
			System.out.println(DAOPartida.findById(1));
			DAOPartida.update(1, new Partida("Otra", Estado.ABIERTA, LocalDateTime.now(), Nivel.MEDIO, 10));
			//DAOPartida.insert(new Partida("Caña", Estado.ABIERTA, LocalDateTime.now(), Nivel.ALTO, 10));
			//DAOPartida.delete(4);
			//DAOPartida.insert(new Partida("Caña", Estado.ABIERTA, LocalDateTime.now(), Nivel.ALTO, 10));
		    System.out.println(DAOPartida.findById(5));
		    System.out.println("--------------");
		    System.out.println(DAOPartida.findAll());
		    
		    DAOPartida.inscribirUsuario(12, "r4ul");
		    DAOPartida.inscribirUsuario(12, "raul84");
		    DAOPartida.inscribirUsuario(12, "manolo");
		    DAOPartida.desinscribirJugador(12, "manolo");
		    System.out.println(DAOPartida.findById(12));
		} catch (SQLException e) {
			System.out.println("Error en BD: ");
			e.printStackTrace();
		}
		
	}
	
	
}
