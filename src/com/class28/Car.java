package com.class28;

public class Car {
	
	String make, model;
	
	Car(){
		System.out.println("I am a non argument constructor");
	}
	
	Car(String make, String model){
		this.make = make;
		this.model = model;
	}

}

class Tesla extends Car{
	boolean autopilot;
	
	Tesla(){
		super(); // used to call parent class constructor Car() ____compiler automatically adds .
		System.out.println("I am a child non argument constructor");
	}
	
	Tesla(String make, String model, boolean autopilot){
		super(make, model); // passed to call parent class constructor: Car(String make, String model)
		this.autopilot = autopilot;
	}
	
	public void displayInfo() {
		System.out.println("Car "+make+" "+model+" has autopilot "+autopilot);
	}
	
	
}
