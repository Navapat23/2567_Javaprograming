import javax.swing.*;
public class lab302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Email;
		boolean chkEmail = false;
		
	while(true) 
	{
	Email = JOptionPane.showInputDialog("Input your e-mail ").toLowerCase();
	while(Email.startsWith("@")||Email.contains(" "));
	Email =JOptionPane.showInputDialog("Input your email, aging");
	
	}
	chkEmail = Email.endsWith("@gmail.com") || Email.endsWith("@hotmail.com"));
	if (chkEmail) {
		JOptionPane.showConfirmDialog(null,"Your e-mail is "+ Email);
		break;
	}
	else {
		JOptionPane.showConfirmDialog(null, "Your email is not hotmail or gmail or dot com");
		continue;
	}
		
	}

}
