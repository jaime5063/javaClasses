package com.class17;

public class ObjectsOfCarClass {
	
	public static void main(String[] args) {
		
		//to create an object syntax is
		//ClassName variable=new ClassName();
		
		// new keyword creates a new object
		// here we have 2 objects
		
		CarExample car1=new CarExample();
		
		car1.make="Tesla";
		car1.model="S";
		car1.color="Black";
		car1.year=2020;
		car1.wheel=4;
		car1.windows=5;
		car1.speed=200;
		// Accessing behavior for car 1
		car1.start();
		car1.accelerate();
		car1.drive();

		
		
		
		System.out.println("-----");
		CarExample car2=new CarExample();
		car2.make="BMW";
		car2.model="i8";
		car2.color="Black";
		car2.year=2019;
		car2.wheel=4;
		car2.windows=6;
		car2.speed=250;
		// Accessing behavior for car 2
		car2.start();
		car2.accelerate();
		car2.drive();
		
		//Print: I have a black Tesla		
		System.out.println("I have "+car1.color+" "+car1.make);
		
		//Print: I drive 2019 BMW
		System.out.println("I drive a "+car2.year+" "+car2.make);
		
		
		
		
	}

}
