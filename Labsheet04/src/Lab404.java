import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputStudent();
	}
	public static void inputStudent () {
		Scanner input = new Scanner(System.in);
		String student, subject;
		boolean isStudentIDvalid, issubjectCodvalid;
		while(true) {
			System.out.print("Enter Student Id (10digits) : ");
			student = input.nextLine();
			
			System.out.print("Enter Subject code (7digits) : ");
			subject = input.nextLine();
			isStudentIDvalid = islength(student,10);
			issubjectCodvalid =islength(subject,7);
			if(isStudentIDvalid && issubjectCodvalid) {
				if(isITstudent(student)) {
				System.out.println("Student id : "+student+" 1st year student in IT and Enroll in courses for 1 year");
				break;
				}else 
				{
					System.out.println("Student id : "+student+" is not 1 st year student in IT Enroll in courses for Year 1");
					
				}
				}
			else {
				System.out.println("Student id : "+student+" is not 1st year student in IT enroll in courses for Year 1");}
			}
		
		
		input.close();
		
		
		
	}
	public static boolean islength (String input, int legth) {
		return input.length() == legth;
	}
	public static boolean isITstudent(String student) {
		return student.startsWith("21");
		
	}
	
	

}
