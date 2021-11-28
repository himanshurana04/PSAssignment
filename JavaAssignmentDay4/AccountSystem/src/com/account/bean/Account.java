package com.account.bean;
/*Create a table called Account with AccNo, AccName, AccType and Balance.
 *  Now consider a transfer of money from AccNo 1 to AccNo2. Display the AccNo 
 *  and Balance before the transfer and after the transfer. 
 * Try both the scenarios of transfer is successful and transfer is failure.*/
public class Account {
public String accNo,name,accType;
public int balance;
public Account(String accNo, String name, String accType, int balance) {
	super();
	this.accNo = accNo;
	this.name = name;
	this.accType = accType;
	this.balance = balance;
}
public Account(String accNo,int balance) {
	this.accNo=accNo;
	this.balance=balance;
}
public String getAccNo() {
	return accNo;
}
public void setAccNo(String accNo) {
	this.accNo = accNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAccType() {
	return accType;
}
public void setAccType(String accType) {
	this.accType = accType;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "Account [accNo=" + accNo + ", name=" + name + ", accType=" + accType + ", balance=" + balance + "]";
}

}
