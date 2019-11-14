package com.class17;

public class ObjectsOfPhone {

	public static void main(String[] args) {
		
		Phone smart=new Phone();
		smart.make="Apple";
		smart.name="iPhone";
		smart.touchScreen=true;
		smart.price=1000;
		
		smart.playGames();
		smart.makePhoneCalls();
		smart.browsInternet();
		System.out.println("-----------------------------------");
		Phone smart1=new Phone();
		smart1.make="Android";
		smart1.name="Pixel";
		smart1.touchScreen=true;
		smart1.price=1100;
		
		smart1.playGames();
		smart1.makePhoneCalls();
		smart1.browsInternet();
		System.out.println("--------------");
		Phone smart2=new Phone();
		smart2.make="Nokia";
		smart2.name="Touch";
		smart2.touchScreen=true;
		smart2.price=500;
		
		smart2.playGames();
		smart2.makePhoneCalls();
		smart2.browsInternet();

	}

}
