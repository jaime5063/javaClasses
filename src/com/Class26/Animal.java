package com.Class26;
// PARENT
public class Animal {

	public void sleep() {
		System.out.println("Animal sleep");
	}
	public void eat() {
		System.out.println("Animal eat");
	}
}
// CHILD
class Cat extends Animal{
	
	public void sleep() {
		System.out.println("Cat sleep all day");
	}
	
	public void meow() {
		System.out.println("I meow when I'm hungry");
	}
}