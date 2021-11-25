package com.training.demo;
import oop.modular.demo.MyDemo;
public class Palindrome {
private int number;
private boolean status;
public void setNumber(int number) {
	this.number = number;
}

public boolean isPalindrome() {
	findPalindrome();
	return status;
}
private void findPalindrome() {
	MyDemo reverse=new MyDemo();
	reverse.setNumber(number);
	int rev=reverse.getReverse();
	if(number==rev) {
		status=true;
	}
	else
		status = false;
}
}
