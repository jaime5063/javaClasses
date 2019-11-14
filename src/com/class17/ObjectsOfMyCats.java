package com.class17;

public class ObjectsOfMyCats {

	public static void main(String[] args) {
	
		System.out.println("Our cat Hunter");
	Cats cat=new Cats();	
		cat.name="hunter";
		cat.color="gray,black and white";
		cat.eyeColor="green black";
		cat.pawColor="white and black";
		cat.weight=8; // <-- PUT A NUMBER
		cat.eat="Cat Food";
		cat.breed="tabby";
			cat.eatingWeight();
			cat.playful();
			cat.hiding();
			cat.running();
			System.out.println("");
			
			System.out.println("Our cat Bell");
			Cats cat2=new Cats();	
			cat2.name="bell";
			cat2.color="white, peach and gold";
			cat2.eyeColor="black and gold";
			cat2.pawColor="black and white";
			cat2.weight=6; // <-- PUT A NUMBER
			cat2.eat="cat food";
			cat2.breed="tabby";
				cat2.eatingWeight();
				cat2.playful();
				cat2.hiding();
				cat2.running();		
		
		
	}

}
