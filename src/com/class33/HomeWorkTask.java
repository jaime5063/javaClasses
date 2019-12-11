package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWorkTask {

	public static void main(String[] args) {
		// Print Array of cars 3 different ways
		System.out.println("-- 1st way --");
		//Parent                child
		List<String> cars = new ArrayList<>();
		cars.add("Tesla");
		cars.add("Kia");
		cars.add("Toyota");
		
		for(String car:cars) {
			System.out.println(car);
		}
		System.out.println("-- 2nd way --");
		for(int i = 0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("-- 3rd way --");
		Iterator<String>iterator = cars.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
