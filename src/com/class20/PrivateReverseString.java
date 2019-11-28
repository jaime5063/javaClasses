package com.class20;

public class PrivateReverseString {
	
//	double negative(double num) {
//		double neg = num *= -1;
//		return num;	
	private String revereseString(String name) {
		String reversed="";
		for(int i=name.length()-1;i>=0; i--) {
			reversed += name.charAt(i);
		}
		return reversed;
	}
/* Create a method that will take a String and
 * 	return whether String is palindrome or not.
 * Method should be available to all classes within your project
 */
	public boolean pal(String text) {
		boolean isPali = false;
		String reverse = "";
		
		for(int i=text.length()-1; i>=0; i--) {
			reverse = reverse+text.charAt(i);
		}
		if (text.equalsIgnoreCase(reverse)) {
			isPali = true;
		} else {
			isPali = false;
		}
		return isPali;
		
	}
	
	// method take String and return array
	// make available within same class
	
	private String [] arrayOfWords(String sentence) {
		String[] stringArray = sentence.split(" "); // get whatever is between the spaces in a sentence (get the words)
		return stringArray;
		
// short way: return stringArray		
	}
	
	

	
	public static void main(String [] args) {
		PrivateReverseString rev = new PrivateReverseString();
		
		// Reverse string
		String reversing = rev.revereseString("Syntax Class");
		System.out.println(reversing);
		
		// Palindrome
		boolean palindrome = rev.pal("Naami");
		System.out.println(palindrome);
	}
}





