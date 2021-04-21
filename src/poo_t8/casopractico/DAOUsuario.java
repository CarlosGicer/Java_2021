package poo_t8.casopractico;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import poo_t8.casopractico.DBConnection;

public class DAOUsuario {

	
	
	/**
	 * Saca de BD el usuario con el login que se pasa como parámetro
	 * @param login
	 * @return Objeto Usuario correspondiente a ese login en BD
	 */
	public static Usuario findByLogin(String login) throws SQLException {
		
		Usuario usuario = null;
		
		JdbcRowSet rowSet = DBConnection.getConnection();
		
		rowSet.setCommand("SELECT * FROM usuarios WHERE login = ?");
		rowSet.setString(1, login);
		rowSet.execute();
		
		// Sólo hay un usuario con ese login
		if (rowSet.next()) {
			usuario = new Usuario(rowSet.getString("login"), rowSet.getString("password"), rowSet.getString("nombre"), rowSet.getString("apellidos"),
										rowSet.getString("email"), rowSet.getString("localidad"), rowSet.getString("pais"), 
										rowSet.getDate("fecha_nac").toLocalDate(), rowSet.getString("sexo"));
		}

		return usuario;
	}
	
	/**
	 * Saca de BD todos los usuarios
	 * @return List con los usuarios de BD pasados a objetos Usuario
	 */
	public static List<Usuario> findAll() throws SQLException{
		
		List<Usuario> usuarios = new ArrayList<>();
	
		JdbcRowSet rowSet = DBConnection.getConnection();
		
		rowSet.setCommand("SELECT * FROM usuarios");
		rowSet.execute();
		
		// Tomamos cada usuario y lo metemos en una lista a devolver
		while (rowSet.next()) {
			usuarios.add(new Usuario(rowSet.getString("login"), rowSet.getString("password"), rowSet.getString("nombre"), rowSet.getString("apellidos"),
										rowSet.getString("email"), rowSet.getString("localidad"), rowSet.getString("pais"), 
										rowSet.getDate("fecha_nac").toLocalDate(), rowSet.getString("sexo")));
		}
			
		return usuarios;
	}
	
	public static void insert(Usuario u) throws SQLException {
		
		JdbcRowSet rowSet = DBConnection.getConnection();
		
		// Insertamos un nuevo registro. Funciona si el RowSet sigue abierto
		rowSet.moveToInsertRow();
		rowSet.updateString("login", u.getLogin());
		rowSet.updateString("password", u.getPassword());
		rowSet.updateString("nombre", u.getNombre());
		rowSet.updateString("apellidos", u.getApellidos());
		rowSet.updateString("email", u.getEmail());
		rowSet.updateString("localidad", u.getLocalidad());
		rowSet.updateString("pais", u.getPais());
		rowSet.updateDate("fecha_nac", Date.valueOf(u.getFecha_nac())); //LocalDate to Date
		rowSet.updateString("sexo", u.getSexo());
		
		rowSet.insertRow();
	}
	
	public static void update(String login, Usuario modif) throws SQLException {
		
		JdbcRowSet rowSet = DBConnection.getConnection();
		
		//En un GridLayout esto no sería necesario, bastaría con actualizar la posición de la fila que estamos pinchando
		//El rowset se colocaría en la fila que queremos actualizar y se cambiaría
		rowSet.setCommand("SELECT * FROM usuarios WHERE login = ?");
		rowSet.setString(1, login);
		rowSet.execute();		
		rowSet.first();
		
		// Modificamos el registro resultado de la consulta por login anterior
		rowSet.updateString("password", modif.getPassword());
		rowSet.updateString("nombre", modif.getNombre());
		rowSet.updateString("apellidos", modif.getApellidos());
		rowSet.updateString("email", modif.getEmail());
		rowSet.updateString("localidad", modif.getLocalidad());
		rowSet.updateString("pais", modif.getPais());
		rowSet.updateDate("fecha_nac", Date.valueOf(modif.getFecha_nac())); //LocalDate to Date
		rowSet.updateString("sexo", modif.getSexo());
		
		rowSet.updateRow();
	}
	
	public static void delete(String login) throws SQLException {
		
		JdbcRowSet rowSet = DBConnection.getConnection();
		
		//En un GridLayout esto no sería necesario, bastaría con actualizar la posición de la fila que estamos pinchando
		//El rowset se colocaría en la fila que queremos borrar y se cambiaría
		rowSet.setCommand("SELECT * FROM usuarios WHERE login = ?");
		rowSet.setString(1, login);
		rowSet.execute();	
		rowSet.first();
		
		rowSet.deleteRow();
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(DAOUsuario.findByLogin("jj7"));
			Usuario u = new Usuario("manolo99","1234","Raúl","Sánchez","raul@gmail.com", "Murcia", "España", LocalDate.of(1984, 5, 28), "m");
			DAOUsuario.update("rasa", new Usuario("rumba", "12345678", "Raúl", "Guillén", "rgb@gmx.com", "Vera", "España", LocalDate.of(1984, 5, 28), "m" ));
			System.out.println(DAOUsuario.findAll());
			DAOUsuario.insert(u);
			DAOUsuario.delete("manolo99");
		} catch (SQLException e) {
			System.out.println("Error en BD: ");
			e.printStackTrace();
		}
		
	}
	
	
}
