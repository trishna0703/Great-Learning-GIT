/**
 * Algorithm
 * 1. Start
 * 2. Create a class ConstructorDemo
 * 3. Define both default constructor and parameterized constructor
 * 4. add print statement in both the constructors
 * 5. pass a parameter in the parameterized constructor
 * 6. Create the main function inside the class ConstructorDemo
 * 7. Create an object using class ConstructorDemo using the default constructor.
 * 8. call the object with the parametrized constructor and pass a parameter.
 * 9. Stop
 * 
 * 
 * */

package com.greatlearning.corejava;

class ConstructorDemo {

	ConstructorDemo(){
		System.out.println("Hie! I'm Trishna Kashyap. Pleasure to print this on console using default constructor.");
	}
	
	ConstructorDemo(String name){
		System.out.println("Hie! I'm " + name + ". Pleasure to print this on console using parameterized construction.");
	}
	
	public static void main(String[] args) {
		ConstructorDemo myIntro = new ConstructorDemo();
		myIntro = new ConstructorDemo("Trishna Kashyap");
		

	}

}



