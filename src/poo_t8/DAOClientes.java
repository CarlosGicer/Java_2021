/**
 * EJEMPLO DE IMPLEMENTACIÓN DEL PATRÓN DAO CON LA TABLA CLIENTES OFRECEMOS LOS MÉTODOS 
 * 
 * - insert
 * - findAll
 * - findByPk
 * - update
 * - delete
 * 
 * TAMBIÉN IMPLEMENTAMOS EL PATRÓN SINGLETON
 * 
 */

package poo_t8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import poo_t8.DBConnection;

/**
 * @author Openwebinars
 *
 */
public class DAOClientes {

	/*
	 * PROPIEDADES Y MÉTODOS SINGLETON
	 */

	private Connection con = null;

	private static DAOClientes instance = null;

	private DAOClientes() throws SQLException {
		con = DBConnection.getConnection();
	}

	public static DAOClientes getInstance() throws SQLException {
		if (instance == null)
			instance = new DAOClientes();

		return instance;
	}

	/*
	 * MÉTODOS PROPIOS DE LA CLASE DAO
	 */

	public void insert(Cliente e) throws SQLException {

		PreparedStatement ps = con.prepareStatement(
				"INSERT INTO clientes (nombre, direccion, localidad, movil, dni) VALUES (?, ?, ?, ?, ?)");
		ps.setString(1, e.getNombre());
		ps.setString(2, e.getDireccion());
		ps.setString(3, e.getLocalidad());
		ps.setString(4, e.getMovil());
		ps.setString(5, e.getDni());

		ps.executeUpdate();

		ps.close();

	}

	public List<Cliente> findAll() throws SQLException {

		PreparedStatement ps = con.prepareStatement("SELECT * FROM clientes");
		ResultSet rs = ps.executeQuery();

		List<Cliente> result = null;

		while (rs.next()) {
			if (result == null)
				result = new ArrayList<>();

			result.add(new Cliente(rs.getInt("id"), rs.getString("nombre"), rs.getString("direccion"), 
						rs.getString("localidad"), rs.getString("movil"), rs.getString("dni")));
		}

		rs.close();
		ps.close();

		return result;
	}

	public Cliente findByPk(int id) throws SQLException {

		PreparedStatement ps = con.prepareStatement("SELECT * FROM clientes WHERE id = ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();

		Cliente result = null;

		if (rs.next()) {
			result = new Cliente(rs.getInt("id"), rs.getString("nombre"), rs.getString("direccion"), rs.getString("localidad"),
					rs.getString("movil"), rs.getString("dni"));
		}

		rs.close();
		ps.close();

		return result;

	}

	public void delete(Cliente e) throws SQLException {
		delete(e.getId());
	}
	
	public void delete(int id) throws SQLException {
		
		if (id <= 0)
			return;
		
		PreparedStatement ps = con.prepareStatement("DELETE FROM clientes WHERE id = ?");
		ps.setInt(1, id);

		ps.executeUpdate();

		ps.close();
	}

	public void update(Cliente e) throws SQLException {

		if (e.getId() == 0)
			return;

		PreparedStatement ps = con.prepareStatement(
				"UPDATE clientes SET nombre = ?, direccion = ?, localidad = ?, movil = ?, dni = ?  WHERE id = ?");
		
		
		ps.setString(1, e.getNombre());
		ps.setString(2, e.getDireccion());
		ps.setString(3, e.getLocalidad());
		ps.setString(4, e.getMovil());
		ps.setString(5, e.getDni());
		ps.setInt(6, e.getId());
		
		ps.executeUpdate();
		
		ps.close();

	}

}