package com.shape;

public class Perimeter {
	public void perimeter(double radius) {
		double peri=2*3.142*radius;
		System.out.println("circle perimeter "+peri);
}
	public void perimeter(int side) {
		int peri=4*side;
		System.out.println("square perimeter"+peri);
}
	public void perimeter(int breadth ,int len) {
		int peri=2*(breadth+len);
		System.out.println("rectangle perimeter "+peri);
	}
}