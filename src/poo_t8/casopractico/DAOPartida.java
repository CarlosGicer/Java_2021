package poo_t8.casopractico;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import poo_t8.casopractico.DBConnection;
import poo_t8.casopractico.Partida.Estado;
import poo_t8.casopractico.Partida.Nivel;

public class DAOPartida {

	
	
	/**
	 * Saca de BD el la partida con el id que se pasa como parámetro
	 * @param login
	 * @return Objeto Partida correspondiente a ese id en BD
	 */
	public static Partida findById(int id) throws SQLException {
		
		Partida partida = null;
		
		JdbcRowSet rowSet = DBConnection.getConnection();
		
		rowSet.setCommand("SELECT * FROM partidas WHERE id = ?");
		rowSet.setInt(1, id);
		rowSet.execute();
		
		if (rowSet.next()) {
			partida = new Partida(rowSet.getString("nombre"), Estado.valueOf(rowSet.getString("estado")), rowSet.getTimestamp("fecha_inicio").toLocalDateTime(), 
								Nivel.valueOf(rowSet.getString("nivel")), rowSet.getInt("max_jugadores"));
			partida.setId(id);
		}

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
	
		JdbcRowSet rowSet = DBConnection.getConnection();
		
		rowSet.setCommand("SELECT * FROM partidas");
		rowSet.execute();
		
		// Tomamos cada usuario y lo metemos en una lista a devolver
		while (rowSet.next()) {
			Partida partida = new Partida(rowSet.getString("nombre"), Estado.valueOf(rowSet.getString("estado")), rowSet.getTimestamp("fecha_inicio").toLocalDateTime(), 
					Nivel.valueOf(rowSet.getString("nivel")), rowSet.getInt("max_jugadores"));
			partida.setId(rowSet.getInt("id"));
			
			//Añadimos la partida
			partidas.add(partida);
		}
			
		//Para cada partida metemos sus jugadores. Los rowset deben estar separados, si no falla
		for(Partida p: partidas) {
			//Sacamos los jugadores de esa partida
			TreeSet<Usuario> jugadores = DAOPartida.getJugadoresPartida(p.getId());
			p.setJugadores(jugadores);
		}
		
		return partidas;
	}
	
	public static void insert(Partida p) throws SQLException {
		
		JdbcRowSet rowSet = DBConnection.getConnection();
		
		//En un GridLayout esto no sería necesario, bastaría con insertar al final de la tabla
		rowSet.setCommand("SELECT * FROM partidas");
		rowSet.execute();		

		// Insertamos un nuevo registro. Funciona si el RowSet sigue abierto
		rowSet.moveToInsertRow();

		rowSet.updateString("nombre", p.getNombre());
		rowSet.updateString("estado", p.getEstado().toString());
		rowSet.updateTimestamp("fecha_inicio", Timestamp.valueOf(p.getFecha_inicio())); //LocalDateTime to Timestamp
		rowSet.updateString("nivel", p.getNivel().toString());
		rowSet.updateInt("max_jugadores", p.getMax_jugadores());
		
		//No añadimos los posibles jugadores, para eso usar el método correspondiente de añadir jugador a partida, y mostrar partida
		
		rowSet.insertRow();
	}
	
	public static void update(int id, Partida p) throws SQLException {
		
		JdbcRowSet rowSet = DBConnection.getConnection();
		
		//En un GridLayout esto no sería necesario, bastaría con actualizar la posición de la fila que estamos pinchando
		//El rowset se colocaría en la fila que queremos actualizar y se cambiaría
		rowSet.setCommand("SELECT * FROM partidas WHERE id = ?");
		rowSet.setInt(1, id);
		rowSet.execute();	
		
		if (rowSet.first()) {
			// Modificamos el registro resultado de la consulta por login anterior
			rowSet.updateString("nombre", p.getNombre());
			rowSet.updateString("estado", p.getEstado().toString());
			rowSet.updateTimestamp("fecha_inicio", Timestamp.valueOf(p.getFecha_inicio())); //LocalDateTime to Timestamp
			rowSet.updateString("nivel", p.getNivel().toString());
			rowSet.updateInt("max_jugadores", p.getMax_jugadores());
			
			rowSet.updateRow();
		}
	}
	
	public static void delete(int id) throws SQLException {
		
		JdbcRowSet rowSet = DBConnection.getConnection();
		
		//En un GridLayout esto no sería necesario, bastaría con actualizar la posición de la fila que estamos pinchando
		//El rowset se colocaría en la fila que queremos borrar y se cambiaría
		rowSet.setCommand("SELECT * FROM partidas WHERE id = ?");
		rowSet.setInt(1, id);
		rowSet.execute();	
		
		if (rowSet.first())
			rowSet.deleteRow();
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
		
		JdbcRowSet rowSet = DBConnection.getConnection();
		
		rowSet.setCommand("SELECT * FROM unen INNER JOIN usuarios ON unen.codigo_usuario = usuarios.login WHERE unen.codigo_partida = ?;");
		rowSet.setInt(1, id);
		rowSet.execute();
		
		String login;
		Usuario usuario;
		
		while (rowSet.next()) {
			login = rowSet.getString("codigo_usuario");			
			usuario = new Usuario(rowSet.getString("login"), rowSet.getString("password"), rowSet.getString("nombre"), rowSet.getString("apellidos"),
					rowSet.getString("email"), rowSet.getString("localidad"), rowSet.getString("pais"), 
					rowSet.getDate("fecha_nac").toLocalDate(), rowSet.getString("sexo"));
			
			boolean resul = jugadores.add(usuario);
		}

		return jugadores;		
	}
	
	/**
	 * Añade un jugador a una partida. Se inserta en la tabla 'unen'
	 * @param idPartida - Partida donde va a unirse el jugador
	 * @param login - Login del usuario que se va a unir a la partida
	 */
	public static void inscribirUsuario(int idPartida, String login) throws SQLException {
		JdbcRowSet rowSet = DBConnection.getConnection();
		
		//En un GridLayout esto no sería necesario, bastaría con insertar al final de la tabla
		rowSet.setCommand("SELECT * FROM unen");
		rowSet.execute();		

		// Insertamos un nuevo registro. Funciona si el RowSet sigue abierto
		rowSet.moveToInsertRow();

		rowSet.updateString("codigo_usuario", login);
		rowSet.updateInt("codigo_partida", idPartida);
		
		rowSet.insertRow();		
	}
	
	
	public static void desinscribirJugador(int idPartida, String login) throws SQLException {
		
		JdbcRowSet rowSet = DBConnection.getConnection();
		
		//En un GridLayout esto no sería necesario, bastaría con actualizar la posición de la fila que estamos pinchando
		//El rowset se colocaría en la fila que queremos borrar y se cambiaría
		rowSet.setCommand("SELECT * FROM unen WHERE codigo_partida = ? and codigo_usuario = ?");
		rowSet.setInt(1, idPartida);
		rowSet.setString(2, login);
		rowSet.execute();	
		
		if (rowSet.first())
			rowSet.deleteRow();
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
		    
		    //DAOPartida.inscribirUsuario(14, "r4ul");
		    //DAOPartida.inscribirUsuario(14, "raul84");
		    //DAOPartida.inscribirUsuario(14, "manolo");
		    DAOPartida.desinscribirJugador(14, "manolo");
		    System.out.println(DAOPartida.findById(14));
		} catch (SQLException e) {
			System.out.println("Error en BD: ");
			e.printStackTrace();
		}
		
	}
	
	
}
