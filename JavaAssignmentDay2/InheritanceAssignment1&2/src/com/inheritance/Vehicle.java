package com.inheritance;

public class Vehicle {
private int speed,mileage;
private String size;
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
public int getSpeed() {
	return speed;
}
public String getSize() {
	return size;
}

}
