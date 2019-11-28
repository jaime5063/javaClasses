package com.class23;

public class CarTest {

	public static void main(String[] args) {
		
		// we access static variables with the class name
		Car.make="Toyota";
		Car car1=new Car();
		car1.model="Camry";
		car1.color="Red";
		car1.speed=200;
		car1.doors=4;
		car1.getDetails();
		
		//Will remain
		Car car2=new Car();
		car2.model="Corolla";
		car2.color="Blue";
		car2.speed=150;
		car2.doors=2;
		car2.getDetails();
		
		
		Car car3=new Car();
		car3.model="Preus";
		car3.color="Green";
		car3.getDetails();
		
		
		//from "betterCar" class constructor with 2 String parameters and 2 integer parameters
		BetterCar betterCar1=new BetterCar("Toyota", "White", 180, 5);
		betterCar1.getDetails();

	}

}
