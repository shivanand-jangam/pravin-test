package com.test.inharitance;

public class ClassA extends ClassB {

	public void classAMethod() {
		System.out.println("Class A method");
	}

	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.add(); // ClassB
		a.sub(); // ClassC
	}

}
