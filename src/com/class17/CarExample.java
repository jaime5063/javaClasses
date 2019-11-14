package com.class17;

public class CarExample {
	
	// TEMPLATE (CLASS)
	
	//define attributes/features/variables
	String make, model, color;
	int year, wheel, windows, speed;

	
	//adding behavior/ action --> methods();
	
	// "drive" is the name of our method
	// our method will have its own body
	
	// first behavior (method) ---  void = Will not print
	void drive() {
		System.out.println("Car "+make+" can drive");
	}
	
	// Second behavior (method)
	void start() {
		System.out.println("Car "+make+" can start");
	}
	
	//third behavior (method)
	void accelerate() {
		System.out.println("Car "+make+" can accelerate");
	}

}
