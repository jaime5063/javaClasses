package com.class15;

public class Replace {

	public static void main(String[] args) {

		// Replace
		// if it finds the match, it will replace
		String str="Java classes at Syntax are awesome";
		String aw=str.replace("awesome", "Great"); // IF it finds, it will replace
		System.out.println(aw);
		
		String cap=str.replace("a", "AA");
		System.out.println(cap);
		
		//replaceAll --> specify regular function		
		// remove all special characters
		String spclChar=str.replaceAll("[^a-zA-Z0-9]", " "); 
		System.out.println(spclChar + " - Replaced all special characters");
		
		
		// split - returns array of string
		String myString="Java classes at Syntax are awesome";
		String[] spli=myString.split("c"); // will return an array of strings
		System.out.println(spli.length);
		
		

	}

}
