import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;

public class withdrawal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int balance = rand.nextInt(9) *100000;
		
		System.out.println(balance);
		int monneywithdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance : " +balance+"\nInput money to withdraw : "));
		
		if (monneywithdraw>balance)
		{
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw more than balance", "\nERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (monneywithdraw>50000) 
		{
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw more than 50,000", "\nERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (monneywithdraw%100!=0) 
		{
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw ",+ (monneywithdraw%100)+" bath.\nERROR",JOptionPane.ERROR_MESSAGE);
		}
		else 
		{
		JOptionPane.showConfirmDialog(null,"You withdraw"+ monneywithdraw + "bath."+"\n1000 = "+(monneywithdraw/1000)+"\n500 = "+(monneywithdraw%1000)/500+
				"/n100 = "+ (monneywithdraw%500)/100);	
		}
	}

}
