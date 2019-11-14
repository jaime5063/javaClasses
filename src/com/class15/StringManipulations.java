package com.class15;

public class StringManipulations {

	public static void main(String[] args) {
		
		//String class comes in java lang package
		// JDK = Java Development Kit
		
		// String is a sequence of characters
		
		String lit1="String Literal";
		
		String lit2=new String("String Literal 2");
		System.out.println(lit1);
		System.out.println(lit2);
		
	
		// find the number of characters inside of String .length()
		System.out.println(lit1.length()); // integer output
		
		// case conversion methods/functions .toLowerCase()  toUpperCase()
		System.out.println(lit1.toLowerCase()); // all to lower case
		System.out.println(lit1.toUpperCase()); // all to upper case
		
		lit1=lit1.toLowerCase(); // re-assigning 
		System.out.println(lit1); // will print all lower case
		
		lit1=lit1.toLowerCase().toUpperCase(); // re-assigning 
		System.out.println(lit1); // will print all lower case
		
		// Verify if string is empty
		String myString=""; // empty value
		System.out.println(myString.isEmpty()); // boolean variable (true or false)
		
		String myString1=" "; // space value
		System.out.println(myString.isEmpty()); // boolean variable (true or false)
		
//		String myString2=null; // no value at all
//		System.out.println(myString2.isEmpty()); // nullPointerException
		
		// verify existence of characters in the string 
		System.out.println("");
		String a="Good eavening students";
		boolean exists=a.contains("students"); // boolean
		System.out.println(exists);
		
		System.out.println(a.startsWith("Good")); // true
		System.out.println(a.endsWith("student")); // false
		
		
		

	}

}
