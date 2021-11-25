package com.abs;

public class Cylinder extends Shape3D {
	private double radius,height;
	public Cylinder(double radius,double height) {
		this.radius = radius;
		this.height=height;
	}
	@Override
	public void surfaceArea() {
		double area=2*3.142*radius*(height+radius);
		System.out.println("Area of cylinder: "+area);
	}

	@Override
	public void Volume() {
		// TODO Auto-generated method stub
		double vol=3.142*radius*radius*height;
		System.out.println("Volume of cylinder: "+vol);
	}

}
