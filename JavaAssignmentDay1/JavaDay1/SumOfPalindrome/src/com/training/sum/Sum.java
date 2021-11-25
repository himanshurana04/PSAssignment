package com.training.sum;
import com.training.demo.Palindrome;
public class Sum {
private int number1,number2,sum=0;

public void setNumber1(int number1) {
	this.number1 = number1;
}



public void setNumber2(int number2) {
	this.number2 = number2;
}

public int getSum() {
	sumPalindrome();
	return sum;
	
}
private void sumPalindrome() {
	Palindrome pal=new Palindrome();
	Palindrome pal2=new Palindrome();
	pal.setNumber(number1);
	pal2.setNumber(number2);
	boolean status1=pal.isPalindrome();
	boolean status2=pal.isPalindrome();
	if(status1 && status2)
	     sum=  number1+number2;
}
}
