package com.class32;

public class WrapperClasses {
	public static void main(String[] args) {
		
		int num = 10;
		
		//Auto-boxing --. converting primitive type into an Object type
		Integer integer = 100;
		System.out.println(integer.MIN_VALUE);
		String str = integer.toString(); // converted into a string (because of it being an object through collections)
		System.out.println(str); 
		
		// converting boolean primitive type into boolean Object type
		Boolean bool=true;
		Byte $b=20;
		System.out.println($b.MAX_VALUE);
	
		
		// Auto-Unboxing --> converting Object type into a primitive type
		int num1 = new Integer(10);
		System.out.println(num1);
		
		
		
		
		
		
		
		
	}
}
