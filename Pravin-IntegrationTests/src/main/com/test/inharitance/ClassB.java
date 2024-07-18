package com.test.inharitance;

public class ClassB extends ClassC {

	public void classAMethod() {
		System.out.println("Class B method");
	}

	public void add() {
		System.out.println("This add from B");
	}

	public static void main(String[] args) {
		ClassC c = new ClassB();
		
		c.add();
	}
}
