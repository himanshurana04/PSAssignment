package com.area;

public class Perimeter {
	public void perimeter(int side) {
		int peri =4*side;
		System.out.println("Square perimeter is : "+peri);
	}
	public void perimeter(double radius) {
		double peri =2*3.142*radius;
		System.out.println("Circle perimeter is : "+peri);
	}
	public void perimeter(int len,int breadth) {
		int peri =2*(len+breadth);
		System.out.println("Rectangle perimeter  is : "+peri);
	}
}
