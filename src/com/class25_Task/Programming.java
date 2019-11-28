package com.class25_Task;

public class Programming {
	
	public void Programming() {
		System.out.println("I love Programming");
	}

	public void Programming(String text) {
		System.out.println("I love "+text);
	}
	
	public static void main(String [] args) {
		
		Programming replace = new Programming();
		replace.Programming();
		replace.Programming("Java");
	}
}
