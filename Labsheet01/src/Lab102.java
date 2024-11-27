import java.util.*;

public class Lab102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("input the number of minutes : ");
		int number = input.nextInt();
		
		int year =  number/ (60*24*30*12);
		int day =  (number-(year*525600))/1440;
		
		
		System.out.print(input+"miutes is approximately "+year+"years and "+day+"days");
		input.close();
	}

}
