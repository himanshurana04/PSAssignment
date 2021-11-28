package com.my.presentation;
import com.my.service.*;
import java.util.Scanner;
import java.util.ArrayList;
import com.my.bean.*;
//import com.my.dao.*;
public class ElementPresentImpl implements ElementPresent {
	private ElementServiceImpl ele1=new ElementServiceImpl();
	@Override
	public void showMenu() {
		System.out.println("Choose options from below: ");
		System.out.println("1.List all elements ");
		System.out.println("2.Delete Element by Symbol");
		System.out.println("3.Update Element weight by Symbol");
		System.out.println("4.Exit");
		System.out.println("*************************************");
	}

	@Override
	public void performMenu(int choice) {
		Scanner sc=new Scanner(System.in);
		
		switch(choice){
		case 1:
			ArrayList<Element> employeeList=ele1.getAll();
			for(Element e:employeeList)
				System.out.println(e);
			break;
		case 2:
			System.out.println("enter Symbol to delete element");
			String symbol=sc.next();
			if(ele1.removeEmployee(symbol))
				System.out.println("element deleted!");
			else
				System.out.println("Deletion failed");
			break;
		case 3:
			System.out.println("enter element symbol, to update weight");
			String symbol2=sc.next();
			System.out.println("enter new weight");
			int weight=sc.nextInt();
			if(ele1.updateElement(symbol2, weight))
				System.out.println("weight updated");
			else
				System.out.println("weight updation failed");
			break;
		case 4:
			System.out.println("Thank you , have a nice day");
			System.exit(0);
		default:
			System.out.println("invalid choice");
		}
		
		

	}

}
