package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		
		// SplitMethod
		// This method splits this string around matches of the given regular expression
		
		String str="Video provides a powerful way to help you prove your point";
		
		//split the following string into array of string/work
		String[] array=str.split(" ");
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("----------------------------------------------------------------");
		
		// How can we find how many sentences are in the following string?
		String str1="Today is Sunday. Its sunny day. and we are having java class";
		
		//WE CONVERT INTO ARRAY OF STRING (FIRST)
		String[] array2=str1.split("\\."); // we needed the backslash for java to recognize the period
		System.out.println(array2.length); // THIS IS HOW WE FIND OUT HOW MANY SENTENCES WE HAVE (SECOND)
		
		for(String string : array2) {
			System.out.println(string.trim()); // we removed the spaces
		};
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
