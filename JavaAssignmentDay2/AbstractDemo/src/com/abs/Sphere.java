package com.abs;

public class Sphere extends Shape3D {
	private double radius;


	public Sphere(double radius) {
		this.radius = radius;
	}
	@Override
	public void surfaceArea() {
		double area=4*3.142*radius*radius;
		System.out.println("Area of sphere: "+area);
	}

	@Override
	public void Volume() {
		double vol=4/3*(3.142*radius*radius*radius);
		System.out.println("Volume of sphere: "+vol);
	}

}
