package com.test.ArraysAndCollection;

import java.util.Hashtable;
import java.util.Set;

public class HashtableExample {

	public static void main(String[] args) {

		Hashtable<Integer, String> table = new Hashtable<>();
		table.put(1, "Shiva");
		table.put(2, "Pravin");
		table.put(3, "Pravin");
		table.put(4, "Pravin");
		// table.put(3, null); // Throws NullPointerException
		// table.put(null, "Orange"); // Throws NullPointerException

		// System.out.println(table);

		Hashtable<String, String> table2 = new Hashtable<>();
		table2.put("1", "Shiva");
		table2.put("2", "Pravin");
		table2.put("3", "Pravin");
		table2.put("4", "Pravin");

		System.out.println(table2);

		//keySet: Returns a view of the keys contained in this map.
		Set<String> setOfKeys = table2.keySet();
		for (String key : setOfKeys) {

			System.out.println(
					"Rank : " + key + "\t\t Name : " + table2.get(key));
		}
	}
}
