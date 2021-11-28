package com.account.service;

import java.util.ArrayList;

import com.account.bean.Account;

//import BalanceAcc;

public interface AccountService {
	ArrayList<Account> displayAllAccountDetails();
	Account getAccountByAccNo(String accNo);
	Account displayBalanceByAccNo(String accNo);
	//void diplayAccounNo(String accNo1,String accNo2);
	boolean transaction1(String accNo1,String accNo2,int amount);
	//int getBalance2(String accNo);
}
