package com.inheritance;

public class City {
Car car =new Car();
Bus bus =new Bus();
Truck truck=new Truck();
public void cityDisplay() {
	truck.display();
	car.display();
	bus.display();
}

}








/*Vehicle vehicle;
String name;
public City(String name) {
	this.name=name;
}
public void setVehicle(Vehicle vehicle) {
	this.vehicle=vehicle;
}
public void display() {
	System.out.println("vehicle : "+name+" ,size : "+vehicle.getSize()+" ,speed : "+vehicle.getSpeed()+" ,mileage : "+vehicle.getMileage()
	+" ,color : "+vehicle.color+" ,model : "+vehicle.model+" ,noOfWheels : "+vehicle.noOfWheels);
}*/