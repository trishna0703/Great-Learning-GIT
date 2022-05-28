/**
 * Algorithm
 * 
 * 1. Start
 * 2. Create package com.greatlearning.corejava.
 * 3. Create Class Customer and CustomerDriver under same package
 * 4. Declare variables x with public modifier, y with protected modifier and z with private modifier inside Customer Class.
 * 5. Assign values to variables.
 * 6. Create main method in CustomerDriver class
 * 7. Create an object using class Customer
 * 8. Print x, y and z using the object Customer.
 * 9. Stop
 * 
 * */
package com.greatlearning.corejava;
class Customer{
	public int x = 5;
	protected String y = "Trishna Kashyap";
	private float z = 24.5f;
}
public class CustomerDriver {

	public static void main(String[] args) {
		Customer newCustomer = new Customer();
		System.out.println("Value of x is "+ newCustomer.x+ ".");
		System.out.println("Value of y is "+ newCustomer.y+ ".");
//		System.out.println("Value of z is "+ newCustomer.z+ ".");

	}

}
