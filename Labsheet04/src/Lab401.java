import javax.swing.*;
public class Lab401 {

	public static void main(String[] args) {
		
		inputEmail();
		
	}//end of main() Method

	public static void inputEmail() {
		String ans;
		String varEmail;
		do {
			varEmail = JOptionPane.showInputDialog("Input your e-mail : ");
			if(varEmail != null && varEmail.isEmpty()) {
				//checkEmailError(varEmail);
			}
			else {
				JOptionPane.showConfirmDialog(null,"E-mail cannot be empty!!!");
			}
			
			ans = JOptionPane.showInputDialog("Do you want to input email address[Y/y] : ");
		}while(ans != null && ans.equalsIgnoreCase("y"));
	}//end of inputEmal() method
	public static void checkEmailError(String email) {
		while(email.startsWith("@")|| email.contains(" "))  {
			email = JOptionPane.showInputDialog("Invalid e-mail. Input your e-mail again : ");
		}
		email = email.toLowerCase();
		JOptionPane.showConfirmDialog(null, 
				checkEmail(email)
				?"Your e-mail is"+email //return true
				:"Your e-mail is not a hot mail or gmail addreass.");// return false
	} 
	public static boolean checkEmail(String email) {
		if(email.endsWith("@gmail.com")||email.endsWith("@hotmail.com")) {
			return true;	
		}else {
			return false;
		}
	}
}

	
