package com.practice.concepts;

public class Polymorphism {
/*
	public static void main(String[] args) {
		A obj = new AB();
		obj.print();
		obj = new AC();
		obj.print();
	}
*/
}

interface A {
	void print();
}

class AB implements A {

	@Override
	public void print() {
		System.out.println("in AB");
	}
	
}

class AC extends AB {

	@Override
	public void print() {
		System.out.println("in AC");
	}
	
}