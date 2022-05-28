class Customer {
    public void getName() {
    
    System.out.println("Name of the customer is Chaitanya");
    
    }
    public void getAge() {
    
    System.out.println("Age of the customer is 27 years");
    
    }

}

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.getName();
		customer.getAge();

	}

}
