package com.class15;

public class StringMoreExamples {

	public static void main(String[] args) {
		
		// get specific character at specific postion
		
		// charAt
		String str="Syntax Technologies inc";
		
		char ch=str.charAt(5);
		System.out.println(ch);
		// OR
		System.out.println(str.charAt(8));
		
		
//		System.out.println(str.charAt(str.length())); // out of bounce exception
		
		// Get me LAST CHARACTER of index position
		System.out.println(str.charAt(str.length()-1)); 
		
		// get a substring from a string
		// print "Syntax"
		String substring1=str.substring(0, 6);
		System.out.println(substring1);
		
		// print "Technologies inc"
		String substring2=str.substring(7);
		System.out.println(substring2);
		System.out.println(substring2.toUpperCase()); // print in upper case

		
		
	}

}
