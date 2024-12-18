import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String fullName;//The input line entered by the user.
		String firstName;//The first name, extracted from the input.
		System.out.println("Please enter your name, seperated by a space.");
		System.out.print(":");
		fullName = input.nextLine();
		int space = fullName.indexOf(' '); //หาช่องว่าง
		firstName = fullName.substring(0,space); //ชื่อแรก
		
		System.out.println(abbreviatName(fullName)+firstName);
		
		input.close();
	}//end of main() method
	public static String abbreviatName(String fName) {
		String initaiLetter ="";
		for(int i=0; i<fName.length(); i++) {
			if(fName.charAt(i)==' ') {
				initaiLetter = (initaiLetter+fName.charAt(i+1)).toUpperCase();
				initaiLetter = initaiLetter+".";
;			}
		}//end for
		return initaiLetter;
	}

}
