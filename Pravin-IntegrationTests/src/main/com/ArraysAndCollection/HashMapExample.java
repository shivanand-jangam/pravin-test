package com.ArraysAndCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Shiva");
		map.put(2, "Pravin");
		map.put(3, null);
		map.put(4, null);

		map.put(5, null);
		map.put(5, "XYZ");

		map.put(null, "Bhima");
		map.put(null, "Sri");
		map.put(null, "ABC");
		System.out.println(map);

		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = "
					+ entry.getValue());
		}

		// using iterators
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			
			Entry<Integer, String> entry = itr.next();
			
			System.out.println("Key = " + entry.getKey() + ", Value = "
					+ entry.getValue());
		}
	}

}
