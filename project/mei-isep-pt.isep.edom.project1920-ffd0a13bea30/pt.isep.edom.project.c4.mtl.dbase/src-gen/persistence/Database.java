package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.h2.Driver";
	static final String DB_URL = "jdbc:h2:~/test-gorgeous-food";

	// Database credentials
	static final String USER = "sa";
	static final String PASS = "";

	static Connection conn = null;

	private static void initDatabase() {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql;
				sql = "CREATE TABLE IF NOT EXISTS MealItem ";

					sql += "(id INTEGER ";
				sql += " PRIMARY KEY ( ";
						sql += "id ,";
				sql += ")";
				stmt.executeUpdate(sql);
				sql = "CREATE TABLE IF NOT EXISTS Meal ";

					sql += "(id INTEGER ";
				sql += " PRIMARY KEY ( ";
						sql += "id ,";
				sql += ")";
				stmt.executeUpdate(sql);
				sql = "CREATE TABLE IF NOT EXISTS Ingredients ";

					sql += "(id INTEGER ";
				sql += " PRIMARY KEY ( ";
						sql += "id ,";
				sql += ")";
				stmt.executeUpdate(sql);

			// Clean-up environment
			stmt.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
				se2.printStackTrace();
			} // nothing we can do
		} // end try
	}

	private static Connection initConnection() {
		try {
			// Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// Open a connection
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			initDatabase();

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
			return null;
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
			return null;
		}

		return conn;
	}

	public static Connection getConnection() {
		if (conn == null) {
			conn = initConnection();
		}
		return conn;
	}

	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}
	}
}
