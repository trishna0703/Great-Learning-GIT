package com.greatlearning.corejava;

public class ConstructorDemo2 {

	ConstructorDemo2(){
		System.out.println("I am default constructor.");
	}
	ConstructorDemo2(int a, String b, float c, char d){
		System.out.println("I am Parameterized constructor. I take various arguments as input.");
		System.out.println("I am Square of integer entered. " + a*a);
		System.out.println("I am Square of decimal entered. " + c*c);
		System.out.println("I am String Value. " + b);
		System.out.println("I am Character value. "+ d);
	}
	public static void main(String[] args) {
		ConstructorDemo2 obj = new ConstructorDemo2();
		obj = new ConstructorDemo2(5,"Trishna Kashyap",15.25f,'A');
	}

}
