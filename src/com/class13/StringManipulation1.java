package com.class13;

public class StringManipulation1 {

	public static void main(String[] args) {
		
		// substring method
//		String str="Java is getting interesting";
//		
//		System.out.println(str.substring(15)); // give beginning index		
//		System.out.println(str.substring(8, 15)); // vie beginning and end index (Much more useful)
//		
		//task
		
		
		String reverse="Testing a String";		
//		System.out.print(reverse.substring(10, 16)+" ");
//		System.out.print(reverse.substring(8, 9)+" ");
//		System.out.print(reverse.substring(0, 8));
		for(int i=0; i>=reverse.length(); i--) {
			System.out.println(reverse.charAt(0));
		}

		
		// task 2
		String Test="Hello";
		
		if(!Test.isEmpty()) {
			if(Test.length()%2!=0) {
				System.out.println(Test.substring(2));
			}else {
				System.out.println("String is even");
			}
		}
		
		//teacher solution
		
		
		

	}

}
