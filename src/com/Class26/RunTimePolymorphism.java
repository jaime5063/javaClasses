package com.Class26;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		
		// creating an object of parent class
		
		
		// creating object of child class
		Cat cat = new Cat();
		cat.eat();
		cat.meow();
		cat.sleep();
		
		
		
		double d = 90; // typecasting--> widening
		int i = (int)1.99; // typecasting--> narrowing
		
		// creating the object of the child class
		// - upcasting 
		// - assigning child class to the parent reference
			// parent type is now reffering to the child instead of vise-versa
		Animal obj = new Cat();
		// narrowing 
//		Cat obj2 = new Animal(); --> cannot covert from animal to cat
		obj.eat(); // method will come PARENT class
		obj.sleep(); // method will come from CHILD class --> runtime polymorphism
//		obj.meow(); --> CHILD CLASS method wont be available
		
		// IT WILL PRINT LINE 28 FROM PARENT BEACAUSE THERES NO SAME METHOD IN CHILD CLASS
		// IT WILL PRINT LINE 29 FROM CHILD BECAUSE THERE IS THE SAME METHOD AND IT WILL OVERRISED IT WITH CHILD CLASS INPUT
		// IT WILL NOT PRINT LINE 30 BECAUSE THAT METHOD DOES NOT EXIST IN PARENT CLASS
		
		
	}
}
/*
 * TypeCasting in Java: changing one type to another
 * 
 * Implicit / widening / automatically
 * Explicit / narrowing / manually
 * 
 * - primitives --> byte--> short--> integer--> long--> double
 * - non-primitive (the opposite of primitive)
 */
