package com.practice.concepts;

public class MethodReference {
/*
	public static void main(String[] args) {
		Arrays.asList(1, 2, 3, 4, 54, 65, 76, 87, 987, 9876).forEach(System.out::println); //for static Method
		
		new MyPrinter().print("Diganta Susmita", new StringParser()::convert); //for dynamic MethodØ
	}
*/
}

interface Parser {
	String parse(String str);
}

class MyPrinter {
	public void print(String str, Parser p) {
		System.out.println(p.parse(str));
	}
}

class StringParser {
	public String convert(String s) {
		if (s.length() <= 3) {
			s = s.toUpperCase();
		} else {
			s = s.toLowerCase();
		}
		return s;
	}
}