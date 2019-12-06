package com.class27;

public class Animal {
	
	// Overriding static methods
	// 1. must have inheritance
		// cannot override static method
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
}		
	class Monkey extends Animal{
		// cannot override static methods with instance methods
	//	public void whoAmI() {
	//	}
	//	@Override --> Not overriding, we are achieving METHOD HIDING. (for Static methods)
		public static void whoAmI() {
			System.out.println("I am a monkey");
	}
}
