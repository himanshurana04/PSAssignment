package com.accoun.dao;
import com.account.bean.*;

import java.sql.SQLException;
import java.util.ArrayList;
public interface AccountDao {
	ArrayList<Account> getAllAccountDetails();
Account displayAccountByAccNo(String accNo);
Account displayBalance(String accNo);
//void diplayAccounNo(String accNo1,String accNo2);
int transferMoney1(String accNo1,String accNo2,int amount);
//int getBalance(String accNo) throws ClassNotFoundException, SQLException;
}
