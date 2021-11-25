package com.inheritance;

public class Road  {

	Vehicle vehicle;
	String name;
	public Road(String name) {
		this.name=name;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle=vehicle;
	}
	public void display() {
		System.out.println("vehicle : "+name+" ,size : "+vehicle.getSize()+" ,speed : "+vehicle.getSpeed()+" ,mileage : "+vehicle.getMileage()
		+" ,color : "+vehicle.color+" ,model : "+vehicle.model+" ,noOfWheels : "+vehicle.noOfWheels);
	}
}