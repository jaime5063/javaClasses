package com.class18;
public class Task {	
	public static void main(String[] args) {	
	Task obj=new Task();
	// check for larger number
	obj.largerNum(30, 10);
	obj.largerNum(10, 55);	
	// check if number is even or odd
	obj.evenOdd(3);
	obj.evenOdd(8);
	// check if number is palindrome
	obj.palindrome("haah");
	obj.palindrome("Test2");
	}
	/*
	 * Create a method that will take 2 parameters as a number
	 * and prints which number is larger
	 */
	void largerNum(int a, int b) {		
		if(a>b) {
			System.out.println(a+" is the larger number");
		}else {
			System.out.println(b+" is the larger number");
		}	
	}
	/*
	 * Create a method that will take a number and prints whether
	 * the number is even or odd
	 */
	void evenOdd(int number) {		
		if(number%2==0) {
			System.out.println(number+" number is even");
		}else {
			System.out.println(number+" number is odd");
		}
	}
	/*
	 * Create a method that will print whether given String
	 * is palindrome or not
	 */
	void palindrome(String pal) {		
		String reversed="";						 //--> put in "" to have a blank String
		for (int i=pal.length()-1; i>=0; i--) {  //--> Reverse String starting at larger index and then decrement
			reversed=reversed+pal.charAt(i);	 //--> replacing String with input word at character i
		}
		if(pal.equals(reversed)) {				 //--> conditional statement .equals word you will input in pal
			System.out.println("Palindrome");    //--> Print statement if words match after reversed
		}else {
			System.out.println("Not Palindrome");//--> Print statement if words do not match with original after reversed
		}
	}
	
	
	
}