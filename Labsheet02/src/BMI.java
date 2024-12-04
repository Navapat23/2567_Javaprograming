import java.text.DecimalFormat;
import java.util.*;

import javax.swing.JOptionPane;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat frm = new DecimalFormat();
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input weight"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input height"));
		weight = weight/100;
		Double BMI = weight/ (height*height);
		if(BMI <18.5) 
		{
			JOptionPane.showMessageDialog(null, frm.format(BMI)+"Underweight");
		}
		else if(BMI>=24.9) 
		{
			JOptionPane.showMessageDialog(null, frm.format(BMI)+"Normal-weight");
		}
		else if(BMI>25.0) 
		{
			JOptionPane.showMessageDialog(null, frm.format(BMI)+"Overweight");
		}
		else if (BMI>=30.0)
		{
			JOptionPane.showMessageDialog(null, frm.format(BMI)+"You'reObesity");
		}
		
	}

}
