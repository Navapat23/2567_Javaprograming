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
			
			ans = JOptionPane.showInputDialog("Do you want to input email address[Y/y] : ");
		}while(ans != null && ans.equalsIgnoreCase("y"));
	}
}
