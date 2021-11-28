package com.travel.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.travel.bean.Passenger;
import com.travel.bean.Travel;

public class TravelDaoImpl implements TravelDao {
	Connection connection=null;
	PreparedStatement preparedStatement2=null;
	PreparedStatement preparedStatement=null;
	PreparedStatement preparedStatement3=null;
	PreparedStatement preparedStatement4=null;
	PreparedStatement preparedStatement5=null;
	public void connectToDatabase() throws ClassNotFoundException,SQLException {
	     Class.forName("oracle.jdbc.driver.OracleDriver");

		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "9557962607");
}	

public void closeConnectionToDatabase() throws SQLException{
	
		

			connection.close();
	
}
public ArrayList<Passenger> listAllPassenger(){
	ArrayList<Passenger> pasList=new ArrayList<Passenger>();
	
	try{connectToDatabase();
	
	preparedStatement=connection.prepareStatement("SELECT * FROM passenger");
	ResultSet resultSet= preparedStatement.executeQuery();
	while(resultSet.next()) {
		int busId=resultSet.getInt("ID");
		String src=resultSet.getString("SOURCE");
		String dest=resultSet.getString("DESTINATION");
		int pid=resultSet.getInt("pid");
		String name=resultSet.getString("NAME");
		int age = resultSet.getInt("AGE");
		Passenger pes=new Passenger(name,src,dest,busId,age,pid);
		pasList.add(pes);
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
	return pasList;
}
	@Override
	public ArrayList<Travel> listAllBus() {
		
ArrayList<Travel> busList=new ArrayList<Travel>();
    	
		try{connectToDatabase();
		
		preparedStatement=connection.prepareStatement("SELECT * FROM bus");
		ResultSet resultSet= preparedStatement.executeQuery();
		while(resultSet.next()) {
			int busId=resultSet.getInt("ID");
			String src=resultSet.getString("SOURCE");
			String dest=resultSet.getString("DESTINATION");
			int capacity=resultSet.getInt("CAPACITY");
			Travel bus=new Travel(busId,capacity,src,dest);
			busList.add(bus);
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
		return busList;
	}

	@Override
	public boolean checkAvailability(String source, String destination) {
		ArrayList<String> src1=new ArrayList<String>();
		ArrayList<String> dest1=new ArrayList<String>();
		try {
			boolean src2=false;
			boolean dest2=false;
			connectToDatabase();
			preparedStatement=connection.prepareStatement("SELECT source,destination FROM bus");
			preparedStatement2=connection.prepareStatement("SELECT CAPACITY FROM BUS Where source=? and Destination=?");
			preparedStatement2.setString(2, destination);
			preparedStatement2.setString(1, source);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				String src=resultSet.getString("SOURCE");
				String dest=resultSet.getString("DESTINATION");
				dest1.add(dest);
				src1.add(src);
			}
            
			for(String s:src1) {
				String s1=s.toLowerCase();
				String s2=source.toLowerCase();
				boolean n=s1.matches(s2);
				if(n) {
					src2=true;
					break;
					}
					
			}
			for(String d:dest1) {
				String s1=d.toLowerCase();
				String s2=destination.toLowerCase();
				boolean n=s1.matches(s2);
				if(n) {
					dest2=true;
					break;
			}
				}
			
			int cap1=0;
			ResultSet resultSet2=preparedStatement2.executeQuery();
			if(src2&&dest2) {
				
			    if(resultSet2.next()) {
			        int cap=resultSet2.getInt("CAPACITY");
			        cap1=cap;
			         }
			
		}if(cap1>0)
			return true;
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
		
		return false;
	}

	@Override
	public int addPassenger(Passenger passenger) {
		try {
			connectToDatabase();
		preparedStatement=connection.prepareStatement("INSERT INTO PASSENGER VALUES(?,?,?,?,?,?)");
		preparedStatement.setInt(1,passenger.getPid());
		preparedStatement.setString(5,passenger.getSource());
		preparedStatement.setString(4,passenger.getDestination() );
		//preparedStatement.setInt(2, passenger.getBusid());
		preparedStatement.setInt(6, passenger.getAge());
		preparedStatement.setString(3,passenger.getName());
		preparedStatement4=connection.prepareStatement("select id from bus WHERE Source=? and destination=?");
		String source =passenger.getSource();
		String dest=passenger.getDestination();
		preparedStatement4.setString(1, source);
		preparedStatement4.setString(2, dest);
		
		ResultSet resultSet5=preparedStatement4.executeQuery();
		int id2=0;
		if(resultSet5.next()) {
			id2=resultSet5.getInt("ID");
			}
		preparedStatement.setInt(2, id2);
		int rowi=preparedStatement.executeUpdate();
		preparedStatement2=connection.prepareStatement("SELECT CAPACITY FROM BUS Where id=?");
		preparedStatement2.setInt(1,id2);
		int capacity=0;
		ResultSet resultSet2=preparedStatement2.executeQuery();
		if(resultSet2.next()) {
		capacity=resultSet2.getInt("CAPACITY");
		}
		capacity=capacity-1;
			
		
		//int rows1=preparedStatement.executeUpdate();
		preparedStatement3=connection.prepareStatement("UPDATE BUS SET CAPACITY=? WHERE ID=?");
		preparedStatement3.setInt(1,capacity);
		preparedStatement3.setInt(2,id2);
		//String source=passenger.getSource();
		//String dest=passenger.getDestination();
		//preparedStatement4=connection.prepareStatement("select id from bus WHERE Source=? and destination=?");
		
		
		
		//preparedStatement5=connection.prepareStatement("UPDATE BUS SET ID=? WHERE Source=? and destination=?");
		//preparedStatement5.setString(2, source);
		//preparedStatement5.setString(3, dest);
		
		int rows2=preparedStatement3.executeUpdate();
		int rows=rowi+rows2;
		return rows;
	
		
	}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	//@Override
	/*public int updateCapacity(int noOfPassenger) {
		
		return 0;
	}*/
	public int getBusId(String src, String dest) {
		int busId=0;
		try {connectToDatabase();
		preparedStatement4=connection.prepareStatement("select id from bus WHERE Source=? and destination=?");
			preparedStatement4.setString(1,src);
			preparedStatement4.setString(2,dest);
			ResultSet resultSet=preparedStatement4.executeQuery();
			if(resultSet.next()) {
				busId=resultSet.getInt("ID");
			}
			return busId;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
}
