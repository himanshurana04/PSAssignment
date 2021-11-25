package com.arrays;

public class Array {
private double sum=0;
public void sum(double[] arr) {
	
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
		
	}
	System.out.println("sum of all array elements is "+sum);
}
public void average(double[] arr) {
	double avg=0;
	int  len=arr.length;
	avg=(sum/len);
	
	
	System.out.println("average of array is "+avg);
}

}
