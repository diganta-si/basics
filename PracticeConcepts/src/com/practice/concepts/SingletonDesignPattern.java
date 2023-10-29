package com.practice.concepts;

public class SingletonDesignPattern {
/*
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			ABC xyz = ABC.getInstance();
		});
		Thread t2 = new Thread(() -> {
			ABC xyz = ABC.getInstance();
		});
		
		t1.start();
		t2.start();
	}
*/
}

class ABC {
	private static ABC abc;
	private ABC() {
		System.out.println("Instance created by " + Thread.currentThread().getName());
	}
	public static synchronized ABC getInstance() {
		if (abc == null) {
			abc = new ABC();
		}
		return abc;
	}
}
