package com.abs;

public class Cube extends Shape3D {
	private int side;
	
	public Cube(int side) {
		this.side = side;
	}
	@Override
	public void surfaceArea() {
		int area=6*side*side;
		System.out.println("Area of cube: "+area);
	}

	@Override
	public void Volume() {
		int vol=side*side*side;
		System.out.println("Volume of cube: "+vol);
	}

}
