package poo_t8.rowset;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import poo_t8.rowset.DBConnection;

/**
 * @author Openwebinars
 *
 */
public class EjemploJdbcRowSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RowSetFactory myRowSetFactory = null;
		JdbcRowSet rowSet = null;
		
		try {
			myRowSetFactory = RowSetProvider.newFactory();
			rowSet = myRowSetFactory.createJdbcRowSet();
			
			rowSet.setUrl(DBConnection.JDBC_URL);
			rowSet.setUsername(DBConnection.USERNAME);
			rowSet.setPassword(DBConnection.PASSWORD);
			
			rowSet.setCommand("SELECT * FROM clientes");
			rowSet.execute();
			
			// Imprimimos todos los registros
			while (rowSet.next()) {
				System.out.printf("%d %s %s %s %s %s %n", rowSet.getInt("id"), rowSet.getString("nombre"), rowSet.getString("direccion"),
						rowSet.getString("localidad"), rowSet.getString("movil"), rowSet.getString("dni"));
			}
			System.out.println("");
			
			// Añadimos este "listener", que nos permite gestionar algunos
			// eventos sobre el RowSet.
//			rowSet.addRowSetListener(new RowSetListener() {
//				
//				@Override
//				public void rowSetChanged(RowSetEvent event) {
//					
//				}
//				
//				@Override
//				public void rowChanged(RowSetEvent event) {
//					System.err.println("Una fila ha sido modificada");
//				}
//				
//				@Override
//				public void cursorMoved(RowSetEvent event) {
//					System.err.println("Cursor movido");
//				}
//			});
			
			// Nos vamos al último registro de nuevo, y le cambiamos el movil
			rowSet.last();
			rowSet.updateString("movil", "646336995");
			rowSet.updateRow();
			
			// Insertamos un nuevo registro
			rowSet.moveToInsertRow();
			rowSet.updateString("nombre", "Manuel");
			rowSet.updateString("direccion", "Calle Cuenca 1");
			rowSet.updateString("localidad", "Garrucha");
			rowSet.updateString("direccion", "Calle Cuenca 1");
			rowSet.updateString("movil", "668999541");
			rowSet.updateString("dni", "49552631A");
			rowSet.insertRow();
			
			// Imprimimos todos los registros de nuevo
			rowSet.beforeFirst();
			while (rowSet.next()) {
				System.out.printf("%d %s %s %s %s %s %n", rowSet.getInt("id"), rowSet.getString("nombre"), rowSet.getString("direccion"),
						rowSet.getString("localidad"), rowSet.getString("movil"), rowSet.getString("dni"));
			}
			System.out.println("");
			
			// Cerramos el cursor
			rowSet.close();

		} catch (SQLException e) {			
			e.printStackTrace();
		}
					

	}

}
