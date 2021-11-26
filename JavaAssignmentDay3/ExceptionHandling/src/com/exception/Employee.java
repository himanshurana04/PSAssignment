package com.exception;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
/*Create a class called Employee which asks the user to input the name and the age of a 
employee. Raise a custom defined exception when the user enters an employee name 
that has been already entered and raise another exception if the age is negative or less
than 18 or greater than 60. */
import java.util.Scanner;

public class Employee {
	
	Scanner sc=new Scanner(System.in);
	ArrayList<String> empName=new ArrayList<String>();
	ArrayList<Integer> empAge=new ArrayList<Integer>();
	public void addEmp() throws NameException,AgeException {
		
				
		System.out.println("Enter employee name");

		String name=sc.next();
		Iterator<String> iterator=empName.iterator();
		
		while(iterator.hasNext()) {
			if(iterator.next().matches(name)) 
				throw new NameException("already exist");
			else
				continue;
		}
		empName.add(name);
		System.out.println("Enter emp age");
		int age=sc.nextInt();
		if(age<0 || age<18 || age>60)
			throw new AgeException("Enter valid age");
		empAge.add(age);
		System.out.println("do you want to display employees yes/no");
		String decision=sc.next();
		if(decision.toLowerCase().matches("no"))
			return;
		else if(decision.toLowerCase().matches("yes")) {
			for(String element:empName)
				System.out.println(element);
			for(Integer element:empAge)
				System.out.println(element);
		}
		else
			System.out.println("Enter either yes/no");
		
		
	}
	
}