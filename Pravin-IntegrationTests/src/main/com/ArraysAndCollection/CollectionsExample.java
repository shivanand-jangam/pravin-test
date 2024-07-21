package com.ArraysAndCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(20);
		list.add(-1);
		list.add(0);
		list.add(100);

		Collections.sort(list);
		System.out.println("sort: " + list);

		Collections.reverse(list);
		System.out.println("reverse: " + list);

		Collections.reverse(list);
		System.out.println("reverse2: " + list);

		Collections.shuffle(list);
		System.out.println("shuffle: " + list);

//		Collections.sort(list);
//		System.out.println("sort: " + list);

		int index = Collections.binarySearch(list, 20);
		System.out.println("binarySearch: " + index);
	}
}
