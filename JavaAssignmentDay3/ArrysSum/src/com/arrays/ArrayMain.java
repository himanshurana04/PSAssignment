package com.arrays;
import java.util.Scanner;
public class ArrayMain {

	public static void main(String[] args) {
		Array arr=new Array();
		Scanner scanner=new Scanner(System.in);
		double[] arr2;
		
		System.out.println("Enter total");
		int total=scanner.nextInt();
		
		arr2=new double[total];
		for (int i=0;i<total;i++) {
			arr2[i]=scanner.nextInt();
		}
		arr.sum(arr2);
		arr.average(arr2);
	}

}
