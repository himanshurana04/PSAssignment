package com.my.client;

import com.my.presentation.ElementPresentImpl;
import java.util.Scanner;

public class MyClient extends ElementPresentImpl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ElementPresentImpl ele=new ElementPresentImpl();
		while(true) {
			ele.showMenu();
			System.out.println("Enter Choice");
			int choice = sc.nextInt();
			ele.performMenu(choice);
		}

	}

}
