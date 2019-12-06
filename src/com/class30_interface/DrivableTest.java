package com.class30_interface;

public class DrivableTest {
	public static void main(String []args) {
	
	Drivable obj = new Toyota();
	obj.drive();
//	obj.DRIVE_FAST = false;  // --> in interface all variables are final therefore cannot be changed
	
	Toyota toyota = new Toyota();
	toyota.drive();
	toyota.stop();
	
	BOA obj2 = new BOA();
	obj2.checkingAccount();
	obj2.savingAccount();
	obj2.Trust();
	
	
	}
}
