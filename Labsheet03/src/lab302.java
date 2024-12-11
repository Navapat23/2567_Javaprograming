import javax.swing.*;
public class lab302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Email = JOptionPane.showInputDialog("Input your e-mail : ");
		boolean validateEmail = false;
		
	
		while(Email.startsWith("@")|| Email.contains(" "))
		{
			Email = JOptionPane.showInputDialog("Input your e-mail, again");
			
		}//end of while
		if(Email.endsWith("@gmail.com")||Email.endsWith("hotmail.com")) 
		{
			JOptionPane.showConfirmDialog(null,"Your e-mail is "+Email);
		}
		else {
			JOptionPane.showConfirmDialog(null,"Your e-mail is not hotmail or gmail or got com"+Email);
		}
		while(Email.endsWith("@gmail.com")||Email.endsWith("hotmail.com"))
	{
			JOptionPane.showConfirmDialog(null,"Your e-mail is not hotmail or gmail or got com"+Email);
		}
	}

}
