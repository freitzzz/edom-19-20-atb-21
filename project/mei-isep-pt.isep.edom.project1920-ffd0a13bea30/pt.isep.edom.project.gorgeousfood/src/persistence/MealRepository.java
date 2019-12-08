package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import domain.*;

public class MealRepository {
	public Meal MealOfId(int id) {
		Statement stmt = null;
		Meal meal=null;

		try {
			Connection conn=Database.getConnection();
	
			String sql = "SELECT * FROM Meal WHERE id="
					+ id;
			stmt = conn.createStatement();

			stmt.executeQuery(sql);
			ResultSet res = stmt.getResultSet();
			if (res.next()) { 

				MealDTO dto = new MealDTO();

				dto.name = res.getString(1);
				dto.id = res.getInt(2);

				

				meal = (Meal)FFactory.getInstance().createMeal(dto);
			}

			stmt.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
				se2.printStackTrace();
			}
		}     	
    	return meal;
    }

	public int remove(int id) {
		Statement stmt = null;
		try {
			Connection conn=Database.getConnection();
			
			String sql = "DELETE FROM Meal WHERE id="
					+ id;
			stmt = conn.createStatement();

			stmt.execute(sql);

			// Clean-up environment
			stmt.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
			return -1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
				se2.printStackTrace();
				return -1;
			} // nothing we can do
		} // end try      
		return 0;
    	
    }
    
    public int remove(Meal aMeal) {
    	return remove(aMeal.id());
    }
    
    private int sqlInsert(Meal aMeal) {
		Statement stmt = null;
		int id=0;
		try {
			Connection conn=Database.getConnection();

			String sql = "INSERT INTO Meal ( ";

				sql += "id, ";
			sql += " ) VALUES ( ";
				sql += aMeal.id() + ", ";
			sql += ")";
			
			stmt = conn.createStatement();
			
			stmt.execute(sql, Statement.RETURN_GENERATED_KEYS);
			ResultSet generatedKeys = stmt.getGeneratedKeys();
			if (generatedKeys.next()) {
			    id = generatedKeys.getInt(1);
			} else {
				id=0;
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
		return id;
    }

    private boolean sqlUpdate(Meal aMeal) {
		Statement stmt = null;
		try {
			Connection conn=Database.getConnection();
			
			stmt = conn.createStatement();

			String sql = "UPDATE Meal SET ";

				sql += "id=" + aMeal.id() + ", ";
			sql += "WHERE id="+aMeal.id();

			stmt.executeUpdate(sql);

			// Clean-up environment
			stmt.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
				se2.printStackTrace();
				return false;
			} // nothing we can do
		} // end try   	
		return true;
    }
    
    public Meal save(Meal aMeal) {
    	if (aMeal.id()==0) {
    		// Insert
    		int newId=sqlInsert(aMeal);
    		return MealOfId(newId);
    	}
    	else
    	{
    		// Update
    		sqlUpdate(aMeal);
    		return aMeal;
    	}
    }
    
    public List<Meal> all() {
		Statement stmt = null;
		Meal meal=null;
		ArrayList<Meal> list=new ArrayList<Meal>();
		try {
			Connection conn=Database.getConnection();
			
			String sql = "SELECT * FROM Meal";
			stmt = conn.createStatement();

			stmt.executeQuery(sql);
			ResultSet res = stmt.getResultSet();
			while (res.next()) {

				MealDTO dto = new MealDTO();

				dto.name = res.getString(1);
				dto.id = res.getInt(2);

				

				meal = (Meal)FFactory.getInstance().createMeal(dto);
 
				
				list.add(meal );
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
    	return list;
    }
}
