package com.class13;

public class Recap2 {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="Hello";
		// the content in both strings is exactly the same.
		
		String str3=new String("Bye");
		String str4=new String("Bye");
		// reference variables are pointing to different objects
		
		
		
		System.out.println(str3.equals(str4)); // true
		// .equals looks at the content
		
		System.out.println(str3==str4); // false
		// == compares two string reference variables, are they pointing to the exact same object.
		
		/*
         * str.isEmpty();
        str.length();
    str.toUpperCase();
    str.toLowerCase();
    str.equals();
    str.equalsIgnoreCase();
    str.contains(s);
    str.startsWith(String prefix);
    str.endsWith(String suffix);
    str.concat(String str);
    str.trim();
    str.charAt(int index);
    str.indexOf(int ch);
         */
		

	}

}
