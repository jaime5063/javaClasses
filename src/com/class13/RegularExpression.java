package com.class13;

public class RegularExpression {

	public static void main(String[] args) {

/*
 * Print only text not numbers		
 */		
		String str="12345Hel12345lo12345";	
		System.out.println(str.replaceAll("[0-9]", ""));
		System.out.println(str.replaceAll("[^0-9]", "")); // ^ =not...replace whatever is not from 0-9
		System.out.println(str.replaceAll("[a-zA-Z]", "")); // Replace all the letters from a-z lower and capital		
		
		//remove eveything expect text and numbers
		String str2="221121HOwjja#41!!isnMM";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", "")); // keeping letters upper and lower with numbers
		System.out.println(str2.replaceAll("[a-zA-Z0-9]", "")); // keeping only the symbols
		
		
		String str1="12-22-1990"; //12/22/1990
		System.out.println(str1.replace('-', '/'));
		System.out.println(str1.replaceFirst("-", "/")); // only convert the first
		

	}

}
