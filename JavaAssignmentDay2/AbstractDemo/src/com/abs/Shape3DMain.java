package com.abs;

public class Shape3DMain {

	public static void main(String[] args) {
		
		Cylinder cylinder=new Cylinder(5.5,5.3);
		Cube cube = new Cube(5);
		Sphere sphere=new Sphere(5.8);
		
		cylinder.surfaceArea();
		cylinder.Volume();
		
		cube.surfaceArea();
		cube.Volume();
		
		sphere.surfaceArea();
		sphere.Volume();
		

	}

}
