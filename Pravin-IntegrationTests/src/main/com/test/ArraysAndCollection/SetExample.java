package com.test.ArraysAndCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("Shiva");
		set.add("Pravin");

		// Print the name from the list....
		for (String value : set) {
			System.out.println(value);
		}

		// Or like this...
		Iterator<String> namesIterator = set.iterator();
		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}
	}

}
