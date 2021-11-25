package com.shape;

public class Shape {
    
	public void area(int side) {
		int area=side*side;
		System.out.println("square area "+area);
	}
	public void area(double radius) {
		double area=3.142*radius*radius;
		System.out.println("Area of Circle : "+area);
	}
	public void area(int breadth ,int len) {
		int area=breadth*len;
		System.out.println("rectangle area "+area);
	}
}
