package com.class22;

public class AccessingStaticVariables {
	
	public static void main(String[] args) {
		
		// accessing instance variables
		Husky obj = new Husky();
		System.out.println(obj.name);
		
		// accessing static variables
		System.out.println(Husky.breed);
	}
	
	/*Static: is a keyword 
	 * Static: keyword can be used with variables, methods and blocks
	 */

	/*
	 * Next Class: constructors 
	 */
}
