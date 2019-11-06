package com.class12;

public class StringContains {

	public static void main(String[] args) {
		
	/*
	 *  .contains
	 */
	String sentence="It was raining";
	String sen="Raining";
	System.out.println(sentence.contains("was"));
	System.out.println(sentence.contains("Was")); // contains charscters                                                                                     
	System.out.println(sen.contains(sentence)); // contains a sequence of characters
		
		
	System.out.println("--------------------------------------------");
	// TASK
	// Create two String and initialize them with some value.
	// implement the following methods on those strings
	
	/*
	sen.length();
	sen.equals();
	sen.contains(s);
    sen.toUpperCase();
    sen.toLowerCase();
    sen.equalsIgnoreCase(anotherString);
	 */
	
	String basic="I love java";
	String basic1="i love JaVa";
	String basic2="Java class is fun";
	// .length
	System.out.println(basic.length());
	System.out.println(basic2.length());
	System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	// .equals
	System.out.println(basic.equals(basic1)); // expected = false
	System.out.println(basic.equalsIgnoreCase(basic1)); // expected = true (.ignore case)
	System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	// .contains
	System.out.println(basic2.contains("class")); // = true
	System.out.println(basic2.contains("ClaSs")); // = false
	System.out.println(basic.contains(basic1)); // = false
	System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	// .toUpperCase
	System.out.println(basic.toUpperCase());
	System.out.println(basic1.toUpperCase());
	System.out.println(basic2.toUpperCase());
	System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	// .toLowerCase
	System.out.println(basic.toLowerCase());
	System.out.println(basic1.toLowerCase());
	System.out.println(basic2.toLowerCase());
	System.out.println(" ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	// .equalsIgnoreCase
	System.out.println(basic.equalsIgnoreCase(basic1)); // = true
	System.out.println(basic2.equalsIgnoreCase(basic)); // = false
	System.out.println(basic.equalsIgnoreCase(basic)); // = true
	
	
	}

}
