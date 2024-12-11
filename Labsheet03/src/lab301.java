import java.util.*;
public class lab301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		//กำหรดตัวแปรชื่อ text ไว้รวมข้อตวามเข้าด้วยกัน
		String txtConcate = "";
		//กำหนดตัวแปรชื่อ word ไว้สำหรับรับข้อความทาง console
		String word;
		while(true) 
		{
			System.out.print("Enter Word: ");
			word = kb.next();
			if(word.equalsIgnoreCase("stop")) 
			{
				System.out.print("Program Terminate");
				break;
			}
			txtConcate += word;
		}
		System.out.print(txtConcate.toUpperCase());
		kb.close();
		}
		
	}


