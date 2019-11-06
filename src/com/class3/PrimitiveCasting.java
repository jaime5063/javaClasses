package com.class3;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		// converting integer 12 into a double (decimal)
		double d=12;
		System.out.println(d);
		
		// widening or automatic or implicit casting
		// Assigning something smaller into something bigger
		byte b=127;
		int i=b;
		System.out.println(b);
		
		int num=123;
		double d1=num;
		System.out.println(d1);
		
		// Narrowing or explicit or manual casting
		// Assigning something bigger into something smaller
		double d2=123.56;
		int num2=(int)d2;
		System.out.println(num2);
		
		
	}
}
