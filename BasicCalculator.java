import java.util.Scanner;
public class BasicCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = input.nextInt();
		System.out.println("Enter another number");
		int b = input.nextInt();
		System.out.println("Choose operation between 1. Addition 2. Subtraction 3. Multiplication 4. Division");
		int opr = input.nextInt();
		switch(opr){
			case 1: System.out.println("Your Answer is " + a+b);break;
			case 2:
				if(a>b) {
					System.out.println("Your Answer is " + (a-b));break;					
				} else {
					System.out.println("Your Answer is " + (b-a));break;
				}
			case 3: System.out.println("Your Answer is " + a*b);break;
			case 4:
				if(b!=0){
					System.out.println("Your Answer is " + a/b);break;					
				}
				else {
					System.out.println("Invalid Division");break;
				}
		}
	}

}
