package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
// Create an ArrayList to store all numbers
 
		// creating collections array list
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);
		
		int size = numbers.size();
		System.out.println(size); // size = 4 (.size() is not by index) /// index =3
		
		// add more
		numbers.add(10000);
		// remove:
		numbers.remove(size-1); // also you can do @index / or specify object example: 100
		// print out entire array list
		//remove @index
		numbers.remove(1);
		System.out.println(numbers);
		
		//retrieve the value from an arrayList
		int element = numbers.get(0); // index at: 0 
		System.out.println(element);
		
		//retrieve values one by one 
		// 1. for loop
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		//2. advanced loop
		for(Integer num:numbers) {
			System.out.println(num);
		}
		
		// I want to print get values in reverse : For Loop
		for(int i=numbers.size()-1; i>0; i--) {
			System.out.println(numbers.get(i));
		}  // NOTE: Advanced loop (reverse) NOT possible.
		
		
		//3. using iterator (RETRIEVE ALL ELEMENTS ONE BY ONE) - while loop
		System.out.println("-----ITERATOR-----");
		Iterator<Integer>iterator = numbers.iterator(); // return you 1 object of the iterator type
		// when we don't know number of iterations = while loop(will loop as long as condition is true)
		while(iterator.hasNext()) { 
			System.out.println(iterator.next());
		}
		
		
		
		
	}
}
