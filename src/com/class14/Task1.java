package com.class14;

public class Task1 {

	public static void main(String[] args) {
		
/*Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		 * 
Create a String that should be combination of letters, numbers and special characters. 
Find out how many alpha characters are there in the String.

You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” 
How would you find out how many sentences are in that String?
*/
		
	String str1="This is the first tast of strings methods etc";
	System.out.println(str1.replace(" ", ""));
	System.out.println("---------------------------------");
	
	
	String comb="This5546%%is%%hte#1";
	System.out.println(comb.replaceAll("[^a-zA-Z]", "").length());
	System.out.println("---------------------------------");
	
	
	String sen="Is it saturday? Is it raining? Do we have a Java Class today?";
	String []cut=sen.split("\\?");
	System.out.println(cut.length);
	
		for(int i=0; i<cut.length; i++) {
			System.out.println(cut[i]);
		}
		
		
		
		
	}
}
