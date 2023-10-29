package com.practice.concepts;

public class ObjectClonning {
/*
	public static void main(String[] args) throws CloneNotSupportedException {
		XYZ obj1 = new XYZ();
		obj1.a = 5;
		obj1.b = 6;
		
		XYZ obj2 = (XYZ) obj1.clone();
		
		obj2.a = 56;
		obj2.b = 78;
		
		System.out.printf("Value of object 1 is %d, %d\n", obj1.a, obj1.b);
		System.out.printf("Value of object 2 is %d, %d", obj2.a, obj2.b);
	}
*/
}

class XYZ implements Cloneable {
	int a;
	int b;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
