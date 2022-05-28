/**
 * Algorithm
 * 
 * 1. Start
 * 2. Create package com.greatlearning.corejava.
 * 3. Create Class Health
 * 4. Declare variables age, weight and bmi in inside Health with protected access modifier.
 * 5. Assign values to variables.
 * 6. Create another class HealthDriver
 * 7. Create main method in HealthDriver
 * 8. Create an object using class Health
 * 9. Print age, weight and bmi using the object Health.
 * 10. Stop
 * 
 * */
package com.greatlearning.corejava;

class Health{
	protected int age = 24;
	protected float weight = 56.50f;
	protected float bmi = 23.22f;
}

public class HealthDriver {

	public static void main(String[] args) {
		Health person1 = new Health();
		System.out.println("I'm " + person1.age +" years old. My weight is " + person1.weight+ "kgs and my BMI is " + person1.bmi + ".");

	}

}
