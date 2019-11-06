package com.class5;

public class LogicalNot {
	
	public static void main(String[] args) {
		
		// NOT operator
		// --> reverts your condition
		
		boolean b1=!true;
			// the value of b1 is NOT true
		boolean b2=!false;
			// the value of b2 is NOT false
		System.out.println(b1); // --> false
		System.out.println(b2); // --> true
		//___________________________________
		
		boolean traffic=true;		
		if(!traffic) {
			System.out.println("Hello"); // --> will print
		}else {
			System.out.println("Bye");
		}
			// with NOT, we are reverting traffic from true to false
		
		
		boolean traffic1=false;		
		if(!traffic1) {
			System.out.println("Hello"); //--> will print
		}else {
			System.out.println("Bye");
		}
			// with NOT, we are reverting traffic from false to true
		//_______________________________________
		
		// using int #1
		int num1=10;
		int num2=10;
		
		if(num1==num2) {
			System.out.println("Example 1 Numbers are equal");
		}else {
			System.out.println("Numbers are NOT equal");
		}
		
		// using int #2
		int num3=10;
		int num4=10;
		
		if(!(num3==num4)) {
			System.out.println("Numbers are NOT equal");
		}else {
			System.out.println("Numbers are equal");
		}
		//_______________________________________
		
		
		// using strings with NOT operator
		
		String newName= "Mary";
		String newName1= "Anna";
		
		if(!(newName.equals("Mary")) || (newName.equals("Anna"))){// the NOT condition makes it false therefore wont print
			System.out.println("You are my sister");
		}else {
			System.out.println("You are not my sister");
		}
		
		
		
		
	}

}
