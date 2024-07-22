package com.test.ArraysAndCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayExample {

	int[] intArray = {1, 2, 3, 5, 6};

	int[] intArray2 = new int[5];

	static String[] strArray = {"shiva", "pravin"};

	String[] strArray2 = new String[5];

	public static void main(String[] args) {

		ArrayExample arrayExample = new ArrayExample();
		for (int value : arrayExample.intArray) {
			System.out.println("intArray values: " + value);
		}

		for (int i = 0; i < arrayExample.intArray2.length; i++) {
			arrayExample.intArray2[i] = arrayExample.intArray[i] + 1;
		}

		for (int value : arrayExample.intArray2) {
			System.out.println("intArray2 values: " + value);
		}

		List<String> list = Arrays.asList(strArray);
		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);
	}

}
