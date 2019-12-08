package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import domain.*;

public class IngredientRepository {
	public Ingredient IngredientOfId(int id) {
		Statement stmt = null;
		Ingredient ingredient=null;

		try {
			Connection conn=Database.getConnection();
	
			String sql = "SELECT * FROM Ingredient WHERE id="
					+ id;
			stmt = conn.createStatement();

			stmt.executeQuery(sql);
			ResultSet res = stmt.getResultSet();
			if (res.next()) { 

				IngredientDTO dto = new IngredientDTO();

				dto.name = res.getString(1);
				dto.id = res.getInt(2);

				

				ingredient = (Ingredient)FFactory.getInstance().createIngredient(dto);
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
    	return ingredient;
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
    
    public int remove(Ingredient aIngredient) {
    	return remove(aIngredient.id());
    }
    
    private int sqlInsert(Ingredient aIngredient) {
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

    private boolean sqlUpdate(Ingredient aIngredient) {
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
    
    public Ingredient save(Ingredient aIngredient) {
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
    
    public List<Ingredient> all() {
		Statement stmt = null;
		Ingredient ingredient=null;
		ArrayList<Ingredient> list=new ArrayList<Ingredient>();
		try {
			Connection conn=Database.getConnection();
			
			String sql = "SELECT * FROM Ingredient";
			stmt = conn.createStatement();

			stmt.executeQuery(sql);
			ResultSet res = stmt.getResultSet();
			while (res.next()) {

				IngredientDTO dto = new IngredientDTO();

				dto.name = res.getString(1);
				dto.id = res.getInt(2);

				

				ingredient = (Ingredient)FFactory.getInstance().createIngredient(dto);
 
				
				list.add(ingredient );
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
