import java.util.Scanner;
public class helloworld {
	  public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  int inputNum = input.nextInt();
	        for(int i=1; i<=10;i++){
	        	System.out.println(inputNum*i);
	        }
		  for(int i=0;i<20;i++){
			  for(int j=0;j<=i;j++) {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
	    }
}
