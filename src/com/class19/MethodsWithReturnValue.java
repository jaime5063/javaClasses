package com.class19;

public class MethodsWithReturnValue {

	public static void main(String[] args) {	
		/*
		 * Declare a string and if String has more than 10 characters 
		 * we will say String is large, else String is small
		 */
		//1st way
		String str =  "Welcome Home";
		int numOfChars = str.length(); // --> assigning a variable 
		if(numOfChars>10) {
			System.out.println("String is large");
		}else {
			System.out.println("String is small");
		}
		
		//2nd way
		String str1 = "Home";
		str1.length();				  // --> Not assigning a variable
		if(str1.length()>10) {
			System.out.println("String is large");
		}else {
			System.out.println("String is small");
		}
		
		char character = str.charAt(5);
		System.out.println(character);
		
		Recap obj = new Recap(); // --> create object of the class where method is defined
		// int num=obj.sum(10, 30); compile error saying change return type
		
		// find the larger number
		MethodsWithReturnValue obj1 = new MethodsWithReturnValue();
		int larger = obj1.findLargest(10, 20);
		System.out.println(larger);
	}
	// find the larger number
		int findLargest(int num1, int num2) {
				
			int largest;
			if(num1>num2) {
				largest=num1;
			}else {
				largest=num2;
			}
			return largest;
	
	}
	
		
		

	}


