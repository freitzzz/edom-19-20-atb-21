package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

import domain.MealItemImpl;

public class MealItemRepository {
	public MealItemImpl MealItemOfId(int id) {
		Statement stmt = null;
		MealItemImpl MealItem=null;

		try {
			Connection conn=Database.getConnection();
	
			String sql = "SELECT * FROM MealItem WHERE id="
					+ id;
			stmt = conn.createStatement();

			stmt.executeQuery(sql);
			ResultSet res = stmt.getResultSet();
			if (res.next()) { 
				MealItem=new MealItemImpl(res.getString(1),
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
    	return MealItem;
    }

	public int remove(int id) {
		Statement stmt = null;
		try {
			Connection conn=Database.getConnection();
			
			String sql = "DELETE FROM MealItem WHERE id="
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
    
    public int remove(MealItemImpl aMealItem) {
    	return remove(aMealItem.id());
    }
    
    private int sqlInsert(MealItemImpl aMealItem) {
		Statement stmt = null;
		int id=0;
		try {
			Connection conn=Database.getConnection();

			String sql = "INSERT INTO MealItem ( ";

				sql += "id, ";
			sql += " ) VALUES ( ";
				sql += aMealItem.id() + ", ";
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

    private boolean sqlUpdate(MealItemImpl aMealItem) {
		Statement stmt = null;
		try {
			Connection conn=Database.getConnection();
			
			stmt = conn.createStatement();

			String sql = "UPDATE MealItem SET ";

				sql += "id=" + aMealItem.id() + ", ";
			sql += "WHERE id="+aMealItem.id();

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
    
    public MealItemImpl save(MealItemImpl aMealItem) {
    	if (aMealItem.id()==0) {
    		// Insert
    		int newId=sqlInsert(aMealItem);
    		return MealItemOfId(newId);
    	}
    	else
    	{
    		// Update
    		sqlUpdate(aMealItem);
    		return aMealItem;
    	}
    }
    
    public List<MealItemImpl> all() {
		Statement stmt = null;
		MealItemImpl MealItem=null;
		ArrayList<MealItemImpl> list=new ArrayList<MealItemImpl>();
		try {
			Connection conn=Database.getConnection();
			
			String sql = "SELECT * FROM MealItem";
			stmt = conn.createStatement();

			stmt.executeQuery(sql);
			ResultSet res = stmt.getResultSet();
			while (res.next()) { 
				MealItemImpl element=new MealItemImpl(res.getString(1),
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
