package com.class29;

public class PhoneTest {

	public static void main(String[] args) {

//		cannot create object of the abstract class
//		- we can define general functionality. Implementation can be hidden until child class		
//		Phone phone = new Phone(); --> cannot instantiate because class is only 50% defined (cannot create object)
		
// 		we can create it indirectly
//		create object of parent and refer it to child class 		
		Phone phone= new iPhone();
		phone.makeCall(); // parent
		phone.sendText(); // parent
		phone.takePictures(); // child class
		phone.playGames(); // child class

	}

}
