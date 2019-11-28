package com.class24;

public class Child1 extends Parent{
	
	public void myAttributes() {
		System.out.println("I love to play Basketball");
	}


	public static void main(String[] args) {
	
		Parent myParent = new Parent();
		System.out.println(myParent.eyes);
		System.out.println(myParent.hair);
		System.out.println(Parent.race);
		myParent.name = "Cesar";
		
		Child1 son = new Child1();
		son.myAttributes();	
		System.out.println();
		son.law();
		
		
		
	}
}
