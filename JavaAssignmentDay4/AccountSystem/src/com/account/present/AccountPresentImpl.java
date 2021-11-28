package com.account.present;
import java.util.ArrayList; 
import com.account.bean.*;
import java.util.Scanner;
import com.accoun.dao.*;
import com.account.service.*;
public class AccountPresentImpl implements AccountPresent {

	@Override
	public void showMenu() {
		System.out.println("Account Management System");
		
		System.out.println("1. List All Accounts");
		System.out.println("2. Search Account by Account Number ");
		System.out.println("3. Check balance by Account Number ");
		System.out.println("4. Do transaction from one account to another");
		System.out.println("5. Exit");

		System.out.println("==================================");

	}

	@Override
	public void performMenu(int choice) {
		Scanner sc=new Scanner(System.in);
		AccountServiceImpl accservice=new AccountServiceImpl();
		
		switch(choice) {
		case 1:
			ArrayList<Account> acc1=accservice.displayAllAccountDetails();
			for(Account acc2:acc1)
				System.out.println(acc2);
			break;
			
		case 2:
			System.out.println("Enter account no to be searched");
			String accno=sc.next();
			Account acc3=accservice.getAccountByAccNo(accno);
			System.out.println(acc3);
			break;
		case 3:
			System.out.println("check balance by enterin account no");
			String accno2=sc.next();
			Account balacc=accservice.displayBalanceByAccNo(accno2);
			System.out.println("account no "+balacc.accNo+" has a balance of "+balacc.balance);
			break;
		case 4:
			System.out.println("enter acc no from which you want to deduct the amount");
			String accno1=sc.next();
			//accservice.getBalance2(accno1);
			Account balacc1=accservice.displayBalanceByAccNo(accno1);
			System.out.println("account no "+balacc1.accNo+" has a balance of "+balacc1.balance);
			System.out.println("enter amount to be deducted");
			int amount=sc.nextInt();
			System.out.println("enter accno in which you want to add that money");
			String accno3=sc.next();
			Account balacc2=accservice.displayBalanceByAccNo(accno3);
			System.out.println("account no "+balacc2.accNo+" has a balance of "+balacc2.balance);
			//accservice.getBalance2(accno3);
			if(accservice.transaction1(accno1, accno3, amount)) {
				System.out.println("transaction successful");
			   Account balacc3=accservice.displayBalanceByAccNo(accno1);
			   System.out.println("After transaction account no "+balacc3.accNo+" has a balance of "+balacc3.balance);
			   Account balacc4=accservice.displayBalanceByAccNo(accno3);
			   System.out.println("After transaction account no "+balacc4.accNo+" has a balance of "+balacc4.balance);
			}
			else
				System.out.println("transaction failed");
			break;
			
		case 5:
			System.out.println("thanks for choosing us!");
			System.exit(0);
		default:
			System.out.println("invalid choice!");
		
		}

	}

}
