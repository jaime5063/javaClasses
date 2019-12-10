package com.class32;

import java.util.ArrayList;

public class Collections_Task {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Kobe");
		names.add("Jordan");
		names.add("LeBron");
		names.add("Magic");
		names.add("Shaq");
		
		boolean testEmpty = true;

		if(names.isEmpty()) {
			System.out.println(testEmpty = true);
		}else {
			System.out.println(testEmpty = false);
		}
		
		if(names.contains("Kobe")) {
			System.out.println("This array does contain the name "+names.get(0));
		}else {
			System.out.println("This collection does NOT contain that name");
		}
		
		Integer size = names.size();
		System.out.println("The size of this collections is "+size);
		for(String name : names) {
			System.out.println(name);
		}
	}

}
