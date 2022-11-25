package question1;

//importing Scanner class
import java.util.Scanner;

//declare class and extends other class
public class University extends Details {

	//declare main method
	public static void main(String arg[]) {
		
		//declaring variables
		int ch;
		
		
		
		//declare Scanner class object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice");
		System.out.println("Enter 1 if you want to enter student details");
		System.out.println("Enter 2 if you want to enter employee details");
		
		//declaring class object
		University obj = new University();
		
		//taking input from user
		ch = sc.nextInt();
		
		//switch statement
		switch(ch) {
		
		case 1:{
			obj.student_details();
			obj.stuDisplay();
			break;
		}
		case 2:{
			obj.employee_details();
			obj.empDisplay();
			break;
		}
		default:
			System.out.println("Enter valid input");
		}
		//end of switch
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
	}
	//end of method
	
	
}
//end of class
