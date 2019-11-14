package com.class16;

public class IntReviewQustn3 {

	public static void main(String[] args) {
		
		// 1. find the length of alpha characters
//		String str="Hello 68768892 &*^^ welcodmsjshcnaoII!!!!";		
//		str = str.replace("[^a-zA-z]", ""); // remove all characters except a-zA-Z
//		System.out.println(str.length());
//-----------------------------------------------------------------------------------------			
		
		// 2. find out the part of the string from a string? what is a substring? find out
		// the numbers of words in String ?
//		String str="Today is very cold outside";
//		String subStr = str.substring(0,5); // print from index 0-5
//		System.out.println(subStr);
		
		// the numbers of words in String ?
		// Step 1: split based on the space ---> array of String
		// Step 2: find the length of an array
//		String[] words=str.split(" ");
//		System.out.println("The length of str = "+words.length);
//-----------------------------------------------------------------------------------------		
		
		// 3. Write a java program to reverse String
		// Reverse a String word by word?
		String given="Welcome to Java class";
			/* Step 1: split() ---> Array of strings
			 * Step 2: Use for Loop ---> use decrement to print values	 
			 */
		String reverse=""; // this will allow us to create a string and we can change the string to anything and reverse it 
		String[] givenA=given.split("\\s");
		for(int i=givenA.length-1; i>=0; i--) {
			reverse=reverse+givenA[i]+" "; // this allows us to create a string and make it dinamic
		}
		System.out.println(reverse);
		System.out.println(" ");
//-----------------------------------------------------------------------------------------			
		
		// Write java program to reverse String
		// Step 1: toCharArray(); charAt();
		System.out.println("Using toCharArray");
//		String conclusion="";					---> same as line 46(creating a variable)
		String name="This is an array string";
		char [] array=name.toCharArray();
		for(int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]);
//			conclusion=conclusion+array[i];		---> same as line 46(creating a variable)
		}
//		System.out.println(conclusion); 	---> same as line 46(creating a variable)
		System.out.println(" ");
		System.out.println(" ");
//-----------------------------------------------------------------------------------------			
		// Reverse string using charAt(); 
		System.out.println("Using charAt:");
		String word3="I love Java";
		for(int i=word3.length()-1; i>=0; i--) {
			System.out.print(word3.charAt(i));
		}
System.out.println(" ");
System.out.println(" ");
//-----------------------------------------------------------------------------------------			
	
	//Write a Java program to find wether a String is palindrome or not
	// if reverse string spells same name ---> string is palindrome
	// dad, mom, racecar, madam

	// Logic:
	// Step 1: Reverse the String
	// Step 2: compare 2 Strings
		// if Strings are equal = palindrome
		// if not equal = Not palindrome

	String original="mom";
	String reversed="";
		//5-1
	for(int i=original.length()-1; i>=0; i--) {
		reversed=reversed+original.charAt(i); //""+k, k+a, ka+y, kay+a, kaya+k.
	}
	System.out.println(reversed);
	
	if(original.equals(reversed)) {
		System.out.println("String is palindrome");
	}else {
		System.out.println("String is not palindrome");
	}
//-----------------------------------------------------------------------------------------

	// Write a java program to check whether a given number is prime or not
	// - prime number is a number that has to meet 2 condition
		// should be divisible by 1 and by itself only
	// 2, 3, 5, 7, 11, 13, 17, 19, 23
	
		// take range of numbers from 1-100 and print all prime numbers
		int num = 3;
		boolean isPrime = true;

		if (num <= 0 || num == 1) { // remove 0's and 1's
			isPrime = false; // if thats the case, then we will ignore loop and jump to line 114 (false)
		} else {

			for (int i = 2; i < num; i++) {

				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println(num + " is a Prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
//-----------------------------------------------------------------------------------------	

	// Write a Java program to prints first 10 numbers of Fibonacci series
		// Fibonacci numbers: 
		// 0+1=1
		// 1+1=2
		// 1+2=3
		// 2+3=5
		// 3+5=8
		// 5+8=13		
		int a, b, c;
		a = 0;
		b = 1;

		for (int i = 0; i <= 10; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
//-----------------------------------------------------------------------------------------		
	
	




	}

}
