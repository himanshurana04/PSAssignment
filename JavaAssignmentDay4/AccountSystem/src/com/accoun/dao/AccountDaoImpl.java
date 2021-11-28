package com.accoun.dao;
import java.sql.Connection;
import com.account.bean.Account;



import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDaoImpl implements AccountDao {
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	PreparedStatement preparedStatement2=null;
	
	public void connectToDatabase() throws ClassNotFoundException,SQLException {
	     Class.forName("oracle.jdbc.driver.OracleDriver");

		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "9557962607");
}	

public void closeConnectionToDatabase() throws SQLException{
	
		

			connection.close();
	
}
    @Override
    public ArrayList<Account> getAllAccountDetails(){
    	ArrayList<Account> accList=new ArrayList<Account>();
    	
		try{connectToDatabase();
		
		preparedStatement=connection.prepareStatement("SELECT * FROM ACCOUNTS");
		ResultSet resultSet= preparedStatement.executeQuery();
		while(resultSet.next()) {
			String accNo=resultSet.getString("ACCNO");
			String name=resultSet.getString("NAME");
			String accType=resultSet.getString("ACCTYPE");
			int balance=resultSet.getInt("BALANCE");
			Account acc=new Account(accNo,name,accType,balance);
			accList.add(acc);
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
		return accList;
    }
	@Override
	public Account displayAccountByAccNo(String accNo) {
		Account accc = null;
		
		try {
			connectToDatabase();
            preparedStatement=connection.prepareStatement("SELECT * FROM ACCOUNTS WHERE ACCNO=?");
			
			preparedStatement.setString(1, accNo);
			
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next()) {
				String acccNo1=resultSet.getString("ACCNO");
				String name1=resultSet.getString("NAME");
				String accType1=resultSet.getString("ACCTYPE");
				int balance1=resultSet.getInt("BALANCE");
			    accc=new Account(acccNo1,name1,accType1,balance1);
				
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
		return accc;
	}

	@Override
	public Account displayBalance(String accNo) {
		
		Account bal=null;
					try {
				connectToDatabase();
	            preparedStatement=connection.prepareStatement("SELECT BALANCE FROM ACCOUNTS WHERE ACCNO=?");
				
				preparedStatement.setString(1,accNo);
				
				ResultSet resultSet= preparedStatement.executeQuery();
				if(resultSet.next()) {
					//String acccNo2=resultSet.getString("ACCNO");
					//String name2=resultSet.getString("NAME");
					//String accType2=resultSet.getString("ACCTYPE");
					int balance1=resultSet.getInt("BALANCE");
					//int balance=resultSet.getInt("BALANCE");
					bal=new Account(accNo,balance1);
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
	return bal;
	}
	
    public int getBalance(String accNo) throws ClassNotFoundException,SQLException {
    	int balance=0;
    	
    	try {
    		connectToDatabase();
            preparedStatement=connection.prepareStatement("SELECT BALANCE FROM ACCOUNTS WHERE ACCNO=?");
			
			preparedStatement.setString(1, accNo);
			
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next()) {
				balance=resultSet.getInt("BALANCE");
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
    	return balance;
    	
    }
    @Override
	public int transferMoney1(String accNo1, String accNo2, int amount) {
		int rows=0;
		try {
			
			connectToDatabase();
			int bal1=0;
			int bal2=0;
			PreparedStatement stmt=connection.prepareStatement("SELECT BALANCE FROM ACCOUNTS WHERE ACCNO=?");
			stmt.setString(1, accNo1);
			PreparedStatement stmt2=connection.prepareStatement("SELECT BALANCE FROM ACCOUNTS WHERE ACCNO=?");
			stmt2.setString(1, accNo2);
			ResultSet resultSet1=stmt.executeQuery();
			ResultSet resultSet2=stmt2.executeQuery();
			if(resultSet1.next()) {
				bal1=resultSet1.getInt("BALANCE");
				}
			if(resultSet2.next()) {
				bal2=resultSet2.getInt("BALANCE");
				}
			//System.out.println("before transaction "+accNo1+" has balance of "+bal1);
			//System.out.println("before transaction "+accNo2+" has balance of "+bal2);
			
			
			bal1=bal1-amount;
			bal2=bal2+amount;
			PreparedStatement preparedStatement=connection.prepareStatement("UPDATE ACCOUNTS SET BALANCE=? WHERE ACCNO=?");
			PreparedStatement preparedStatement2=connection.prepareStatement("UPDATE ACCOUNTS SET BALANCE=? WHERE ACCNO=?");
		   // preparedStatement.execute();
		  //  preparedStatement.execute();
		    preparedStatement.setInt(1, bal1);
		    preparedStatement.setString(2, accNo1);
		    preparedStatement2.setInt(1, bal2);
		    preparedStatement2.setString(2, accNo2);
		  //  System.out.println("after transaction "+accNo1+" has balance of "+bal1);
			//System.out.println("after transaction "+accNo2+" has balance of "+bal2);
		    int rows1= preparedStatement.executeUpdate();
		    int rows2= preparedStatement2.executeUpdate();
		    rows=rows1+rows2;
		    return rows;
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
	return 0;
	}

}
