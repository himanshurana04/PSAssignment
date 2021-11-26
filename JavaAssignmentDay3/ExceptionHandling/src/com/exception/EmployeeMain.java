package com.exception;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) //throws NameException, AgeException 
	{
		Employee emp=new Employee();
		//@SuppressWarnings("resource")
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of emp you want ro add");
		int noOfRecord=sc.nextInt();
		for(int i=0;i<noOfRecord;i++) {
			emp.addEmp();
		}}
		catch(AgeException a) {
			a.printStackTrace();
		}
		catch(NameException n) {
			n.printStackTrace();
		}
		

	}

}
