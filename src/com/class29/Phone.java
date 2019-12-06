package com.class29;

public abstract class Phone {
	// implemented methods (has body)
	public void makeCall() {
		System.out.println("Make call"); // implemented method (when it has a body)
	}
	
	public void sendText() {
		System.out.println("Send text"); // implemented method 
	}
	// unimplemented methods (no body)
	public abstract void takePictures();
	
	public abstract void playGames();
	}
// concrete class (everything is defined)
class iPhone extends Phone{  // in order to 'extends' child class, you will have to provide full implementation for
							 // unimplemented methods of parent class.
	@Override
	public void takePictures() {
		System.out.println("iPhone takes pictures");
	}

	@Override
	public void playGames() {
		System.out.println("Play games on iPhone");
	}
}
// concrete class (everything is defined)
class Samsung extends Phone{

	@Override
	public void takePictures() {
		System.out.println("Samsung takes pictures");
	}

	@Override
	public void playGames() {
		System.out.println("Play games on Samsung");
	}
	
}
/* In an 'abstract' class 
 * 
 * you can have implemented methods (body)
 * you can have unimplemented methods (no body)
 * - as many as you want as long as you have an idea of what your class should do
 * 
 * When can we create the object?
 * - NO--> If only half the methods are defined, you do not have a full class yet. (not 100% complete)
 * - YES--> Once class is defined, 'concrete class' you can now create the object. (100% complete)
 * 
 * 
 */
