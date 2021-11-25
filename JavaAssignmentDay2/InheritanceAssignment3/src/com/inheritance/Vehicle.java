package com.inheritance;

public class Vehicle {
private int speed,mileage;
private String size,name;
public int noOfWheels;
public String color,model;

public Vehicle() {
	this.color="browm";
	this.noOfWheels=4;
	this.model="Z+";
}

public void setMileage(int mileage) {
	this.mileage = mileage;
}

public int getMileage() {
	return mileage;
}

public void setSpeed(int speed) {
	this.speed = speed;
}
public void setSize(String size) {
	this.size = size;
}
public void setName(String name) {
	this.name = name;
}
public int getSpeed() {
	return speed;
}
public String getSize() {
	return size;
}
public String getName() {
	return name;
}
public void display() {
	System.out.println("vehicle : "+getName()+" ,size : "+getSize()+" ,speed : "+getSpeed()+" ,mileage : "+getMileage()
	+" ,color : "+this.color+" ,model : "+this.model+" ,noOfWheels : "+this.noOfWheels);
}
}
