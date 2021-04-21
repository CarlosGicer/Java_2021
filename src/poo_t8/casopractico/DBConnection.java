package poo_t8.casopractico;

import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class DBConnection {
	
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/fornite";
	public static final String USERNAME = "admin";
	public static final String PASSWORD = "admin";
	
	private static JdbcRowSet rowSet = null;
	
	private DBConnection() { }
	
	public static JdbcRowSet getConnection() throws SQLException {
		
		RowSetFactory myRowSetFactory = null;
		
		try {
			if (rowSet == null) {
				myRowSetFactory = RowSetProvider.newFactory();
				rowSet = myRowSetFactory.createJdbcRowSet();
				
				rowSet.setUrl(JDBC_URL);
				rowSet.setUsername(USERNAME);
				rowSet.setPassword(PASSWORD);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowSet;	
		
		
	}

}
