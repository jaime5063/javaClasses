package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWorkTask_2 {
	public static void main(String[] args) {
		
		/* Create an arrayList of words.
		 * remover every word that ends with "e". Use iterator
		*/		
		// creating collections array
		List<String> list = new ArrayList<>();
		list.add("Cute");
		list.add("Love");
		list.add("Hello");
		list.add("Java");

		// starts looping from beginning of collection and ends at the end of the collection
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			if (it.next().endsWith("e")) { // if string ends with 'e'...
				it.remove(); // ..remove it
			}
		}
		System.out.println(list);
		
	}

}
