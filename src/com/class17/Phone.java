package com.class17;

public class Phone {
	
	String name, make;
	boolean touchScreen;
	int price;
	
	//behaviors
	void playGames() {
		System.out.println("I play games on my "+name);
	}
	
	void makePhoneCalls(){
		System.out.println("I make phone calls on my "+name);
	} 
	
	void browsInternet() {
		System.out.println("I can brows the internet on my "+name);
	}

}
