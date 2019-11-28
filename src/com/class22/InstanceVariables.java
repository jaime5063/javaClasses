package com.class22;

public class InstanceVariables {
	
	String name="Samir";  // --> an instance variable

	
	public static void main(String[] args) {
	
		String name="Burcu"; // --> a local variable
		System.out.println(name);
		
		InstanceVariables obj = new InstanceVariables(); // Creating the object to access our instance variable
		System.out.println(obj.name);
		
		obj.name = "John";
		System.out.println(obj.name); // Changing the value of our instance variable
		
		InstanceVariables obj1 = new InstanceVariables(); 
		System.out.println(obj1.name); // We created another object therefore it went back to the original instance variable
		
	}
	
	/*
	 *  Types of variables:
	 *  	- LOCAL
	 *  
	 *  	- INSTANCE
	 *  
	 *  	- STATIC: variables defined inside the class but outside ANY methods, constructor or a block
	 *  		- When To Use: if its within same class it can be accessed by its variable name EX: brain, eyes, nose.
	 *  		- declared with static keyword
	 *  		- whenever you want to use the same variables within all the classes
	 */
	
}
