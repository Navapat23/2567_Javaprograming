import javax.swing.*;
public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input Product Name : ");
		String strProduct = JOptionPane.showInputDialog("Input Product Unit : ");
		int ProductUnit = Integer.parseInt(strProduct);
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog(""+"Input Price per unit"));
		double totalPriceofproduct = ProductUnit*productPrice;
		double totalwithVat = totalPriceofproduct * 1.07;
		JOptionPane.showMessageDialog(null,
				"Total Price is "+ totalPriceofproduct + "bath."+""
						+ "\nAdd Vat 7% is "+totalwithVat +"Bath.");
		
	}

}
