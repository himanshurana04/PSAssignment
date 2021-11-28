package com.my.dao;

import java.util.ArrayList;

import com.my.bean.Element;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ElementDaoImpl implements ElementDao{
	Connection connection=null;
	PreparedStatement preparedStatement=null;
    public void connectToDatabase() throws ClassNotFoundException,SQLException {
    	     Class.forName("oracle.jdbc.driver.OracleDriver");

			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "9557962607");
    }	

    public void closeConnectionToDatabase() throws SQLException{
    	
			

				connection.close();
    	
    }
    
    
	@Override
	public ArrayList<Element> getAllElement() {
		ArrayList<Element> elementList=new ArrayList<Element>();
		try{connectToDatabase();
		
		preparedStatement=connection.prepareStatement("SELECT * FROM ELEMENT");
		ResultSet resultSet= preparedStatement.executeQuery();
		while(resultSet.next()) {
			String symbol=resultSet.getString("CHEMICAL_SYMBOL");
			String name=resultSet.getString("NAME");
			int weight=resultSet.getInt("ATOMIC_WEIGHT");
			Element element=new Element(symbol,weight,name);
			elementList.add(element);
		}
		}
		
		catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
		catch(SQLException s) {
			s.printStackTrace();
		}
		finally {
			try {
				closeConnectionToDatabase();
			}
			catch(SQLException s) {
				s.printStackTrace();
			}
		}
		return elementList;
	}

	@Override
	public int deleteElement(String symbol) {
		try {
			connectToDatabase();
		preparedStatement=connection.prepareStatement("DELETE FROM ELEMENT WHERE CHEMICAL_SYMBOL=?");
		
		preparedStatement.setString(1,symbol );


		int rows= preparedStatement.executeUpdate();


		return rows;}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				closeConnectionToDatabase();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	

	@Override
	public int updateElementBySymbol(String symbol,int weight) {
		try {
			connectToDatabase();
preparedStatement=connection.prepareStatement("UPDATE ELEMENT SET ATOMIC_WEIGHT=? WHERE CHEMICAL_SYMBOL=?");
			
			preparedStatement.setInt(1, weight);
			preparedStatement.setString(2, symbol);
			
			
			int rows= preparedStatement.executeUpdate();


			return rows;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				closeConnectionToDatabase();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

}
