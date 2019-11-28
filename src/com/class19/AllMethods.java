package com.class19;

public class AllMethods {
	
	//create methods to return return value of sum
	//sub
	//multiplication
	//division
	//RETURN VALUE MUST BE THE SAME A RETURN TYPE: int, string etc

	int sum(int num1, int num2) {

		int result=num1+num2;
		return result;
	}
	
	int sub(int num1, int num2) {
		
		int sub=num1-num2;
		return sub;
	}
	
	int div(int num1, int num2) {
		
		int div=num1/num2;
		return div;	
}
	int mul(int num1, int num2) {
		
		int mul=num1*num2;
		return mul;		
}
	// CREATE:
	// method to find largest number
	int largerNumber(int num1, int num2) {
		int larger;
		if(num1>num2) {
			larger = num1;
		}else {
			larger = num2;
		}
		return larger;
		
	}
	// method to return number is odd (use boolean)
	boolean isOdd(int num1) {
		boolean odd;
		if(num1%2!=0) {
			odd = true;
		}else {
			odd = false;
		}
		return odd;
	}
	
	
	
	
}
