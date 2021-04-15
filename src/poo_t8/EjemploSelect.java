package poo_t8;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import poo_t8.DBConnection;

/**
 * @author Openwebinars
 *
 */
public class EjemploSelect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Connection con = null;

		try {

			// Obtenemos la conexión
			con = DBConnection.getConnection();

			// Creamos el objeto para enviar sentencias
			Statement st = con.createStatement();

			// Enviamos una sentencia para rescatar todos los datos de una tabla
			ResultSet rs = st.executeQuery("SELECT * FROM clientes");

			while (rs.next()) {
				String nombre = rs.getString("nombre"); //equivalente a rs.getString(1);
				String direccion = rs.getString("direccion"); // equivalente a rs.getString(2);
				String localidad = rs.getString("localidad"); // equivalente a rs.getString(3);			
				String movil = rs.getString("movil");
				
				System.out.printf("%s %s %s %s %n", nombre, direccion, localidad, movil);
			}
			
			// Cerramos ResultSet y Statement
			rs.close();
			st.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close(); //Si otro programa necesita conexión la creará
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

}