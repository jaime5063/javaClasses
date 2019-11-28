package com.class25;

public class TaskOverloading {
	
	public void calculate(int a, int b) {
		System.out.println("the area of the ractangle is "+(a*b));
	}
	
	public void calculate(int c) {
		
		System.out.println("the area of the square is "+(c*c));
	}
	
	public void calculate(int a, int b, int c) {
		System.out.println("the area of the box is "+(a*b*c));
	}

	public static void main(String[] args) {
		
		TaskOverloading rectangle = new TaskOverloading();
		rectangle.calculate(5, 4);
		
		TaskOverloading square = new TaskOverloading();
		square.calculate(8);
		
		TaskOverloading box = new TaskOverloading();
		box.calculate(5, 5, 10);
		
		
		
	}
}
