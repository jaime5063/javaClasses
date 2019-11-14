package com.class17;

public class computer {
	
	// Computer Template
	
	// Features and Attributes
	String display, mouse, name, brand;
	int memory, ram, screenSize;
	boolean keyboard, monitor;
	
	// DEFINE BEHAVIORS
	void playGames() {
		System.out.println("");
	}
	
	void JavaCoding() {
		System.out.println();
	}
	
	void watchMovies() {
		System.out.println();
	}

/////////////////////////////////////////////////////
	// - CREATE THE MAIN METHOD TO EXECUTE CODE - //
	public static void main(String[] args) {
		
		// 1. Create the Object
		computer  comp=new computer();
		
		comp.display="5K";
		comp.name="Apple MacBookPro";
		comp.brand="Apple";
		comp.ram=250;
		comp.keyboard=true;
		
		
		
		
		
	}
	
	
}
