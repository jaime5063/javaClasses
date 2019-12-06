package com.class29;

public class VehicleTest {

	public static void main(String[] args) {
/*
 * You can refer the object to the:
 * - Parent (Car class)
 * - Grandparent (Vehicle class)		
 */	
		Car car = new BMW();
		car.drive();
		car.stop();
		car.start();
		car.speed();
		car.breaking(); // this method is defined in parent of BMW class therefore it has access
		
		Vehicle car2 = new BMW();
		car2.drive();
		car2.stop();
		car2.start();
		car2.speed();
//		car2.break(); this is not deinfe in grandparent therefore it does not have access		
	}
}
