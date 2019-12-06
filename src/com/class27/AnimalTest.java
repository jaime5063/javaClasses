package com.class27;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal animal = new Monkey();
		animal.whoAmI(); //--> from parent class 
/*
 * When both methods are static within Sub and Super class it is method HIDING.
 */
		// #1 rule, to override we need to have inheritance	
		// NOTE:constructors get called by creating an object and matching parameters
	}

}
