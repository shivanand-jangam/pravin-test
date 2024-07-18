package com.test.Variables;

public class InstanceVariables {

	int a = 10;
	int b = 20;

	public static void main(String[] args) {
		InstanceVariables instanceVariables = new InstanceVariables();
		instanceVariables.instanceExample();
		
		instanceVariables.a=25;
		instanceVariables.b=25;
		
//		System.out.println(ClassVeriables.a);
//		System.out.println(ClassVeriables.b);
	}

	public void instanceExample() {
		System.out.println(a + b);
	}
}
