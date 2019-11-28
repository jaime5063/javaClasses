package com.class25_Task;

public class ThreeOverloads {
	
	public static void ThreeOverloads(String a) {
		System.out.println(a);
	}
	public static void ThreeOverloads(int num) {
		System.out.println("My favorite numer is "+num);
	}
	public static void ThreeOverloads(boolean enter) {
		System.out.println(enter+" I love Java!!!");
	}

	public static void main(String [] args) {
		
		ThreeOverloads(true);
		ThreeOverloads(3);
		ThreeOverloads("I am happy to be part of Syntax Class!");
	}
}
