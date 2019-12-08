package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import domain.MealImpl;

public class MealRepository {
	public MealImpl MealOfId(int id) {
		Statement stmt = null;
		MealImpl Meal=null;

		try {
			Connection conn=Database.getConnection();
	
			String sql = "SELECT * FROM Meal WHERE id="
					+ id;
			stmt = conn.createStatement();

			stmt.executeQuery(sql);
			ResultSet res = stmt.getResultSet();
			if (res.next()) { 
				Meal=new MealImpl(res.getString(1),
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
    	return Meal;
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
    
    public int remove(MealImpl aMeal) {
    	return remove(aMeal.id());
    }
    
    private int sqlInsert(MealImpl aMeal) {
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

    private boolean sqlUpdate(MealImpl aMeal) {
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
    
    public MealImpl save(MealImpl aMeal) {
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
    
    public List<MealImpl> all() {
		Statement stmt = null;
		MealImpl Meal=null;
		ArrayList<MealImpl> list=new ArrayList<MealImpl>();
		try {
			Connection conn=Database.getConnection();
			
			String sql = "SELECT * FROM Meal";
			stmt = conn.createStatement();

			stmt.executeQuery(sql);
			ResultSet res = stmt.getResultSet();
			while (res.next()) { 
				MealImpl element=new MealImpl(res.getString(1),
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
