package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWorkTask_3 {

	public static void main(String[] args) {
		
		/* Create an arrayList of drinks.
		 * If any drink has letter "a" or "e" replace it with water
		 */
		// COPY FROM GIT-HUB
		
		List<String> drinks = new ArrayList<>();
		drinks.add("Cola");
		drinks.add("milk");
		drinks.add("Juiuce");
		drinks.add("coffee");
		drinks.add("tea");
		
		Iterator<String> dr = drinks.iterator();
		while(dr.hasNext()) {
			if(dr.next().contains("a")) dr.next().contains("e");{
				dr.remove();
			}
		}
		System.out.println(drinks);
		
	}

}
