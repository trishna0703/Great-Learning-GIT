
/**
 * Algorithm
 * 
 * 1. Start
 * 2. Create class Customer
 * 3. Define data members fullName and age.
 * 4. Create main method in the same class
 * 5. Make object using the Customer class
 * 6. Initialize the values of fullName and age through reference.
 * 7. Print the variables to check result.
 * 8. Stop
 * 
 * */
public class Customers{
	int age;
	String fullName;
	
	public static void main(String[] args) {
		Customers cst1 = new Customers();
		cst1.fullName = "Trishna Kashyap";
		cst1.age = 24;
		System.out.println("Hi! My name is " + cst1.fullName + " & I'm " + cst1.age + " years old.");
	}

}