package com.bankimpl;
import com.bank.LoanAcc;
import com.bank.DebitInterest;
public class PersonalLoanAcc implements LoanAcc,DebitInterest{

public void createAcc(){
		
    	System.out.println(PersonalLoan+" acc created");
   
}
	public void calcInt() {
		System.out.println(PersonalLoanAccount+" % interest");
	}
public void repayPrincipal() {
	System.out.println("Pricipal repaid");
}
	
	
	public void payInterest() {
		System.out.println("Interest paid");
	}
		
	
	public void payPartialPrincipal() {
		System.out.println("Partial principal paid");
	}
	
	
	
	
	
	public void deductMonthlyInt() {
		System.out.println("Monthly interest deducted");
	}
	 
	 
	 public void deductHalfYrlyInt() {
		 System.out.println("Halfyrly interest deducted");
	 }
		 
	 public void deductAnnualInt() {
		 System.out.println("annual interest deducted");
	 }
}
