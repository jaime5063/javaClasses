package com.class2;

public class TaskArythmeticOperations {
	
	public static void main(String[] args) {
		
		//Operator in Java called Arithmetic Operator
		//Arithmetic Operators: +, -, /, *, %
		
		// TASK 1
		
		double one=10.00;
		double two=20.00;
		
		double first=one+two;
		double second=one-two;
		double third=one*two;
		double fourth=one/two;
		String Text1="The addition of ";
		String Text2="The subtractions of ";
		String Text3="The multiplications of ";
		String Text4="The division of ";
		String Text5=" and ";
		String Text6=" is equal to ";
		String Text7=" and is equal to ";
		String Text8=" numbers ";
		byte num1=2;
		
		System.out.println(Text1 + num1 + Text8 + one + Text5 + two + Text6 + first);
		System.out.println(Text2 + num1 + Text8 + one + Text5 + two + Text6 + second);
		System.out.println(Text3 + num1 + Text8 + one + Text5 + two + Text6 + third);
		System.out.println(Text4 + num1 + Text8 + one + Text5 + two + Text6 + fourth);
		
		
		// TASK 2
		// the square of the number 3.9
		String firstOne="The square of the number ";
		double value=3.9;
		int value1=2;
		double math=value/value1;
		System.out.println(firstOne + value + " is " + math);
		
		// TASK 3
		//Find perimeter of a rectangle with width 5 and height 8
		//Go over formula from in class example!!		
		/*
		 * Instructor example to find area of a Rectangle
		 */
		int width=5;
		int height=8;
		
		int area1=width*height; //finding the area
		int perimeter1=2*(width+height); //finding the perimeter
		System.out.println("Perimeter: " + perimeter1);
		
		System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+
				perimeter1+" and the area is "+area1);
		
		
		//You can also store your entire message for print later 
		String message="The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+
				perimeter1+" and the area is "+area1;
		
		System.out.println("Stored message: "+message);
		
		
		
		
		
		
		
		
		
	}

}
