package com.class24;

public class Country {
	// instance variables 
	// we can use access modifiers to access them
	public String capital, name;
	public int population;
	
	// with 'this' keyword you can differentiate your local variables from your instance variables (if same name)
	Country(String name, String capital, int population){
		this.name = name;
		this.capital = capital;
		this.population = population;
	}
	
	Country(){
		System.out.println("I am non argument constructor");
	}
	
	public void displayInfo() {
		System.out.println(name+" "+capital);
	}
	
	
	public static void main(String[] args) {
		
		// NEW WAY - using constructor (ALWAYS ONLY 1 CONSTRUCTOR WILL GET EXECUTED)
		Country contry1 = new Country("USA", "Washington DC", 1000);
		Country contry2 = new Country("AnyCountry", "AnyCapital", 10);
		Country country3 = new Country(); 
		
		contry1.displayInfo();
		contry2.displayInfo();
		country3.displayInfo();
//		System.out.println(contry1.name); - NOT PREFFERED
//		System.out.println(contry1.capital); - NOT PREFFERED
		
	
		
		
	}
}
// THE OLD WAY - no constructor
//Country contry1 = new Country();
//// how we used to do it ...but redundancy
//contry1.capital = "USA";
//contry1.name = " Washington dc";

//Country contry2 = new Country();
//// how we used to do it ...but redundancy
//contry2.capital = "AnyCountry";
//contry2.name = "AnyName";
