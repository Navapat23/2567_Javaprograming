import java.util.*;

import javax.security.sasl.SaslException;
public class secure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter your password (type 'exit') to quit : ");
			String password = scan.nextLine();
			
			if(password.equalsIgnoreCase("exit")) {
				System.out.println("program terminated.");
				break;
			}
			//validate password
			String error = "";
			//check for minimum lenght
			
			if(password.length()<8) {
				error +="- Password must is must be at least 8 characters long. \n";
			}
			boolean haseUppercase = false;
			boolean hasLowercase = false;
			boolean hasDight =false; 
			
			for (int i=0;i<password.length();i++) {
				char ch = password.charAt(i);
				if(ch>='A'&&ch<='Z') {
					haseUppercase =true;
				}else if (ch>='a'&&ch<='z') {
					hasLowercase=true;
					
				}else if (ch>='0'&& ch<='9') {
					hasDight=true;
				}
			}
			if (!haseUppercase) {
				error += "Password must contain at lease one uppercase letter(A-Z).\n";
			}
			if(!hasDight) {
				error += "Password must contain at lease one digit(0-9).\n";
			}
			if(error.isEmpty()) {
				System.out.println("Your password is secure.");
				break;
			}
			else {
				System.out.println("Your validation erros.");
				System.out.println(error);
			}
		
		}
	
		
		
		scan.close();
	}

}
