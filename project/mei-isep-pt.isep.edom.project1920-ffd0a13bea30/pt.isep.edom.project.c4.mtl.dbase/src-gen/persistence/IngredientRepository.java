package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import domain.IngredientImpl;

public class IngredientRepository {
	public IngredientImpl IngredientOfId(int id) {
		Statement stmt = null;
		IngredientImpl Ingredient=null;

		try {
			Connection conn=Database.getConnection();
	
			String sql = "SELECT * FROM Ingredient WHERE id="
					+ id;
			stmt = conn.createStatement();

			stmt.executeQuery(sql);
			ResultSet res = stmt.getResultSet();
			if (res.next()) { 
				Ingredient=new IngredientImpl(res.getString(1),
							res.getInt(2)
						);
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
    	return Ingredient;
    }

	public int remove(int id) {
		Statement stmt = null;
		try {
			Connection conn=Database.getConnection();
			
			String sql = "DELETE FROM Ingredient WHERE id="
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
    
    public int remove(IngredientImpl aIngredient) {
    	return remove(aIngredient.id());
    }
    
    private int sqlInsert(IngredientImpl aIngredient) {
		Statement stmt = null;
		int id=0;
		try {
			Connection conn=Database.getConnection();

			String sql = "INSERT INTO Ingredient ( ";

				sql += "id, ";
			sql += " ) VALUES ( ";
				sql += aIngredient.id() + ", ";
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

    private boolean sqlUpdate(IngredientImpl aIngredient) {
		Statement stmt = null;
		try {
			Connection conn=Database.getConnection();
			
			stmt = conn.createStatement();

			String sql = "UPDATE Ingredient SET ";

				sql += "id=" + aIngredient.id() + ", ";
			sql += "WHERE id="+aIngredient.id();

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
    
    public IngredientImpl save(IngredientImpl aIngredient) {
    	if (aIngredient.id()==0) {
    		// Insert
    		int newId=sqlInsert(aIngredient);
    		return IngredientOfId(newId);
    	}
    	else
    	{
    		// Update
    		sqlUpdate(aIngredient);
    		return aIngredient;
    	}
    }
    
    public List<IngredientImpl> all() {
		Statement stmt = null;
		IngredientImpl Ingredient=null;
		ArrayList<IngredientImpl> list=new ArrayList<IngredientImpl>();
		try {
			Connection conn=Database.getConnection();
			
			String sql = "SELECT * FROM Ingredient";
			stmt = conn.createStatement();

			stmt.executeQuery(sql);
			ResultSet res = stmt.getResultSet();
			while (res.next()) { 
				IngredientImpl element=new IngredientImpl(res.getString(1),
							res.getInt(2)
						);
				list.add(element);
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
