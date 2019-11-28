	package com.class23;

public class BetterCar {
	// constructor can initialize instance variables
	
	public static String make; // static variable (access by class name)
	public String model; // instance variables (access by creating and object)
	public String color; // instance variables (access by creating and object)
	public int speed;
	public int doors;
	
	// creating a constructor with 4 parameters
	BetterCar(String carModel, String carColor, int carSpeed, int carDoors){
		model=carModel;
		color=carColor;
		speed=carSpeed;
		doors=carDoors;
	}	
	
	public static void main(String[] args) {
		make="BMW";
		//compiler will give an error, we have to pass values when we build and object
		// those values will be passed as arguments to the constructor
		// through the constructor instance variables will get initialized
		BetterCar bcar1 = new BetterCar("X5", "Blue", 400, 2);
		bcar1.getDetails();
	}
	
	public void getDetails() {			//--> method header
		
		System.out.println("I built a "+color+" "+make+" "+model);  //--> method body
		System.out.println("My car can have speed up to "+speed+" and it has "+doors+" doors");
	}

}
