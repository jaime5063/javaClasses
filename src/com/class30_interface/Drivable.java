package com.class30_interface;

public interface Drivable {
	//public static final variable
	boolean DRIVE_FAST = true; // constant variables are written using UPPERcase (naming convention)
	
	//By default your compiler will add 'public abstract' to the methods
	void drive();
}
class Cars{
	public void stop() {
		System.out.println("Car stops by pressing breaks");
	}
}
class Toyota extends Cars implements Drivable{
	@Override
	public void drive() {
		System.out.println("Toyota can drive");
	}	
}
