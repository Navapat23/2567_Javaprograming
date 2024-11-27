import java.util.*;
import java.text.*;
public class javaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//กำหนด object ในการรับข้อมูลทางคีย์บอร์ด
		Scanner input = new Scanner(System.in);
		//กำหนด object ในการจัดรูปแบบตัวเลข 
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//แสดงผลและชื่อสินค้า
		System.out.print("Input product name : ");
		String productName = input.nextLine();
		//แสดงและรับจำนวนสินค้า
		System.out.print("Input product unit : ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit : ");
		float productPrice = input.nextFloat();
		System.out.println();
		//คำนวณหาผลรวมของสินค้า
		float totalPriceofProduct =productUnit*productPrice;
		System.out.println("Total Price is "+ frm.format(totalPriceofProduct)+" bath.");
		
		float totalwithVat = totalPriceofProduct + (totalPriceofProduct*7/100);
		System.out.println("Add VAT 7% is "+frm.format(totalwithVat)+" bath.");
		System.out.println();
		
		String frmtotalwithVat = String.format("%, .2f",totalwithVat);
		System.out.println("Output using string.format");
		System.out.println("Add VAT 7% is "+frm.format(totalwithVat)+" bath.");
		System.out.println("Output using printf");
		System.out.printf("Add Vat 7%% is %,.2f", totalwithVat);
		input.close();
		
		
	}

}
