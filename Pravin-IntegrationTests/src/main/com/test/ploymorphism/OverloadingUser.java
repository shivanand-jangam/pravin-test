package com.test.ploymorphism;

import java.util.Arrays;

public class OverloadingUser {

	public static void main(String[] args) {

		OverloadingExample example = new OverloadingExample();

		example.calculateTotal(10, 20);

		example.calculateTotal(10, 50, 62);

		example.calculateTotal(Arrays.asList(1, 34, 65,5,9,6,2,85,4,5,5,5,5,8,4,2,6,9,8));
	}

}
