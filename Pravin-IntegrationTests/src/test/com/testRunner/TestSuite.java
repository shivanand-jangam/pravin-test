package com.testRunner;

import org.testng.annotations.Test;

public class TestSuite {

	@Test(groups = {"smoke", "regression","sanity","custom"}, invocationCount = 10, priority=0)
	public void test1() {
		System.out.println("Test1");
	}

	@Test(priority=-2)
	public void test2() {
		System.out.println("Test2");
	}

	@Test(priority=5)
	public void test3() {
		System.out.println("Test3");
	}
}
