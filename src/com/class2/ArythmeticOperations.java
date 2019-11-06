package com.class2;


public class ArythmeticOperations {

	public static void main(String[] args) {
		/*
		 * declare 2 variables and initialize them
		 * display result of addition, subtraction, multiplication and division
		 */
		
		int num1, num2;
		
		num1=20;
		num2=10;
		
		System.out.println(num1+num2); //=30   //add
		System.out.println(num1-num2); //=10   //subtract
		System.out.println(num1*num2); //=200  //multiply
		System.out.println(num1/num2); //=2    //divide
		
		//gives you the value of num1 and num2 without adding them together
		System.out.println(num1+","+num2);
		
		//2nd way of performing addition, subtract, divide and multiply
		//different way to assign and perform a mathematical operation
		//You assign a value to your variable and you can use them in the future
		int sum=num1+num2; 
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		//You can also print out this way
		System.out.println("Printing all variable values together: "+sum+","+sub+","+mult+","+div);
		
		
		//1st Task
		//the addition of 2 numbers is ___
		
		String message1="The addition of ";
		String message2="The subtraction of ";
		String message3="The muliplication of ";
		String message4="The division of ";
		byte two=2;
		
		System.out.println(message1 + two +" numbers is: " +sum);
		System.out.println(message2 + two +" numbers is: " +sub);
		System.out.println(message3 + two +" numbers is: " +mult);
		System.out.println(message4 + two +" numbers is: " +div);

		//2nd Task
		
		
		
		
		
		
	}
	
}
