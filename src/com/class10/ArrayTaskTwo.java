package com.class10;

public class ArrayTaskTwo {
	
	public static void main(String[] args) {
		
		//Create an array of countries. While retieving all values
		// from an array, print capital for each country
		
		String [] countries= {"USA", "Canada", "Mexico", "China"};
		
		for(int i=0; i<countries.length; i++) {
			
			if(countries[i].equals("USA")) {
				System.out.println("Washington DC");
			}else if(countries[i].equals("Mexico")) {
				System.out.println("Mexico D.F.");
			}else if(countries[i].equals("Canada")) {
				System.out.println("Ottawa");
			}else if(countries[i].equals("China")) {
				System.out.println("Beijing");				
			}
		}

		// - ATTEMPT DOING WITH SWITCH CASE -
		
		
	}

}
