package demo.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import demo.domain.MealItem;

public class MealItemRepository {

    public MealItem mealItemOfId(int aMealItemId) {
		Statement stmt = null;
		MealItem mealItem=null;
		try {
			Connection conn=Database.getConnection();
			
			String sql = "SELECT mealItemId, name, mealId, prodDate, expDate FROM MEALITEM WHERE mealItemId="
					+ aMealItemId;
			stmt = conn.createStatement();

			stmt.executeQuery(sql);
			ResultSet res = stmt.getResultSet();
			if (res.next()) { 
				mealItem=new MealItem(res.getInt(1),
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
    	return mealItem;
    }

    public int remove(int mealItemId) {
		Statement stmt = null;
		try {
			Connection conn=Database.getConnection();
			
			String sql = "DELETE FROM MEALITEM WHERE mealItemId="
					+ mealItemId;
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
    
    public int remove(MealItem aMealItem) {
    	return remove(aMealItem.getMealItemId());
    }
    
    private int sqlInsert(MealItem aMealItem) {
		Statement stmt = null;
		int id=0;
		try {
			Connection conn=Database.getConnection();
			
			String sql = "INSERT INTO MEALITEM (name, mealId, prodDate, expDate) VALUES("
					+"'"+aMealItem.getName()+"'"
					+", "+aMealItem.getMealId()
					+", '"+aMealItem.getProdDate()+"'"
					+", '"+aMealItem.getExpDate()+"')";
			stmt = conn.createStatement();
			
			stmt.execute(sql, Statement.RETURN_GENERATED_KEYS);
			ResultSet generatedKeys = stmt.getGeneratedKeys();
			if (generatedKeys.next()) {
			    id = generatedKeys.getInt(1);
			} else {
			    // Throw exception?
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

    private boolean sqlUpdate(MealItem aMealItem) {
		Statement stmt = null;
		try {
			Connection conn=Database.getConnection();
			
			stmt = conn.createStatement();
			String sql = "UPDATE MEALITEM SET "
						+ "name='"+ aMealItem.getName() +"', "
						+ "mealId="+ aMealItem.getMealId() + ", " 
						+ "prodDate='"+ aMealItem.getProdDate() +"', "
						+ "expDate='"+ aMealItem.getExpDate() +"' "
						+ "WHERE mealItemId="+aMealItem.getMealItemId();
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
    
    public MealItem save(MealItem aMealItem) {
    	if (aMealItem.getMealItemId()==0) {
    		// Insert
    		int newId=sqlInsert(aMealItem);
    		return mealItemOfId(newId);
    	}
    	else
    	{
    		// Update
    		sqlUpdate(aMealItem);
    		return aMealItem;
    	}
    }
    
    public List<MealItem> allMealItems() {
		Statement stmt = null;
		MealItem mealItem=null;
		ArrayList<MealItem> mealItemList=new ArrayList<MealItem>();
		try {
			Connection conn=Database.getConnection();
			
			String sql = "SELECT mealItemId, name, mealId, prodDate, expDate FROM MEALITEM";
			stmt = conn.createStatement();

			stmt.executeQuery(sql);
			ResultSet res = stmt.getResultSet();
			while (res.next()) { 
				mealItem=new MealItem(res.getInt(1),
							res.getString(2),
							res.getInt(3),
							res.getString(4),
							res.getString(5)
						);
				mealItemList.add(mealItem);
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
    	return mealItemList;
    }
 }
