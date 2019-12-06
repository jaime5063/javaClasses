package com.class29;

public abstract class Vehicle {

	public void drive(){
		System.out.println("vehicle can drive");
	}	
	public void stop() {
		System.out.println("Vehicle can stop");
	}	
	public abstract void start();	
	public abstract void speed();
}
abstract class Car extends Vehicle{
	@Override
	public void speed() {
		System.out.println("Max car soeed uo to 400");
	}
	public abstract void breaking();
}
class BMW extends Car{
	@Override
	public void start() {
		System.out.println("BMW starts remotely");
	}
	@Override
	public void breaking() {
		System.out.println("BMW can break");
	}
}









