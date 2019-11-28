package com.class23;

public class Car {
/*
 * We want to build Toyota cars that will have different 
 * Models and Colors	
 */

	public static String make; // static variable (access by class name)
	public String model; // instance variables (access by creating and object)
	public String color; // instance variables (access by creating and object)
	public int speed;
	public int doors;
	
	
	public void getDetails() {			//--> method header
		
		System.out.println("I built a "+color+" "+make+" "+model);  //--> method body
		System.out.println("My car can have speed up to "+speed+" and it has "+doors+" doors");
	}
	
	

}
