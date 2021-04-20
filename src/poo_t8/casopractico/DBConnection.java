package poo_t8.casopractico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/fornite";
	public static final String USERNAME = "admin";
	public static final String PASSWORD = "admin";
	
	private static Connection instance = null;
	
	private DBConnection() { }
	
	public static Connection getConnection() throws SQLException {
		if (instance == null) {
			Properties props = new Properties();
			props.put("user", USERNAME);
			props.put("password", PASSWORD);
			Connection instance = DriverManager.getConnection(JDBC_URL, props);
			instance.setAutoCommit(false);
		}
		
		return instance;
	}

}
