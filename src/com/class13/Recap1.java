package com.class13;

public class Recap1 {

	public static void main(String[] args) {
		
		//String class is immutable = cannot be changes
		
		String str1= "Hello"; // String literal. create and initialize a value
		String str3= "Hello";
		// stre3 value of "Hello" will not take up the memory due to java using the memory from str1 to save memory
				
		String str4 = str1.concat("World");
		
		
		System.out.println(str4);
		String str2=new String("Hello"); 
		
		
		
		
		
		
		

	}

}
