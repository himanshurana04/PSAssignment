package com.training.demo;

public class PalindromeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Palindrome palindrome=new Palindrome();
          palindrome.setNumber(12392321);
          
          if(palindrome.isPalindrome())
        	  System.out.println("palindrome");
          else
        	  System.out.println("not palindrome");
	}

}
