package com.greatlearning.corejava;

public class StaticFinalDemo {

	int var1 = 10;
	static int var2 = 10;
	
	void method1() {
		var1++;
		System.out.println("This is value of var1 " + var1);
	}
	
	void method2() {
		var2++;
		System.out.println("This is value of var2 " + var2);
	}
	public static void main(String[] args) {
		StaticFinalDemo obj1 = new StaticFinalDemo();
		StaticFinalDemo obj2 = new StaticFinalDemo();
		StaticFinalDemo obj3 = new StaticFinalDemo();
		obj1.method1();
		obj2.method1();
		obj3.method1();
		obj1.method2();
		obj2.method2();
		obj3.method2();

	}
}

