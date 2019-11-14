package com.class14;

public class InterviewQuestions {

	public static void main(String[] args) {
		
		// Write a program to swap 2 numbers without a temporary variable?
		// Swap 2 strings without a temporary variable
		
		int one=20;
		int two=10;		
		int swap;	
		swap=one;
		one=two;	
		two=swap;
		System.out.println(one);
		System.out.println(two);
		
		
		//find out how many alpha characters present in a string 
		
		String alpha="Alpha characters";
		String cut=alpha.replace(" ", "");
		System.out.println(cut.length());

		
		// Write a Java program to find whether a String is palindrome or not
		
		String pal="noon";
		String str="";
		
		int size=pal.length();
		for(int i=size-1; i>=0; i--) { // decrement to reverse index print
			
			str=str+pal.charAt(i); //Will Print:  .n  .no  .noo  .noon
			System.out.println(str); // ^^^
		}
		if(pal.equalsIgnoreCase(str)) { // once the loop completes, compare str to string pal
			System.out.println("This is palindrome.");
		}else {
			System.out.println("This is not palindrome.");
		}
		
		
		
		

	}

}
