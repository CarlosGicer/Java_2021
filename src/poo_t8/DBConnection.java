package poo_t8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Openwebinars
 *
 */
public class DBConnection {
	
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/incidencias";
	
	private static Connection instance = null;
	
	private DBConnection() { }
	
	public static Connection getConnection() throws SQLException {
		if (instance == null) {
			Properties props = new Properties();
			props.put("user", "admin");
			props.put("password", "admin");
			instance = DriverManager.getConnection(JDBC_URL, props);
		}
		
		return instance;
	}
}