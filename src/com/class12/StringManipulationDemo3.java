package com.class12;

public class StringManipulationDemo3 {

	public static void main(String[] args) {
		
	// .isEmpty
		// This method checks whether a String is empty or not.
		
		
		String str="";
		System.out.println("Is this string empty?: "+str.isEmpty()); // true
		String str1="Hello";
		System.out.println("Is this string empty?: "+str1.isEmpty()); // false
		
		// EXAMPLE
//		if(!str.isEmpty()) {					// ---> IF NOT EMPTY
//			System.out.println("This is not empty");
//		}else {
//			System.out.println("This is empty string");
//		}
		// using the \n allows your to print in next line
		String sent="Each day has a promise to brighten up the day, \n but first you must allo the sun to come your way";
		System.out.println(sent);
		
		
		System.out.println("----------------------------------------------------------");
		
		/*
		 * This method apends one String to the end of another
		 * 
		 */
		// CONCAT
		String str3="Hello";
		String str4="World";
		String str5="People";
		System.out.println(str3.concat(str4));
		System.out.println(str4+str3);
		System.out.println(str3.concat(str4+str5));
		                     
		System.out.println("----------------------------------------------------------");


		// .trim
		String str6=" How are you? ";
		
		System.out.println(str6);
		System.out.println(str6.trim());
		
		System.out.println("----------------------------------------------------------");
		
		// - method returns the character located at the String's specific index
		// .charAt
		String str7="We might be done early today";
		System.out.println(str7.charAt(4)); // what do i have on index (CHOOSE INDEX)

		// .indexOf
		System.out.println(str7.indexOf('m')); // which is the index of a character (Only first occurence of given letter)
		
		System.out.println("----------------------------------------------------------");
		
		
		
		
	}

}
