package ques_03;

//importing Scanner class
import java.util.Scanner;

//declare class
public class Menu {
	
	//declare method to add of two number
	public static void add(int num1, int num2) {
		System.out.println("Sum of two number is "+(num1+num2));
	}
	//end of method

	//declare method to multiple of two number
	public static void mul(int num1, int num2) {
		System.out.println("Multiple of "+num1 +" and "+num2+" is: "+(num1*num2));
	}
	//end of method
	
	//declare method to print string
	public static void string(String str) {
		System.out.println("String is : "+str);
	}
	//end of method
	
	//declare main method
	public static void main(String arg[]) {
		
		//declare variables
		int num, num1, num2;
		String str;
		
		//declare try block to check exception
		try(Scanner sc = new Scanner(System.in);){
			System.out.println("Enter menu ");
			num = sc.nextInt();
			// if-else ladder
			if(num > 3 || num < 1) {
				//throws an exception
				throw new myException("Invalid number");
			}else {
				System.out.println("Enter two number");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				System.out.println("Enter a string");
				str = sc.next();
				//inner if-else ladder
				if(num1 < 1 || num2 < 1) {
					//throws an exception
					throw new myException("number must be greater than 0");
				}else if((str.length())>1){
					//throws an exception
					throw new myException("String must hava single character");
				}else {
					
					//switch statement
					switch(num) {
						
					case 1: {
						add(num1, num2);
						break;
					}
					case 2: {
						mul(num1, num2);
						break;
					}
					case 3: {
						string(str);
					}
					//end of inner if else ladder
					}
					//end of switch statement
				}
				
			}
			//if-else ladder
		}
		//end of try block
		//declare catch block
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		//end of catch block
	}
	//end of method
}
//end of class
