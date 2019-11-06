package com.class14;


public class StringMethodsRecap {

	public static void main(String[] args) {
		
		
		// .replace
		String str="your Syntax Technologies. is your place to study";
		System.out.println(str.replace('y', 'i'));
		// Print: "iour Sintax Technologies"
		
		System.out.println(str.replace("your", "My"));
		// Print: "My Syntax Technologies. is My place to study"
		
		//-----------------------------------------------------------------
		
		// .replaceAll
		String str2="sjwaku47892389HjLL0";
		String str3="This is the string that will be tested in Java class";
		
		// Do NOT remove numbers
		System.out.println(str2.replaceAll("[^0-9]", ""));
		
		// Remove ONLY numbers and NOT letters
		System.out.println(str2.replaceAll("[0-9]", ""));
		
		// Remove everything after the given word (including the given word)
		System.out.println(str3.replaceAll("that(.*)", ""));

		// Replace the first one
		// Example replace the space with nothing 
		System.out.println(str3.replaceFirst(" ", ""));

	}

}
