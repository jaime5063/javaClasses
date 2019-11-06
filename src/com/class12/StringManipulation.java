package com.class12;

public class StringManipulation {

	public static void main(String[] args) {
		
		// String - is a Java class
		
		// 2 Ways to create String objects
		
		// First way
		// String literal
		String name="John";
		System.out.println(name);		
		System.out.println(name.length());
		
			
		// Second way
		// String with new keyword
		String name1=new String("John1");
			
		
		/*
		 * This method returns the length of this string.
		 * The length is equal to the number
		 * of 16-bit Unicode characters in the string
		 */
		int name1Len=name.length();
		System.out.println("The length of name1Len is= "+name1Len);
		
		// .toLowerCase
		String str1="HeLlo WoRld";
		System.out.println("Before: "+str1);
		str1=str1.toLowerCase();
		System.out.println("After: "+str1);
		
		System.out.println("---------------------");
		
		//.equals()
		String str2="HeLlO WORld";
		
		boolean isEqual=str1.equals(str2);
		System.out.println(isEqual);
		
		//.equalsIgnoreCase();
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println("---------------------");
		
		
		// .toUpperCase
		String str3="Mohammad";
		System.out.println("Before: "+str3);
		str3=str3.toUpperCase();
		System.out.println("After: "+str3);
		System.out.println("---------------------");
		System.out.println("---------------------");
		
		
		// .startsWith
		String strA="It is very hot in the class";
		System.out.println("Does this string start with 'It'?: "+strA.startsWith("It"));
		System.out.println("Does this string start with 'it'?: "+strA.startsWith("it"));	
		// .endsWith
		System.out.println("Does this string end with 'class'?: "+strA.endsWith("class"));
		System.out.println("Does this string end with 'Class'?: "+strA.endsWith("Class"));
		
		
		
	}
}
