package com.bankimpl;
import com.bank.DepositAcc;
import com.bank.CreditInterest;

public class FDAcc implements DepositAcc,CreditInterest {
	public void createAcc(){
		
    	System.out.println(Fixed+" acc created");
   
}
	public void calcInt() {
		System.out.println(FixedDepositAccount+" % interest");
	}
public void withdraw() {
	System.out.println("Money withdrawn from your FD acc");
}
public void deposit() {
	System.out.println("Money deposited to your FD acc");
}
public void getBalance() {
	System.out.println("your FD acc balance is x");
}
public void addMonthlyInt() {
	System.out.println("Monthly interest added");
}


public void addHalfYrlyInt() {
	System.out.println("Half yearly interest added");
}

public void addAnnualInt() {
	System.out.println("annual interest added");
}

}
