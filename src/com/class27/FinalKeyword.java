package com.class27;

public class FinalKeyword {
	
	public final String str = "Hello";

	public static void main(String[] args) {
		
		String str = "I am awsome";
		str="I am cool";
		System.out.println(str);
		
		// variable of 'final' type
		final String finalString = "Java is easy";
//		finalString="Java is hard";

		final int age=120;
//		age=100;
		
		//NOTE: usually 'final' is used with static as such;
			//public static final str1 ="Hello";	
	}
}
class FinalKeywordChild extends FinalKeyword{
	public final void Hey() {
		System.out.println("Hello");
	}
	public final void Hey(String one) {
		System.out.println("Hello 22");
	}
	// we can overload as above example. But we cannot override
	
	// if you set your class as final: 
		// it cannot have any inheritance 
		// you cannot have a subClass
}
/*
 * 'final' keyword with:
 * 	variables --> makes variable to have a constant value, you cannot change the value of that 
 * 		variable later in that code.
 * 
 * 	methods --> it prevents overriding process, final methods cannot be overridden in the child class
 * 
 * 	classes --> prevent inheritance, class defined as final cannot have subclasses.
 * 
 * 
 */













