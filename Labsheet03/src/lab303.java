import java.util.*;
public class lab303 {

	public static void main(String[] args) {
		int numspace=0;
		int numword =0;
		Scanner kb = new Scanner(System.in);
		String word ="";
		System.out.print("Input a sentence: ");
		word = kb.nextLine();
		while(!word.endsWith(".")) {
			System.out.print("Input a sentence, again : ");
			word = kb.nextLine();
			for (int i =0; i<word.length(); i++) 
			{
				
				char ch =word.charAt(i);
				if(ch==' ') {
					numspace++;
				}
			
				
			}
			
		}
		System.out.println("This sentence has"+numspace+"spacebar.");
		System.out.println("This sentence has"+numword+"word.");
		kb.close();
	

	}

}
