package com.class13;

public class RegularExpression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Today is out java class";
		
		// Replace space with nothing 
		System.out.println(str.replace(" ", ""));
		System.out.println(str.replaceAll("\\s", ""));
		
		
	}

}
