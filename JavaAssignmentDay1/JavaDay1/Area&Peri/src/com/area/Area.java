package com.area;

public class Area {
public void area(int side) {
	int area =side*side;
	System.out.println("Square area is : "+area);
}
public void area(double radius) {
	double area =3.142*radius*radius;
	System.out.println("Circle area is : "+area);
}
public void area(int len,int breadth) {
	int area =len*breadth;
	System.out.println("Rectangle area is : "+area);
}
}
