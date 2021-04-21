package poo_t8.casopracticoPStatement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import poo_t8.casopracticoPStatement.DBConnection;

public class DAOUsuario {

	
	
	/**
	 * Saca de BD el usuario con el login que se pasa como parámetro
	 * @param login
	 * @return Objeto Usuario correspondiente a ese login en BD
	 */
	public static Usuario findByLogin(String login) throws SQLException {
		
		Usuario usuario = null;
		
		// Obtenemos la conexión
		Connection con = DBConnection.getConnection();

		// Creamos el objeto para enviar sentencias
		PreparedStatement ps = con
				.prepareStatement("SELECT * FROM usuarios WHERE login = ?");
		ps.setString(1, login);

		ResultSet rs = ps.executeQuery();
		
		// Sólo hay un usuario con ese login
		if (rs.next()) {
			usuario = new Usuario(rs.getString("login"), rs.getString("password"), rs.getString("nombre"), rs.getString("apellidos"),
										rs.getString("email"), rs.getString("localidad"), rs.getString("pais"), 
										rs.getDate("fecha_nac").toLocalDate(), rs.getString("sexo"));
		}
		
		ps.close();

		return usuario;
	}
	
	/**
	 * Saca de BD todos los usuarios
	 * @return List con los usuarios de BD pasados a objetos Usuario
	 */
	public static List<Usuario> findAll() throws SQLException{
		
		List<Usuario> usuarios = new ArrayList<>();
	
		// Obtenemos la conexión
		Connection con = DBConnection.getConnection();

		// Creamos el objeto para enviar sentencias
		PreparedStatement ps = con
				.prepareStatement("SELECT * FROM usuarios");

		ResultSet rs = ps.executeQuery();
		
		// Tomamos cada usuario y lo metemos en una lista a devolver
		while (rs.next()) {
			usuarios.add(new Usuario(rs.getString("login"), rs.getString("password"), rs.getString("nombre"), rs.getString("apellidos"),
										rs.getString("email"), rs.getString("localidad"), rs.getString("pais"), 
										rs.getDate("fecha_nac").toLocalDate(), rs.getString("sexo")));
		}
			
		ps.close();
		
		return usuarios;
	}
	
	public static void insert(Usuario u) throws SQLException {
		
		// Obtenemos la conexión
		Connection con = DBConnection.getConnection();

		// Creamos el objeto para enviar sentencias
		PreparedStatement ps = con
				.prepareStatement("INSERT INTO usuarios (login,password,nombre,apellidos,email,localidad,pais,fecha_nac,sexo) VALUES (?,?,?,?,?,?,?,?,?)");
		ps.setString(1, u.getLogin());
		ps.setString(2, u.getPassword());
		ps.setString(3, u.getNombre());
		ps.setString(4, u.getApellidos());
		ps.setString(5, u.getEmail());
		ps.setString(6, u.getLocalidad());
		ps.setString(7, u.getPais());
		ps.setDate(8, Date.valueOf(u.getFecha_nac())); //LocalDate to Date
		ps.setString(9, u.getSexo());
		ps.executeUpdate();
		
		ps.close();
	}
	
	public static void update(String login, Usuario modif) throws SQLException {
		
		// Obtenemos la conexión
		Connection con = DBConnection.getConnection();

		// Creamos el objeto para enviar sentencias
		PreparedStatement ps = con
				.prepareStatement("UPDATE usuarios SET password=?,nombre=?,apellidos=?,email=?,localidad=?,pais=?,fecha_nac=?,sexo=? "
						+ "	WHERE login=?");
		ps.setString(1, modif.getPassword());
		ps.setString(2, modif.getNombre());
		ps.setString(3, modif.getApellidos());
		ps.setString(4, modif.getEmail());
		ps.setString(5, modif.getLocalidad());
		ps.setString(6, modif.getPais());
		ps.setDate(7, Date.valueOf(modif.getFecha_nac())); //LocalDate to Date
		ps.setString(8, modif.getSexo());
		ps.setString(9, login);

		ps.executeUpdate();
		
		ps.close();
	}
	
	public static void delete(String login) throws SQLException {
		
		// Obtenemos la conexión
		Connection con = DBConnection.getConnection();

		// Creamos el objeto para enviar sentencias
		PreparedStatement ps = con
				.prepareStatement("DELETE FROM usuarios WHERE login = ?");
		ps.setString(1, login);

		ps.executeUpdate();
		
		ps.close();
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
