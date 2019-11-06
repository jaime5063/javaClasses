package com.class2;

public class ModulusOperator {

	
	public static void main(String[] args) {
		
	
		float num1=12.5f;
		float num2=3.5f;
		
		float div=num1/num2;
		System.out.println(div);
		
		int number1=13;
		int number2=2;
		int divOfIntegers=number1/number2;
		System.out.println(divOfIntegers);  //you get a whole number as result because it is an Integer
		
		double d=12;
		System.out.println(d);  //Assigned a whole number but because it is a DOUBLE it'll add a decimal = 12.0
								//But you cannot assign a double value to an integer
		
		
		//modulus gives the remainder of the division
		
		int a=15;
		int b=9;
		
		int remainder=a%b; //Will give you the remainder. whatever number remains after the you divide.
		
		System.out.println(remainder); //Result is 6. 15 divided by 9=1 and the remainder is 6=(numbers left).
		
		
		
	}
}
