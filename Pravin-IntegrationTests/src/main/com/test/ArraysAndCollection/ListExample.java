package com.test.ArraysAndCollection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Shiva");
		list.add("Pravin");

		// Print the name from the list....
		for (String value : list) {
			System.out.println(value);
		}

		// Or like this...
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
