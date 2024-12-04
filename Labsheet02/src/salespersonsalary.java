import java.util.*;
public class salespersonsalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Declare constants
		final double BASESALARY = 1000.0;
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 // Declare variables
		 int sales; // Input gross sales
		 double salary; // Salary to be computed
		 
		 while(true) 
		 {
			 System.out.print("Enter gross salese for the salesperson(or -1 to end) : ");
			 sales = input.nextInt();
			 
			 //check for sentinel value
			 if (sales==SENTINEL) 
			 {
				 break;
			 }
			 salary = BASESALARY + (sales * COMMISSION_RATE);
			 System.out.printf("The saleperson's is : $%.2f"+salary);
		 }//end while
		 System.out.println("bye");
		
		input.close();
		
	}

}
