package com.travel.present;
import java.util.ArrayList;
import java.util.Scanner;

import com.travel.bean.*;
import com.travel.service.*;
public class TravelPresentImpl implements TravelPresent {
    TravelServiceImpl travel=new TravelServiceImpl();
    Scanner sc=new Scanner(System.in);
	@Override
	public void showMenu() {
		System.out.println("Travel Management System");
		System.out.println("==================================");
		System.out.println("1. List All Buses");
		System.out.println("2. List All Passengers");
		System.out.println("3. check bus availability ");
		System.out.println("4. Add Passenger");
		System.out.println("5. Exit");
		System.out.println("==================================");

	}

	@Override
	public void performMenu(int choice) {
		switch(choice) {
		case 1:
			ArrayList<Travel> list=travel.listOfAllBus();
			for(Travel t:list)
				System.out.println(t);
			break;
		case 2:
			ArrayList<Passenger> list2=travel.listOfAllPassenger();
			for(Passenger t:list2)
				System.out.println(t);
			break;
		case 3:
			System.out.println("Enter source");
			String src=sc.next();
			System.out.println("Enter Dest");
			String dest=sc.next();
			boolean check=travel.checkForBusAvailibility(src, dest);
			if(check==true)
				System.out.println("ticket is available for this bus ,your bus id is "+travel.busId(src, dest));
			else
				System.out.println("ticket not available!");
			break;
		case 4:
			System.out.println("please enter your name");
			String name=sc.next();
			System.out.println("please enter your source");
			String src2=sc.next();
			System.out.println("please enter your destination");
			String dest2=sc.next();
			if(travel.checkForBusAvailibility(src2, dest2)==false) {
				System.out.println("No bus on this route");
				break;
				}
			//System.out.println("please enter your bus id");
			int id=0;
			System.out.println("please enter your personal id");
			int pid=sc.nextInt();
			System.out.println("please enter your age");
			int age=sc.nextInt();
			Passenger passenger=new Passenger(name,src2,dest2,id,age,pid);
			if(travel.addPassenger(passenger))
				System.out.println("passenger added successfully!");
			else
				System.out.println("can't add passenger!");
			break;
		case 5:
			System.out.println("Thank you! exited");
			System.exit(0);
		default:
			System.out.println("invalid choice");
			
				
		}

	}

}
