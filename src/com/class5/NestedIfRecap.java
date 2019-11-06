package com.class5;

public class NestedIfRecap {
	
	public static void main(String[] args) {
		
		boolean isDisplayed=true;
		String buttonText="Sign in";
		
		if(isDisplayed) {
			System.out.println("Button is Displayed"); // Condition is true, will print
			if(buttonText.equals("Sign In")){	// Condition false due to lower case i , will not Print
				System.out.println("Test Case Passed"); // Condition false due to lower case i , will not Print
			}else {
				System.out.println("Wrong Text is displayed"); // Condition is true, will Print
			}
		}else {
			System.out.println("Button is not Displayed"); // Will not print due to line 11 being true 
		}
		
	}

}
