package com.practice.concepts;

@SuppressWarnings("all")
public class Reflection {
/*
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.practice.concepts.DEF");
		DEF d = (DEF) c.newInstance();
		Method m = c.getDeclaredMethod("print", null);
		m.setAccessible(true);
		m.invoke(d, null);
	}
*/
}

class DEF {
	@SuppressWarnings("unused")
	private void print() {
		System.out.println("Method called");
	}
}
