package com.class24;

public class ThisKeyword2 {

	int a, b;
	
	public ThisKeyword2(int a, int b) {
		this.a=a; // this. = initialize instance variable (differentiate)
		this.b=b; // same.
	}	
	
	ThisKeyword2(){
		System.out.println("I am non argument constructor");
	}
				  // Local variable	
	public void sum(int a, int b) {
									// need parenthesis so that it wont concatenate
		System.out.println("The sum of local parameters is "+(a+b)); // local variables
		System.out.println("The sum of instance variables is "+(this.a+this.b)); // instance variable
	}
	
	public void sayA() {
		System.out.println(a);
	}
	public void sayB() {
		System.out.println(b);
	}
	public void sayAandB() { // you cannot use static method with this
		// calling another method within current instance method
		this.sayA(); //--> not commonly used
		sayB(); // compiler adds this automatically on the back end--> this.b();
	}
	
	
	public static void main(String[] args) {
		
		ThisKeyword2 obj = new ThisKeyword2(5, 10);
		obj.sum(10, 20);
		obj.sayA();
		obj.sayB();
		obj.sayAandB();
		
		ThisKeyword2 obj1 = new ThisKeyword2(20, 20);
		obj1.sum(100, 200);
		
		
	}

}
