package com.class13;

public class replaceMethodStringClass {

	public static void main(String[] args) {
		
		//replaceMethod
		
		String str="Hello Dear Dan, how are you, How have you been Dan?";
		
		System.out.println(str.replace('e', 'z')); // changes all occurences of character given
		
		System.out.println(str.replace("Dan", "Customer")); // changes all string to new string 
		
		System.out.println(str.replaceFirst("Dan", "Bob")); // only the first occurence of string 
		
		
		
		
	}

}
