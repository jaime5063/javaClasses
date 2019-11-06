package com.class14;

public class RexapStringManipulation {

	public static void main(String[] args) {
		// SIDE NOTE: COMPUTERS MUST BE AT LEAST 8GB OF MEMORY
		
		// What is an object?
			// Entity that state, behavior and has an identity
			// in coding every object has a certain behavior
				// Example an object of String Class
			// Computer class object only have behavior when you run it 

		
		//replace
		// String is immutable therefore it can only be replaced not changed
		String str=new String("Hello");
		System.out.println(str);
		String str2=str.replaceAll("Hello", "Bye");
		System.out.println(str2);
		String str3="Hello";
		
		// Example of ==
		System.out.println(str==str3); // compares if they are pointing to the same OBJECT NOT THE CONTENT
		// .equals (compare the content)
		System.out.println(str.equals(str3)); // compares the CONTENT in the string 
		
		
		
		
		
		
		
		
		

	}

}
