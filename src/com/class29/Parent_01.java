package com.class29;

public class Parent_01 {
	
	Parent_01(int num1){
		System.out.println("constructor with int parameter");
	}
	
	String name;
	public void superMethd(String name) {
		this.name = name;
		System.out.println("Parent method name is "+name);
	}
}

class Child extends Parent_01{
	
	Child(int num1){  // calling your constructor from parent class
		super(num1);  // calling your constructor from parent class
	}
	
	public void display(String name) {
		superMethd(name);
		super.superMethd(name);
	}
}


