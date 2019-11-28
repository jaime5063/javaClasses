package com.class25_Task;

public class PrivateOverloading {
	
	private void PrivateOverloading() {
		System.out.println("This is a private overload with no parameters");
	}
	
	private void PrivateOverloading(String text) {
		System.out.println(text+" this is a private overload with 1 parameter");
	}
	
	private void PrivateOverloading(int num1, int num2) {
		System.out.println("This is a private overload with "+num1+" "+num2+" as parameters");
	}
	
	public static void main(String []args) {
		
		PrivateOverloading test = new PrivateOverloading();
		test.PrivateOverloading();
		test.PrivateOverloading("Hello");
		test.PrivateOverloading(8, 24);
	}

}
