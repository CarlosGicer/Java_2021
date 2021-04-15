package poo_t8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import poo_t8.DBConnection;

/**
 * @author Openwebinars
 *
 */
public class EjemploPreparedStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection con = null;

		try {

			// Obtenemos la conexión
			con = DBConnection.getConnection();

			// Creamos el objeto para enviar sentencias
			PreparedStatement ps = con
					.prepareStatement("SELECT * FROM incidencias WHERE estado = ? ORDER BY ciudad");
			ps.setString(1, "enproceso");

			// Ejecutamos la sentencia y recogemos
			// datos de la consulta
			ResultSet rs = ps.executeQuery();

			// El procesamiento se hace igual que en el ejemplo anterior			
			while (rs.next()) {
				int id = rs.getInt("id");
				String latitud = rs.getString("latitud"); //equivalente a rs.getString(1);
				String longitud = rs.getString("longitud"); // equivalente a rs.getString(2);
				String ciudad = rs.getString("ciudad"); // equivalente a rs.getString(3);			
				String direccion = rs.getString("direccion");
				String descripcion = rs.getString("descripcion");
				
				System.out.printf("Incidencia %d -> %s %s %s %s %n", id, latitud, longitud, ciudad, direccion, descripcion);
			}

			// Cerramos ResultSet y Statement
			rs.close();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

}