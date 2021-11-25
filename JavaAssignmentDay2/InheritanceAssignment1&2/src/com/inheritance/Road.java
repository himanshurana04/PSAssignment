package com.inheritance;

public class Road  {

	Truck truck=new Truck();
	Bus bus=new Bus();
	Car car =new Car();
	
	public void display() {
		System.out.println("Truck  size : "+truck.getSize()+" ,speed : "+truck.getSpeed()+" ,mileage : "+truck.getMileage()
		+" ,color : "+truck.color+" ,model : "+truck.model+" ,noOfWheels : "+truck.noOfWheels);
		System.out.println("Car  size : "+car.getSize()+" ,speed : "+car.getSpeed()+" ,mileage : "+car.getMileage()
		+" ,color : "+car.color+" ,model : "+car.model+" ,noOfWheels : "+car.noOfWheels);
		System.out.println("Bus  size : "+bus.getSize()+" ,speed : "+bus.getSpeed()+" ,mileage : "+bus.getMileage()
		+" ,color : "+bus.color+" ,model : "+bus.model+" ,noOfWheels : "+bus.noOfWheels);
	}
}

