package com.class3;

public class RelationalAndEqualityOperator {
	
	public static void main(String[] args) {
		
		int num1=20;
		int num2=19;
		System.out.println(num1>num2); // True
		System.out.println(num1<num2); // False
		System.out.println("****************");
		
		double d=1.99;
		double d1=2.99;
		
		boolean b5=d>d1;
		System.out.println(b5); // False
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		System.out.println(b1); //
		System.out.println(b2);
		System.out.println(b3);
		System.out.println("*****************");
		
		
		int a=30;
		int b=40;
		
		if (a>b) {
			System.out.println("a is greater than b ");
			}else {
				System.out.println("a is smaller than b");
			}
		System.out.println("*************");
		
		int expectedHours=15;
		int actualHours=2;
		
		if (expectedHours<actualHours) {
			System.out.println("You will succeed");
		}else {
			System.out.println("Please study more");
		}
		System.out.println("*****************");

		
		
		double teaPrice=4.99;
		double allowedPrice=3.99;
		//teaPrice-=2; //2.99 = 4.99-2
		
		if (allowedPrice>=teaPrice) {
			System.out.println("I will buy tea");
		}else {
			System.out.println("I will not buy tea, too expensive");
		}
		
		
		
		
		
	}

}
