package com.bankimpl;

public class MyAccount {
	public static void main(String[] args) {
SavingsAcc saving=new SavingsAcc();
FDAcc fd=new FDAcc();
HousingLoanAcc hloan=new HousingLoanAcc();
PersonalLoanAcc ploan=new PersonalLoanAcc();

saving.createAcc();
saving.calcInt();

}
}