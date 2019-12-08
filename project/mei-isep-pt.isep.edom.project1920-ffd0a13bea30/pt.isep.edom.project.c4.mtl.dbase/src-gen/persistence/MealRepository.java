package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import domain.Meal;

public class MealRepository {
	public Meal mealItemOfId(int aMealItemId) {
		Statement stmt = null;
		Meal Meal=null;

		try {
			Connection conn=Database.getConnection();
	
			String sql = "SELECT mealItemId, name, mealId, prodDate, expDate FROM Meal WHERE mealItemId="
					+ aMealItemId;
			stmt = conn.createStatement();

			stmt.executeQuery(sql);
			ResultSet res = stmt.getResultSet();
			if (res.next()) { 
				Meal=new Meal(res.getInt(1),
							res.getString(2),
							res.getInt(3),
							res.getString(4),
							res.getString(5)
						);
			} else {
			    // Throw exception?
			}

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
    	return Meal;
    }
}
