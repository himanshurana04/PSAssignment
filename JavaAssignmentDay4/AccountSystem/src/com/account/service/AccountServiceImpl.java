package com.account.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.account.bean.Account;

import BalanceAcc;

import com.accoun.dao.*;
public class AccountServiceImpl implements AccountService {
    AccountDaoImpl accdao=new AccountDaoImpl();
	@Override
	public ArrayList<Account> displayAllAccountDetails() {
		
		return accdao.getAllAccountDetails();
	}

	@Override
	public Account getAccountByAccNo(String accNo) {
		
		return accdao.displayAccountByAccNo(accNo);
	}

	@Override
	public Account displayBalanceByAccNo(String accNo) {
		
		return accdao.displayBalance(accNo);
	}

	@Override
	public boolean transaction1(String accNo1, String accNo2, int amount) {
		int rows=accdao.transferMoney1(accNo1, accNo2, amount);
		if(rows>0)
			return true;
		return false;
	}

	
	public int getBalance2(String accNo) {
		
		try {
			return accdao.getBalance(accNo);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return 0;
	}

}
