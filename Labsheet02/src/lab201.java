import java.awt.JobAttributes;
import java.text.*;
import javax.swing.*;
public class lab201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int BUFFET = 299;
		int isMember;
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberOfcustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		
		double totalprice = BUFFET  * numberOfcustomer;
		
		//System.out.printf("Total price is %,.2f bath",totalprice);
		
		do 
		{
		isMember = JOptionPane.showConfirmDialog(null, "Total price is "+totalprice +"Bath"+"\nDo you have a member card");
		}while(isMember==JOptionPane.CANCEL_OPTION);
		
		if(isMember==JOptionPane.YES_OPTION) 
		{
			double discount = totalprice * 0.90;
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+discount+" bath");
		}
		else if (isMember==JOptionPane.NO_OPTION) 
		{
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(totalprice)+" bath");
		}
		
		
	}

}
