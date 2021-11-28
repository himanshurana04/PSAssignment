package com.accoun.client;
import com.account.present.*;
import java.util.Scanner;
public class MyClient {

	public static void main(String[] args) {
		AccountPresentImpl acc=new AccountPresentImpl();
		Scanner sc=new Scanner(System.in);
		while(true) {
			acc.showMenu();
			System.out.println("enter choice");
			int choice=sc.nextInt();
			acc.performMenu(choice);
		}

	}

}
