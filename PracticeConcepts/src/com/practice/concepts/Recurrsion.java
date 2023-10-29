package com.practice.concepts;

import java.util.Scanner;

public class Recurrsion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		switch(n) {
		case 0:
			System.out.println(n);
			break;
		case 1:
			System.out.printf("%d, %d", 0, n);
			break;
		default:
			System.out.printf("%d, %d, ", 0, 1);
			new PrintFibonacci().fibonacci(n - 2);
		}
	}

}

class PrintFibonacci {
	int n1 = 0, n2 = 1, n3 = 0;

	public void fibonacci(int c) {
		if (c > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(n3 + ", ");
			fibonacci(c - 1);
		}
	}
	
}