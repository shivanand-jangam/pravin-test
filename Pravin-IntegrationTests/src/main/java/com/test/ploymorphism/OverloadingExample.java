package com.test.ploymorphism;

import java.util.List;

public class OverloadingExample {

	public int calculateTotal(int a, int b, int c) {
		System.out.println(a + b+c);
		return a + b + c;
	}
	
	public int calculateTotal(int a, int b, int c) {
		System.out.println(a + b+c);
		return a + b + c;
	}

	public int calculateTotal(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}

	public int calculateTotal(List<Integer> list) {
		int integer = 0;
		for (int i = 0; i < list.size(); i++) {
			integer = integer + list.get(i);
		}
		System.out.println(integer);
		return integer;
	}

}
