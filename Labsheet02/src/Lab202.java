import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int number;
		int numberbefore = Integer.MIN_VALUE;
		
		while(true) 
		{
			System.out.print("Input number : ");
			number =input.nextInt();
			if(number < numberbefore) 
			{
				break;
			}
			numberbefore = number;
		}
		System.out.println("bye bye");
		input.close();
		
	}

}
