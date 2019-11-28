package com.class24;

public class ThisWithConstructor {

	ThisWithConstructor(){
		System.out.println("I am non argument constructor");
	}
	ThisWithConstructor(String str){
		this(); //used to call current class constructor. Calling constructor with no parameters
		System.out.println("I am constructor with 1 parameter");
	}
	ThisWithConstructor(String str, String str1){
		this("Hello"); // calling constructor with 1 String parameter
		System.out.println("I am a constructor with 2 parameters");
	}
	
	
	public static void main(String[] args) {
		
		ThisWithConstructor obj = new ThisWithConstructor("Hello");
		// can we execute 2 constructors when creating an object?
		// Yes - it can be achieved using this keyword this() ...to call current class constructor
		System.out.println("----");
		
		// 1. calling constructor with 2 String parameters. 
		// 2. execute body of constructor called
		ThisWithConstructor obj1 = new ThisWithConstructor("Hello", "Bye");
		/*PRINT:
		 * I am non argument constructor  --> from this
		   I am constructor with 1 parameter
		   I am a constructor with 2 parameters
		 */
		
		
		// CONSTRUCTOR VS METHOD (DIFFERENCES)
		// 1.constructor does not have any return type. not even void
		// 			method uses return type. Can have any
		// 2. Constructor Must be same name as class, method can be ANY name
		// 3. Constructor CANNOT use any non access modifiers, while method can(static, final, abstract)
		// 4. Constructor call happens automatically when object/instance of the class is getting created, method must be called
		// 5. Constructor initializes the object, while method performs some specific functionalities, by suing method we 
		//			describe behavior of the object
		
		/*SIMILARITIES:
		 * - both can have or do not have parameters
		 * - both can use access modifiers
		 */
		
	}
	
}
